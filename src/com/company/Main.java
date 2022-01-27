
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;



public class Main {
    /*
    2775

    a층의 b호 사람수 -> a-1층의 1~b호 사람합
    k: 층. 0층부터 있음   /   n: 호. 1호부터 있음
    0층의 i호에는 i명이 산다

     */

    public static int howMany(int k, int n) {
        int[] currentFloor = new int[n]; //현재 층. 이것을 기준으로 위에층 설정할것
        int[] nextFloor = new int[n]; //다음 층.
        nextFloor[0] = 1; //첫방에는 다들 1이므로 1 넣어주기
        for(int i=0; i<n; i++)
            currentFloor[i] = i+1; //1,2,3,.. n 값 넣어주기

        for(int i=0; i<k; i++){ //층수만큼 돌릴거야
            for(int j=0; j<n-1; j++){
                //한 층에서 j, j+1번째 방의 차이는 바로밑에층의 j+1번째 방만큼이므로 아래와 같이 계산
                nextFloor[j+1] = nextFloor[j] + currentFloor[j+1];
            }
            currentFloor = nextFloor; //방금 설정했던 nextFloor을 currentFloor로 설정해준다.
        }

        //위의 반복문이 모두 끝나면 currentFloor는 최상층이므로, 최상층의 마지막 방 인원수를 리턴.
        return currentFloor[n-1];
    }

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(howMany(k, n));
        }




    }


}