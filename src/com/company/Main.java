package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону №1:");
        int side1 = scanner.nextInt();

        System.out.println("Введите сторону №2:");
        int side2 = scanner.nextInt();

        if (side1>side2) {
            System.out.println("Сторона №1 больше - " + side1);
        } else if (side1<side2) {
            System.out.println("Сторона №2 больше - " + side2);
        } else {
            System.out.println("Стороны равны");
        }
        }
    }

