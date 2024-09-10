/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.business.abstracts;

import java.util.List;
import project.jobs.entities.concretes.JobPosition;

/**
 *
 * @author Emre Yıldırım
 */
public interface JobPositionService {
    List<JobPosition>getAll();
    JobPosition findJobPositionByNameIgnoreCase(String positionName);
    List <JobPosition>findJobPositionsContainingKeyword(String keyword);
    JobPosition addJobPosition(JobPosition jobPosition);
    void deletedById(long id);
}
