package guru.qa;

import java.sql.SQLOutput;

public class MyHomework {

    public static void main(String[] args){

        int x = 6;
        int y = 3;

        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;
        int e = x % y;


        String name = "Павел";
        System.out.println("Отчёт о работе программы:");
        System.out.println("После сложения  x и y мы получили: "+ a);
        System.out.println("После вычитания x и y мы получили: "+ b);
        System.out.println("После умножения x и y мы получили: "+ c);
        System.out.println("После целочисленного деления x и y мы получили: "+ d);
        System.out.println("После взятия отстатка от деления x и y мы получили: "+ e);

        if (x > y) {
            System.out.println("x > y");
        }else{
            System.out.println("x < y");
        }
        if (x >= y){
            System.out.println("x >= y");
        }else{
            System.out.println("x <= y");
        }

        if ((a > b) && (b < c) ||(d!=e)){
            System.out.println("Логика верна");
        }else{
            System.out.println("Логика неверна");
        }

        if (name instanceof String){
            System.out.println("Верное имя");
        }else{
            System.out.println("Неверное имя");
        }

        if (name.equals("Павел")){
            System.out.println("Привет " + name);
        }else{
            System.out.println("Бан!");
        }

        switch (name){
            case"Pavel":
                System.out.println("Привет " + name);
                break;
            case"John":
                System.out.println("Бан!");
        }
            int numone = Byte.MAX_VALUE + 2;
            System.out.println("numone");
            int numtwo = Byte.MIN_VALUE - 1;
            System.out.println("numtwo");

            name = a > b ? "Pavel" : "John";
            System.out.println("Pavel");







    }




}
