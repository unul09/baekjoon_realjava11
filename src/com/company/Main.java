
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;



public class Main {
    /*
    2839

    N = 5*a + 3*b
    a+b 값이 제일 작아지도록.
    5의 배수가 될때까지 (N%5 =0일때까지) N에서 3을 빼준다. 빼주면서 b카운트 증가시키기
    위의 반복문이 끝나면 a = (새로운N값)/5 해주고나서 출력하기.
     */

    public static int SugerBags(int N){
        int a=0, b=0;
        while(N%5 != 0){
            N -= 3;
            if(N < 0) return -1;
            b++;
        }
        a = N/5;
        return a+b;
    }

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(SugerBags(N));
    }

}