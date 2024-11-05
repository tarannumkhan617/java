//program to dermonstration of interface
interface company
{
String cname="analyze";
int pin=226021;
void showdata();
void msg();
}
class employee implements company
{
String sname;
int srno;
void getemp(String name,int rno)
{
sname=name;
srno=rno;
}
public void showdata(){
System.out.println("company name="+cname);
System.out.println("pin code="+pin);
System.out.println("employee name="+sname);
System.out.println("employee code="+srno);
}
public void msg(){
}
}
class interface1{
public static void main(String args[]){
employee emp=new employee();
emp.getemp("william",1001);
emp.showdata();
company cmp=new employee();
cmp.showdata();
}
}
