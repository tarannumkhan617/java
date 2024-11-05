//creat class student now input stud. name , roll no. & MARKS of 3 sub. using keybord & generate the marksheet of student with total marks ,% & div. (implements this 
//program 3 student)
import java.util.*;
class Student{
String Sname,div;
int rno,m1,m2,m3,total, per;
void getstu(){
Scanner sc = new Scanner(System.in);
System.out.println("enter the student name, rno and marks of 3 students");
Sname= sc.next();
rno=sc.nextInt();
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
}
void marksheet(){
total=m1+m2+m3;
per=total/3;
if(per>=60)
div="first division";
else if(per>=33)
div="second division";
else
div="fail";
System.out.println(Sname);
System.out.println(rno);
System.out.println(total);
System.out.println(per);
System.out.println(div);
System.out.println("__________________ ");
}
}
class Marksheet{
public static void main(String args[]){
Student stu1=new Student();
Student stu2=new Student();
Student stu3=new Student();
stu1.getstu();
stu2.getstu();
stu3.getstu();
stu1.marksheet();
stu2.marksheet();
stu3.marksheet();
}
}
