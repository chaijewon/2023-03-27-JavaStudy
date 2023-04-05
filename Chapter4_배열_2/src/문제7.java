/*
 *   5개 정수를 입력받은 후 차례로 출력하는 프로그램 
     입력예) 5 10 9 3 2
     출력예) 5 10 9 3 2
     
     문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
     입력예) A B C D E F G H I J
     출력예) ABCDEFGHIJ


 */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int[] arr={5 ,10, 9, 3, 2};
		/*
		 * for(int i:arr) { System.out.print(i+" "); }
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 5개 입력:");
		int[] arr=new int[5];
		arr[0]=scan.nextInt();
		arr[1]=scan.nextInt();
		arr[2]=scan.nextInt();
		arr[3]=scan.nextInt();
		arr[4]=scan.nextInt();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		char[] c= {'A', 'B', 'C', 'D', 'E' ,'F', 'G', 'H','I', 'J'};
		for(char cc:c)
		{
			System.out.print(cc);
		}
		
	}

}
