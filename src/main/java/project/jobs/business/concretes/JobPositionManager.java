/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;
import project.jobs.business.abstracts.JobPositionService;
import project.jobs.dataAccess.abstracts.JobPositionRepository;
import project.jobs.entities.concretes.JobPosition;

/**
 *
 * @author Emre Yıldırım
 */
@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionRepository jobPositionRepository;

    public JobPositionManager(JobPositionRepository jobPositionRepository) {
        super();
        this.jobPositionRepository = jobPositionRepository;
    }
    
    
    
    
    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionRepository.findAll();
    }
    
    @Override
    public JobPosition findJobPositionByNameIgnoreCase(String positionName){
        return this.jobPositionRepository.findByPositionNameIgnoreCase(positionName);
    }


    @Override
    public List<JobPosition> findJobPositionsContainingKeyword(String keyword) {
        return jobPositionRepository.findByPositionNameContainingIgnoreCase(keyword);
    }
    @Override
    public JobPosition addJobPosition(JobPosition jobPosition) {
        return jobPositionRepository.save(jobPosition);
    }

    @Override
    public void deletedById(long id) {
        this.jobPositionRepository.deleteById(id);
    }
    
    
    
}
