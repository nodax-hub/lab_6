package com.example.lab_6.functions;

import com.example.lab_6.functions.basic.Const;
import com.example.lab_6.functions.meta.*;

@SuppressWarnings("unused")
final public class Functions {
    private Functions() {
    }

    public static Function shift(Function f, double shiftX, double shiftY) {
        return new Shift(f, shiftX, shiftY);
    }

    public static Function scale(Function f, double scaleX, double scaleY) {
        return new Scale(f, scaleX, scaleY);
    }

    public static Function power(Function f, double power) {
        return new Power(f, new Const(power));
    }

    public static Function sum(Function f1, Function f2) {
        return new Sum(f1, f2);
    }

    public static Function mult(Function f1, Function f2) {
        return new Mult(f1, f2);
    }

    public static Function composition(Function f1, Function f2) {
        return new Composition(f1, f2);
    }

    public static double integration(Function f, double leftX, double rightX, double samplingStep) {
        if (leftX >= rightX || leftX < f.getLeftDomainBorder() || rightX > f.getRightDomainBorder() || samplingStep <= 0)
            throw new IllegalArgumentException("illegal argument");
        double x1 = leftX, x2 = x1 + samplingStep;
        double result = 0;
        while (x2 < rightX) {
            result += samplingStep * (f.getFunctionValue(x1) + f.getFunctionValue(x2)) / 2;
            x1 = x2;
            x2 += samplingStep;
        }
        return result + (rightX - x1) * (f.getFunctionValue(x1) + f.getFunctionValue(rightX)) / 2;
    }

    public static double integration(Function f, double leftX, double rightX) {
        return integration(f, leftX, rightX, 0.001);
    }
}