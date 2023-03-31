/*
 *  public static void main(String[] arg) 
{
      int num1=10;   
      System.out.printf("%d \n", num1); 10
      //num1++;
      System.out.printf("%d \n", num1++); 10
      //++num1;
      System.out.printf("%d \n", ++num1); 12
      --num1;
      System.out.printf("%d \n", num1); 11
      num1--;
      System.out.printf("%d \n", num1); 10
}

 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        System.out.println(a++);//10
        // a=a+1
        System.out.println(a++);//11
        // a=a+1 ==> 12
        System.out.println(++a);//13
        System.out.println(++a);//14
	}

}
