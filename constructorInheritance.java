//constructor in inheritance
class number{
int a;
number(){
a=10;
System.out.println("default constructor of class number");
}
number(int x){
a=x;
System.out.println("parameterized constructor of class number");
}
}
class value extends number
{
int b;
value(){
b=40;
System.out.println("default constructor of class value");
}
value(int x){
b=x;
System.out.println("parameterized constructor of class number");
}
void showdata(){
System.out.println("a="+a);
System.out.println("b="+b);
}
} 
class constructorInheritance{
public static void main(String args[]){
value v1=new value();
value v2=new value(70);
v1.showdata();
v2.showdata();
}
}



