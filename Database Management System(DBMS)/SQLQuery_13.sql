1.	Create view Personal
	as
	Select * from Student_V
	Select * from Personal


2.	Create view Student_Details
	as 
	Select Name, Branch, SPI from Student_V
	Select * from Student_Details


3.	Create view Academic
	as
	Select RNo, Name, Branch from Student_V
	Select * from Academic


4.	Create view Student_Data
	as
	Select * from Student_V
	Where Bklog > 2
	Select * from Student_Data


5.	Create view Student_Pattern
	as
	Select RNo, Name, Branch from Student_V
	Where Name like '____'
	Select * from Student_Pattern

	
6.	Insert into Academic values (107, 'Meet', 'ME')
	Select * from Academic


7.	Update Student_Details set Branch = 'ME'
	Where Name = 'Amit'
	Select * from Student_Details


8.	Delete from Academic 
	Where RNo = 104
	Select * from Academic

9.	Create view HighResult
	as
	Select * from Student_V
	Where SPI > 9.5
	Select * from HighResult


10.	Create view BL
	as 
	Select * from Student_V
	Where Bklog = 0
	Select * from BL

