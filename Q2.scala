var a:Int  = 2;
var b:Int  = 3;
var c:Int  = 4;
var d:Int = 5;
var k:Double  = 4.3f;

//a) println(--b*a+c*d--);
b-=1;
println(b*a+c*d);
d-=1;
//b) println(a++);
a+=1;
println(a);
//c) println(–2*(g– k)+c); // no such variable as g defined

//d) println (c=c++);
c+=1;
println(c);

//e) println (c=++c*a++);

c+=1;
println(c*a);
a+=1;
