class data{
void show()
{
System.out.println("this is method show");
}
void msg()
{
System.out.println("this is method msg");
}
void display(){
System.out.println("this is method display");
this.show();
msg();
}
}
class testthis3
{
public static void main(String args[]){
new data().display();
}
}