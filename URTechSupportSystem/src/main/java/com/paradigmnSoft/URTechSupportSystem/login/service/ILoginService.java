/**
 * 
 */
package com.paradigmnSoft.URTechSupportSystem.login.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asimasad
 *
 */

public interface ILoginService {

	public Boolean authenticateUser(String userName, String password);
}
