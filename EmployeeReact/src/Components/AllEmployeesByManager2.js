import axios from "axios";
import { useEffect, useState} from "react";
import {useParams} from "react-router-dom";

export default function GetAllEmployeesByManager2() {

    const [employees, setEmployees] = useState([])

    useEffect(() => {
        getAllEmployeesfunc()
    }, [])


    const {id} = useParams()

    function getAllEmployeesfunc() {

        axios.get(`http://localhost:8080/api/employee/manager/${id}`).then(function (response) {
                console.log(response.data);
                setEmployees(response.data);
            }
        );

    }

    return (
        <div>

            <h1>All Employees Manager {id} </h1>

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