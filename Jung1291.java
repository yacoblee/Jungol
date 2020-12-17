package subject;

import java.util.Scanner;

public class Jung1291 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number1;
		int number2;
		
		while(true) {
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			
			//�������� ũ�⸦ ����� while�� �ٽ� ����
			if((1 > number1 || 9 < number1) || (1 > number2 || 9 < number2)) {
				System.out.println("INPUT ERROR!");
			}else {
				for(int i=1; i<10; i++) {
					System.out.printf( "%d * %d = %3d" ,number1, i, number1*i);
					System.out.printf( "%4d * %d = %3d \n" ,number2, i, number2*i);
					
				}
				return;
			}
		}
	}
}
