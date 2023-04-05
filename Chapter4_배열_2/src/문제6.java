import java.util.Arrays;

/*
 *   정수를 10개 저장하는 배열을 만들고 
 *   1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
 *   그리고 배열에 든 숫자들과 평균을 출력하라.
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // 초기화
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(arr));
        
        int total=0;
        for(int i:arr)
        {
        	total+=i;
        }
        
        System.out.printf("평균:%.2f",(total/10.0));
	}

}
