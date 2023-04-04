/*
 *   8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 *   
 *   for의 형식
 *         1    2     4
 *   for(초기값;조건식;증가식)
 *   {
 *       반복 실행문장  3
 *   }
 *   
 *   1-2-3-4 2-3-4 2-3-4 2-3-4 => 2번 false면 종료 
 *   int sum=0;
 *   int i=0;
 *   for(i=0;i<10;i++)
 *   {
 *     
 *   }//i는 }에서 자동으로 사라진다 
 *   int sum=0;
 *   for(i=0;i<10;i++)
 *   {
 *     
 *   }//i는 }에서 자동으로 사라진다 
 */
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        for(int i=2;i<=100;i+=2)
        {
        	sum+=i;
        }
        
        System.out.println(sum);
        
	}

}
