Create Table Students
(
	StuID int,
	FirstName varchar(25),
	LastName varchar(25),
	Website varchar(50),
	City varchar(25),
	Division varchar(20)
);



--------------Students Records---------------

Insert into Students Values(1011, 'Keyur', 'Patel', 'techonthenet.com', 'Rajkot', 'II-BCX')
Insert into Students Values(1022, 'Hardik', 'Shah', 'digminecraft.com', 'Ahmedabad', 'I-BCY')
Insert into Students Values(1033, 'Kajal', 'Trivedi', 'bigactivities.com', 'Baroda', 'IV-DCX')
Insert into Students Values(1044, 'Bhoomi', 'Gajera', 'checkyourmath.com', 'Ahmedabad', 'III-DCW')
Insert into Students Values(1055, 'Harmit', 'Mitel', Null, 'Rajkot', 'II-BCY')
Insert into Students Values(1066, 'Ashok', 'Jani', Null, 'Baroda', 'II-BCZ')





--------------------- Queries (LIKE Operation)------------------------


1.	Select * From Students Where FirstName like 'k%'

2.	Select * From Students Where FirstName like '_____'

3.	Select FirstName, LastName From Students Where City like '_____a'

4.	Select * From Students Where LastName like '%tel'

5.	Select * From Students Where FirstName like 'ha%t'

6.	Select * From Students Where FirstName like 'k_y%'

7.	Select * From Students Where Website is Null and FirstName like '_____'

8.	Select * From Students Where LastName like '%jer%'

9.	Select * From Students Where City like '[r,b]%'

10.	Select * From Students Where Website is Not Null

11.	Select * From Students Where FirstName like '[a-h]%'

12.	Select * From Students Where FirstName like '_[a,e,i,o,u]%'

13.	Select FirstName From Students Where City like '%rod%'

14.	Select FirstName, LastName From Students Where Website like 'bi%'

15.	Select City From Students Where LastName like '______'

16.	Select * From Students Where City like '_____' and City Not like 'ba%'

17.	Select * From Students Where Division like 'II%'

18.	Select FirstName From Students Where Division like '%bc%'

19.	Select StuID, City From Students Where Division like '_______' and Website is Not Null

20.	Select * From Students Where FirstName Not like '__[a,e,i,o,u]%'
