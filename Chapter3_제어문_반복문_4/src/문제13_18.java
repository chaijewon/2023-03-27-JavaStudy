/*
 *   ********** 
     ********** 
     **********
     **********
     **********
     ------------------
     1 1 1 1 1
     2 2 2 2 2
     3 3 3 3 3
     4 4 4 4 4
     5 5 5 5 5
     -----------------
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     ---------------------
     A B C D E
     A B C D E
     A B C D E
     A B C D E
     A B C D E
     ---------------
     A A A A A 
     B B B B B
     C C C C C
     D D D D D
     E E E E E

     

 */
public class 문제13_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=10;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println();
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
        
        System.out.println();
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        
        System.out.println();
        
        for(int i=1;i<=5;i++)
        {
        	char c='A';
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print(c++ +" ");
        	}
        	System.out.println();
        	
        }
        
        System.out.println();
        
        char c='A';
        for(int i=1;i<=5;i++)
        {
        	
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print(c +" ");
        	}
        	System.out.println();
        	c++;
        }
	}

}
