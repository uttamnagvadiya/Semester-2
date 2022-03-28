Insert into Employee Values(101, 'Rahul', 'Admin', 56000, '1990-Jan-01', 'Rajkot')
Insert into Employee Values(102, 'Hardik', 'IT', 18000, '1990-Sep-25', 'Ahmedabad')
Insert into Employee Values(103, 'Bhavin', 'HR', 25000, '1991-May-14', 'Baroda')
Insert into Employee Values(104, 'Bhoomi', 'Admin', 39000, '1991-Feb-08', 'Rajkot')
Insert into Employee Values(105, 'Rohit', 'IT', 17000, '1990-Jul-23', 'Jamnagar')
Insert into Employee Values(106, 'Priya', 'IT', 9000, '1990-Oct-18', 'Ahmedabad')
Insert into Employee Values(107, 'Neha', 'HR', 34000, '1990-Dec-25', 'Rajkot')




------------ Lab 8 --------------


Select max(Salary) as Max_Sal,
	min(Salary) as Min_Sal,
	sum(Salary) as Total_Sal,
	avg(Salary) as Avg_Sal
From Employee

Select count(*) as Total_Record
From Employee

Select max(Salary) as Max_Sal_IT
From Employee
Where Department = 'IT'

Select count(Distinct City) as Num_of_City
From Employee

Select City, count(*) as Total_Emp
From Employee
Group by City

Select City, count(*) as Total_Emp
From Employee
Group by City
Having count(*)>1

Select Department, sum(Salary) as Total_Sal
From Employee
Group by Department

Select avg(Salary) as Avg_Sal
From Employee
Group by Department

Select min(Salary) as Min_Sal
From Employee
Where City = 'Ahmedabad'

Select Department, sum(Salary) as Total_Sal
From Employee
Where City = 'Rajkot'
Group by Department
Having sum(Salary)>5000

Select count(*) as Total_Emp
From Employee
Where City = 'Rajkot'

Select max(Salary) - min(Salary) as Sal_Difference
From Employee

Select count(*) as Hired_Emp
From Employee
Where JoiningDate < '1991-Jan-01'

Select Department, sum(Salary) as Total_Sal
From Employee
Group by Department
Having sum(Salary)>35000
Order by sum(Salary)

Select Department, count(*) as Dep_Emp
From Employee
Group by Department
Having count(*)>2

Select min(Salary) as Min_Sal
From Employee
Where City = 'Rajkot'

Select City, count(*)
From Employee 
Group by City

Select Department, min(Salary) as Min_Sal
From Employee
Group by Department

Select sum(Salary) as Total_Sal
From Employee
Group by City

Select Department, min(Salary) as Min_Sal, 
					max(Salary) as Max_Sal,
					sum(Salary) as Total_Sal
From Employee
Group by Department

Select City, Department, min(Salary) as Min_Sal,
						 max(Salary) as Max_Sal
From Employee
Group by City, Department
Having min(Salary) < 30000






	 

