package com.mumin.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long empId;
  private String empName;
  private String empMobileNo;
  private Boolean empStatus;

  public Employee() {
  }

  public Employee(Long empId, String empName, String empMobileNo, Boolean empStatus) {
    this.empId = empId;
    this.empName = empName;
    this.empMobileNo = empMobileNo;
    this.empStatus = empStatus;
  }

  public Long getEmpId() {
    return empId;
  }

  public void setEmpId(Long empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpMobileNo() {
    return empMobileNo;
  }

  public void setEmpMobileNo(String empMobileNo) {
    this.empMobileNo = empMobileNo;
  }

  public Boolean getEmpStatus() {
    return empStatus;
  }

  public void setEmpStatus(Boolean empStatus) {
    this.empStatus = empStatus;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "empId=" + empId +
        ", empName='" + empName + '\'' +
        ", empMobileNo='" + empMobileNo + '\'' +
        ", empStatus=" + empStatus +
        '}';
  }
}
