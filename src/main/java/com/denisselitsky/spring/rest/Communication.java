package com.denisselitsky.spring.rest;

import com.denisselitsky.spring.rest.entity.Employee;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    private final RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/spring_rest/api/employees";

    public Communication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Employee>>() {
        });
        List<Employee> allEmployees = responseEntity.getBody();
        return allEmployees;
    }

    public Employee getEmployee(int id) {
        return null;
    }

    public void saveEmployee(Employee employee) {

    }

    public void deleteEmployee(int id ) {

    }

}