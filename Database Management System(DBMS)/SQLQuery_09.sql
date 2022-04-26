
--------------- SET OPERATORS --------------

Create Table Computer
(
	RollNo int,
	Name varchar(50)
);

Create Table Electrical
(
	RollNo int,
	Name varchar(50)
);




---- Records ----

Insert into Computer values (101, 'Ajay')
Insert into Computer values (109, 'Haresh')
Insert into Computer values (115, 'Manish')


Insert into Electrical values (105, 'Ajay')
Insert into Electrical values (107, 'Mahesh')
Insert into Electrical values (115, 'Manish')


-------------------------------------------------------------

1.	Select Name from Computer
	Union
	Select Name from Electrical


2.	Select Name from Computer
	Union all
	Select Name from Electrical


3.	Select Name from Computer
	Intersect
	Select Name from Electrical


4.	Select Name from Computer
	Except
	Select Name from Electrical
	

5.	Select Name from Electrical
	Except
	Select Name from Computer


6.	Select * from Computer
	Union
	Select * from Electrical


7.	Select * from Computer
	Intersect
	Select * from Electrical










------------------------ INTO ---------------------------

Create Table Cricket
(
	Name varchar(50),
	City varchar(50),
	Age int
)


---- Records ----

Insert into Cricket values ('Sachin Tendulkar', 'Mumbai', 30)
Insert into Cricket values ('Rahul Dravid', 'Bombay', 35)
Insert into Cricket values ('M.S.Dhoni', 'Jharkhand', 31)
Insert into Cricket values ('Suresh Raina', 'Gujarat', 30)


------------------------------------------------------------------------

1.	Select * into World_Cup from Cricket


2.	Select Name, City into T20 from Cricket 
	Where 1 = 2


3.	Select * into IPL from Cricket
	Where 1 = 2


4.	Insert into IPL
	Select * from Cricket
	Where Name like '_a_____'
	

5.	Truncate Table IPL


6.	Delete from Cricket 
	Where City = 'Jharkhand'


7.	Sp_Rename 'IPL', 'IPL2018'


8.	Drop Table T20
