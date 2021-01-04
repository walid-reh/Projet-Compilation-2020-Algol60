begin
comment straightforward loop;
    integer n;
    n := 0;
start:begin
    if n = 20 then goto finish
    else
    begin
        n := n + 1;
        outinteger(1, n);
    end;
    end;
    goto start;
finish:;
    outstring(1,"\n")

end
