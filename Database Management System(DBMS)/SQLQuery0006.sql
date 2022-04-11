
--------- String Function ---------------

select len(Null)
select len(' hello ')
select len('')

select lower('UTTAM')
select upper('uttam')

select left('Uttam',3)

select substring('Uttam Nagvadiya',3,10)

select replace('abc123efg', '123', 'XYZ')
select replace('abcabcabc', 'c', '5')

select ascii('a')
select ascii('A')
select ascii('z')
select ascii('Z')
select ascii(0)
select ascii(9)

select char(97)
select char(65)
select char(122)
select char(90)
select char(48)
select char(57)

select ltrim('     hello world      ')

select rtrim('       hello world         ')

select left('SQL Server', 4), right('SQL Server', 5)
 
select cast('1234.56' as decimal(8,2))

select convert(int, 10.58)

select space(10) + 'Uttam'

select concat('Uttam', ' ', 'Nagvadiya') 
select 'Uttam' + space(1) + 'Nagvadiya'

select reverse('Darshan')

select replicate('Uttam', 3)

select stuff('WebDesign', 1, 3, 'HTML')

select coalesce(Null, 'xyz', 'pqr')
select coalesce('abc', null, null)
select coalesce(Null, null, 'efg')

select isnumeric('xyz')
select isnumeric(123)

select charindex('e', 'customer')
select charindex('i', 'Admission',5)