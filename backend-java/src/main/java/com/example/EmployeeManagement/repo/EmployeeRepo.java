package com.example.EmployeeManagement.repo;

import com.example.EmployeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {


}
