package com.utcn.employeeapplication.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/AllDepartments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/dreateDepartment")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.create(department);
    }

    @PutMapping("/updateDepartment")
    public Department updateDepartment(@RequestBody Department updatedDepartment) {
        return departmentService.update(updatedDepartment);
    }

    @DeleteMapping("/{departmentID}")
    public void deleteDepartment(@PathVariable Integer departmentID) {
        departmentService.delete(departmentID);
    }

    @GetMapping("/departments/location/{location}")
    public List<Department> getDepartmentsByLocation(@PathVariable String location) {
        return (List<Department>) departmentService.getDepartmentsByLocation(location);
    }

    @GetMapping("/departments/establishedDate/{establishedDate}")
    public Department getDepartmentByEstablishedDate(@PathVariable Integer establishedDate) {
        return departmentService.getDepartmentByEstablishedDate(establishedDate);
    }

    /*
    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.create(department);
    }
     */

}