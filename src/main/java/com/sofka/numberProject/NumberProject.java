package com.sofka.numberProject;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class NumberProject {
    public static void main(String[] args) {
        int number=0, sum=0, div;
        String numberInverted= "";
        Scanner read = new Scanner(System.in);

        while(number<=999 || number >9999)
        {
            System.out.println("Digite el numero al que desea sumar sus digitos e invertir");
            number = read.nextInt();
        }

        for(int i = 1000; i >= 1; i /= 10)
        {
            div = number / i; //Div by i value to obtain the first digit
            sum = sum + div; // Sum the digit obtained

            numberInverted = div + numberInverted; //concatenate the digit to create the inverse
            number = number % i; //change number to the next iteration
        }

        System.out.println("La suma de los digitos es: " + sum + " y el numero invertido: " + numberInverted);
    }
}
