begin
comment classic recursive procedure;
	integer nn, nf;

	integer procedure factorial(n); value n; integer n;
	begin
		if n = 1 then factorial := 1
		else factorial := n * factorial(n-1)
	end;

	nn := 5;
	nf := factorial(nn);
	outinteger ( 1 , nf)

end
