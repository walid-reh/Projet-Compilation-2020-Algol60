begin
comment dynamical array allocation;
	integer n;
	n := 50;
	begin
		integer array nArr[1:n];
		nArr[n-1] := 234;
		outinteger(1,nArr[n-1])
	end
end

