package com.company;

//2. Написать программу, удаляющую из целочисленного массива А размерности N элементы, равные целочисленному Х.
//В результате должен получиться массив не большей размерности. На экран должны выводиться как оригинальное состояние массива, так и итоговое.

import java.util.*;

public class L4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> IntegerArrayList = new ArrayList<>();
        System.out.print("Введите целое число: ");
        while (!in.hasNext("quit")) {
            System.out.print("Введите целое число: ");
            IntegerArrayList.add(in.nextInt());
        }

        ArrayList<Integer> NewArrayList = new ArrayList <>(IntegerArrayList);
        Collections.copy(NewArrayList, IntegerArrayList);
        in.next();
        System.out.print("Введите число, которое должно быть удалено: ");
        NewArrayList.remove(in.nextInt());


        IntegerArrayList.toArray();
        System.out.println("Изначальный массив: " + IntegerArrayList);

        NewArrayList.toArray();
        System.out.println("Новый массив: " + NewArrayList);


            in.close();
        }
    }
