package com.ted.model;

import java.util.List;
/**
 * 
 * @author Cristo
 *
 */
public interface PostDAO {

	public boolean insert(Post post);
	public List<Post> obtain();
	public boolean update(Post post);
	public boolean delete(Post post);
}
