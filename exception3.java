//program to demonstration of try with catch
class exception3{
public static void main(String args[]){
int a,b,res;
a=10;
b=0;
res= a+b;
System.out.println("addition="+res);
res=a-b;
System.out.println("subtraction="+res);
try{
res=a/b;
System.out.println("division="+res);
}
catch(ArithmeticException e){
System.out.println("method1:we can not divide by 0");
System.out.println("method2:"+e.getMessage());
System.out.println("method3:"+e);
System.out.print("method4:");
e.printStackTrace();
}
res=a*b;
System.out.println("multiplication"+res);
System.out.println("end of program");
}
}