package Main;

public class Loader {

	public static void main(String[] args) {
			
		Designer ob=new Designer();
		ob.design();
		System.out.printf("\n\n\n\n");
		Excel obj1=new Excel();
		obj1.Word_Caller();
		System.out.printf("\n\n\n\n");
		obj1.Excel_Caller();

	}

}
