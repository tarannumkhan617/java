// wap to create a class shape that contains two atributes a,b & method for input and output now create two sub classes triangle, rectangle
class shape{
int a,b;
void getdata(int x,int y){
a=x;
b=y;
}
void putdata(){
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class rectangle extends shape{
int ar;
void arearect(){
ar=a*b;
System.out.println("area of rectangle="+ar);
}
}
class triangle extends shape{
double ar;
void areatr(){
ar=(a*b)/2.0;
System.out.println("area of triangle="+ar);
}
}
class runarea{
public static void main(String args[]){
rectangle re=new rectangle();
triangle tr=new triangle();
re.getdata(7,8);
tr.getdata(4,5);
re.arearect();
tr.areatr();
}
}