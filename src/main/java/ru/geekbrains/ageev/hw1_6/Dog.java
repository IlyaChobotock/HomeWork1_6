package ru.geekbrains.ageev.hw1_6;

public class Dog extends Animal {

    // Через статик, так как существует отдельно от объекта
    private static int counter;

    // Инициализатор. Добавляем счетчик созданных объектов Dog
    {
        ++counter;
    }

    // Конструктор
    public Dog(String name, int distRun, int distSwim) {
        super(name, distRun, distSwim);
    }

    // Ниже представлены переопределенные методы
    @Override
    public void voice() {
        System.out.printf("Пёс %s полаял!\n", getName());
    }

    // Переопределенный метод с проверкой по условию
    @Override
    public void run() {
        if (getDistRun() > 0 && getDistRun() <= 500){
            System.out.printf("Пёс %s пробежал %d метров(а)\n", getName(), getDistRun());
        } else if (getDistRun() < 0) {
        System.out.printf("Введите положительное значение дистанции бега пса %s\n", getName());
        }
        else {
            System.out.printf("%d метров(а) - слишком большая дистанция бега для пса %s...\n", getDistRun(), getName());
        }
    }

    // Переопределенный метод с проверкой по условию
    @Override
    public void swim() {
        if (getDistSwim() > 0 && getDistSwim() <= 10){
            System.out.printf("Пёс %s проплыл %d метров(а)\n", getName(), getDistSwim());
        } else if (getDistSwim() < 0) {
        System.out.printf("Введите положительное значение дистанции плавания пса %s\n", getName());
        }
        else {
            System.out.printf("%d метров(а) - слишком большая дистанция плавания для пса %s...\n", getDistSwim(), getName());
        }
    }

    // Геттер для получения созданных псов. Обязательно статик, так как существует отдельно от объекта
    public static int getValue(){
        return counter;
    }
}
