package com.example.begin.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmpController {

	@Autowired  
	private IEmpRepository emprepo;
	
	//mapping the getAllEmployees() method to /employees  
	@GetMapping(value = "/employees")  
	public ArrayList<Employee> getAllEmployees(){  
		//finds all the products  
		ArrayList<Employee> emps = emprepo.getEmpList();  
		System.out.println(emps.size());
		//returns the product list  
		return emps;  
	} 
	
	
//	@RequestMapping(value="/employees/{id}",method=RequestMethod.DELETE)
//	public void deleteEmp(@PathVariable("id") int id){
//		System.out.println(id);
//		
//		//emprepo.deleteEmployee(id);
//	
//		
//		
//	}
	
	
}
