/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.business.concretes;

import org.springframework.stereotype.Service;
import project.jobs.business.abstracts.EmployerService;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.core.utilities.results.ErrorDataResult;
import project.jobs.core.utilities.results.SuccessDataResult;
import project.jobs.dataAccess.abstracts.EmployerRepository;
import project.jobs.dto.EmployerDto;
import project.jobs.entities.concretes.Employer;
import project.jobs.entities.concretes.User;

/**
 *
 * @author Emre Yıldırım
 */
@Service
public class EmployerManager implements EmployerService {
    private EmployerRepository employerRepository;

    public EmployerManager(EmployerRepository employerRepository) {
        super();
        this.employerRepository = employerRepository;
    }
    
    
    
//    @Override
//    public DataResult<Employer> addEmployer(Employer employer) {
//        if(!employer.getPassword().equals(employer.getPassword_again())){
//            return new ErrorDataResult<>("Passwords doesn't match!");
//        }
//        employerRepository.save(employer);
//        return new SuccessDataResult<>(employer, "Employer saved successfully.");
//    }
    
    @Override
    public DataResult<EmployerDto> addEmployer(EmployerDto employerDto) {
        
        if(!employerDto.getPassword().equals(employerDto.getPassword_again())){
            return new ErrorDataResult<>("Passwords doesn't match!");
        }
        
        if (!isValidPassword(employerDto.getPassword())) {
            return new ErrorDataResult<>("Password must be at least 5 characters long and should not contain special characters.");
    }
  
        Employer employer = new Employer();
        employer.setEmail(employerDto.getEmail());
        employer.setName(employerDto.getName());
        employer.setLname(employerDto.getLname());
        employer.setPassword(employerDto.getPassword());
        employer.setWebsite(employerDto.getWebsite());
        employer.setPhoneNumber(employerDto.getPhoneNumber());

        Employer savedEmployer = employerRepository.save(employer);

        
        EmployerDto savedEmployerDTO = new EmployerDto();
        savedEmployerDTO.setId(savedEmployer.getId());
        savedEmployerDTO.setEmail(savedEmployer.getEmail());
        savedEmployerDTO.setName(savedEmployer.getName());
        savedEmployerDTO.setLname(savedEmployer.getLname());
        savedEmployerDTO.setPassword(savedEmployer.getPassword());
        savedEmployerDTO.setWebsite(savedEmployer.getWebsite());
        savedEmployerDTO.setPhoneNumber(savedEmployer.getPhoneNumber());

        return new SuccessDataResult<>(savedEmployerDTO, "Employer added successfully");
    }
    public boolean isValidPassword(String password) {
    if (password.length() < 5) {
        return false;
    }
    return password.matches("[A-Za-z0-9]*");
}
    
}
