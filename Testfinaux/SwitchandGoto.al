begin
    integer res;
    switch S:=S0,S1,S2,S3,S4,S5,S6;

    S0:outstring(1,"monday");
       goto S[1];
    S2:outstring(1,"wednesday");
       goto S[3];
    S1:outstring(1,"tuesday");
       goto S[2];
    S3:outstring(1,"thirsday");
       goto S[4];
    S5:outstring(1,"saturday");
        goto S[6];
    S6:outstring(1,"sunday");
        goto final;
    S4:outstring(1,"friday");
        goto S[5];


    final:;
  end
