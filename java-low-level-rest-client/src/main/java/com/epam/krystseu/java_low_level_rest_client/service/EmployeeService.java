package com.epam.krystseu.java_low_level_rest_client.service;

import com.epam.krystseu.java_low_level_rest_client.dto.Employee;

import java.io.IOException;

public interface EmployeeService {
    Employee[] getAllEmployees() throws IOException;
    Employee getEmployeeById(String id) throws IOException;
    void createEmployee(String id, Employee employee) throws IOException;
    void deleteEmployeeById(String id) throws IOException;
    Employee[] searchEmployees(String fieldName, String fieldValue) throws IOException;
    Object performAggregation(String field, String metricType, String metricField) throws IOException;
}