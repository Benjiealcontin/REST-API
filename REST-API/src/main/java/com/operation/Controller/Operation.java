package com.operation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.operation.Model.Model;
import com.operation.Service.Services;

@RestController
public class Operation {
	
	@Autowired
	private Services service;
	
	@RequestMapping("/")
	public ModelAndView HomePage() {
		return new ModelAndView("home");
	}
	@RequestMapping("/Add")
	public ModelAndView AddPage() {
		return new ModelAndView("Adddata");
	}
	@RequestMapping("/Delete")
	public ModelAndView DeletePage() {
		return new ModelAndView("delete");
	}
	@RequestMapping("/Update")
	public ModelAndView UpdatePage() {
		return new ModelAndView("update");
	}
	
	@RequestMapping("/find")
	public ModelAndView viewPage() {
		return new ModelAndView("find");
	}
	
	@PostMapping("/api/Adddata")
	public ModelAndView adddata(Model mod){
		ModelAndView mv = new ModelAndView();
		String asd = "success";
		mv.addObject("data", asd);
		service.Adddata(mod);
		mv.setViewName("success");	
		return mv;	
	}
	
	@RequestMapping("/showdata")
	public ModelAndView showdata() {
		ModelAndView mv = new ModelAndView();
		List<Model> datalist = service.viewdata();	
		mv.addObject("data", datalist);
		mv.setViewName("view");	
		return mv;
	}
	@RequestMapping("/api/getdataById/")
	public ModelAndView showdatabyId(@RequestParam("id")int id) {
		ModelAndView mv = new ModelAndView();
		List<Model> datalist = service.getdataById(id);
		mv.addObject("data", datalist);
		mv.setViewName("result");	
		return mv;	
	}	
	
	@RequestMapping("/api/getdataByName/")
		public ModelAndView showdatabyName(@RequestParam("firstname") String firstname) {
		ModelAndView mv = new ModelAndView();
		List<Model> datalist = service.findByFirstname(firstname);
		mv.addObject("data",datalist);
		mv.setViewName("result");
		return mv;		
	}
	
	@RequestMapping("/UpdateData")
	@ResponseBody
	public String Updatedata(@RequestParam("id")int id,@RequestParam("firstname")String firstname,@RequestParam("lastname")String lastname,@RequestParam("age")int age) {
		Model myUpdateData = service.getdataByid(id);
		myUpdateData.setFirstname(firstname);
		myUpdateData.setLastname(lastname);
		myUpdateData.setAge(age);
		service.Updatedata(myUpdateData);
		return "success";
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView deletedata(@RequestParam("id") int id) {
		service.Deletedata(id);
		ModelAndView mv = new ModelAndView();
		List<Model> datalist = service.viewdata();	
		mv.addObject("data",datalist);
		mv.setViewName("view");
		return mv;
		
	}

}

