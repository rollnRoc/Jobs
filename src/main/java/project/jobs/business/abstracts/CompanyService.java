/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.business.abstracts;

import java.util.List;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.entities.concretes.Company;

/**
 *
 * @author Emre Yıldırım
 */
public interface CompanyService {
    List<Company> getAll();
    Company addCompany(Company company);
    
    DataResult<Company> updateCompany(Company updatedCompany);
    
}
