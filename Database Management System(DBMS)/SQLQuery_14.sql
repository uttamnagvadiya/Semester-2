
------------------ User Defined Function (UDF) -------------

1.	Declare @x int
	set @x = 1
	begin
		While(@x <= 10)
		begin
			print @x
			set @x= @x+1
		end
	end



2.	Declare @No int
	set @No = 14
	begin
		if @No % 2 = 0
		print 'This Number is Even.'
		else 
		print 'This Number is Odd.'
	end	



3.	Declare @z int 
	set @z = 1
	begin 
		while(@z <= 10)
		begin
			if @z % 2 != 0
				print @z
			set @z = @z + 1
		end
	end 



4.	Declare @sum int, @a int
	set @sum = 0
	set @a = 1
	begin
		while(@a <= 50)
		begin
			set @sum = @sum + @a
			set @a = @a + 1
		end
		print @sum
	end



5.	Declare @ev int 
	set @ev = 1
	begin
		while(@ev <= 20)
		begin
			if (@ev % 2 = 0)
				print @ev
			set @ev = @ev + 1
		end
	end
			


6.	Create Procedure Prime_No
	@N int
	as
	Declare @pr int, @i int
	set @pr = 2
	set @i = 1
	while(@pr <= @N/2)
		begin
			if (@N % @pr = 0)
			begin
				set @i = 0
				break
			end
			set @pr = @pr + 1
		end
	if (@i = 1)
		print 'This is Prime Number.'
	else
		print 'This is Not Prime Number.'


	exec Prime_No 67



7.	Create Table Even (No int)
	Create Table Odd (No int)

	Declare @num int
	set @num = 1
	while (@num <= 50)
	begin 
		if (@num % 2 = 0)
			Insert into Even (No) Values (@num);
		else
			Insert into Odd (No) Values (@num);

		set @num = @num + 1
	end
		

	Select * from Even
	Select * from Odd

