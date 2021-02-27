package com.nastya;

import com.nastya.fruits.Apple;
import com.nastya.fruits.Orange;

import java.util.*;

public class Main {

    public static void main ( String[] args ) {
        Integer[] array = {1 , 2 , 3 , 4 , 5 , 6};       //Задание 1
        System.out.println (Arrays.toString (array));
        swap (array , 2 , 3);
        System.out.println (Arrays.toString (array));
        List<Integer> list = toArrayList (array); //Задание 2
        System.out.println (list);

        //Задание 3.
        Apple apple = new Apple ();


        Orange orange = new Orange ();


        Box<Apple> boxApple = new Box<> ();
        Box<Apple> boxApple2 = new Box<> ();
        Box<Orange> boxOrange = new Box<> ();
        boxApple.add (apple, apple,apple);
        boxApple2.add (apple, apple);
        boxOrange.add (orange , orange, orange, orange);
        System.out.println ("Вес коробки с апельсинами (1):" + boxOrange.getWeight ());
        System.out.println ("Вес первой коробки с яблоками (2):" + boxApple.getWeight ());
        System.out.println ("Вес второй коробки с яблоками (3):" + boxApple2.getWeight ());
        System.out.println ("Соответствие веса коробок:" + " 1 и 2 " + boxApple.compare (boxOrange));
        System.out.println ("Соответствие веса коробок:" + " 3 и 2 " + boxApple.compare (boxApple2));
        System.out.println ("Соответствие веса коробок:" + " 3 и 1 " + boxApple.compare (boxOrange));
        transferBoxByBox (boxApple,boxApple2);
    }

    public static <T> void swap ( T[] arr , int swap1 , int swap2 ) { //метод замены Задание1
        T temp = arr[ swap1 ];
        arr[ swap1 ] = arr[ swap2 ];
        arr[ swap2 ] = temp;
    }

    public static <K> List<K> toArrayList ( K[] arr ) {  //метод преобразования Задание 2

        return Arrays.asList (arr);
    }

    public static   <T> void transferBoxByBox ( Box<? super T> boxToEmply, Box <? super T>  boxToClear ) {

        System.out.println (boxToEmply);
        boxToClear.empty (boxToEmply);
        System.out.println ("Вес в прересыпанной коробке: " + boxToEmply.getWeight ());


    }
}

