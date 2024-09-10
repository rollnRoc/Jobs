/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.business.concretes;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.jobs.business.abstracts.CompanyService;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.core.utilities.results.ErrorDataResult;
import project.jobs.core.utilities.results.SuccessDataResult;
import project.jobs.dataAccess.abstracts.CompanyRepository;
import project.jobs.entities.concretes.Company;

/**
 *
 * @author Emre Yıldırım
 */
@Service
public class CompanyManager implements CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyManager(CompanyRepository companyRepository) {
        super();
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAll() {
        return this.companyRepository.findAll();
    }

    @Override
    public Company addCompany(Company company) {

        if (company.getCompanyName().isEmpty()) {
            throw new IllegalArgumentException("Company name must exist.");
        }
        if (company.getCompanyName().length() < 5) {
            throw new IllegalArgumentException("Company name must be longer than 5 characters.");
        }

        return this.companyRepository.save(company);
    }

    @Override
    public DataResult<Company> updateCompany(Company updatedCompany) {

        
        Company existingCompany = companyRepository.findById(updatedCompany.getId());

        
        if (existingCompany == null) {
            return new ErrorDataResult<>("Company with id " + updatedCompany.getId() + " does not exist.");
        }

        
        if (updatedCompany.getCompanyName().length() < 5) {
            return new ErrorDataResult<>("Name must be longer than 5 characters.");
        }

        
        if (updatedCompany.getCompanyName().isEmpty()) {
            return new ErrorDataResult<>("Name can't be empty.");
        }

        
        if (!existingCompany.getCompanyName().equals(updatedCompany.getCompanyName()) 
            && companyRepository.existsByCompanyName(updatedCompany.getCompanyName())) {
            return new ErrorDataResult<>("Name already exists.");
        }

        //kaydetme
        existingCompany.setCompanyName(updatedCompany.getCompanyName());
        
        companyRepository.save(existingCompany);

        
        return new SuccessDataResult<>(existingCompany, "Company updated successfully.");
    }

}
