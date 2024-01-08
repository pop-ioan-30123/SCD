package com.utcn.employeeapplication;

import com.utcn.employeeapplication.employee.Employee;
import com.utcn.employeeapplication.department.Department;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TablesPopulate {
        public static void main(String[] args) throws SQLException {


            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/departmentManagement", "root", "root22")) {

                // Create the prepared statements
                PreparedStatement departmentStatement = null;
                try {
                    departmentStatement = connection.prepareStatement("INSERT INTO department (departmentName, description, parentID, managerID, establishedDate, location) VALUES (?, ?, ?, ?, ?, ?)");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                    PreparedStatement employeeStatement = connection.prepareStatement("INSERT INTO employee (name, departmentID, managerID, email, position, phoneNumber) VALUES (?, ?, ?, ?, ?, ?)");


                // Insert departments
                Department department1 = new Department("IT Department", "A description of the IT department", 22, 1, 2023, "San Jose, CA");
                departmentStatement.setString(1, department1.getDepartmentName());
                departmentStatement.setString(2, department1.getDescription());
                departmentStatement.setInt(3, department1.getParentID());
                departmentStatement.setInt(4, department1.getManagerID());
                departmentStatement.setInt(5, department1.getEstablishedDate());
                departmentStatement.setString(6, department1.getLocation());
                departmentStatement.executeUpdate();

                Department department2 = new Department("Marketing Department", "A description of the Marketing department", 22, 2, 2023, "San Francisco, CA");
                departmentStatement.setString(1, department2.getDepartmentName());
                departmentStatement.setString(2, department2.getDescription());
                departmentStatement.setInt(3, department2.getParentID());
                departmentStatement.setInt(4, department2.getManagerID());
                departmentStatement.setInt(5, department2.getEstablishedDate());
                departmentStatement.setString(6, department2.getLocation());
                departmentStatement.executeUpdate();

                Department department3 = new Department("Sales Department", "A description of the Sales department", 22, 3, 2023, "Redwood City, CA");
                departmentStatement.setString(1, department3.getDepartmentName());
                departmentStatement.setString(2, department3.getDescription());
                departmentStatement.setInt(3, department3.getParentID());
                departmentStatement.setInt(4, department3.getManagerID());
                departmentStatement.setInt(5, department3.getEstablishedDate());
                departmentStatement.setString(6, department3.getLocation());
                departmentStatement.executeUpdate();

                Department department4 = new Department("Finance Department", "A description of the Finance department", 22, 4, 2023, "Sunnyvale, CA");
                departmentStatement.setString(1, department4.getDepartmentName());
                departmentStatement.setString(2, department4.getDescription());
                departmentStatement.setInt(3, department4.getParentID());
                departmentStatement.setInt(4, department4.getManagerID());
                departmentStatement.setInt(5, department4.getEstablishedDate());
                departmentStatement.setString(6, department4.getLocation());
                departmentStatement.executeUpdate();

                Department department5 = new Department("HR Department", "A description of the HR department", 22, 5, 2023, "Mountain View, CA");
                departmentStatement.setString(1, department5.getDepartmentName());
                departmentStatement.setString(2, department5.getDescription());
                departmentStatement.setInt(3, department5.getParentID());
                departmentStatement.setInt(4, department5.getManagerID());
                departmentStatement.setInt(5, department5.getEstablishedDate());
                departmentStatement.setString(6, department5.getLocation());
                departmentStatement.executeUpdate();


                // Insert employees
                Employee employee1 = new Employee(101,"John Doe", department1.getDepartmentID(), department1.getManagerID(), "johndoe@example.com", "Software Engineer", "123-456-7890");
                employeeStatement.setString(1, employee1.getName());
                employeeStatement.setInt(2, employee1.getDepartmentID());
                employeeStatement.setInt(3, employee1.getManagerID());
                employeeStatement.setString(4, employee1.getEmail());
                employeeStatement.setString(5, employee1.getPosition());
                employeeStatement.setString(6, employee1.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee2 = new Employee(102,"Jane Doe", department1.getDepartmentID(), department1.getManagerID(), "janedoe@example.com", "Project Manager", "555-666-7777");
                employeeStatement.setString(1, employee2.getName());
                employeeStatement.setInt(2, employee2.getDepartmentID());
                employeeStatement.setInt(3, employee2.getManagerID());
                employeeStatement.setString(4, employee2.getEmail());
                employeeStatement.setString(5, employee2.getPosition());
                employeeStatement.setString(6, employee2.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee3 = new Employee(103,"Peter Jones", department1.getDepartmentID(), department1.getManagerID(), "peterjones@example.com", "Systems Administrator", "987-654-3210");
                employeeStatement.setString(1, employee3.getName());
                employeeStatement.setInt(2, employee3.getDepartmentID());
                employeeStatement.setInt(3, employee3.getManagerID());
                employeeStatement.setString(4, employee3.getEmail());
                employeeStatement.setString(5, employee3.getPosition());
                employeeStatement.setString(6, employee3.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee4 = new Employee(104,"Sarah Smith", department2.getDepartmentID(), department2.getManagerID(), "sarahsmith@example.com", "Marketing Manager", "321-098-7654");
                employeeStatement.setString(1, employee4.getName());
                employeeStatement.setInt(2, employee4.getDepartmentID());
                employeeStatement.setInt(3, employee4.getManagerID());
                employeeStatement.setString(4, employee4.getEmail());
                employeeStatement.setString(5, employee4.getPosition());
                employeeStatement.setString(6, employee4.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee5 = new Employee(105, "David Brown", department2.getDepartmentID(), department2.getManagerID(), "davidbrown@example.com", "Marketing Specialist", "654-321-0987");
                employeeStatement.setString(1, employee5.getName());
                employeeStatement.setInt(2, employee5.getDepartmentID());
                employeeStatement.setInt(3, employee5.getManagerID());
                employeeStatement.setString(4, employee5.getEmail());
                employeeStatement.setString(5, employee5.getPosition());
                employeeStatement.setString(6, employee5.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee6 = new Employee(106,"Elizabeth Evans", department2.getDepartmentID(), department2.getManagerID(), "elizabethevans@example.com", "Social Media Manager", "098-765-4321");
                employeeStatement.setString(1, employee6.getName());
                employeeStatement.setInt(2, employee6.getDepartmentID());
                employeeStatement.setInt(3, employee6.getManagerID());
                employeeStatement.setString(4, employee6.getEmail());
                employeeStatement.setString(5, employee6.getPosition());
                employeeStatement.setString(6, employee6.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee7 = new Employee(107,"Michael Green", department3.getDepartmentID(), department3.getManagerID(), "michaelgreen@example.com", "Sales Representative", "765-432-0987");
                employeeStatement.setString(1, employee7.getName());
                employeeStatement.setInt(2, employee7.getDepartmentID());
                employeeStatement.setInt(3, employee7.getManagerID());
                employeeStatement.setString(4, employee7.getEmail());
                employeeStatement.setString(5, employee7.getPosition());
                employeeStatement.setString(6, employee7.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee8 = new Employee(108,"Laura White", department3.getDepartmentID(), department3.getManagerID(), "laurawhite@example.com", "Account Manager", "432-098-7654");
                employeeStatement.setString(1, employee8.getName());
                employeeStatement.setInt(2, employee8.getDepartmentID());
                employeeStatement.setInt(3, employee8.getManagerID());
                employeeStatement.setString(4, employee8.getEmail());
                employeeStatement.setString(5, employee8.getPosition());
                employeeStatement.setString(6, employee8.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee9 = new Employee(109,"David Johnson", department3.getDepartmentID(), department3.getManagerID(), "davidjohnson@example.com", "Sales Director", "098-765-4321");
                employeeStatement.setString(1, employee9.getName());
                employeeStatement.setInt(2, employee9.getDepartmentID());
                employeeStatement.setInt(3, employee9.getManagerID());
                employeeStatement.setString(4, employee9.getEmail());
                employeeStatement.setString(5, employee9.getPosition());
                employeeStatement.setString(6, employee9.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee10 = new Employee(110,"Emily Taylor", department4.getDepartmentID(), department4.getManagerID(), "emilytaylor@example.com", "Accountant", "123-456-7890");
                employeeStatement.setString(1, employee10.getName());
                employeeStatement.setInt(2, employee10.getDepartmentID());
                employeeStatement.setInt(3, employee10.getManagerID());
                employeeStatement.setString(4, employee10.getEmail());
                employeeStatement.setString(5, employee10.getPosition());
                employeeStatement.setString(6, employee10.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee11 = new Employee(111, "James Williams", department4.getDepartmentID(), department4.getManagerID(), "jameswilliams@example.com", "Budget Analyst", "555-666-7777");
                employeeStatement.setString(1, employee11.getName());
                employeeStatement.setInt(2, employee11.getDepartmentID());
                employeeStatement.setInt(3, employee11.getManagerID());
                employeeStatement.setString(4, employee11.getEmail());
                employeeStatement.setString(5, employee11.getPosition());
                employeeStatement.setString(6, employee11.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee12 = new Employee(112, "Thomas Brown", department4.getDepartmentID(), department4.getManagerID(), "thomasbrown@example.com", "Financial Analyst", "987-654-3210");
                employeeStatement.setString(1, employee12.getName());
                employeeStatement.setInt(2, employee12.getDepartmentID());
                employeeStatement.setInt(3, employee12.getManagerID());
                employeeStatement.setString(4, employee12.getEmail());
                employeeStatement.setString(5, employee12.getPosition());
                employeeStatement.setString(6, employee12.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee13 = new Employee(113,"Jennifer Jones", department5.getDepartmentID(), department5.getManagerID(), "jenniferjones@example.com", "Human Resources Manager", "321-098-7654");
                employeeStatement.setString(1, employee13.getName());
                employeeStatement.setInt(2, employee13.getDepartmentID());
                employeeStatement.setInt(3, employee13.getManagerID());
                employeeStatement.setString(4, employee13.getEmail());
                employeeStatement.setString(5, employee13.getPosition());
                employeeStatement.setString(6, employee13.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee14 = new Employee(114, "Robert Smith", department5.getDepartmentID(), department5.getManagerID(), "robertsmith@example.com", "Employee Relations Specialist", "654-321-0987");
                employeeStatement.setString(1, employee14.getName());
                employeeStatement.setInt(2, employee14.getDepartmentID());
                employeeStatement.setInt(3, employee14.getManagerID());
                employeeStatement.setString(4, employee14.getEmail());
                employeeStatement.setString(5, employee14.getPosition());
                employeeStatement.setString(6, employee14.getPhoneNumber());
                employeeStatement.executeUpdate();

                Employee employee15 = new Employee(115,"Catherine Davis", department5.getDepartmentID(), department5.getManagerID(), "catherinedavis@example.com", "Training and Development Specialist", "098-765-4321");
                employeeStatement.setString(1, employee15.getName());
                employeeStatement.setInt(2, employee15.getDepartmentID());
                employeeStatement.setInt(3, employee15.getManagerID());
                employeeStatement.setString(4, employee15.getEmail());
                employeeStatement.setString(5, employee15.getPosition());
                employeeStatement.setString(6, employee15.getPhoneNumber());
                employeeStatement.executeUpdate();

            }

            /*
            Department department1 = new Department("IT Department", "A description of the IT department", null, 1, 2023, "San Jose, CA");

            Department department2 = new Department("Marketing Department", "A description of the Marketing department", null, 2, 2023, "San Francisco, CA");

            Department department3 = new Department("Sales Department", "A description of the Sales department", null, 3, 2023, "Redwood City, CA");

            Department department4 = new Department("Finance Department", "A description of the Finance department", null, 4, 2023, "Sunnyvale, CA");

            Department department5 = new Department("HR Department", "A description of the HR department", null, 5, 2023, "Mountain View, CA");


// Create employees for the IT Department
            Employee employee1 = new Employee("John Doe", 1, department1.getDepartmentID(), "johndoe@example.com", "Software Engineer", "123-456-7890");
            Employee employee2 = new Employee("Jane Doe", 1, department1.getDepartmentID(), "janedoe@example.com", "Project Manager", "555-666-7777");
            Employee employee3 = new Employee("Peter Jones", 1, department1.getDepartmentID(), "peterjones@example.com", "Systems Administrator", "987-654-3210");

// Create employees for the Marketing Department
            Employee employee4 = new Employee("Sarah Smith", 2, department2.getDepartmentID(), "sarahsmith@example.com", "Marketing Manager", "321-098-7654");
            Employee employee5 = new Employee("David Brown", 2, department2.getDepartmentID(), "davidbrown@example.com", "Marketing Specialist", "654-321-0987");
            Employee employee6 = new Employee("Elizabeth Evans", 2, department2.getDepartmentID(), "elizabethevans@example.com", "Social Media Manager", "098-765-4321");

// Create employees for the Sales Department
            Employee employee7 = new Employee("Michael Green", 3, department3.getDepartmentID(), "michaelgreen@example.com", "Sales Representative", "765-432-0987");
            Employee employee8 = new Employee("Laura White", 3, department3.getDepartmentID(), "laurawhite@example.com", "Account Manager", "432-098-7654");
            Employee employee9 = new Employee("David Johnson", 3, department3.getDepartmentID(), "davidjohnson@example.com", "Sales Director", "098-765-4321");

// Create employees for the Finance Department
            Employee employee10 = new Employee("Emily Taylor", 4, department4.getDepartmentID(), "emilytaylor@example.com", "Accountant", "123-456-7890");
            Employee employee11 = new Employee("James Williams", 4, department4.getDepartmentID(), "jameswilliams@example.com", "Budget Analyst", "555-666-7777");
            Employee employee12 = new Employee("Thomas Brown", 4, department4.getDepartmentID(), "thomasbrown@example.com", "Financial Analyst", "987-654-3210");

// Create employees for the HR Department
            Employee employee13 = new Employee("Jennifer Jones", 5, department5.getDepartmentID(), "jenniferjones@example.com", "Human Resources Manager", "321-098-7654");
            Employee employee14 = new Employee("Robert Smith", 5, department5.getDepartmentID(), "robertsmith@example.com", "Employee Relations Specialist", "654-321-0987");
            Employee employee15 = new Employee("Catherine Davis", 5, department5.getDepartmentID(), "catherinedavis@example.com", "Training and Development Specialist", "098-765-4321");

             */

        }

}
