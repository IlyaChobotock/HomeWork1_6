package ru.geekbrains.ageev.hw1_6;

public class Cat extends Animal {

    // Через статик, так как существует отдельно от объекта
    private static int counter;

    // Инициализатор. Добавляем счетчик созданных объектов Cat
    {
        ++counter;
    }

    // Конструктор
    public Cat(String name, int distRun, int distSwim) {
        super(name, distRun, distSwim);
    }

    // Ниже представлены переопределенные методы
    @Override
    public void voice() {
        System.out.printf("Кот %s мяукнул\n", getName());
    }

    // Переопределенный метод с проверкой по условию
    @Override
    public void run() {
        if (getDistRun() > 0 && getDistRun() <= 200){
            System.out.printf("Кот %s пробежал %d метров(а)\n", getName(), getDistRun());
        } else if (getDistRun() < 0) {
            System.out.printf("Введите положительное значение дистанции бега кота %s\n", getName());
        }
        else {
            System.out.printf("%d метров(а) - слишком большая дистанция для кота %s...\n", getDistRun(), getName());
        }
    }

    // Переопределенный метод с проверкой по условию
    @Override
    public void swim() {
        if (getDistSwim() > 0 && getDistSwim() <= 5){
            System.out.printf("Кот %s проплыл %d метров(а)\n", getName(), getDistSwim());
        } else if (getDistSwim() < 0){
            System.out.printf("Введите положительное значение дистанции кота %s. А вообще коты редко плавают\n", getName());
        }
        else {
            System.out.printf("%d метров(а) - слишком большая дистанция плавания для кота %s...\n", getDistSwim(), getName());
        }
    }

    // Геттер для получения созданных котов. Обязательно статик, так как существует отдельно от объекта
    public static int getValue(){
        return counter;
    }
}
