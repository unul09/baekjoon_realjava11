
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    /*
    1929

    1978, 2581과 유사. 시간 더 줄이려면 어떻게.? 나중에 다시 생각해보자.
    M이상 N이하의 소수를 모두 출력
     */


    public static boolean isPrimeNum(int n){ //해당숫자가 소수인지 참거짓 반환
        if(n == 1) return false; //1이면 거짓
        for(int i = 2; i <= Math.sqrt(n); i++){ //루트값까지 확인해주기(반복수줄이기)
            if(n%i == 0) return false; //나누어지는 값이면 소수 아님
        }
        return true; //끝까지 살아남았으면 소수
    }


    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] nums = new int[N-M+1];

        for(int i=0; i<nums.length; i++){
            nums[i] = M+i;
            if(isPrimeNum(nums[i])) System.out.println(nums[i]);
        }

    }

}