package com.company;

import java.util.Scanner;

public class Main {

    static Integer sumaCifara(Integer broj) {
        Integer n = broj;
        Integer suma = 0;
        while(n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite cijeli broj n");
        Integer n = input.nextInt();
        System.out.println("Brojevi izmedju 1 i n djeljivi sa sumom svojih cifara");
        for(Integer i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}
