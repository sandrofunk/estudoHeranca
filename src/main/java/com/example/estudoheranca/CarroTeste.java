package com.example.estudoheranca;

public class CarroTeste {
    public static void main(String[] args) {
        Fiat147 x = new Fiat147();
        x.acelerar();
        System.out.println(x);

        Fusca y = new Fusca();
        y.acelerar();
        System.out.println(y);
    }
}
