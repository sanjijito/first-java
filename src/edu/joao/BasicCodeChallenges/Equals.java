package edu.joao.BasicCodeChallenges;

import java.util.*;

public class Equals{

    static Scanner sc = new Scanner(System.in);

    public static void saoIguais(){
        int A = 0;
        int B = 0;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A == B){
            System.out.println("Sao iguais!");
        }else{
            System.out.println("Nao sao iguais!");
        }
    }

    public static void main(String[] args) {
        saoIguais(); 
    }
}
