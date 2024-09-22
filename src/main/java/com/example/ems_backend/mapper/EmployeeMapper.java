package com.example.ems_backend.mapper;

import com.example.ems_backend.dtos.EmployeeDto;
import com.example.ems_backend.entity.Employee;

public class EmployeeMapper {
    //map Employee jpa to EmployeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(), employee.getFirstName(),
                employee.getLastName(), employee.getEmail()
        );
    }
    //map Employee entity to EmployeeDto
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(), employeeDto.getFirstName(),
                employeeDto.getLastName(),employeeDto.getEmail()
        );
    }
}
