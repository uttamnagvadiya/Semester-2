
---------------------------------- User Define Function (UDF) -------------------------------------------

1.	Create Function print1to10()
	returns varchar(100)
	as
	begin
		declare @x int, @demo varchar(100)   
		set @x = 1
		set @demo=''
		while (@x <= 10)
		begin
			Select @demo = @demo + cast(@x as varchar(10)) + ', '
			set @x = @x + 1
		end
		return @demo
	end

	Select dbo.print1to10()



2.	Create Function OddEven(@num int)
	returns varchar(10)
	as
	begin
		declare @demo varchar(100)
		if @num % 2 = 0
		begin
			set @demo='Even'
		end
		else
		begin
			set @demo='Odd'
		end
		return @demo
	end

	Select dbo.OddEven(14)


3.	Create Function Odd1to10()
	returns varchar(100)
	as
	begin
		declare @i int, @demo varchar(100)
		set @i = 1
		set @demo=''
		while (@i <= 10)
		begin
			if (@i%2 != 0)
			begin
				Select @demo = @demo + cast(@i as varchar(10)) + ', '
			end
			set @i = @i + 1
		end
		return @demo
	end

	Select dbo.Odd1to10()



4.	Create Function Sumof50()
	returns int
	as
	begin
		declare @i int, @sum int
		set @i=1
		set @sum=0
		while (@i <= 50)
		begin
			set @sum=@sum+@i
			set @i=@i+1
		end
		return @sum
	end

	Select dbo.Sumof50()



5.	Create Function Even20()
	returns int
	as 
	begin 
		declare @i int, @sum int
		set @i=1
		set @sum=0
		while (@i <= 20)
		begin
			if (@i%2=0)
			begin
				set @sum=@sum+@i
			end
			set @i=@i+1
		end
		return @sum
	end

	Select dbo.Even20()



6.	Create Function PrimeNumber(@num int)
	returns varchar(10)
	as
	begin
		declare @demo varchar(10), @i int = 2
		while (@i < @num)
		begin
			if (@num % @i = 0)
			begin
				set @demo = 'not Prime.'
				break
			end
			else
			begin
				set @demo = 'Prime.'
			end
			set @i=@i+1
		end
		return @demo
	end

	Select dbo.PrimeNumber(45)