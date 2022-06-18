import java.util.Scanner;
class demo1
{
public static void main(String arg[])
{
int a,b,c;
Scanner sc= new Scanner(System.in);
System.out.println("-- Important Note --");
System.out.println("Press 1 for Sum");
System.out.println("Press 2 for Substraction");
System.out.println("Press  3 for Multiplication");
System.out.println("Press 4 for Division");
System.out.println("Please Enter 2 value for Operation");
 a=sc.nextInt();
b=sc.nextInt();
System.out.println("Please Enter Your Choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
c=a+b;
System.out.println("Sum = "+c);
break;
case 2:
c=a-b;
System.out.println("Substraction = "+c);
break;
case 3:
c=a*b;
System.out.println("Multiplication = "+c);
break;
case 4:
if(b==0)
{
System.out.println("Wrong Value - Divide by Zero Error");
}
else{
float d=a/b;
System.out.println("Division = "+d);
}
break;
default:
System.out.println("You Enter Wrong Choice");
}
}
}