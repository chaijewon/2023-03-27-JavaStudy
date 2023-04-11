import java.util.Arrays;

// 1. 달력 만들기 
/*
 *    기능 
 *     1. 년도 / 월 입력 
 *     2. 1일자의 요일 ==> 세분화 
 *     3. 달력 출력 
 *     ---------------
 *     ===> 재사용할 수 있는 메소드 (윤년)
 *     
 *  2. 숫자야구게임
 *     난수 발생 
 *     사용자 입력 
 *     비교 
 *     힌트
 *     종료여부 확인 
 */
/*
 *     40 30 10 50 20
 *     -- --
 *     30 40
 *     --    --
 *     10    30
 *     --       --
 *     10       50
 *     --          --
 *     10          20
 *     --------------------- for 1
 *     10 40 30 50 20
 *        -- --
 *        30 40
 *        --    --
 *        30    50
 *        --       --
 *        20       30
 *    --------------------- for 2
 *    10  20  40  50 30
 *            --  --
 *            40  50
 *            --     --
 *            30     40
 *    --------------------- for 3
 *    10 20 30 50 40
 *             -- --
 *             40 50
 *    --------------------- for 4
 *    10 20 30 40 50
 */
public class 메소드조립법_1 {
	/*
	 *   int a=10;
	 *   int b=20;
	 *   a=b;
	 *     -20 => a=20
	 *   b=a; // b=20
	 */
    static void sort(int[] arr,int n) // n=1 ASC , n=2 DESC
    {
    	//Arrays.sort(arr);
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    		   boolean bCheck=false;
    		   if(n==1)
    			   bCheck=arr[i]>arr[j];
    		   else
    			   bCheck=arr[i]<arr[j];  
    		   
    		   if(bCheck)
	    	   {
	    				int temp=arr[i];// arr[i]=50 temp=50
	    				arr[i]=arr[j]; //arr[j]=40 arr[i]=40
	    				arr[j]=temp;// arr[j]=50
	    		}
    		   
    		}
    	}
    }
    static void rand(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        rand(arr);
        System.out.println("정렬전:"+Arrays.toString(arr));
        sort(arr,1);
        System.out.println("정렬후(ASC):"+Arrays.toString(arr));
        sort(arr,2);
        System.out.println("정렬후(DESC):"+Arrays.toString(arr));
        
	}

}
