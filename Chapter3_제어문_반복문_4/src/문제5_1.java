/*
 *   5.	1~1000까지에서 7의 배수의 합 ,9의 배수의 합
 */
public class 문제5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a7=0,a9=0;
        for(int i=1;i<=1000;i++)
        {
        	if(i%7==0)
        		a7+=i;
        	if(i%9==0)
        		a9+=i;
        }
        System.out.println("7의 배수의 합:"+a7);
        System.out.println("9의 배수의 합:"+a9);
	}

}
