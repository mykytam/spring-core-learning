package other;

public class ExampleSingleton {
    // В этой статической(!) переменной будет хранится единственный объект класса ExampleSingleton
    private static ExampleSingleton instance;

    // Скажем, что у нашего единственного объекта должно быть поле value
    private String value;

    // Метод getter для поля value
    public String getValue() { return value; }

    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса ExampleSingleton
    private ExampleSingleton(String value) { this.value = value; }

    // Вот этот статический метод будет вызывать пользователь, чтобы получить объект класса Lesson7Singleton
    public static ExampleSingleton getInstance(String value) {
        // если ранее не был создан единственный объект
        if (instance == null) {
            // код здесь выполняется только в момент первого вызова метода getInstance()

            // создаем объект один раз
            instance = new ExampleSingleton(value);
        }
        // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объект
        return instance;
    }
}

// Тестируем
class SingletonTest {
    public static void main(String[] args) {
        ExampleSingleton first = ExampleSingleton.getInstance("Hello!");
        ExampleSingleton second = ExampleSingleton.getInstance("Goodbye!");

        System.out.println(first == second); // true
        System.out.println(first.getValue()); // Hello!
        System.out.println(second.getValue()); // Hello!
    }
}