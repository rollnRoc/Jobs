/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.jobs.entities.concretes.UserPositionCompany;

/**
 *
 * @author Emre Yıldırım
 */
@Repository
public interface UserPositionCompanyRepository extends JpaRepository<UserPositionCompany, Long> {
    
}
