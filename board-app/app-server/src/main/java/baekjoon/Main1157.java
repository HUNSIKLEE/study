package baekjoon;

import java.util.*;

public class Main  {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();
        sc.close();

        int[] a = new int [26];

        for(int i = 0; i <str.length(); i++) {
            int num = str.charAt(i) - 'A';
            a[num]++;
        }

            int m = 0;
            char r = '?';
            for(int i = 0; i < a.length; i++){
                if(m < a[i]){
                    m = a[i];
                    r = (char) (i + 'A');
                }else if(m == a[i]){
                    r = '?';
                }

            }

        System.out.println(r);
    }
 }
