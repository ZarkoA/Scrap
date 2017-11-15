package test.lambdas;

import java8.lambdas.Integrable;
import java8.lambdas.NumericalIntegration;

class NumericalIntegrationTest {

    public static void main(String[] args){
        integrationTest(x -> x*x, 10, 100);
        integrationTest(x -> Math.pow(x, 3), 50, 500);
        integrationTest(Math::sin, 0, Math.PI);
        integrationTest(Math::exp, 2, 20);
    }

    public static void integrationTest(Integrable function, double x1, double x2){
        for (int i = 1; i < 7; i++){
            int numSlices = (int)Math.pow(10, i);
            double result = NumericalIntegration.integrate(function, x1, x2, numSlices);
            System.out.printf(" For numSlices =%, 10d result = %, .8f%n", numSlices, result);
        }
    }
}