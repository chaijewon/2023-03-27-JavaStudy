// 성적 계산 => Rank,정렬 ...
// 세개의 정수를 받아서 평균을 구해서 =>  등급 출력 
// 다중 조건문 사용 
/*
 *   >=90
 *   >=80
 *   >=70
 *   >=60
 *   ------- else 
 */
import java.util.Scanner;
public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // System.in 키보드 입력값 => 입력값을 받아서 메모리에 저장해주는 역할 
        // 정수:nextInt() , 실수 : nextDouble() , nextBoolean()
        // next() : 문자열 => char는 존재하지 않는다 
        // Scanner는 도스에서만 사용이 가능 
        System.out.print("세개의 정수 입력(10 20 30):");
        int kor=scan.nextInt();
        int eng=scan.nextInt();
        int math=scan.nextInt();
        int avg=(kor+eng+math)/3; // 학점 계산 
        
        System.out.println("국어점수:"+kor);
        System.out.println("국어점수:"+eng);
        System.out.println("국어점수:"+math);
        
        System.out.println("총점:"+(kor+eng+math));
        System.out.printf("평균:%.2f\n",(kor+math+eng)/3.0);
        
        // 학점 계산 
        char score='F';// 값이 변경이 없는 경우에 처리되는 값(default)
        if(avg>=90)
        	score='A';// 종료
        else if(avg>=80)
        	score='B';// 종료
        else if(avg>=70)
        	score='C'; // 종료
        else if(avg>=60)
        	score='D'; // 종료
        else // 생략이 가능 
        	score='F';
        System.out.println("학점:"+score);
       
        	
        	
        
	}

}



