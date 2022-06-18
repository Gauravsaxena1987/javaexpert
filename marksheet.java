import java.util.Scanner;
import java.util.ArrayList;
class cal_marks
{
String s_name, f_name, m_name, rollno, enroll, branch;
int m1,m2,m3,m4,m5, i, sum=0, count,j;
//m=new int[]; 
int m[]= new int[6];
double per;
Scanner sc=new Scanner(System.in);
void basic_detail()
{
System.out.println("\t--------------------------------------------------------------------------------");
System.out.println("Enter Student Name ");
 s_name=sc.nextLine();
System.out.println("Enter Father Name ");
f_name=sc.nextLine();
System.out.println("Enter Mother Name ");
m_name=sc.nextLine();
System.out.println("Enter Student Roll Number ");
rollno=sc.nextLine();
System.out.println("Enter Student Enrollment Number ");
enroll=sc.nextLine();
System.out.println("Enter Student Branch ");
branch=sc.nextLine();
}

void marks_entry()
{
for(i= 1;i<=5;i++)
{
System.out.println("Please Enter Marks of Subject :"+i);
m[i]=sc.nextInt();
}
}

void cal_marks()
{
for(i=1;i<=5;i++)
{
sum=sum+m[i];
}
//int sum=m1+m2+m3+m4+m5;
per = (sum*100)/500;
}

void display()
{
System.out.println("\t***************************************************************");
System.out.println("\t------------------------------Marksheet-------------------------------");
System.out.println("\t\tRajeev Gandhi Pradhougiki University, Bhopal ");
System.out.println("\t-------------------------------------------------------------------------------");
System.out.println("\tStudent Name :"+s_name+"\t\t"+"Enrollment Number :"+enroll);
System.out.println("\tFather Name :"+f_name+"\t\t"+"Roll Number :"+rollno);
System.out.println("\tMother Name :"+m_name+"\t\t"+"Branch:"+branch);
System.out.println("\t-------------------------------------------------------------------------------");
System.out.println("\tSubject Code"+"\t"+"Max Marks"+"\t"+"Min Marks"+"\t"+"Obt Marks"+"\t"+"Remark");
System.out.println("\t--------------------------------------------------------------------------------");

for(i=1;i<=5; i++)
{
if(m[i]>=35)
{
	if(m[i]>=75)
	{

	System.out.println("\tCS"+i+"\t\t"+"100"+"\t\t"+"35"+"\t\t"+m[i]+"\t"+"P"+"\t"+"D");
	}
	else{
	System.out.println("\tCS"+i+"\t\t"+"100"+"\t\t"+"35"+"\t\t"+m[i]+"\t"+"P");
	}
}

else
{
System.out.println("\tCS"+i+"\t\t"+"100"+"\t\t"+"35"+"\t\t"+m[i]+"\t"+"F");
count=count+1;
}
}

System.out.println("\t-----------------------------------------------------------------------------------");
System.out.println("\t\t\t"+"500"+"\t\t"+"\t\t"+sum);
System.out.println("\t-----------------------------------------------------------------------------------");
if(count==0)
{
System.out.println("\tResult : Pass" +"\t\t"+"Percent="+per);
}
else if(count==1){
System.out.println("\tResult : ATKT in one Subject");
}
else
{
System.out.println("\tResult : Fail");
}
}
}

class marksheet
{
public static void main(String args[])
{
cal_marks cm= new cal_marks();
cm.basic_detail();
cm.marks_entry();
cm.cal_marks();
cm.display();
}
}