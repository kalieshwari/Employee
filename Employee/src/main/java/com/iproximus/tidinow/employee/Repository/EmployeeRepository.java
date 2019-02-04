package com.iproximus.tidinow.employee.Repository;
import org.springframework.data.repository.CrudRepository;

import com.iproximus.tidinow.employee.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
