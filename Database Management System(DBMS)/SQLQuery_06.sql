
--------- String Function ---------------

Select len(Null)
Select len(' hello ')
Select len('')

Select lower('UTTAM')
Select upper('uttam')

Select left('Uttam',3)

Select substring('Uttam Nagvadiya',3,10)

Select replace('abc123efg', '123', 'XYZ')
Select replace('abcabcabc', 'c', '5')

Select ascii('a')
Select ascii('A')
Select ascii('z')
Select ascii('Z')
Select ascii(0)
Select ascii(9)

Select char(97)
Select char(65)
Select char(122)
Select char(90)
Select char(48)
Select char(57)

Select ltrim('     hello world      ')

Select rtrim('       hello world         ')

Select left('SQL Server', 4), right('SQL Server', 5)
 
Select cast('1234.56' as decimal(8,2))

Select convert(int, 10.58)

Select space(10) + 'Uttam'

Select concat('Uttam', ' ', 'Nagvadiya') 
Select 'Uttam' + space(1) + 'Nagvadiya'

Select reverse('Darshan')

Select replicate('Uttam', 3)

Select stuff('WebDesign', 1, 3, 'HTML')

Select coalesce(Null, 'xyz', 'pqr')
Select coalesce('abc', null, null)
Select coalesce(Null, null, 'efg')

Select isnumeric('xyz')
Select isnumeric(123)

Select charindex('e', 'customer')
Select charindex('i', 'Admission',5)