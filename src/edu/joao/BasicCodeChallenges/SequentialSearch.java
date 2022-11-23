package edu.joao.BasicCodeChallenges;

import java.util.*;

public class SequentialSearch {

   static Scanner sc = new Scanner(System.in);
   
   static int[] A = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
     
    static void busca(){
        boolean resultado = false;
        
        int input = sc.nextInt();
        
            for (int i = 0;i<A.length;i++){
                if(input == A[i]){
                    System.out.println("Achei " + input + " na posicao " + (i));
                    resultado = true;
                }   
            }    
        if(resultado == false){
            System.out.println("Numero " + input + " nao encontrado!");
        }        
    }

    public static void main(String[] args) {
        busca();
    }   
}
