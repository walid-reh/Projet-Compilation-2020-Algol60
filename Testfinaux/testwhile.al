begin
	integer i, n;
	outstring(1,"for-while\n");
	n := 0;
	for i:=1 while n<11 do
	begin
		outinteger(1,n);
		n := n+1
	end
end
