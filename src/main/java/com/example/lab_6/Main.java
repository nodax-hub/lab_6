package com.example.lab_6;

import com.example.lab_6.functions.FunctionPoint;
import com.example.lab_6.functions.LinkedListTabulatedFunction;
import com.example.lab_6.functions.TabulatedFunction;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) throws Exception {
        TabulatedFunction func_1 = new LinkedListTabulatedFunction(1, 5, new double[]{1, 2, 3, 4, 5});

        TabulatedFunction func_2 = func_1.clone();
        System.out.println("must eq: " + func_1.equals(func_2) + ". hc must eq: " + (func_1.hashCode() == func_2.hashCode()));

        func_2.setPoint(0, new FunctionPoint(1.8, 545));
        System.out.println("not be eq: " + func_1.equals(func_2) + ". hc any: " + (func_1.hashCode() == func_2.hashCode()));

        System.out.println(func_1);
        System.out.println(func_2);

    }
}
