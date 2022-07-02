package com.operation.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.operation.Model.Model;

public interface Respository extends JpaRepository<Model, Integer> {
	//For delete and update
	Model findByid(int id);
	Model findByfirstname(String firstname);

	//Select specific column
	List<Model>findById(int id);
	List<Model>findByFirstname(String firstname);
	
	
}
