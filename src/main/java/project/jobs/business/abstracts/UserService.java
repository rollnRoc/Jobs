/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.jobs.business.abstracts;

import java.util.List;
import project.jobs.core.utilities.results.DataResult;
import project.jobs.entities.concretes.User;

/**
 *
 * @author Emre Yıldırım
 */
public interface UserService {
    User addUser(User user);
    List<User> getAll();
    DataResult<User> updateUser(User updatedUser);
    void deletedById(long id);
}
