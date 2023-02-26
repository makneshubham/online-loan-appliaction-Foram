import java.util.Scanner;
class bank
{
	String name ;
	String adders;
  	int amount ;
	float time;
	float RateOfInterest ;
	float simpleInterset ;
	
	void input()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a your name ");
		name = scan.next();
	     
		System.out.println("Enter your addres ");
		adders = scan.next();
		
		System.out.println("please mention the amount required  ");
		amount = scan.nextInt();
		
		System.out.println("please mention the Time duration  ");
		time = scan.nextFloat();
		
		RateOfInterest = 8.5f;	
	}

	
	void compute() 
	{
		simpleInterset = (amount * time * RateOfInterest)/100;
	}
	
	void display() 
	{
		System.out.println("The simpleInterset = "+simpleInterset);
	}
	
//	void retunamout() {
//		int total ;
//		  total = simpleInterset + amount ;
//		System.out.println("The return of Total amount = "+total);
//	}
}

public class laonforam {

	public static void main(String[] args) {
		
		bank b = new bank();
		System.out.println("please file the information ");
		b.input();
		b.compute();
		b.display();

	}

}
