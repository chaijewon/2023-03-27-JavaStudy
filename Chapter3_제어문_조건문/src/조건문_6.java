// 년도를 입력을 받아서 윤년여부 확인 
// 4년마다 
// 100년마다 제외
// 400년마다 
// (year%4==0 && year%100!=0)||(year%400==0) 윤년조건 
import java.util.Scanner;
public class 조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        
        if((year%4==0 && year%100!=0)||(year%400==0))
        	System.out.println(year+"년도는 윤년입니다");
        if(!((year%4==0 && year%100!=0)||(year%400==0)))
        	System.out.println(year+"년도는 윤년이 아닙니다");
	}

}
