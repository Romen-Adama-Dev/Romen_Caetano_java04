package pk.edu.pk.erasmus.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    //Real example using ArrayList
    public static void main(String[] args) {
        ArrayList<Double> height = new ArrayList();
        int N;
        double average;
        N = studentNum();
        readheight(height, N);
        average = calulateAverage(height);
        results(height, average);
    }

    public static int studentNum() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Student Number: ");
            n = sc.nextInt();
        } while (n < 1);
        return n;
    }

    public static void readheight(ArrayList<Double> a, int n) {
        Scanner sc = new Scanner(System.in);
        int i;
        double high;
        for (i = 1; i <= n; i++) {
            do {
                System.out.print("Student " + i + " high: ");
                high = sc.nextDouble();
            } while (high <= 0);
            a.add(high);
        }
    }

    public static double calulateAverage(ArrayList<Double> a) {
        double average = 0;
        for (Double d : a) {
            average = average + d;
        }
        return average / a.size();
    }

    public static void results(ArrayList<Double> a, double average) {
        int higher = 0, lower = 0;
        System.out.println("Introduced height: ");
        System.out.println(a);
        for (Double d : a) {
            if (d > average)
                higher++;
            else if (d < average)
                lower++;
        }
        System.out.printf("Average: %.2f %n", average);
        System.out.println("Exists " + higher + " students biggers than the average");
        System.out.println("Exists " + lower + " students lowers than the average");
    }
    //Tets
    public static void tets(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.remove(1);
        cars.set(1, "Manzana");
        cars.clear();
        System.out.println(cars);
    }


}