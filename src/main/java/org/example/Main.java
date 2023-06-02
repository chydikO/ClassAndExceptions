package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static SteelSheet[] steelSheets;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input count of Sheets:\t");
        int countOfSheets = scanner.nextInt();
        steelSheets = new SteelSheet[countOfSheets];

        Random random = new Random();
        int randomSteelSheets;
        for (int i = 0; i < countOfSheets; i++) {
            randomSteelSheets = random.nextInt(4);
            switch (randomSteelSheets) {
                case 0 -> steelSheets[i] = new RectangularSheet(1, 1, 1, 1);
                case 1 -> steelSheets[i] = new TriangularSheet(2, 2, 2, 2);
                case 2 -> steelSheets[i] = new SquareSheet(3, 3, 3);
                case 3 -> steelSheets[i] = null;
            }
        }

        for (SteelSheet steelSheet : steelSheets) {
            System.out.println(steelSheet);
        }
        System.out.println("-".repeat(20));
        System.out.println("totalAreas is-> " + getTotalAreas());
        System.out.println("averageArea-> " + String.format("%.2f", getAverageArea()));
        System.out.println("totalWeight-> " + getTotalWeight());
        System.out.println("-".repeat(20));
    }

    static double getTotalAreas() {
        double totalAreas = 0d;

        for (SteelSheet steelSheet : steelSheets) {
            try {
                totalAreas += steelSheet.area();
            } catch (NullPointerException exception) {
                System.err.println("getTotalAreas -> Sheet is null !!!");
            }
        }
        return totalAreas;
    }

    static double getAverageArea() {
        double averageArea = 0d;
        int steelSheetCounter = steelSheets.length;
        for (SteelSheet steelSheet : steelSheets) {
            try {
                averageArea += steelSheet.area();
            } catch (NullPointerException exception) {
                System.err.println("getAverageArea -> Sheet is null !!!");
                steelSheetCounter--;
            }
        }
        return averageArea / steelSheetCounter;
    }

    static double getTotalWeight() {
        double totalWeight = 0d;
        for (SteelSheet steelSheet : steelSheets) {
            try {
                totalWeight += steelSheet.weight();
            } catch (NullPointerException exception) {
                System.err.println("getTotalWeight -> Sheet is null !!!");
            }
        }
        return totalWeight;
    }
}