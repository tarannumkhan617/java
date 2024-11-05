// input 2 no.&  find division of 2 no. if second value is not equal to zero  

import java.util.*;
class division{
public static void main(String args[]){
int a,b,result=0;
Scanner scan= new Scanner(System.in);
System.out.println("enter 2 no.");
a=scan.nextInt();
b=scan.nextInt();
if (b!=0)
{
result=a/b;
} 
System.out.println("division="+result);
}
}