package com.aidai;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	kluug(23,25);
    kluug(24,26);
        kluug(28,26);
        kluug(21,gererateRandomAge());
        kluug(22,gererateRandomAge());
        kluug(24,gererateRandomAge());
    }
    public static void kluug ( int temp ,int  age){
        if (age > 20&& age <45 && temp >-20 && temp<30){
            System.out.println("Вы можете идти гулять");
        }else
            if (age<20 && temp>0 && temp<28){
                System.out.println(" можно гулять");

            }else
                if (age<45 && temp>-10 && temp<25){
                    System.out.println("Можно идти гулять");
                }else
                    System.out.println("Оставайтесь дома");





    }
    public static int gererateRandomAge(){
        Random random = new Random();
    int kluug = random.nextInt(50)+1;
    return kluug;
    }

}
