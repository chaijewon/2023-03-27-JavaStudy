/*
 *   1에서 50까지의 합을 더하는 while 문이다. 빈칸에 적절한 코드를 삽입하라.
        int sum=0,i=1;
		while (true) {
		    if(i>50) break;
		    sum+=i;
		    i++;  
		} 
		System.out.println(sum);

 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i=1;
		/*while (true) {
		    if(i>50) break;
		    sum+=i;
		    i++;  
		}*/
		while(i<=50)
		{
			sum+=i;
		    i++; 
		}
		System.out.println(sum);
	}

}
