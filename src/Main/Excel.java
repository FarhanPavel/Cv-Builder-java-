package Main;

import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
public class Excel extends Word {
	void  Excel_Caller()
	{try {
		Scanner input=new Scanner(System.in); 
		Formatter formatter=new Formatter("D:/JAVA/Project/Student.csv");
		String data1="Degrees,Group,Board/University,Pass.Year,Grade\n";
		formatter.format("%s",data1);
		System.out.printf("How Many Degrees Do you Have(Currently):\n");
		int n=input.nextInt();
		String garbage,name,group,board,passyear,result;
		for(int i=0;i<n;i++)
		{
		if(i==0)	
		{garbage=input.nextLine();}	
		System.out.printf("Enter Degree Name:\n");
		name=input.nextLine();
		System.out.printf("Enter %s Group:\n",name);
		group=input.nextLine();
		System.out.printf("Enter %s Board/University:\n",name);
		board=input.nextLine();
		System.out.printf("Enter %s Passyear:\n",name);
		passyear=input.nextLine();
		System.out.printf("Enter %s Result(GPA/CGPA):\n",name);
		result=input.nextLine();
		formatter.format("%s,%s,%s,%s,%s\n",name,group,board,passyear,result);
		System.out.printf("Qualification Added Successfully....,\n\n");
		}
		formatter.close();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	
	}
	
}
	
