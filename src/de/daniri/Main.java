package de.daniri;

import java.util.Scanner;

public class Main {

    /* function */
    public static double f(double x) {
        return x * x * x - 2. * x * x + x - 5.;
    }

    public static void main(String[] args) {
        /* init scanner */
        Scanner sc = new Scanner(System.in);

        /* init c */
        double c = 0;

        /* ask for a */
        System.out.println("Enter a: ");
        /* store a */
        double a = sc.nextDouble();
        /* ask for b */
        System.out.println("Enter b: ");
        /* store b */
        double b = sc.nextDouble();

        /* check different signes */
        if ((f(a) > 0 && f(b) < 0) || (f(a) < 0 && f(b) > 0)){
            /* iterate 10 */
            for (int i = 0; i < 10; i++){

                c = (a + b) / 2;

                if((f(a) > 0 && f(c) < 0) || (f(a) < 0 && f(c) > 0)){
                    b = c;
                }else {
                    a = c;
                }
            }
            System.out.println(c);
        }else {
            System.out.println("Numbers have same sign");
        }
    }
}
