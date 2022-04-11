package ru.geekbrains.ageev.hw1_6;

// Делаем абстрактный (супер)класс, так как методы переопределяем в подклассах Cat и Dog
public abstract class Animal {
    // Заполнили поля
    private String name;
    private int distRun;
    private int distSwim;
    // Через статик, так как существует отдельно от объекта
    private static int counter;

    // Инициализатор. Добавляем счетчик созданных объектов Animal
    {
        ++counter;
    }

    // Конструктор
    public Animal(String name, int distRun, int distSwim) {
        this.name = name;
        this.distRun = distRun;
        this.distSwim = distSwim;
    }
    // Абстрактные методы, пожлежащие переопределению в подклассах Cat и Dog
    public abstract void voice();
    public abstract void run();
    public abstract void swim();

    // Ниже указываем геттеры для последующего использования значений
    public int getDistRun(){
        return distRun;
    }

    public String getName(){
        return name;
    }

    public int getDistSwim(){
        return distSwim;
    }

    // Геттер для получения созданных животных. Обязательно статик, так как существует отдельно от объекта
    public static int getValue(){
        return counter;
    }
}
