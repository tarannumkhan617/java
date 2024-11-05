//program to demonstration of parameterized constructor using call by reference 
class Number 
{
int a,b;
Number()  //default constructor
{
a=10;
b=23;
System.out.println("class number in initialized");
}
Number(Number N)
{
a=N.a;
b=N.b;
System.out.println("duplicate copy of class number is created");
}
void swap()
{
int temp=a;
a=b;
b=temp;
}
void showdata()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class constructor4{
public static void main(String args[])
{
Number N1=new Number(); //object creation and calling of default constructor
Number N2=new Number();//object creation and calling parameters constructor call by referens
N1.swap();
System.out.println("swaped data");
N1.showdata();
System.out.println("actual data");
N2.showdata();
}
}
 