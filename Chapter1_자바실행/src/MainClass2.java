
public class MainClass2 {
   public static void main(String[] args) {
	   var a=10;
	   var b=20.5;
	   System.out.println(a);
	  // 프로그램의 시작점 / 끝점 
	  /*
	   *    정수 
	   *    ---
	   *    2진법 0b
	   *    8진법  0
	   *    16진법  0x
	   *    
	   *    29 => 2진법 
	   *    64 32 16 8 4 2 0(1)
	   *           1 1 1 0  1    => 11101
	   *    76 => 2진법 
	   *    1   0  0  1 1 0 0
	   */
	   System.out.println(0b11101);
	   System.out.println(0b1001100);
	   System.out.println(Integer.toBinaryString(29));
	   // 11101
	   /*
	    *   11101
	    *     ---
	    *  ---  5
	    *    3  -------------> 035
	    *    
	    *   11101
	    *    ----
	    *  --  13 => 10-a,11-b,12-c,13-d
	    *   1 ==> 1d
	    */
	   System.out.println(Integer.toOctalString(29));
	   System.out.println(Integer.toHexString(29));
	   
	   System.out.println("c:\\dev");
	   System.out.print("Hello\n");
	   System.out.println("Hello");
	   //System.out.printf("%d+%d=%d",10,20,30);
	   // 10+20=30
	   System.out.println(10+"+"+20+"="+30);
   }
}
