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


Select * From Students Where FirstName like 'k%'

Select * From Students Where FirstName like '_____'

Select FirstName, LastName From Students Where City like '_____a'

Select * From Students Where LastName like '%tel'

Select * From Students Where FirstName like 'ha%t'

Select * From Students Where FirstName like 'k_y%'

Select * From Students Where Website is Null and FirstName like '_____'

Select * From Students Where LastName like '%jer%'

Select * From Students Where City like '[r,b]%'

Select * From Students Where Website is Not Null

Select * From Students Where FirstName like '[a-h]%'

Select * From Students Where FirstName like '_[a,e,i,o,u]%'

Select FirstName From Students Where City like '%rod%'

Select FirstName, LastName From Students Where Website like 'bi%'

Select City From Students Where LastName like '______'

Select * From Students Where City like '_____' and City Not like 'ba%'

Select * From Students Where Division like 'II%'

Select FirstName From Students Where Division like '%bc%'

Select StuID, City From Students Where Division like '_______' and Website is Not Null

Select * From Students Where FirstName Not like '__[a,e,i,o,u]%'
