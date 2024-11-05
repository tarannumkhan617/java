// creat class table , now input a no. & print its table
class Table{
int i,n,T;
void input(int x){
n=x;
}
void output(){
for(i=1;i<=10;i++){
T=n*i;
System.out.println(T);
}
}
}
class RunTable{
public static void main(String args[]){
Table tb=new Table();
tb.input(8);
tb.output();
}
}