begin
integer n;
integer m;
integer pt;
integer i;
n := 100;
m := 2;
pt := 0;

for i := 0 step 1 until n do
begin
if (i = 2) then
begin

pt := pt + 1;
outinteger(1, i);
outstring(1, "On incrémente la variable pt")
end
end;

outinteger(1, pt);
outstring(1,"Fin du programme")
end
