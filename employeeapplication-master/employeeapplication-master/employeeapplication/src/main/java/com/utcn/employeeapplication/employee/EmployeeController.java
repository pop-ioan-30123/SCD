package com.utcn.employeeapplication.employee;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("createEmployee")
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee updatedEmployee){
        return employeeService.updateEmployee(updatedEmployee);
    }

    @DeleteMapping("/deleteEmployee {employeeID}")
    public void deleteEmployee(@PathVariable Integer employeeID){
        employeeService.deleteEmployee(employeeID);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/position/{position}")
    public List<Employee> getEmployeesByPosition(@PathVariable String position){
        return employeeService.getEmployeesByPosition(position);
    }

    @GetMapping("/{phoneNumber}")
    public Employee getEmployeeByPhoneNumber(@PathVariable String phoneNumber){
        return employeeService.getEmployeeByPhoneNumber(phoneNumber);
    }

    @GetMapping("/department/{department_id}")
    public List<Employee> getEmployeeByDepartmentID(@PathVariable Integer department_id){
        return employeeService.getEmployeeByDepartmentID(department_id);
    }

    @GetMapping("/manager/{manager_id}")
    public List<Employee> getEmployeeByManagerID(@PathVariable Integer manager_id){
        return employeeService.getEmployeeByManagerID(manager_id);
    }


}
