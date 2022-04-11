package ru.geekbrains.ageev.hw1_6;

public class HomeWork1_6 {

    public static void main(String[] args) {

        // Создали котов. Можно было и через массив
        Cat cat01 = new Cat("Пушок", 100, 3);
        Cat cat02 = new Cat("Маркиз", 120, 6);
        Cat cat03 = new Cat("Снежок", 500, -3);

        // Создали псов. Можно было и через массив
        Dog dog01 = new Dog("Дик", 90, 31);
        Dog dog02 = new Dog("Шарик", 1200, 150);
        Dog dog03 = new Dog("Бим", -1000, -310);

        // Ниже выполняем действия. Дополнительно введены печати в консоля для наведения "красоты"
        System.out.println("================================================================");
        System.out.println("Коты: ");
        System.out.println("================================================================");

        // Сначала коты мяукают, бегут, плывут (разрешил немного плавать котам)
        cat01.voice();
        cat01.run();
        cat01.swim();

        System.out.println();

        cat02.voice();
        cat02.run();
        cat02.swim();

        System.out.println();

        cat03.voice();
        cat03.run();
        cat03.swim();

        // Затем псы лают, бегут, плывут
        System.out.println();
        System.out.println("================================================================");
        System.out.println("Псы: ");
        System.out.println("================================================================");

        dog01.voice();
        dog01.run();
        dog01.swim();

        System.out.println();

        dog02.voice();
        dog02.run();
        dog02.swim();

        System.out.println();

        dog03.voice();
        dog03.run();
        dog03.swim();

        // Вывод подсчитанных животных, котов и псов
        System.out.println();
        System.out.println("================================================================");
        System.out.println("Итого создано ");
        System.out.println("================================================================");
        System.out.printf("Всего животных: %d\n", Animal.getValue());
        System.out.printf("Из них Котов: %d\n", Cat.getValue());
        System.out.printf("Из них Псов: %d", Dog.getValue());
    }
}
