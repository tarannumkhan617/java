/*   solid rhombus
    *****
   *****
  *****
 *****
*****   */

class adpattern1{
public static void main(String args[]){
int i,j,n;
n=5;
for(i=1;i<=n;i++){
//spaces
for(j=1;j<=n-i;j++){
System.out.print(" ");
}
//stars
for(j=1;j<=5;j++){
System.out.print("*");
}
System.out.println();
}
}