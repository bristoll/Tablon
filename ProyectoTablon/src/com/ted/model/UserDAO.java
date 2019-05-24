package com.ted.model;

import java.util.List;
/**
 * 
 * @author Cristo
 *
 */

public interface UserDAO {

	public boolean insert(User user);
	public List<User> obtain();
	public boolean update(User user);
	public boolean delete(User user);
}
