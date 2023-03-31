/*
 *   다음의 결과값을 적성하시오

public  static void main(String[] arg) 
{  
   int a;   
   int b;   
   a=3;   
   b=a+5;       
   System.out.printf("a의 값: %d \n", a);  // 3  
   System.out.printf("b의 값: %d \n", b);  // 8
}

  1. 메모리 저장 
    int a;  int b;
    -----   ------ 4byte
    
    -----a  ------ b
    
    -----   ------ 4byte
      3      a+5 => 8
    -----a  ------ b
  2. System.out.printf() => JDK 1.5 => C언어에서 도입 (prinf())
     서식이 있는 출력 
     
     %d => 정수값 
     %f => 실수값
     %c => 문자
     %s => 문자열 
     
     int a=10;
     

 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        double d=10.5;
        char c='A';
        
        System.out.println("a="+a+",d="+d+",c="+c);
        System.out.printf("a=%d b=%.1f c=%c",a,d,c);
	}

}
