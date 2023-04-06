import java.util.Arrays;

// 정수 10개 저장 공간 => 임의로 초기화 (1~100)
// 최대값/최소값 ==> 위치 
/*
 *    1 2 3 4 6 5 7 8 10 9 
 *    ---------------------
 *    max=10 ==> 8
 *    min=1  ==> 0
 *    
 *    => 영화 ==> 같은 인덱스
 *    제목 
 *    포스터
 *    장르
 *    감독
 *    출연
 *    순위
 *    
 */
public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arr));
        // 최대값
        int max=arr[0];
        // 최소값
        int min=arr[0];
        for(int i:arr)
        {
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
        
        int index1=0,index2=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==max)
        	{
        		index1=i;//i 인덱스번호 
        	}
        	else if(arr[i]==min)
        	{
        		index2=i;
        	}
        }
        System.out.println("최대값 위치(index):"+index1
        		+","+(index1+1)+"번째 위치");
        System.out.println("최소값 위치(index):"+index2
        		+","+(index2+1)+"번째 위치");
	}

}
