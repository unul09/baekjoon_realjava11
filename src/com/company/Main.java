
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    /*
    1978

    n개의 수 중 소수 몇개인지 출력
     */

    public static int howManyPrimeNum(int[] nums){
        int cnt = 0; //소수갯수세줄거임
        for(int i=0; i<nums.length; i++){
            if(isPrimeNum(nums[i])) cnt++;
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
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++)
            nums[i] = Integer.parseInt(st.nextToken());

        System.out.println(howManyPrimeNum(nums));

    }

}