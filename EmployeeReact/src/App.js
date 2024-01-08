
import './App.css';
import {BrowserRouter, Route, Routes, Link} from 'react-router-dom'
import GetAllEmployees from "./Components/GetAllEmployees";
import AllEmployeesByDepartment from "./Components/AllEmployeesByDepartment";
import AllEmployeesByManager from "./Components/AllEmployeesByManager";
import AllEmployeesByManager2 from "./Components/AllEmployeesByManager2";
import AllEmployeesByDepartment2 from "./Components/AllEmployeesByDepartment2";
function App() {
  return (

      <div className="App">

          <h5>Department and Employee Application</h5>

          <BrowserRouter>
              <nav>
                <ul>
                    <li>
                        <Link to="/">AllEmployees</Link>
                    </li>
                    <li>
                        <Link to="api/employee/department">All Employees By Department</Link>
                    </li>
                    <li>
                        <Link to="api/employee/manager">All Employees By Manager</Link>
                    </li>
                </ul>
              </nav>
                  <Routes>
                      <Route index element={<GetAllEmployees />} />
                      <Route path="api/employee/department" element = {<AllEmployeesByDepartment />} />
                      <Route path="api/employee/manager" element = {<AllEmployeesByManager />} />
                      <Route path="api/employee/manager/:id" element = {<AllEmployeesByManager2 />} />
                      <Route path="api/employee/department/:id" element = {<AllEmployeesByDepartment2 />} />
                  </Routes>
          </BrowserRouter>

      </div>
  );
}

export default App;
