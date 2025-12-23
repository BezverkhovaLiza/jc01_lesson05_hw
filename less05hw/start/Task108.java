package edu.jc1.less05hw.start;

public class Task108 {
    public static void main(String[] args){
        double a = 4;
        double b = 3;

        if(a * a < b * b){
            System.out.println("Квадрат числа а меньше.");
        }
        else if(a * a > b * b){
            System.out.println("Квадрат числа b меньше.");
        }
        else{
            System.out.println("Квадраты чисел равны.");
        }
    }
}
