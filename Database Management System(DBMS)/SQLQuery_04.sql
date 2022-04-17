
--------- PK, FK, UK, Auto Increment, Default Values, Null, Not Null, Check ----------- 

Create Table CITY_MASTER
(
	CityID int Not Null Primary Key Identity(101, 1),
	CityName varchar(20) Not Null Unique,
	PinCode varchar(10), 
	STDCode varchar(10)
)


Create Table STUDENT_MASTER_2
(
	StudentID int Not Null Primary Key Identity(101, 1),
	Enrollment_No varchar(20) Not Null Unique,
	Name varchar(25) Not Null,
	CPI decimal(5,2) Check(CPI<=10),
	JoiningDate datetime Not Null Default getdate(),
	Bklog int Check(Bklog > 0),
	CityID int Foreign Key References CITY_MASTER(CityID),
	StateName varchar(50) Default 'Gujarat'
)