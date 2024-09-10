/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.business.abstracts;

import project.jobs.core.utilities.results.DataResult;
import project.jobs.dto.EmployerDto;
import project.jobs.entities.concretes.Employer;

/**
 *
 * @author Emre Yıldırım
 */
public interface EmployerService {
//    DataResult<Employer> addEmployer(Employer employer);
    DataResult<EmployerDto> addEmployer(EmployerDto employerDto);
}
