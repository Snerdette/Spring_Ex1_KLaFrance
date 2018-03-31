package com.catalyst.springboot.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.springboot.entities.Employee;

@RestController
public class EmployeeWebService {
	private List<Employee> employees = new ArrayList<>();
	
	@RequestMapping(value="/employees", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employees.add(employee);
		System.out.println(employees.size() + " employees.");
	}
	
	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return employees;
	}

	@RequestMapping (value = "/employees/{id}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable Integer id){
		for(Employee empId: employees){
			if(empId.getEmployeeId() == id){
				System.out.println(empId);
				return empId;
			}
		}
		return null;
	}
	@RequestMapping (value = "/employees/{id}", method = RequestMethod.POST)
	public Employee changeEmployeeById(@PathVariable Integer id,@RequestBody Employee employee){
		for(Employee changeEmId: employees){
			if(changeEmId.getEmployeeId() == id){
				this.changeEmployeeById(id, changeEmId);
				return changeEmId;
			}
		}
		return null;
	}
		
		@RequestMapping (value = "/employees/{id}", method = RequestMethod.DELETE)
		public Employee removeEmployeeById(@PathVariable Integer id){
			for(Employee removeEmId: employees){
				if(removeEmId.getEmployeeId() == id){
					employees.remove(removeEmId);
					return removeEmId;
				}
			}
			return null;
		}
		
		@RequestMapping(value="/employees/{id}", method=RequestMethod.PUT)
		public Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee updateEmployee){  //takes the URL variable and body from Postman
			//for(Employee emp : employees) {
			 for(int i = 0; i < employees.size(); i++){
				if(employees.get(i).getEmployeeId() == id) {
					employees.set(i, updateEmployee);
					return employees.get(i);
				}
			} return null;
		}

		
}
