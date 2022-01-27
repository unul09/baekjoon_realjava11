
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    /*
    10757

    A+B 반환 근데 이제 값이매우큰.
    스트링 변환 후 각자리수 더해주고, 다시 스트링으로 만들어서 출력해주자~
    10넘을시 올림하는것 주의. 새로운 자리수 생길수있음 주의.
    아예 마지막자리는 반복문에서 빼서 처리할까..?

    완성은 했는데 너무 난잡해!!! 이따가 블로그글 보고 짧게작성하는법 참고할것.
     */
    public static String largeSum(String A, String B){
        int num, up = 0; //num은 append해줄 숫자. up은 올림여부
        StringBuilder sb = new StringBuilder();
        int whoIsLonger; //더 긴놈 길이

        //더 긴놈 길이 구하고, 짧은놈은 긴놈길이 맞춰서 앞에 0 붙여주기
        if(A.length() > B.length()){
            whoIsLonger = A.length();
            int Bl = B.length();
            for(int i=0; i<whoIsLonger - Bl; i++){
                B = "0" + B;
            }
        }
        else{
            whoIsLonger = B.length();
            int Al = A.length();
            for(int i=0; i<whoIsLonger - Al; i++){
                A = "0" + A;
            }
        }


        for(int i=0; i<whoIsLonger; i++){ //1의자리수부터 맨끝자리수까지
            //숫자 = Achar + Bchar + up
            num = (A.charAt(A.length()-1 - i) - '0') + (B.charAt(B.length()-1 - i) - '0') + up;

            //올림수여부 체크
            if(num > 9) up = 1;
            else up = 0;

            sb.append(num%10);
        }

        if(up == 1) sb.append(1); //마지막 올림수 있다면 1붙여주기

        //append는 맨뒤에 붙이는 식이기 때문에 리턴은 reverse해준값으로.
        return sb.reverse().toString();
    }


    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String A = st.nextToken();
        String B = st.nextToken();

        System.out.println(largeSum(A, B));
    }

}