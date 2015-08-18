import java.util.Scanner;


public strictfp class FirstClass {

	public static void main(String[] args) {
		
		// ***************** Numbers (Non Decimal) ***************
		byte q = 10;  // 1byte
		short w = 300;  // 2 byte
		int e = 999999;  // 4 byte
		long r = 89898998;  // 8 byte
		//*****************************************************
		// %%%%%%%%%%%%%%%%%%% Only For Decimal Value %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		float  b1 = 90.34f;  // 4 byte
		double b2 = 787.34342;  //  8 byte
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		
		boolean b3 = true;  // true and false value  (1 byte , 2 byte , 4 byte)
		
		
		char t1 = 'A' ; // Take Single Character (2 Bytes) (UniCode)
		String name = "amit"; // Group of Characters
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		long a = scanner.nextLong();
		System.out.println("Enter the Second Number");
		long b = scanner.nextLong();
		//int a = 10;
		//int b = 20;
		long c  =  a + b;
		System.out.println("Sum is "+c);
		scanner.close();

	}

}
