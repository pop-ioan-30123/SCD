import {useState} from "react";
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import AllEmployeesByManager2 from "./AllEmployeesByManager2";

import axios from "axios";

export default function AllEmployeesByManager() {
    const [inputs, setInputs] = useState([])

    var idsave ;

    const handleChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        idsave = event.target.value;
        const strValue = String(value); // Convert the input value to a string
        setInputs(values => ({ ...values, [name]: parseInt(strValue) })); // Convert the string to an integer before adding it to the state
    };

    const strValue = String(idsave);
    let iid = parseFloat(String(strValue)); // Convert the saved ID string to an integer


    const handleSubmit= (event) => {
        event.preventDefault();

        console.log(inputs);
    }


    return (
        <div>

            <h1>All Employees by Manager ID</h1>

            <form onSubmit={handleSubmit}>
                <table cellSpacing="10px">
                    <tbody>
                    <tr>
                        <th>
                            <label> Manager ID:</label>
                        </th>

                        <td>
                            <input type = "number" id= "tbuser" name="Manager ID" onChange={handleChange}/>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${1}`}>
                                <button onClick={handleChange}>Manager 1</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${2}`}>
                                <button onClick={handleChange}>Manager 2</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${3}`}>
                                <button onClick={handleChange}>Manager 3</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${4}`}>
                                <button onClick={handleChange}>Manager 4</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${5}`}>
                                <button onClick={handleChange}>Manager 5</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${6}`}>
                                <button onClick={handleChange}>Manager 6</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${7}`}>
                                <button onClick={handleChange}>Manager 7</button>
                            </Link>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <Link to={`/api/employee/manager/${8}`}>
                                <button onClick={handleChange}>Manager 8</button>
                            </Link>
                        </td>
                    </tr>

                    </tbody>
                </table>
            </form>
        </div>
    );
}