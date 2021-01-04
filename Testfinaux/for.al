begin
	integer n, i;
	integer k;
	integer s;
	n:=0;
	for i:=0 step 1 until 2 do
	  begin
	    for k := 0 step 1 until 2  do
	       begin
	        n := n+1
	       end
	  end;
	outinteger(1,n);
	for s:=1, 2, 4, 5,  7 do outinteger(1,s)

end
