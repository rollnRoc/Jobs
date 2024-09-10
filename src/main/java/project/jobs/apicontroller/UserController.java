/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.apicontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import project.jobs.business.abstracts.UserService;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.entities.concretes.Employer;
import project.jobs.entities.concretes.User;

/**
 *
 * @author Emre Yıldırım
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }
    
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);

    }
    
    @GetMapping("/getAll")
    public List<User> getAll(){
        return this.userService.getAll();
    }
    @PutMapping("/edit")
    public DataResult<User> userCompany(@RequestBody User user) {
        return userService.updateUser(user);
    }
    
    @DeleteMapping("/delete")
    public void deleteById(long id){
         this.userService.deletedById(id);
    }
    
    
}
