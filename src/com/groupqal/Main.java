package com.groupqal;

public class Main {

    public static void main(String[] args) {
	double pounds = 25;
	double grams = pounds * 453.6;
	int kilos;

	kilos = (int)grams / 1000;
	grams = grams % 1000;

        System.out.println("In " + (int)pounds + " pounds " + kilos + " kilos and " + (int)grams + " grams");

    }
}
