begin
comment matrix and vector multiplication;
	real array aa[1:100,1:100];
	real array bb[1:100];
	real array cc[1:100];
	integer n, i, j;
	integer k;


integer procedure factorial(n); value n; integer n;
	begin
		if n = 1 then factorial := 1
		else factorial := n * factorial(n-1)
	end;


	comment matrix generation;
	n := 4;
	for i := 1 step 1 until n do
	begin
		bb[i] := i;
		for j := 1 step 1 until n do
		   begin
			  aa[i,j] := factorial(i)
		   end
	end ;


	for i := 1 step 1 until n do
		begin
			cc[i] :=0;
			for j := 1 step 1 until n do cc[i] := cc[i] + aa[i,j]*bb[j]
		end;



        begin
        	integer S;
        	for S := 1 step 1 until n do outinteger (1, cc[S]);
        	outstring(1, "FINAL \n")
        end;


        comment réaffichage des éléments du tableaux avec des goto;
            k := 0;
        start:begin
            if k = n then goto finish
            else
            begin
                k := k + 1;
                outinteger(1, cc[k]);
            end;
            end;
            goto start;
        finish:;
            outstring(1,"FIN")




end

