/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.jobs.entities.concretes.Company;

/**
 *
 * @author Emre Yıldırım
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {

    boolean existsByCompanyName(String companyName);

    Company findById(long id);
}
