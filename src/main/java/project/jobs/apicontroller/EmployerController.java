/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.apicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import project.jobs.business.abstracts.EmployerService;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.dto.EmployerDto;
import project.jobs.entities.concretes.Employer;

/**
 *
 * @author Emre Yıldırım
 */
@RestController
@RequestMapping("/employer")
public class EmployerController {
    private EmployerService employerService;

    
    @Autowired
    public EmployerController(EmployerService employerService) {
        super();
        this.employerService = employerService;
    }
    
    
//    @PostMapping("/add")
//    @ResponseStatus(HttpStatus.CREATED)
//    public DataResult<Employer> addEmployer(@RequestBody Employer employer){
//        return this.employerService.addEmployer(employer);
//    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public DataResult<EmployerDto> addEmployer(@RequestBody EmployerDto employerDto){
        return employerService.addEmployer(employerDto);
    }
}
