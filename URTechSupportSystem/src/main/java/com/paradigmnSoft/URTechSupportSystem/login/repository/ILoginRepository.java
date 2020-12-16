/**
 * 
 */
package com.paradigmnSoft.URTechSupportSystem.login.repository;

import org.springframework.stereotype.Repository;

/**
 * @author asimasad
 *
 */

public interface ILoginRepository {

	public Boolean authenticate(String userName, String password); 
	
}
