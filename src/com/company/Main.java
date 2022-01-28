
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    /*
    4948

    베르트랑 공준: (자연수 n) n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재
    자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구해라
     */

    public static int howManyBtrang(int n){ //n보다 크고, 2n보다 작거나 같은 소수의 개수 리턴
        int cnt = 0;
        for(int i=n+1; i<=2*n; i++){
            if(isPrimeNum(i)) cnt++;
        }
        return cnt;
    }


    public static boolean isPrimeNum(int n){ //해당숫자가 소수인지 참거짓 반환
        if(n == 1) return false; //1이면 거짓
        for(int i = 2; i <= Math.sqrt(n); i++){ //루트값까지 확인해주기(반복수줄이기)
            if(n%i == 0) return false; //나누어지는 값이면 소수 아님
        }
        return true; //끝까지 살아남았으면 소수
    }


    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            System.out.println(howManyBtrang(n));
        }

    }

}