Create Table Student
(
	Rno int ,
	Name varchar(50) ,
	Branch varchar(50)
)
Create Table Result
(
	Rno int ,
	SPI decimal(4,2)
)
Create Table Employee
(
	EmployeeNo varchar(50),
	Name varchar(50),
	ManagerNo varchar(50)
)


------------------ Records ------------------------

--Student Table--
Insert into Student Values (101, 'Raju', 'CE')
Insert into Student Values (102, 'Amit', 'CE')
Insert into Student Values (103, 'Sanjay', 'ME')
Insert into Student Values (104, 'Neha', 'EC')
Insert into Student Values (105, 'Meera', 'EE')
Insert into Student Values (106, 'Mahesh', 'ME')

--Result Table--
Insert into Result Values (101, 8.8)
Insert into Result Values (102, 9.2)
Insert into Result Values (103, 7.6)
Insert into Result Values (104, 8.2)
Insert into Result Values (105, 7.0)
Insert into Result Values (107, 8.9)

--Employee Table--
Insert into Employee Values ('E01', 'Tarun', Null)
Insert into Employee Values ('E02', 'Rohan', 'E02')
Insert into Employee Values ('E03', 'Priya', 'E01')
Insert into Employee Values ('E04', 'Milan', 'E03')
Insert into Employee Values ('E05', 'Jay', 'E01')
Insert into Employee Values ('E06', 'Anjana', 'E04')

-----------------------------------------------------------------

Select *
From Student
Cross Join Result


Select Student.Rno, Student.Name, Student.Branch, Result.SPI
From Student
Inner Join Result
on Student.Rno = Result.Rno
Where Student.Branch = 'CE'


Select Student.Rno, Student.Name, Student.Branch, Result.SPI
From Student
Left Outer Join Result
on Student.Rno = Result.Rno
Where Student.Branch <> 'EC'


Select Student.Branch, avg(Result.SPI) as Avg_SPI
From Student
Inner Join Result
on Student.Rno = Result.Rno
Group by Student.Branch


Select Student.Branch, avg(Result.SPI) as Avg_SPI
From Student
Inner Join Result
on Student.Rno = Result.Rno
Group by Student.Branch
Order by avg(SPI) asc


Select Student.Branch, avg(Result.SPI) as Avg_SPI
From Student
Inner Join Result
on Student.Rno = Result.Rno
Where Student.Branch in ('CE', 'ME')
Group by Student.Branch


Select *
From Student
Left Outer Join Result
on Student.Rno = Result.Rno


Select *
From Student
Right Outer Join Result
on Student.Rno = Result.Rno


Select *
From Student
Full Outer Join Result
on Student.Rno = Result.Rno