/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            double salary = scanner.nextDouble(); // Employee's salary

            double grossSalary = calculateGrossSalary(salary);
            System.out.printf("%.2f%n", grossSalary); // Print gross salary with 2 decimal places
        }

        scanner.close();
    }

    public static double calculateGrossSalary(double salary) {
        double hra, da;
        
        if (salary < 1500) {
            hra = 0.10 * salary;
            da = 0.90 * salary;
        } else {
            hra = 500;
            da = 0.98 * salary;
        }
        
        return salary + hra + da;
    }
}
