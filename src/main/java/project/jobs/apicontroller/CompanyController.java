/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.apicontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import project.jobs.business.abstracts.CompanyService;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.entities.concretes.Company;

/**
 *
 * @author Emre Yıldırım
 */
@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        super();
        this.companyService = companyService;
    }

    @GetMapping("/getAll")
    public List<Company> getAll() {
        return this.companyService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Company addCompany(@RequestBody Company company) {
        try {
            return this.companyService.addCompany(company);
        } catch (Exception e) {
            throw e;
        }

    }

    @PutMapping("/edit")
    public DataResult<Company> updateCompany(@RequestBody Company company) {
        return companyService.updateCompany(company);
    }
}
