import java.util.Scanner;
public class Data {
	Scanner s=new Scanner(System.in);
	 void func(int amount) {
		System.out.println("Enter Quantity");
		int q=s.nextInt();
		int r=0;
		amount=amount*q;
		System.out.println("Total Amount:"+amount);
		while(r==0)
		{
			System.out.println("Insert Money into the Socket:");
			int m=s.nextInt();
			if(m>=amount)
			{
				System.out.println("Returned Amount:"+(m-amount));r=1;
				System.out.println("Enjoyy Your IceCream");
			}
			else
			{
				amount=amount-m;
				System.out.println("Insert Remaining "+amount+" Money into the Socket");
			}
		}
		
	}

}
