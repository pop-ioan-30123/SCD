package com.utcn.employeeapplication.department;

import com.utcn.employeeapplication.employee.Employee;
import com.utcn.employeeapplication.employee.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public Department create(Department department) {
        return departmentRepository.save(department);
    }

    @Transactional
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Transactional
    public Department update(Department updatedDepartment) {
        return departmentRepository.save(updatedDepartment);
    }

    @Transactional
    public void delete(Integer departmentID) {
        departmentRepository.deleteById(departmentID);
    }

    @Transactional
    public Department getDepartmentsByLocation(String location) {
        return departmentRepository.findByLocation(location);
    }

    @Transactional
    public Department getDepartmentByEstablishedDate(Integer establishedDate) {
;        return departmentRepository.findByEstablishedDate(establishedDate);
    }

    /*
    @Transactional
    public Department addDepartment(Department department) {
        if (departmentRepository.findByName(department.getDepartmentName()).equals(department.getDepartmentName()) &&
                departmentRepository.findByLocation(department.getLocation()).equals(department.getLocation())) {
            try {
                throw new DepartmentAlreadyExists("Department already exists.");
            } catch (DepartmentAlreadyExists e) {
                throw new RuntimeException(e);
            }

        }

        return departmentRepository.save(department);
    }
    */

    public static class DepartmentAlreadyExists extends Throwable {
        public DepartmentAlreadyExists(String s) {
        }
    }

}