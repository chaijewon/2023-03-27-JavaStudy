import java.util.Arrays;

/*
 *  10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
입력예) 5 10 8 55 6 31 12 24 61 2
출력예) 61

 */
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arr));
        
        /*
         *   int a=10,b=30,c=40;
         *   int max=a;
         *   if(max<b) max=b
         *   if(max<c) max=c;
         */
        
        int max=arr[0];
        for(int i:arr)
        {
        	if(max<i)
        		max=i;
        }
        System.out.println("최대값:"+max);
	}

}
