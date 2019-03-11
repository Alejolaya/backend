package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {
/**
 * guarda los usuarios
 * @param user
 * @return
 */
	User save(User user);
/**
 * recupera la lista de todos los usuarios
 * @return
 */
	List<User> findAll();

	

}
