/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.jobs.entities.concretes.Company;
import project.jobs.entities.concretes.User;

/**
 *
 * @author Emre Yıldırım
 */
public interface UserRepository extends JpaRepository<User,Long> {
    
    boolean existsByName(String name);
    User findById(long id);
    void deleteById(long id);
}
