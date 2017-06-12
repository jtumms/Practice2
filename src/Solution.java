import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        while (true) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            System.out.println("enter a base 10 number...");
            Scanner scan = new Scanner(System.in);


            int n = scan.nextInt();
            StringBuilder sb = new StringBuilder();
            while (n > 1) {
                if (n % 2 == 0) sb.append("0");
                if (n % 2 == 1) sb.append("1");
                n = n / 2;
                if (n == 1) sb.append("1");
            }
            String binary = sb.reverse().toString();

            int max = 0;
            int i = 0;
            int successive = 0;
            boolean moreToCheck = true;
            while (moreToCheck) {
                if (i >= binary.length() -1) {
                    moreToCheck = false;
                    System.out.printf("The base 10 number %d in binary is: %s\n", n, binary);
                    System.out.printf("The maximum conesecutive number of ones in the binary strings is: %d\n\n",max);
                    break;
                }
                else if (binary.charAt(i) == '1') {
                    successive = 1;
                    int j = i;
                    while (j < binary.length() -1 && binary.charAt(j + 1) == '1') {
                        successive += 1;
                        j++;

                    }

                    if (max < successive) max = successive;
                    i = j + 1;
                }
                else if (binary.charAt(i) == '0') i++;

            }




        }


    }
}