import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
            try {
                a=input.nextInt();
                b=input.nextInt();

                System.out.println(a);
                System.out.println(b);
                System.out.println(a/b);
            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                //System.out.println("java.util.InputMismatchException"); HackerRank Çözümü.
            }catch (ArithmeticException e) {
                System.out.println(e.toString());
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }

    }
}