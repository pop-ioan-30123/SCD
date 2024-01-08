import {useEffect, useState} from "react";
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import AllEmployeesByDepartment2 from "./AllEmployeesByDepartment2";
import GetAllEmployees from "./GetAllEmployees";
import AllEmployeesByManager from "./AllEmployeesByManager";
import axios from "axios";
import {getValue} from "@testing-library/user-event/dist/utils";

export default function AllEmployeesByDepartment() {
    const [input, setInputs] = useState(0)

    var str = "test";
    const handleChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        str= String(value);

        setInputs(values => ({ ...values, [name]: value })); // Convert the string to an integer before adding it to the state
    };


    const handleSubmit = (event) => {
        event.preventDefault();
        handleChange("Department ID", input); // Update the state before submitting
        // Submit the form using formData
        const formData = new FormData();
        formData.append("Department ID", input);
        // Submit the formData object
        fetch(`http://localhost:8080/api/employee/department/${input}`, {
            method: "GET",
            body: formData,
        });
    };



    return (
        <div>

            <h1>All Employees by Department ID</h1>

           <form onSubmit={handleSubmit}>
               <table cellSpacing="10px">
                    <tbody>
                    <tr>
                        <th>
                            <label> Department ID:</label>
                        </th>

                        <td>
                            <input type = "number" id= "tbuser" name="Department ID" onChange={handleChange}/>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/department/${1}`}>
                            <button onClick={handleChange}>Department 1</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/department/${2}`}>
                                <button onClick={handleChange}>Department 2</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/department/${3}`}>
                                <button onClick={handleChange}>Department 3</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/department/${4}`}>
                                <button onClick={handleChange}>Department 4</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/department/${5}`}>
                                <button onClick={handleChange}>Department 5</button>
                            </Link>
                        </td>
                    </tr>

                    </tbody>
               </table>
           </form>
        </div>
    );
}