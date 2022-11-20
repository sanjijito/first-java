package edu.joao.BasicCodeChallenges;

import java.util.*;

public class Multiples {

       static Scanner sc = new Scanner(System.in);
        
        public static int somaMultiplos(){
            int A, N, T = 1, C = 0;

            A = sc.nextInt();
            N = sc.nextInt();

            while(T * A <= N){
                C += A * T; 
                T++; 
            }
            return C;
        }
        public static void main(String[] args) {
            System.out.println(somaMultiplos());
        }
}
