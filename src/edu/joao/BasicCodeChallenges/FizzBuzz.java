package edu.joao.BasicCodeChallenges;

import java.util.*;

public class FizzBuzz {

    static Scanner numero = new Scanner(System.in);

    static void imprima(){

        int num = numero.nextInt();

        if(num % 3==0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(num % 3 == 0){
            System.out.println("Fizz");
        }else if(num % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        imprima();
    }   
}
