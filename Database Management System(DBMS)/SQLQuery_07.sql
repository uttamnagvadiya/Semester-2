-------------- Date Function ---------------

1.	Select getdate() as Today_Date

2.	Select getdate() + 365

3.	Select convert(varchar(50), getdate())

4.	Select convert(varchar(50), getdate(), 106)

5.	Select convert(varchar(50), getdate(), 107)

6.	Select DateDiff(Month, '31-Dec-08', '31-Mar-09')

7.	Select DateDiff(Year, '14-Sep-10', '25-Jan-12')

8.	Select DateDiff(Hour, '25-Jan-12 7:00', '26-Jan-12 10:30')

9.	Select day('12-May-16') as date, month('12-May-16') as month, year('12-May-16') as year

10.	Select DateADD(Year, 5, getdate())

11.	Select DateADD(Month, -2, getdate())

12.	Select DateName(Month, getdate())
	Select DatePart(Month, getdate())

13.	Select EoMonth(getdate())

14.	Select DateADD(Day, 30, getdate())
	Select getdate() + 30

15.	Select DateDiff(Year, '2004-01-05', getdate())




-------------------- Aggregate Functions -------------------

Create Table Student_Marks
(
	SID int Not Null,
	SName varchar(50) Not Null,
	Marks int Not Null
)

------- Records --------

Insert into Student_Marks Values(1, 'John', 90)
Insert into Student_Marks Values(2, 'Martin', 80)
Insert into Student_Marks Values(3, 'Carol', 89)
Insert into Student_Marks Values(4, 'Jack', 99)
Insert into Student_Marks Values(5, 'Rose', 88)
Insert into Student_Marks Values(6, 'Mary', 90)

---------------------------------------------------------

1.	Select count(SID) From Student_Marks

2.	Select sum(Marks) From Student_Marks

3.	Select avg(Marks) From Student_Marks

4.	Select min(Marks) From Student_Marks

5.	Select max(Marks) From Student_Marks