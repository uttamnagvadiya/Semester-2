
------------------------- VIEW ------------------------

Create Table Student01
(
	RollNo int Primary Key Identity(101, 1),
	Name varchar(50),
	Branch varchar(50),
	SPI decimal(4, 2),
	Bklog int  
)

-- Records --
Insert into Student01 values ('Raju', 'CE', 8.80, 0)
Insert into Student01 values ('Amit', 'CE', 2.20, 3)
Insert into Student01 values ('Sanjay', 'ME', 1.50, 6)
Insert into Student01 values ('Neha', 'EC', 7.65, 1)
Insert into Student01 values ('Meera', 'EE', 5.52, 2)
Insert into Student01 values ('Mahesh', 'EC', 4.50, 3)


------------------------------------------------------------------------


1.	Create view Personal
	as
	Select * from Student01
	Select * from Personal
	
	
2.	Create view Student_Details
	as 
	Select Name, Branch, SPI from Student01
	Select * from Student_Details
	
	
3.	Create view Academic
	as
	Select RollNo, Name, Branch from Student01
	Select * from Academic
	
	
4.	Create view Student_Data
	as
	Select * from Student01
	Where Bklog > 2
	Select * from Student_Data
	
	
5.	Create view Student_Pattern
	as
	Select RollNo, Name, Branch from Student01
	Where Name like '____'
	Select * from Student_Pattern
	
	
6.	Insert into Academic values ('Meet', 'ME')
	Select * from Academic
	
	
7.	Update Student_Details set Branch = 'ME'
	Where Name = 'Amit'
	Select * from Student_Details
	
	
8.	Delete from Academic 
	Where RollNo = 104
	Select * from Academic
	
	
9.	Create view HighResult
	as
	Select * from Student01
	Where SPI > 9.5
	Select * from HighResult
	
	
10.	Create view BL
	as 
	Select * from Student01
	Where Bklog = 0
	Select * from BL