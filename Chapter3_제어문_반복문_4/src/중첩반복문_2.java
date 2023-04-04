/*
 *     ★
 *     ★★
 *     ★★★
 *     ★★★★
 *     
 *      i    j
 *     줄수  별표
 *      1    1
 *      2    2
 *      3    3
 *      4    4  ==> i=j  ==> j<=i
 *     ★★★★
 *     ★★★
 *     ★★
 *     ★
 *      i    j    ===> i+j=5   j=5-i
 *     줄수  별표
 *      1    4
 *      2    3
 *      3    2
 *      4    1    ==> 역순이면 +
 *      
 *      A
 *      BC
 *      DEF 
 *      GHIJ
 *      
 *      A
 *      AB
 *      ABC
 *      ABCD
 *      
 *      #234
 *      1#34
 *      12#4
 *      123#
 *      
 *      ===> 정렬 
 *      ===> 빈도구하기 
 *      ===> 등수구하기 
 *      ===> 마름모 / 나비 / 모래시계 
 *      
 *         ★
 *        ★★
 *       ★★★
 *      ★★★★
 *      ------------
 *         i    k    j     i/k   i/j
 *        줄수  공백  별표    i+k=4 ==> k=4-i   j=i
 *         1    3    1
 *         2    2    2
 *         3    1    3
 *         4    0    4
 *      ★★★★
 *       ★★★
 *        ★★
 *         ★
 *         
 *         ★
 *        ★★★
 *       ★★★★★
 *      ★★★★★★★
 *     
 *     1 3
 *     2 2
 *     3 1
 *     4 0
 *      
 */
public class 중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for(int i=1;i<=5;i++)
        {
        	char c='A';
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print(c++ +" ");
        	}
        	System.out.println();
        	
        }
	}

}
