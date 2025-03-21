import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        while(input.hasNext()) {//Kullanıcı giriş yaptıkça devam eder.
            String a = input.nextLine();
                System.out.println(num++ + " " + a);
        }
    }
}