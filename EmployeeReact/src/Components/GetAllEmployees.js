import axios from "axios";
import { useEffect, useState} from "react";

export default function GetAllEmployees() {

    const [employees, setEmployees] = useState([])

    useEffect(() => {
        getAllEmployeesfunc()
    }, [])


    function getAllEmployeesfunc() {

        axios.get('http://localhost:8080/api/employee/employees').then(function (response) {
                console.log(response.data);
                setEmployees(response.data);
            }
        );

    }

    return (
        <div>

        <h1>All Employees</h1>

        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Position</th>
            </tr>
            </thead>

            <tbody>

            {employees.map((employee, key) =>
                <tr key = {key} >
                    <td>{employee.id}</td>
                    <td>{employee.name}</td>
                    <td>{employee.email}</td>
                    <td>{employee.position}</td>
                </tr>

            )}

            </tbody>

        </table>
        </div>
    );
}