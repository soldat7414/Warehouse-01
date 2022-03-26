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
    static String totalWeightRounded;
    static private final String MEASURE = "кг";


    static private void doInputs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Наименование товара: ");
        name = scanner.nextLine();
        System.out.print("Вес товара" + " (" + MEASURE + "): ");
        weight = scanner.nextDouble();
        System.out.print("Количество товара (шт.): ");
        quantity = scanner.nextInt();
        scanner.close();
    }

    // Обработка данных
    static private String handleData() {
        // Создаем экземпляр товара
        product = new Product(name, weight);
        // Получаем имя
        name = product.getName();
        // Рассчитываем результат
        totalWeight = getTotalWeight(product.getWeight(), quantity);
        totalWeightRounded = getTotalWeightRounded(totalWeight);
        // Подготовка вывода
        return "------------------------\n" +
                "Общий вес товара " + name + " (" + MEASURE + "): "
                + totalWeightRounded;
    }

    // Метод рассчета общего веса.
    static private double getTotalWeight(double weight, int quantity) {
        return weight * quantity;
    }

    // Метод округления общего веса.
    static private String getTotalWeightRounded(double totalWeight) {
        return Rounder.roundWeight(totalWeight);
    }

    // Метод вывода в консоль.
    static private void showInfo(String output) {
        System.out.println(output);
    }

}
