package com.example.EmployeeApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeApplication.Model.EmployeeModel;
import com.example.EmployeeApplication.Repository.EmploeeRepository;

@Service
public class EmployeeService {

	@Autowired 
	private EmploeeRepository repository;
	
	public List<EmployeeModel> getEmployee()
	{
		return repository.findAll();
	}
	
	public EmployeeModel getEmployeeByID(long id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public EmployeeModel addEmployee(EmployeeModel Employee) {
		return repository.save(Employee);
	}
	
	public String deleteEmployee(long id)
	{
		repository.deleteById(id);
		return "Delete Sucessfull....!";
	}
}
