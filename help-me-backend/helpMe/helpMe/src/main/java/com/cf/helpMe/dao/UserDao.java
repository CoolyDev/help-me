package com.cf.helpMe.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cf.helpMe.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, String>{
	DAOUser findByUsername(String username);
}
