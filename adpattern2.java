/*    1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5 no. pyramid */

import java.util.*;
class adpattern2
{
public static void main(String args[]){
int i,j,n;
n=5;
for(i=1;i<=n;i++){
//spaces
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}
//number->print row no.times
for(j=1;j<=i;j++){
System.out.print(i+" ");
}
System.out.println();
}
}
}










