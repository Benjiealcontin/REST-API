package com.operation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.Model.Model;
import com.operation.Respository.Respository;

@Service
public class Services {
	
	@Autowired
	private Respository respo;
	
	//Insert data
	public Model Adddata(Model mod) {
		return respo.save(mod);		
	}
	
	//Retrieve data	
	public List<Model> viewdata(){		
		return (List<Model>)respo.findAll();		
	}
	
	//Retrieve data by id
	public List<Model> getdataById(int id) {		
		return respo.findById(id);		
	}
	
	//Retrieve data by Name
	public List<Model> findByFirstname(String firstname) {		
		return respo.findByFirstname(firstname);
	}
	
	//Select by id for Update
	  public Model getdataByid(int id) { 
		  return respo.findByid(id); }
	 
	
	//Delete data by id
	public String Deletedata(int id) {
		respo.deleteById(id);
		return "Successfully Delete !!" + id;		
	}
	
	//Update data
	public Model Updatedata(Model mod) {
		Model existdata = respo.findByid(mod.getId());
		existdata.setFirstname(mod.getFirstname());
		existdata.setLastname(mod.getLastname());
		existdata.setAge(mod.getAge());
		return respo.save(existdata);
		
	}
	

	
	
	
	
	
	
}
