class Table{
static int T;
static void printTable(int n){
for(int i=1;i<=10;i++){
T=n*i;
System.out.println(T);
}
}
}
class teststatic {
static int a=10;
int b=20;
public static void main(String args[])
{
int c=30;
System.out.println("a="+a);
System.out.println("c="+c);
Table tab=new Table();
tab.printTable(8);
}
}
