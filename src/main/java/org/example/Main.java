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
            randomSteelSheets = random.nextInt(5);
            switch (randomSteelSheets) {
                case 0 -> steelSheets[i] = new RectangularSheet(1, 1, 1, 1);
                case 1 -> steelSheets[i] = new TriangularSheet(2, 2, 2, 2);
                case 3 -> steelSheets[i] = new SquareSheet(3, 3, 3);
                case 4 -> steelSheets[i] = null;
            }
        }

        for (SteelSheet steelSheet : steelSheets) {
            System.out.println(steelSheet);
        }

        System.out.println("totalAreas is-> " + getTotalAreas());
        System.out.println("averageArea-> " + getAverageArea());
        System.out.println("totalWeight->" + getTotalWeight());
    }

    static double getTotalAreas() {
        double totalAreas = 0d;
        try {
            for (SteelSheet steelSheet : steelSheets) {
                totalAreas += steelSheet.area();
            }
        } catch (NullPointerException exception) {
            System.err.println("Sheet is null !!!");
        }
        return totalAreas;
    }

    static double getAverageArea() {
        double averageArea = 0d;
        try {
            for (SteelSheet steelSheet : steelSheets) {
                averageArea += steelSheet.area();
            }
        } catch (NullPointerException exception) {
            System.err.println("Sheet is null !!!");
        }
        return averageArea / steelSheets.length;
    }

    static double getTotalWeight() {
        double totalWeight = 0d;
        try {
            for (SteelSheet steelSheet : steelSheets) {
                totalWeight += steelSheet.getWidth();
            }
        } catch (NullPointerException exception) {
            System.err.println("Sheet is null !!!");
        }
        return totalWeight;
    }
}