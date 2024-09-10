/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;
import project.jobs.business.abstracts.UserService;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.core.utilities.results.ErrorDataResult;
import project.jobs.core.utilities.results.SuccessDataResult;
import project.jobs.dataAccess.abstracts.UserRepository;
import project.jobs.entities.concretes.User;

/**
 *
 * @author Emre Yıldırım
 */
@Service
public class UserManager implements UserService {

    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    
    
    
    
    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    

    }

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }
    
    @Override
    public DataResult<User> updateUser(User updatedUser) {

        //sirket var mi
        User existingUser = userRepository.findById(updatedUser.getId());
        

        
        if (existingUser == null) {
            return new ErrorDataResult<>("User with id " + updatedUser.getId() + " does not exist.");
        }



        //yeni sirket eski ile ayni degilse ve yeni sirketin adi eski sirketlerde varsa error
        if (!existingUser.getName().equals(updatedUser.getName()) 
            && userRepository.existsByName(updatedUser.getName())) {
            return new ErrorDataResult<>("Name already exists.");
        }
        
        
        
        if(!isValidPassword(updatedUser.getPassword())){
            return new ErrorDataResult<>("Password must be at least 5 characters long and should not contain special characters.");

        }
        
        if(!updatedUser.getPassword().equals(updatedUser.getPassword_again())){
            return new ErrorDataResult<>("Passwords doesn't match!");
        }

        //kaydetme
        existingUser.setName(updatedUser.getName());
        existingUser.setLname(updatedUser.getLname());        
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        userRepository.save(existingUser);

        
        return new SuccessDataResult<>(existingUser, "User updated successfully.");
    }
    @Override
    public void deletedById(long id) {
        this.userRepository.deleteById(id);
    }
    private boolean isValidPassword(String password){
        if(password.length()<5){
            return false;
        }
        return password.matches("[A-Za-z0-9]*");
    }
    
}
