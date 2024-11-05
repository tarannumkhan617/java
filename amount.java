import java.io.*;
class AmountException extends Exception{
AmountException(){
super("please enter amount in multiple of 100 ");
}
}
class amount{
public static void main(String args[]){
int amt;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try{
System.out.println("enter the amount");
amt=Integer.parseInt(br.readLine());
if(amt%100!=0){
AmountException ae=new AmountException();
throw ae;
}
System.out.println("processing---");
}
catch(IOException ioe){
System.out.println(ioe);
}
catch(AmountException ae){
System.out.println(ae);
}
catch(NumberFormatException ne){
System.out.println(ne);
}
}
}