// while ==> 반복 횟수가 없는 경우에 주로 사용 (무한루프)
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~100까지의 합 , 짝수 합 , 홀수의 합 
		int sum=0,even=0,odd=0;
		
		// 1~100까지 증가하는 변수 => 루프변수 
		/*int i=1;
		while(i<=100)
		{
			// 실행문장 
			sum+=i;// 총합
			if(i%2==0)
				even+=i; // 짝수합
			else
				odd+=i;//홀수합 
			i++;
		}*/
		for(int i=1;i<=100;i++)
		{
			sum+=i;// 총합
			if(i%2==0)
				even+=i; // 짝수합
			else
				odd+=i;//홀수합
		}
		System.out.println("1~100까지 의 총합:"+sum);
		System.out.println("1~100까지 의 짝수합:"+even);
		System.out.println("1~100까지 의 홀수합:"+odd);
	}

}
