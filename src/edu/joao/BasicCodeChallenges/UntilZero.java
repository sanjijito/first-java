package edu.joao.BasicCodeChallenges;

import java.util.*;

public class UntilZero {
    
    static Scanner sc = new Scanner(System.in);

    static int reduzAZero(){
        int N, soma = 0;

        N = sc.nextInt();
        if(N > 0)
            while(N >= 0){
                soma += N;
                N--;
            }
             
    return soma;
    }

    public static void main(String[] args) {
       System.out.println(reduzAZero()); 
    }
}
