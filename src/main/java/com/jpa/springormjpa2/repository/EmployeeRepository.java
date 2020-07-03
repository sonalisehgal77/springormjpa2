package com.jpa.springormjpa2.repository;

import com.jpa.springormjpa2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByNameAndCity(String name, String city);
}
