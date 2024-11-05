import java.util.*;
class calculater{
public static void main(String[] args){
int operator,n1,n2;
System.out.println("1-add\n 2-sub\n 3-mul\n 4-div\n");
System.out.println("choose the operator:");
Scanner sc= new Scanner(System.in);
operator = sc.nextInt();
System.out.println("enter the first number a:");
n1=sc.nextInt();
System.out.println("enter the second number b:");
n2 = sc.nextInt();
int result = 0;
switch(operator){
case 1:
result=n1+n2;
case 2:
result=n1-n2;
case 3:
result=n1*n2;
case 4:
result=n1/n2;
break;
default:
System.out.println("invalid operator");
}
System.out.println("result is:"+result);
}
}