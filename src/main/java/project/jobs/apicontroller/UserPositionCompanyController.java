/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.apicontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.entities.concretes.UserPositionCompany;
import java.util.List;
import project.jobs.business.abstracts.UserPositionCompanyService;

@RestController
@RequestMapping("/api/user-position-company")
public class UserPositionCompanyController {

    private   UserPositionCompanyService userPositionCompanyService;

    @Autowired
    public UserPositionCompanyController(UserPositionCompanyService userPositionCompanyService) {
        super();
        this.userPositionCompanyService = userPositionCompanyService;
    }

    @PostMapping("/add")
    public  UserPositionCompany save(UserPositionCompany userPositionCompany){
        return userPositionCompanyService.save(userPositionCompany);
    } 

    @GetMapping("/get")
    public  List<UserPositionCompany> getAll(UserPositionCompany userPositionCompany){
        return userPositionCompanyService.getAll();
    }
            
}

