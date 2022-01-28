
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
     */


    public static void primeFactorization(int N){
        /*소수 2부터 시작해서,
        N%소수=0이라면 N 소수로 나눠주고 해당소수 출력 후 반복,
        아니라면 다음 소수값(ex) 2 -> 3)으로 반복*/
        int prime = 2;
        while(N != 1){
            if(N % prime == 0){
                N = N/prime;
                System.out.println(prime);
            }
            else{
                prime = nextPrimeNum(prime);
            }
        }
    }

    public static int nextPrimeNum(int currentPrime){ //다음 소수값 찾아서 반환
        currentPrime++;
        while(isPrimeNum(currentPrime) == false){
            currentPrime++;
        }
        return currentPrime;
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