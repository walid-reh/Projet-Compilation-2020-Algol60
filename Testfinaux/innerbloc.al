begin
comment dynamic memory allocation in inner block;
	integer n;

	n := 100;
	begin
		integer array a[1:n];
		a[n] := n;
		outinteger (1, a[n])
	end

end

