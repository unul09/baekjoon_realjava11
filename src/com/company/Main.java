
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    /*
    1011

    y-x만큼 이동해줄거임
    처음은 1광년, 그 다음값은 (전의이동거리) +- 1 범위. 정확히 이동해야함

    구상
    전의이동거리가 n일때, 남은 거리가 (n-1)보다 작다면 전의이동거리는 n이되어서는안됨!
     */

    public static int dimensionMoverTimes(int D){
        return 0;

    }


    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(dimensionMoverTimes(y-x));
        }

    }

}