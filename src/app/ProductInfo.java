package app;

import java.util.Scanner;

public class ProductInfo {
    // Переменные этого класса.
    // Они задекларированы здесь.
    // Не путать с переменными класса-модели.
    static String name;
    static double weight;
    static int quantity;
    static Product product;
    static double totalWeight;
    static private final String MEASURE = "кг";


    static private void doInputs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Наименование товара: ");
        name = scanner.nextLine();
        System.out.print("Количество товара (шт.): ");
        quantity = scanner.nextInt();
        scanner.close();
    }
}
