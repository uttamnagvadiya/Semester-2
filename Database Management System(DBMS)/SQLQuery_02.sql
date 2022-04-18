
-------------- Queries (ALTER Operation)-------------

1.	Select * From Student_Master

2.	Alter Table Student add City varchar(20), Backlog int Not Null

3.	Alter Table Student Alter Column Name varchar(35)

4.	Alter Table Student Alter Column CPI int 

5.	Sp_Rename 'Student.Enrollment_No', 'ENO', 'Column'

6.	Alter Table Student Drop Column City

7.	Sp_Rename 'Student', 'Student_Master'

8.	Alter Table Student_Master Drop Column Backlog

9.	Alter Table Student_Master Alter Column Name varchar(35) Not Null

10.	Sp_Rename 'Student_Master.Birthdate', 'BDate', 'Column'

11.	Alter Table Student_Master Alter Column ENO varchar(12)

