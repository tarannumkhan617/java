 class circle
{
double r,ar,cr;
void input(double x){
r=x;
}
void area(){
ar=3.14*r*r;
System.out.println("area of circle="+ar);
}
void circum(){
cr=2*3.14*r;
System.out.println("circumference="+cr);
}
}
class Runcircle{
public static void main(String args[]){
circle ob = new circle();
ob.input(5.2);
ob.area();
ob.circum();
}
}