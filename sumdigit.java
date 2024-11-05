import java.util.*;
class sumdigit{
public static void main(String args[]){
int n,rem,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter the no.");
n=sc.nextInt();
while(n>0){
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("sum of digit="+sum);
} 
}