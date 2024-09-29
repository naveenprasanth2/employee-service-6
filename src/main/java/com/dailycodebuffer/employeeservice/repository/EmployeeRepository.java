package com.dailycodebuffer.employeeservice.repository;

import com.dailycodebuffer.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @GetMapping("/employees/department/{departmentId}")
    List<Employee> findByDepartmentId(@PathVariable("departmentId") Long departmentId);
}
