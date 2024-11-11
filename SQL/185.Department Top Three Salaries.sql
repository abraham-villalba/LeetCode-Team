-- Select the columns needed in the final table.
SELECT Department.Name AS 'Department', rank_t.Name AS 'Employee', rank_t.Salary FROM
-- Generate the temporary table through windows functions.
(SELECT DepartmentId, Name, Salary, DENSE_RANK() OVER(PARTITION BY DepartmentID ORDER BY Salary DESC) AS r
FROM Employee) rank_t
-- Join the tables through their common column.
JOIN Department ON rank_t.DepartmentId = Department.Id
-- Filter the values equal or grater than 3.
WHERE r <= 3
