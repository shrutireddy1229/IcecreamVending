import java.util.Scanner;
public class IceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.Vaneela Rs:30.0");
		System.out.println("2.Choclate Rs:45.0");
		System.out.println("3.Strawberry Rs:35.0");
		System.out.println("4.Butter-Scotch Rs:40.0");
		int ch=s.nextInt();
		Data d=new Data();
		switch(ch)
		{
		case 1:d.func(30);break;
		case 2:d.func(45);break;
		case 3:d.func(35);break;
		case 4:d.func(40);break;
		default:System.out.println("Invalid Amount");
		}
		System.out.println("END");
	}

}
