package ru.geekbrains;

public class taskMain {

    public static void main(String[] args) {
        System.out.println(calc(1, 2, 4, 4));
        System.out.println("Hello World");
        System.out.println(number(12, 3));
        int a = 1;
        char b = 'b';
        byte c = 127;
        boolean d = true;
        long e = 7788992L;
        float f = 3.33f;
        double g = 4.55;
    }

    public static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean number(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }


}



