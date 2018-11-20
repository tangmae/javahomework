/**
 * Copyright   Rakuten, Inc. All Rights Reserved.
 *
 * This program is the information assets which are handled
 * as "Strictly Confidential".
 * Permission of Use is only admitted in Rakuten Inc.
 * Development Department.
 * If you don't have permission , MUST not be published,
 * broadcast, rewritten for broadcast or publication
 * or redistributed directly or indirectly in any medium.
 */
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

        boolean ans = isDivisible(25, 5); //output in boolean -> true or false
        System.out.println(ans);
        
        // example isDivisible(25, 5) -> true
        // example isDivisible(25, 3) -> false
        // example isDivisible(20, 4) -> true

        ans = isPrimeNumber(13);//output true or false
        System.out.println(ans);
        // example isPrimeNumber(13) -> true
        ans = isPrimeNumber(93);
        System.out.println(ans);

        ans = isPrimeNumber(149);
        System.out.println(ans);

        ans = isPrimeNumber(169);
        System.out.println(ans);

        ans = isPrimeNumber(20);
        System.out.println(ans);

        ans = isPrimeNumber(13);
        System.out.println(ans);

        ans = isPrimeNumber(13);
        System.out.println(ans);

        // 素数（そすう）とは、1 と自分自身以外に正の約数を持たない
    }

    public static boolean isDivisible(int number, int divisor) {

    }


    public static boolean isPrimeNumber(int number) {

    }

}
