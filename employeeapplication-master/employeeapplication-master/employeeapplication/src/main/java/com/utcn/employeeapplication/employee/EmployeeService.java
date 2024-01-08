package com.utcn.employeeapplication.employee;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee create(Employee employee){
       return employeeRepository.save(employee);
    }

    @Transactional
    public Employee updateEmployee(Employee updatedEmployee){
        return employeeRepository.save(updatedEmployee);
    }

    @Transactional
    public void deleteEmployee(Integer employeeID){
        employeeRepository.deleteById(employeeID);
    }

    @Transactional
    public List<Employee> getEmployeesByPosition(String position){
        return (List<Employee>) employeeRepository.findByPosition(position);
    }

    @Transactional
    public Employee getEmployeeByPhoneNumber( String phoneNumber){
        return employeeRepository.findByPhoneNumber(phoneNumber);
    }

    @Transactional
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Transactional
    public List<Employee> getEmployeeByDepartmentID(Integer department_id){
        return employeeRepository.findByDepartmentID(department_id);
    }

    @Transactional
    public List<Employee> getEmployeeByManagerID(Integer manager_id){
        return  employeeRepository.findByManagerID(manager_id);
    }

    /*
    @Transactional
    public Employee addEmployee(Employee employee) {
        if (employeeRepository.findByEmail(employee.getEmail()).equals(employee.getEmail())) {
            try {
                throw new EmailAlreadyExistsException("Email already exists");
            } catch (EmailAlreadyExistsException e) {
                throw new RuntimeException(e);
            }
        }

        if (employeeRepository.findByPhoneNumber(employee.getPhoneNumber()).equals(employee.getPhoneNumber())) {
            try {
                throw new PhoneNumberAlreadyExistsException("Phone number already exists");
            } catch (PhoneNumberAlreadyExistsException e) {
                throw new RuntimeException(e);
            }
        }

        return employeeRepository.save(employee);
    }

    private class EmailAlreadyExistsException extends Throwable {
        public EmailAlreadyExistsException(String emailAlreadyExists) {
        }
    }

    private class PhoneNumberAlreadyExistsException extends Throwable {
        public PhoneNumberAlreadyExistsException(String phoneNumberAlreadyExists) {
        }
    }
     */
}

