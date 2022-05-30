Create Table Student00
(
	Rno int,
	Name varchar(50),
	City varchar(50),
	DID int
)

Create Table Academic00
(
	Rno int,
	SPI decimal(4, 2),
	Bklog int
)

Create Table Department00
(
	DID int,
	DName varchar(50)
)



------------------------------- Records -----------------------------------

Insert into Student00 Values (101, 'Raju', 'Rajkot', 10)
Insert into Student00 Values (102, 'Amit', 'Ahmedabad', 20)
Insert into Student00 Values (103, 'Sanjay', 'Baroda', 40)
Insert into Student00 Values (104, 'Neha', 'Rajkot', 20)
Insert into Student00 Values (105, 'Meera', 'Ahmedabad', 30)
Insert into Student00 Values (106, 'Mahesh', 'Baroda', 10)


Insert into Academic00 Values (101, 8.8, 0)
Insert into Academic00 Values (102, 9.2, 2)
Insert into Academic00 Values (103, 7.6, 1)
Insert into Academic00 Values (104, 8.2, 4)
Insert into Academic00 Values (105, 7.0, 2)
Insert into Academic00 Values (106, 8.9, 3)


Insert into Department00 Values (10, 'Computer')
Insert into Department00 Values (20, 'Electrical')
Insert into Department00 Values (30, 'Mechanical')
Insert into Department00 Values (40, 'Civil')




----------------------------------------------------------------------------------------

1.	Select Rno, Name, City
	From Student00
	Where DID =	(Select DID From Department00
					Where DName = 'Computer')


2.	Select Name From Student00
	Where Rno in (Select Rno From Academic00
					Where SPI > 8)


3.	Select Rno, Name, City From Student00
	Where City = 'Rajkot' And DID = (Select DID From Department
										Where DName = 'Computer')


4.	Select Count(*) From Student00
	Where DID = (Select DID From Department00
					Where DName = 'Electrical')


5.	Select Name From Student00
	Where Rno = (Select Rno From Academic00
					Where SPI = (Select max(SPI) From Academic00))


6.	Select * From Student00
	Where Rno in (Select Rno From Academic00
					Where Bklog > 1) 


7.	Select Name From Student00
	Where Rno = (Select Rno From Academic00
					Where SPI = (Select max(SPI) From Academic00
									Where SPI < (Select max(SPI) From Academic00)))


									-- _OR_ --


	Select Name From Student00
	Where Rno = (Select Rno From Academic00
					Where SPI = (Select Top 1 SPI From (Select Distinct Top 2 SPI From Academic00
															Order by SPI Desc) as Temp
																Order by SPI Asc))



8.	Select Name From Student00
	Where DID in (Select DID From Department00
					Where DName = 'Computer' or DName = 'Mechanical')



9.	Select Name From Student00
	Where DID = (Select DID From Student00
					Where Rno = 102)



10.	Select Name From Student00
	Where Rno in (Select Rno From Academic00 Where SPI > 9)
	And
	DID = (Select DID From Department00 Where DName = 'Electrical')