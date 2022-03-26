package app;

// Модель объекта товара.
// Модель рассматриваем как
// абстрактное представление
// единицы товара.
public class Product {
    // Свойства единицы товара: имя, вес.
    // Количество мы заранее не знаем.
    private final String name;
    private final double weight;

    public Product (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
