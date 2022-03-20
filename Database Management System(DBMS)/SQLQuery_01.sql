
------------2.1 Queries (SELECT Operation)-------------

Select * From Deposit

Select * From Borrow

Select * From Customers

Select ACTNO, CNAME, AMOUNT From Deposit

Select LOANNO, AMOUNT From Borrow

Select * From Borrow Where BNAME = 'ANDHERI'

Select ACTNO, AMOUNT From Deposit Where ACTNO = 106

Select * From Borrow Where AMOUNT > 5000

Select CNAME From Deposit Where ADATE > '1996-12-01'

Select CNAME From Deposit Where ACTNO < 105

Select CNAME From Customers Where CITY = 'Nagpur' or CITY = 'Delhi'
Select CNAME From Customers Where CITY in ('Nagpur', 'Delhi')

Select CNAME, BNAME From Deposit Where AMOUNT > 4000 and ACTNO < 105

Select * From Borrow Where AMOUNT >= 3000 and AMOUNT <= 8000
Select * From Borrow Where AMOUNT between 3000 and 8000

Select * From Deposit Where BNAME <> 'ANDHERI'
Select * From Deposit Where BNAME != 'ANDHERI'

Select CNAME From Borrow Where AMOUNT is Null

Select ACTNO, CNAME, AMOUNT From Deposit Where BNAME in ('AJNI', 'KAROLBAGH', 'M.G.ROAD') and ACTNO < 104

Select Top 5 * From Borrow

Select Top 3 * From Deposit Where AMOUNT > 1000

Select Top 5 CNAME, LOANNO From Borrow Where BNAME <> 'ANDHERI'

Select distinct CITY From Customers 

Select distinct BNAME From Branch

Select * From Customers Order by CITY asc

Select * From Deposit Order by AMOUNT asc
Select * From Deposit Order by AMOUNT desc

Select * From Customers Order by CITY desc

Select CNAME as uni_borrowers From Borrow







-----------------2.2 Queries (UPDATE Operation)------------------

Update Deposit set AMOUNT = 5000 Where AMOUNT = 3000 

Update Borrow set BNAME = 'C.G.ROAD' Where BNAME = 'VRCE' and CNAME = 'Anil'

Update Deposit set ACTNO = 111, AMOUNT = 5000 Where CNAME = 'Sandip'

Update Borrow set AMOUNT = (AMOUNT + AMOUNT * 0.1)

Update Deposit set AMOUNT = 5000 Where ACTNO between 103 and 107

----Update Borrow set AMOUNT = Null Where LOANNO = 321

Update Borrow set LOANNO = 401, BNAME = 'AJNI' Where LOANNO = 201 and BNAME = 'C.G.ROAD'

Update Customers set CNAME = 'Anil Jain' Where CNAME = 'Anil'

Update Deposit set CNAME = 'Ramesh', BNAME = 'VRCE', AMOUNT = 5500 Where ACTNO = 102

----Update Borrow set BNAME = Null, AMOUNT = Null Where LOANNO = 481 and CNAME = 'Kranti'








----------------2.3 Queries (DELETE/ DROP/ TRUNCATE Operration)-----------------

Delete From Customers Where CITY = 'Bombay'

Delete From Deposit Where AMOUNT <= 1000

Delete From Borrow Where BNAME = 'AJNI'

Delete From Borrow Where LOANNO > 201 and LOANNO < 210

Delete From Deposit Where ADATE > '1996-12-01'

Truncate Table Customers

Delete From Deposit Where CNAME = 'Anil' and ACTNO = 101

Delete From Deposit Where BNAME <> 'ANDHERI'

Delete From Borrow Where AMOUNT < 2000 and BNAME <> 'VRCE'

Drop Table Branch