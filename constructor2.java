//find area of triangle if its 3 size are initialized using explicit default constructer
import java.util.*;
class triangle{
int a,b,c;
double s, ar;
triangle()//explicit default constructer
{
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println("class triangle is initialized");
}
void area(){
s=(a+b+c)/2;
ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area of triangle="+ar);
}
}
class constructor2
{
public static void main(String args[])
{
triangle tr=new triangle();
tr.area();
}
}