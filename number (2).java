class number{
static int a;
static{
System.out.println("static block1");
}
number() //constructer{
System.out.println("this is construction");
}
void showdata(){
System.out.println("a="+a);
} 
static{
System.out.println("static block2");
}
public static void main(String args[]){
System.out.println("enter in main()");
number n=new number();
}
static{
System.out.println("static block3");
}
}	