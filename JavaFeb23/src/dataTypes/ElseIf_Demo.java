package dataTypes;

public class ElseIf_Demo {

	public static void main(String[] args) {
		
		/*Else if syntax
		 * if(condition)
		 * {
		 * code to be executed
		 * }else if(condition)
		 * {
		 * code
		 * }else
		 * {
		 * code
		 * }
		 * 
		 */
		
		int age = 16;
		if(age >=18 && age <= 80)
		{
			System.out.println("it is too to get marry");
		}else if (age >80 && age <= 129)
		{
			System.out.println("Pray to God that \nyou are in good health");
		}else
		{
			System.out.println("you r so young!! \nwait for while");
		}
		

	}

}
