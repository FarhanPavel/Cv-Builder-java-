package Main;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Word {
	void  Word_Caller()
	
	{try {
		Formatter formatter =new Formatter("D:/JAVA/Project/Student.doc");
		Scanner input=new Scanner (System.in);
		String head="					Curriculum Vitae		";
		formatter.format("%s\n\n\n\n",head);
		String name2="Name					:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Name			:");
		String data=input.nextLine();
		formatter.format("%s\n\n\n",data);
		
		name2="Father's Name			:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Father's Name	:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
	
		name2="Mother's Name			:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Mother's Name	:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
	
		name2="Personal Address			:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Personal Address	:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
	
		name2="Present Address			:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Present Address	:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
	
		name2="Mobile Number			:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Mobile Number	:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
	
		name2="Date of Birth			:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Date of Birth	:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
		
		name2="Sex					:";
		formatter.format("%s",name2);
		System.out.printf("Enter Sex			:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
	
		name2="Married Status			:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Married Status	:");
		data=input.nextLine();
		formatter.format("%s\n\n\n",data);
	
		name2="Nationality				:";
		formatter.format("%s",name2);
		System.out.printf("Enter Your Nationality		:");
		data=input.nextLine();
		formatter.format("%s\n\n\n\n\n",data);
	
		name2="Educational Qualification			";
		formatter.format("%s\n\n\n\n",name2);
		data="Check Excel Sheet";
		formatter.format("%s\n\n\n",data);
	
		
		formatter.close(); 
		
	}
	catch(FileNotFoundException e){
		System.out.println(e);
	}

	}
}