import java.util.Arrays;

/*
 *   int a=10;
 *   int b=a;
 */
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1={10,20,30,40,50};
        int[] arr2=arr1.clone();// 별칭 (참조데이터)
        System.out.println("arr1="+Arrays.toString(arr1));
        System.out.println("arr2="+Arrays.toString(arr2));
        
        System.out.println("======= 배열값 변경 ========");
        arr2[0]=100;
        arr2[1]=200;
        arr2[2]=300;
        arr2[3]=400;
        arr2[4]=500;
        System.out.println("arr2="+Arrays.toString(arr2));
        System.out.println("arr1="+Arrays.toString(arr1));
        
        int[] arr3=new int[10];
        for(int i=0;i<arr1.length;i++)
        {
        	arr3[i]=arr1[i];
        }
	}

}
