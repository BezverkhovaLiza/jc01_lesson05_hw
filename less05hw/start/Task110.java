package edu.jc1.less05hw.start;

public class Task110 {
    public static void main(String[] args){
        double r1 = 4;
        double r2 = 3;
        double S1 = Math.PI * r1 * r1;
        double S2 = Math.PI * r2 * r2;

        if(S1 < S2){
            System.out.println("Площадь первого круга меньше.");
        }
        else if(S1 > S2){
            System.out.println("Площадь второго круга меньше.");
        }
        else{
            System.out.println("Площади кругов равны.");
        }
    }
}
