package com.utcn.employeeapplication.employee;

import com.utcn.employeeapplication.department.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByPosition(String position);

    Employee findByPhoneNumber(String phoneNumber);

    List<Employee> findByDepartmentID(Integer department_id);

    List<Employee> findByManagerID(Integer manager_id);

   //
    // Employee findByEmail(String email);
}
