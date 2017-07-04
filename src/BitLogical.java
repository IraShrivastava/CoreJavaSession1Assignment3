import java.util.Scanner;

public class BitLogical {

	public static void main(String[] args) {
		int b1,b2,b3;
		
		System.out.println("Enter b1: ");
		Scanner scanner = new Scanner (System.in);
		b1=scanner.nextByte();
		
		System.out.println("Enter b2: ");
		Scanner scanner1 = new Scanner (System.in);
		b2=scanner1.nextByte();
	
		b3=b1&b2;
		System.out.println("b1 b2 Output");
		System.out.println(b1+" "+ b2+" "+ b3);
	}

}
