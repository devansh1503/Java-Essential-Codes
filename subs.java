package com.company;
import java.util.*;
public class subs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        HashSet<Character> sub = new HashSet<Character>();
        int i = 0, j = 0, res = 0;
        while (i < n) {
            if (!sub.contains(s.charAt(i))) {
                sub.add(s.charAt(i++));
                res = i - j;
                System.out.println("added"+ sub +"i="+i+"j="+j);
            } else {
                sub.remove(s.charAt(j++));
                System.out.println("removed"+sub +"i="+i+"j="+j);
            }
        }
        System.out.println(res);
        System.out.println(sub);
    }
}
