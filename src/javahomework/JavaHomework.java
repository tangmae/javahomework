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
     // Create method to operate the number as the following
     // plusNumber(int x, int y)
     // minusNumber(int x, int y)
     // multiplyNumber(int x, int y)
     // divideNumber(int x, int y)  => x/y
     // plusRangeOfNumber(int x, int y) => result of accumulating from x to y  => x + (x+1) + (x+2) + ... + y
    public static void main(String[] args) {
//    		plusNumber(1,2);
    		
//    		minusNumber(1,2);
    		
//    		multiplyNumber(1,2);
    		
//    		divideNumber(1,2);
    		
    		plusRangeOfNumber(2,11);
//    		
//    		int loopVal;
//    		int end_value = 11;
//    		int addition =0;
//    		
//    		for (loopVal=1; loopVal < end_value; loopVal++) {
//    			addition = addition + loopVal;
//    		}
//    		System.out.println("Total = " + addition);
    		
    		
    		
    }

    // the method should return the number of result
    // int result = plusNumber(1, 2);
    // System.out.println(result); => output in the console must showing "3"
    // https://www.safaribooksonline.com/videos/java-for-beginners/9781788996518/9781788996518-video3_11
    // https://www.tutorialspoint.com/java/java_methods.htm
    // or search "java method with return" on google
    // the below method still incomplete and something incorrect please fix it ~!
    public static void plusNumber(int x, int y) {
 
    	System.out.println(x+y);
    }
    
    public static void minusNumber(int x ,int y) {
    	System.out.println(x-y);
    }
    
    public static void multiplyNumber(int x ,int y) {
    	System.out.println(x*y);
    }
    
    public static void divideNumber(int x, int y) {
    	System.out.println(x/y);
    }
    
    public static void plusRangeOfNumber(int x, int y ) {
    	int addition =0;
    	for (; x < y; x++) {
    		addition = addition + x;
    	}
    	System.out.println(addition);
    }
    
}
