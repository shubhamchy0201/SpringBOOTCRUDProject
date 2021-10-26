package springboot.crud.SpringBootCRUDProject.service;

import springboot.crud.SpringBootCRUDProject.entity.Employee;
import java.util.List;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
