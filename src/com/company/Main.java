
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    /*
    11653

    정수 N이 주어졌을 때, 소인수분해

    소수 2부터 시작해서,
    N%소수=0이라면 N 소수로 나눠주고 반복,
    아니라면 다음 소수값(ex) 2 -> 3)으로 반복

    시간초과 해결방안?
    sb -> X
    루트 N 할때마다 실행? -> O !!

    Stranger's lab 참고해서 작성한 내용임. 나중에 스스로 다시 해결해볼 것.

     */


    public static void primeFactorization(int N){

        /*
        기본 틀: N = a*b 일때, 반드시 한 수는 루트N보다 작거나 같다
        루트N에 대해 실행. 새롭게 나누어진 N값에 대해 계속 적용된다
        9991의 경우, 97 구하고 103은 계산할 필요 없이 출력되기 때문에 시간 단축 굳.
         */
        for(int i=2; i<= Math.sqrt(N); i++){
            while(N % i == 0){
                System.out.println(i);
                N /= i;
            }
        }

        if(N!= 1){
            System.out.println(N);
        }

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
        int N = Integer.parseInt(br.readLine());

        primeFactorization(N);

    }

}