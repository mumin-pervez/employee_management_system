package com.mumin.emp.service;

import com.mumin.emp.entity.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {

  Employee saveEmployee(Employee employee);

  List<Employee> getEmployees();

  Optional<Employee> getEmployeeById(Long id);

  void deleteEmployeeById(Long id);


}
