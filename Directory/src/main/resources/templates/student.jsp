<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Profile - College Directory</title>
    <style>
        /* Global Styles */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f5;
            color: #333;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }

        .container {
            flex: 1;
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        /* Navigation Bar */
        nav {
            background-color: #004080;
            padding: 15px;
            text-align: center;
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }

        nav ul li {
            display: inline;
            margin-right: 20px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
            font-size: 18px;
        }

        nav ul li a:hover {
            text-decoration: underline;
        }

        /* Search Bar */
        .search-bar {
            margin: 20px 0;
            text-align: center;
        }

        .search-bar input,
        .search-bar select {
            padding: 10px;
            font-size: 16px;
            margin-right: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 180px;
            max-width: 100%;
        }

        .search-bar button {
            padding: 10px 20px;
            background-color: #004080;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .search-bar button:hover {
            background-color: #003060;
        }

        /* List View */
        .list-view {
            margin-top: 30px;
            overflow-x: auto;
        }

        .list-view table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 30px;
            font-size: 16px;
        }

        .list-view th,
        .list-view td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: left;
        }

        .list-view th {
            background-color: #004080;
            color: white;
        }

        /* Responsive Table */
        .list-view table {
            width: 100%;
            border-collapse: collapse;
        }

        .list-view th,
        .list-view td {
            padding: 15px;
            text-align: left;
            white-space: nowrap;
        }

        @media (max-width: 768px) {
            .list-view th,
            .list-view td {
                font-size: 14px;
                padding: 10px;
            }

            .search-bar input,
            .search-bar select {
                margin-bottom: 10px;
            }
        }

        /* Logout Button */
        .logout-button {
            background-color: #d9534f;
            color: white;
            border: none;
            padding: 10px 20px;
            margin-top: 20px;
            border-radius: 4px;
            cursor: pointer;
        }

        .logout-button:hover {
            background-color: #c9302c;
        }

        /* Footer */
        footer {
            text-align: center;
            padding: 20px;
            background-color: #004080;
            color: white;
            position: relative;
        }

    </style>
</head>

<body>

    <!-- Navigation Bar -->
    <nav>
        <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/about">About</a></li>
            <li><a href="/contact">Contact</a></li>
            <li><a href="/logout">Logout</a></li>
        </ul>
    </nav>

    <!-- Search Bar with Filters -->
    <div class="container">
        <div class="search-bar">
            <input type="text" id="search-name" placeholder="Search by name">
            <select id="search-department">
                <option value="">Select Department</option>
                <option value="CS">Computer Science</option>
                <option value="EE">Electrical Engineering</option>
                <option value="ME">Mechanical Engineering</option>
            </select>
            <select id="search-year">
                <option value="">Select Year</option>
                <option value="1">First Year</option>
                <option value="2">Second Year</option>
                <option value="3">Third Year</option>
                <option value="4">Fourth Year</option>
            </select>
            <button onclick="filterResults()">Search</button>
        </div>

        <!-- List View of Matching Students -->
        <div class="list-view">
            <h3>Student List</h3>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Department</th>
                        <th>Year</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody id="student-list">
                    <tr>
                        <td>John Doe</td>
                        <td>Computer Science</td>
                        <td>3rd Year</td>
                        <td><a href="mailto:john.doe@example.com">john.doe@example.com</a></td>
                    </tr>
                    <tr>
                        <td>Jane Roe</td>
                        <td>Electrical Engineering</td>
                        <td>2nd Year</td>
                        <td><a href="mailto:jane.roe@example.com">jane.roe@example.com</a></td>
                    </tr>
                    <tr>
                        <td>Michael Johnson</td>
                        <td>Mechanical Engineering</td>
                        <td>1st Year</td>
                        <td><a href="mailto:michael.johnson@example.com">michael.johnson@example.com</a></td>
                    </tr>
                </tbody>
            </table>
        </div>

        <!-- List View of Faculty Advisors -->
        <div class="list-view">
            <h3>Faculty Advisors</h3>
            <table>
                <thead>
                    <tr>
                        <th>Faculty Name</th>
                        <th>Department</th>
                        <th>Email</th>
                        <th>Phone</th>
                    </tr>
                </thead>
                <tbody id="faculty-list">
                    <tr>
                        <td>Dr. Jane Smith</td>
                        <td>Computer Science</td>
                        <td><a href="mailto:jane.smith@example.com">jane.smith@example.com</a></td>
                        <td><a href="tel:1234567890">123-456-7890</a></td>
                    </tr>
                    <tr>
                        <td>Dr. Robert Brown</td>
                        <td>Electrical Engineering</td>
                        <td><a href="mailto:robert.brown@example.com">robert.brown@example.com</a></td>
                        <td><a href="tel:9876543210">987-654-3210</a></td>
                    </tr>
                    <tr>
                        <td>Dr. Emily White</td>
                        <td>Mechanical Engineering</td>
                        <td><a href="mailto:emily.white@example.com">emily.white@example.com</a></td>
                        <td><a href="tel:5551234567">555-123-4567</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <!-- Footer -->
    <footer>
        &copy; 2024 College Directory. All Rights Reserved.
    </footer>

    <!-- JavaScript to filter search results -->
    <script>
        function filterResults() {
            const name = document.getElementById('search-name').value.toLowerCase();
            const department = document.getElementById('search-department').value;
            const year = document.getElementById('search-year').value;

            const students = document.querySelectorAll('#student-list tr');
            students.forEach(student => {
                const studentName = student.children[0].textContent.toLowerCase();
                const studentDepartment = student.children[1].textContent;
                const studentYear = student.children[2].textContent.charAt(0);

                if ((name === "" || studentName.includes(name)) &&
                    (department === "" || studentDepartment === department) &&
                    (year === "" || studentYear === year)) {
                    student.style.display = '';
                } else {
                    student.style.display = 'none';
                }
            });
        }
    </script>
</body>

</html>
