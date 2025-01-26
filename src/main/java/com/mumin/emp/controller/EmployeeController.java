package com.mumin.emp.controller;

import com.mumin.emp.entity.Employee;
import com.mumin.emp.service.EmployeeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  //localhost:8081/employees

  @PostMapping
  public Employee createEmployee(@RequestBody Employee employee) {
    System.out.println("Employee information is saved");
    return employeeService.saveEmployee(employee);
  }

  @GetMapping
  public List<Employee> getEmployees() {
    return employeeService.getEmployees();
  }

  @GetMapping("/{id}")
  public Optional<Employee> getEmployeeById(@PathVariable Long id) {
    return employeeService.getEmployeeById(id);
  }

  @DeleteMapping("/{id}")
  public void deleteAnEmployee(@PathVariable Long id) {
    System.out.println("Deleted employee id : " + id);
  }

}
