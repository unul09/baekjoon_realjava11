
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    /*
    2581

    M이상 N이하의 자연수 중 소수인 것 골라서 총합, 최솟값 찾기
     */

    public static int sumOfPrimeNum(int[] nums){ //소수 총합
        int sum = 0; //총합
        for(int i=0; i<nums.length; i++){
            if(isPrimeNum(nums[i])) sum += nums[i];
        }
        return sum;
    }

    public static int smallestPrimeNum(int[] nums){ //소수 최솟값
        for(int i=0; i<nums.length; i++){
            if(isPrimeNum(nums[i])) return nums[i];
        }
        return -1;
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
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N-M+1];

        for(int i=0; i<nums.length; i++)
            nums[i] = M+i;

        //M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력, 리턴하여 main 끝내기
        if(sumOfPrimeNum(nums) == 0){
            System.out.println(-1);
            return;
        }
        System.out.println(sumOfPrimeNum(nums));
        System.out.println(smallestPrimeNum(nums));

    }

}