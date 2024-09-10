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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import project.jobs.business.abstracts.JobPositionService;
import project.jobs.entities.concretes.JobPosition;

/**
 *
 * @author Emre Yıldırım
 */
@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
        super();
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
    public List<JobPosition> getAll() {
        return this.jobPositionService.getAll();
    }

    @GetMapping("/getCeng")
    public JobPosition getFindPositionByPosition(String positionName) {
        return this.jobPositionService.findJobPositionByNameIgnoreCase(positionName.trim());
    }

    @GetMapping("/getCengContains")
    public List<JobPosition> getFindPositionByPositionContains(String keyword) {
        return this.jobPositionService.findJobPositionsContainingKeyword(keyword);

    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public JobPosition addJobPosition(@RequestBody JobPosition jobPosition){
        return this.jobPositionService.addJobPosition(jobPosition);
    }
    @DeleteMapping("/delete")
    public void deleteById(long id){
         this.jobPositionService.deletedById(id);
    }
} 
