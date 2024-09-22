package com.example.ems_backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//while creating restapi, it is used as response
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
