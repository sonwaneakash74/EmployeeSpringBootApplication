package com.example.EmployeeApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeApplication.Model.EmployeeModel;
import com.example.EmployeeApplication.Service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/users")
	public List<EmployeeModel> getEmployee(){
		return service.getEmployee();
	}
	
	@GetMapping("/users/{id}")
	public EmployeeModel getEmployeeByID(@PathVariable long id)
	{
		return service.getEmployeeByID(id);
	}
	
	@PostMapping("/users")
	public EmployeeModel addEmployee(@RequestBody EmployeeModel Employee)
	{
		return service.addEmployee(Employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable long id)
	{
		return service.deleteEmployee(id);
	}
}
