import java.util.Scanner;
public class WeightProgram 
{

	public static void main(String[] args) 
	{		

		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//title of the program
		System.out.println("Weight Program");
		
		//ask user to input number of apples
		System.out.print("Enter number of apples to buy: ");
		
		//Use the Scanner class's methods to read number of apples
		int NumOfApple = sc.nextInt();
		
		//ask user to input number of mangos
		System.out.print("Enter number of mangos to buy: ");
		
		//Use the Scanner class's methods to read number of mangos
		int NumOfMangos = sc.nextInt();
		
		//total mass of the fruits
		int mass = (NumOfApple * 103 )+ (NumOfMangos * 110) ;
		
		//100g-weight
		int _100Weight = mass/100;
		
		System.out.println("100g-weight: "+_100Weight);
		
		//50g-Weight
		int _50Weight = (mass - (_100Weight *100))/50;
		
		System.out.println("50g-weight: "+_50Weight);
		
		//20g-Weight
		int _20Weight = (mass - _100Weight *100 - _50Weight * 50 ) / 20;
		
		System.out.println("20g-weight: "+_20Weight);
		
		//10g-Weight
		int _10Weight = (mass - (_100Weight *100) - _50Weight*50- _20Weight * 20 ) / 10;
		
		System.out.println("10g-weight: "+_10Weight);
		
		//5g-Weight
		int _5Weight = (mass - (_100Weight *100) - _50Weight*50- _20Weight * 20 - _10Weight * 10 ) / 5;
		
		System.out.println("5g-weight: "+_5Weight);
		
		//1g-Weight
		int _1Weight = (mass - (_100Weight *100) - _50Weight*50- _20Weight * 20- _10Weight * 10 - _5Weight * 5 ) / 1;
		
		System.out.println("1g-weight: "+_1Weight);
	}

}
