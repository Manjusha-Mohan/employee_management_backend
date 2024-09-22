package com.example.ems_backend.repository;

import com.example.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//extend with JpaRepository and pass the parameter: entity and data type of primary key
//so our repository will get all the methods from JpaRepo to perform CRUD operation
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
