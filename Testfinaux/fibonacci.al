   
    begin
    integer i;
    integer m;
    integer b;
    integer temp;
	  integer procedure FIBO(n);
	  		value n;
            integer n;
            begin
            	m := 0;
            	b := 1;
            	for i:=1 step 1 until n do
            	    begin
            	        temp := m + b;
            	        m := b;
            	        b := temp;
            	        outinteger(1,temp)
            	end
            end;
      FIBO(8)
    end
