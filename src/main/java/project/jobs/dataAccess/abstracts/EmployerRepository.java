/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.jobs.entities.concretes.Employer;

/**
 *
 * @author Emre Yıldırım
 */
public interface EmployerRepository extends JpaRepository<Employer,Long> {
    
}
