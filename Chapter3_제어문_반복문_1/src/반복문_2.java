// 1~100까지의 합 
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        for(int i=1;i<=100;i++)// 1 2 3 4...
        {
        	sum=sum+i; // sum+=i;
        	System.out.println("sum="+sum+",i="+i);
        }
        System.out.println("====== 최종 결과값 ======");
        System.out.println("1~100까지의 합:"+sum);
        
        sum=0;//값을 변경 => 다시 누적 (초기값은 0) 곱 => 1
        for(int i=0;i<=100;i+=2)//0 2 4 6...
        {
        	sum+=i;
        }
        System.out.println("====== 최종 결과값 ======");
        System.out.println("1~100까지의 짝수합:"+sum);
        
        sum=0;
        for(int i=1;i<=100;i+=2)// 1 3 5 7...
        {
        	sum+=i;
        }
        System.out.println("====== 최종 결과값 ======");
        System.out.println("1~100까지의 홀수합:"+sum);
        
        sum=0;
        for(int i=3;i<=100;i+=3)// 1 3 5 7...
        {
        	sum+=i;
        }
        System.out.println("====== 최종 결과값 ======");
        System.out.println("1~100까지의 3의 배수 합:"+sum);
        
        
	}

}
