
------------2.1 Queries (SELECT Operation)-------------

1.	Select * From Deposit

2.	Select * From Borrow

3.	Select * From Customers

4.	Select ACTNO, CNAME, AMOUNT From Deposit

5.	Select LOANNO, AMOUNT From Borrow

6.	Select * From Borrow Where BNAME = 'ANDHERI'

7.	Select ACTNO, AMOUNT From Deposit Where ACTNO = 106

8.	Select * From Borrow Where AMOUNT > 5000

9.	Select CNAME From Deposit Where ADATE > '1996-12-01'

10.	Select CNAME From Deposit Where ACTNO < 105

11.	Select CNAME From Customers Where CITY = 'Nagpur' or CITY = 'Delhi'
	Select CNAME From Customers Where CITY in ('Nagpur', 'Delhi')

12.	Select CNAME, BNAME From Deposit Where AMOUNT > 4000 and ACTNO < 105

13.	Select * From Borrow Where AMOUNT >= 3000 and AMOUNT <= 8000
	Select * From Borrow Where AMOUNT between 3000 and 8000

14.	Select * From Deposit Where BNAME <> 'ANDHERI'
	Select * From Deposit Where BNAME != 'ANDHERI'

15.	Select CNAME From Borrow Where AMOUNT is Null

16.	Select ACTNO, CNAME, AMOUNT From Deposit Where BNAME in ('AJNI', 'KAROLBAGH', 'M.G.ROAD') and ACTNO < 104

17.	Select Top 5 * From Borrow

18.	Select Top 3 * From Deposit Where AMOUNT > 1000

19.	Select Top 5 CNAME, LOANNO From Borrow Where BNAME <> 'ANDHERI'

20.	Select distinct CITY From Customers 

21.	Select distinct BNAME From Branch

22.	Select * From Customers Order by CITY asc

23.	Select * From Deposit Order by AMOUNT asc
	Select * From Deposit Order by AMOUNT desc

24.	Select * From Customers Order by CITY desc

25.	Select CNAME as uni_borrowers From Borrow







-----------------2.2 Queries (UPDATE Operation)------------------

1.	Update Deposit set AMOUNT = 5000 Where AMOUNT = 3000 

2.	Update Borrow set BNAME = 'C.G.ROAD' Where BNAME = 'VRCE' and CNAME = 'Anil'

3.	Update Deposit set ACTNO = 111, AMOUNT = 5000 Where CNAME = 'Sandip'

4.	Update Borrow set AMOUNT = (AMOUNT + AMOUNT * 0.1)

5.	Update Deposit set AMOUNT = 5000 Where ACTNO between 103 and 107

6.	Update Borrow set AMOUNT = Null Where LOANNO = 321

7.	Update Borrow set LOANNO = 401, BNAME = 'AJNI' Where LOANNO = 201 and BNAME = 'C.G.ROAD'

8	Update Customers set CNAME = 'Anil Jain' Where CNAME = 'Anil'

9.	Update Deposit set CNAME = 'Ramesh', BNAME = 'VRCE', AMOUNT = 5500 Where ACTNO = 102

10.	Update Borrow set BNAME = Null, AMOUNT = Null Where LOANNO = 481 and CNAME = 'Kranti'









----------------2.3 Queries (DELETE/ DROP/ TRUNCATE Operration)-----------------

1.	Delete From Customers Where CITY = 'Bombay'

2.	Delete From Deposit Where AMOUNT <= 1000

3.	Delete From Borrow Where BNAME = 'AJNI'

4.	Delete From Borrow Where LOANNO > 201 and LOANNO < 210

5.	Delete From Deposit Where ADATE > '1996-12-01'

6.	Truncate Table Customers

7.	Delete From Deposit Where CNAME = 'Anil' and ACTNO = 101

8.	Delete From Deposit Where BNAME <> 'ANDHERI'

9.	Delete From Borrow Where AMOUNT < 2000 and BNAME <> 'VRCE'

10.	Drop Table Branch