package com;

public class Math {

static double divide(double numerator, double denominator){

    if(denominator==0){
        throw new ArithmeticException("divide by zero");
    }
    return numerator/denominator;
}


}

