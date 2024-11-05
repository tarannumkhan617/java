//program to demonstration of multithreading by implementing runnable interface
class Table3 implements Runnable 
{
int i,T,n;
public void run(){
n=3;
for(i=1;i<=10;i++){
T=n*i;
System.out.println(n+"*"+i+"="+T);
}
System.out.println("end of Table "+n);
}
}
class Table5 implements Runnable 
{
int i,T,n;
public void run(){
n=5;
for(i=1;i<=10;i++){
T=n*i;
System.out.println(n+"*"+i+"="+T);
}
System.out.println("end of Table "+n);
}
}
class Table8 implements Runnable 
{
int i,T,n;
public void run(){
n=8;
for(i=1;i<=10;i++){
T=n*i;
System.out.println(n+"*"+i+"="+T);
}
System.out.println("end of Table "+n);
}
}
class thread2{
public static void main(String args[]){
Table3 T3=new Table3();
Table5 T5=new Table5();     //partial thread
Table8 T8=new Table8();

Thread tab3=new Thread(T3);
Thread tab5=new Thread(T5);   //COV. FROM PARTIAL THREAD TO COMP.THREAD 
Thread tab8=new Thread(T8);

tab3.start();
tab5.start();
tab8.start();
}
}