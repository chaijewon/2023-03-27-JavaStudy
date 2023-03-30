// << , >>
/*
 *    10<<2
 *    1010
 *  1010(0)(0)
 *  => 101000 => 40
 *  => 1010=> 0을 뒤에 2개 채운다 
 *    7<<3
 *    111000
 *    ---
 *    32+16+8 ==> 56
 *    
 *    8<<2 ==> 32
 *    100000
 *    
 *    x<<y  ==> x*2^y
 *    ----------------
 *    9<<3
 *    
 *    ==================
 *    10>>2  
 *    1010
 *      --제거 ==> 2
 *      
 *    15>>3 ==> 1
 *    1111
 *     ---
 *    
 *    27>>3
 *    
 *    16 8 4 2 1
 *     1 1 0 1 1
 *         -----
 *    27 / 2^3  ==> 27/8  => 3
 *    
 *    x>>y ==> x/2^y
 *    
 *    100>>3 ==> 100/8
 *         
 *    
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(10<<2);//40
        System.out.println(7<<3);
        System.out.println(8<<2);
        System.out.println(15>>3);
        System.out.println(10>>2);
	}

}
