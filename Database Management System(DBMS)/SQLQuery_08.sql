Create Table Employee
(
	EID int not Null,
	EName varchar(50) not Null,
	Department varchar(50) not Null,
	Salary decimal(8,2) not Null,
	JoiningDate datetime not Null,
	City varchar(50) not Null
);


---------- Records -----------

Insert into Employee Values(101, 'Rahul', 'Admin', 56000, '1990-Jan-01', 'Rajkot')
Insert into Employee Values(102, 'Hardik', 'IT', 18000, '1990-Sep-25', 'Ahmedabad')
Insert into Employee Values(103, 'Bhavin', 'HR', 25000, '1991-May-14', 'Baroda')
Insert into Employee Values(104, 'Bhoomi', 'Admin', 39000, '1991-Feb-08', 'Rajkot')
Insert into Employee Values(105, 'Rohit', 'IT', 17000, '1990-Jul-23', 'Jamnagar')
Insert into Employee Values(106, 'Priya', 'IT', 9000, '1990-Oct-18', 'Ahmedabad')
Insert into Employee Values(107, 'Neha', 'HR', 34000, '1990-Dec-25', 'Rajkot')





----------- Lab-8 (Group By & Having) -------------



1.	Select max(Salary) as Max_Sal,
		   min(Salary) as Min_Sal,
		   sum(Salary) as Total_Sal,
		   avg(Salary) as Avg_Sal
	From Employee


2.	Select count(*) as Total_Record
	From Employee


3.	Select max(Salary) as Max_Sal_IT
	From Employee
	Where Department = 'IT'


4.	Select count(Distinct City) as Num_of_City
	From Employee


5.	Select City, count(*) as Total_Emp
	From Employee
	Group by City


6.	Select City, count(*) as Total_Emp
	From Employee
	Group by City
	Having count(*)>1


7.	Select Department, sum(Salary) as Total_Sal
	From Employee
	Group by Department


8.	Select avg(Salary) as Avg_Sal
	From Employee
	Group by Department


9.	Select min(Salary) as Min_Sal
	From Employee
	Where City = 'Ahmedabad'


10.	Select Department, sum(Salary) as Total_Sal
	From Employee
	Where City = 'Rajkot'
	Group by Department
	Having sum(Salary)>5000


11.	Select count(*) as Total_Emp
	From Employee
	Where City = 'Rajkot'


12.	Select max(Salary) - min(Salary) as Sal_Difference
	From Employee


13.	Select count(*) as Hired_Emp
	From Employee
	Where JoiningDate < '1991-Jan-01'


14.	Select Department, sum(Salary) as Total_Sal
	From Employee
	Group by Department
	Having sum(Salary)>35000
	Order by sum(Salary)


15.	Select Department, count(*) as Dep_Emp
	From Employee
	Group by Department
	Having count(*)>2


16.	Select min(Salary) as Min_Sal
	From Employee
	Where City = 'Rajkot'


17.	Select City, count(*)
	From Employee 
	Group by City


18.	Select Department, min(Salary) as Min_Sal
	From Employee
	Group by Department


19.	Select sum(Salary) as Total_Sal
	From Employee
	Group by City


20.	Select Department, min(Salary) as Min_Sal, 
					   max(Salary) as Max_Sal,
					   sum(Salary) as Total_Sal
	From Employee
	Group by Department


21.	Select City, Department, min(Salary) as Min_Sal,
							 max(Salary) as Max_Sal
	From Employee
	Group by City, Department
	Having min(Salary) < 30000