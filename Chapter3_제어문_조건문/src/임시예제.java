import java.util.Arrays;

public class 임시예제 {
   public static void main(String[] args) {
	  int[] arr=new int[5];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=(int)(Math.random()*100)+1;
	  }
	  System.out.println(Arrays.toString(arr));
	  //Arrays.sort(arr);
	  //System.out.println(Arrays.toString(arr));
	  for(int i=0;i<arr.length-1;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]>arr[j])
			  {
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	  System.out.println(Arrays.toString(arr));
   }
}
