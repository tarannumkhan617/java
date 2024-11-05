//write a program to print 1 to n natural no. series here make sure diff. of 1 second 
//b/w printing of two seconds.
class naturalThread extends Thread
{
int i,n;
public void run() //override
{
long a=System.currentTimeMillis(); //return
n=20;
for(i=1;i<=n;i++){
System.out.print(i);
try
{
sleep(1000);
} 
catch(InterruptedException e){
}
System.out.print("\r");
}
System.out.println("time in execution="+(System.currentTimeMillis()-a)+"M.S.");
}
public static void main(String args[]){
new naturalThread().start();
}
}
