/**
ﾂ�* Copyrightﾂ�ﾂ� Rakuten, Inc. All Rights Reserved.
ﾂ�*
ﾂ�* This program is the information assets which are handled
ﾂ�* as "Strictly Confidential".
ﾂ�* Permission of Use is only admitted in Rakuten Inc.
ﾂ�* Development Department.
ﾂ�* If you don't have permission , MUST not be published,
ﾂ�* broadcast, rewritten for broadcast or publication
ﾂ�* or redistributed directly or indirectly in any medium.
ﾂ�*/
package javahomework;

/**
 * @author suppassara.k
 *
 */
public class JavaHomework {
    /**
     * @param args
     */

    public static void main(String[] args) {

        printOddNumberInRange(1,10); // output should be 1,3,5,7,9,10
        printPrimeNumberInRange(1,10); // output should be 1,3,5,7

    }

    // write a method which can find and print odd numbers from assigned range x - y
    public static void printOddNumberInRange(int x, int y) {
    
    	for (; x < y; x++) {
    		
    		if (x % 2 == 1) {
    			System.out.println(x);
//    		}else {
//    			System.out.println(x);
    			}
    		
    	}
    }

    public static void printPrimeNumberInRange(int x, int y) {
    
    	String primeNumbers = "";
    	for (; x <=10; x++)
    	{
    		int counter=0;
    		for(y = x; y>=1; y--)
    		{
    			if(x%y==0)
    			{
    				counter = counter + 1;
    			}
    		}
    		if (counter ==2)
    		{
    			primeNumbers = primeNumbers + x + " ";
    		}
    	}
    	System.out.println(primeNumbers);
    	
 
    }
    // write a method which can find and print prime numbers from assigned range x - y

}
