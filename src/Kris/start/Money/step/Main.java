package Kris.start.Money.step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple1 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.box.add(orange1);
        orangeBox.box.add(orange2);
        appleBox.box.add(apple);
        appleBox.box.add(apple1);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));


        Integer[] arr2 = new Integer[5];
        int[] arr1 = new int[7];
        arr1[2] = 9;
        arr1[3] = 2;
        arr1[5] = 4;


        System.out.println(Arrays.toString(arr1));
        swap(arr1, 3, 6);
        System.out.println(Arrays.toString(arr1));
        arays(arr2);


    }

    public static void swap(int[] arr, int x, int y) {

        int swp = arr[x];
        arr[x] = arr[y];
        arr[y] = swp;


    }

    public static void arays(Integer[] arr) {
        List<Integer> x = new ArrayList<>();
        arr = x.toArray(new Integer[0]);
        System.out.println(x);


    }
}

