
-------------- Queries (ALTER Operation)-------------

Select * From Student_Master

Alter Table Student add City varchar(20), Backlog int Not Null

Alter Table Student Alter Column Name varchar(35)

Alter Table Student Alter Column CPI int 

Sp_Rename 'Student.Enrollment_No', 'ENO', 'Column'

Alter Table Student Drop Column City

Sp_Rename 'Student', 'Student_Master'

Alter Table Student_Master Drop Column Backlog

Alter Table Student_Master Alter Column Name varchar(35) Not Null

Sp_Rename 'Student_Master.Birthdate', 'BDate', 'Column'

Alter Table Student_Master Alter Column ENO varchar(12)

