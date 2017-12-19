package com.my;

public class MathOperator {

    public static  void main(String []args)
    {
        int ValA=21;
        int ValB=6;
        int ValC=3;
        int ValD=1;

        int result1= ValA- ValB/ ValC;
        int result2= (ValA-ValB)/ValC;

        System.out.println(result1);
        System.out.println(result2);

        int result3= ValA/ValC * ValD + ValB;

        System.out.println(result3);
    }
}
