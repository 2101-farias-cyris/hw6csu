/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hw6;

/**
 *
 * @author cyris
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // arraylists to store days and temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

       
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the day of the week mon through sun: ");
            String day = scanner.nextLine();
            days.add(day);

            System.out.print("Enter the average temperature for" + day + ": ");
            double temperature = Double.parseDouble(scanner.nextLine());
            temperatures.add(temperature);
        }

        //displaying
        for (int i = 0; i < days.size(); i++) {
            System.out.println("Day " + days.get(i) + ", Temp: " + temperatures.get(i));
        }

        // Calculating and displaying 
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        double weeklyAverage = sum / temperatures.size();
        System.out.println("Weekly Average Temperature: " + weeklyAverage);
    }
}
