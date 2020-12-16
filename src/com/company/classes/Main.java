package com.company;

public class Main {

    public static void main(String[] args) {

        Valores Valor = new Valores();

        for (int i = 1; i < 10; i++){
            System.out.println(Valor.ins(i));

            System.out.println(Valor.del(i));

            System.out.println(Valor.size());
        }
    }
}
