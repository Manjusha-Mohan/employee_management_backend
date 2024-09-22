package com.example.ems_backend.service;

import com.example.ems_backend.dtos.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    //method to create employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
