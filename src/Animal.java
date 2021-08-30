// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Animal {
private static int maxRun;
private static int maxSwim;

// Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    public static void maxRun(int Distance) {
        if (Distance > maxRun) {
            System.out.println("Не может пробежать " + Distance);
            System.out.println("Максимум возможностей: " + maxRun);
        }
        else
        {
            System.out.println("Расстояние для бега " + Distance + " преодолено.");
        }
        System.out.println();
    }
 public static void maxSwim(int Distance)
    {
        if (Distance > maxSwim)
        {
            System.out.println("Не может проплыть " + Distance);
            System.out.println("Максимум возможностей: " + maxRun);
        }
        else
        {
            System.out.println("Расстояние для заплыва " + Distance + " преодолено.");
        }

        System.out.println();
    }
    // 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

    public Animal(int maxRun, int maxSwim)
    {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }
}

