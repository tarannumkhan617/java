//program to demonstration of thread priority
class Natural extends Thread
{
int i,n;
public void run(){
n=20;
for(i=1;i<=n;i++){
System.out.println("Natural="+i);
}
}
}
class even extends Thread{
int i,n;
public void run(){
n=40;
for(i=2;i<=n;i+=2){
System.out.println("even="+i);
}
}
}
class odd extends Thread{
int i,n;
public void run(){
n=40;
for(i=2;i<=n;i+=2){
System.out.println("odd="+i);
}
}
}
class priority{
public static void main(String args[]){
Natural N=new Natural();
even e=new even();
odd O=new odd();
System.out.println("object of Natural="+N);
System.out.println("priority of Thread1"+N.getpriority());
System.out.println("priority of Thread2"+e.getpriority());
System.out.println("priority of Thread3"+O.getpriority());
System.out.println("name of Thread1"+N.getname());
System.out.println("name of Thread2"+e.getname()); 
System.out.println("name of Thread3"+O.getname());
N.setname("Natural");
e.setname("even");
O.setname("odd");
N.setpriority(Thread.MIN_PRIORITY);
O.setpriority(10);
System.out.println("object Natural="+N);
System.out.println("priority of Thread1"+N.getpriority());
System.out.println("priority of Thread2"+e.getpriority());
System.out.println("priority of Thread3"+O.getpriority());
System.out.println("name of Thread1"+N.getname());
System.out.println("name of Thread2"+e.getname());
System.out.println("name of Thread3"+O.getname());
N.start();
e.start();
O.start();
}
}