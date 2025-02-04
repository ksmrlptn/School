Create database TASKPERFORMANCE

Use TASKPERFORMANCE

Create Table StudentGrade (
CourseCode Varchar(50) Primary Key,
CourseTitle Varchar(50),
Units Int,
Grade Float
);

Insert into StudentGrade (CourseCode, CourseTitle, Units, Grade) Values
('COSC1003', 'Data Structures and Algorithm', 3, 1.50),
('GEDC1006', 'Reading in Philippine History', 3, 2.25),
('PHED1003', 'Physical Education 3', 2, 1.25),
('GEDC1014', 'Rizal`s Life and Works', 3, 1.50),
('COSC1007', 'Human-Computer Interaction', 3, 1.25),
('INTE1044', 'Object-Oriented Programming', 3, 1.75),
('COSC1001', 'Principles of Communication', 3, 2.25),
('COSC1008', 'Platform Technology', 3, 1.50);

SELECT COUNT(*) AS Number_of_courses
FROM StudentGrade;

SELECT SUM(Units) AS Total_units
FROM StudentGrade;

SELECT COUNT(*) AS Courses_with_grades_lower_than_2
FROM StudentGrade
WHERE Grade < 2.00;

SELECT COUNT(*) AS Courses_with_grades_higher_than_2
FROM StudentGrade
WHERE Grade > 2.00;

SELECT ROUND(SUM(Units * Grade) / SUM(Units), 2) AS General_weighted_average
FROM StudentGrade;
