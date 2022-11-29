package org.example;
public class Main {
    public static void main(String[] args)
    {
        int count = 0;
        int a,b = 1, c = 2;
        double r = 1.4;
        float f = 1.4f;
        boolean trueFalse = true;
        String str = "Stroka";
        char cc = 'r';
        char ccc = 143;

        if (true) {
            System.out.println("hello worde");
        } else if (2==0){
            int i = 9;
        } else {
            int k = 10;
        }
        // sout + tab выводит сразу штука для вывода
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        while (i<10){
            System.out.print(i+ " ");
            i++;
        }
        Human humanDima = Human();
        humanDima.setAge = 18;
        humanDima.weight = 70;
        humanDima.height = 170;

        System.out.println("Dima" + humanDima.age);
    }
}