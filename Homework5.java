
/**
 * На JAVA НЕ!!!! ПИШУТ на русском языке *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */



package Homework5;

public class Homework5 {


    public static void main(String[] args) {

        Employee[] persArray={
                new Employee("Иванов", "Иван", "Иванович", "manager", "ivanov@mail.ru", "89111111111", 70000, 41),
                new Employee("Петров", "Петр", "Петрович", "teacher", "petrov@mail.ru", "89112211111", 30000, 35),
                new Employee("Ивкина", "Ирина", "Николаевна", "cooker", "ivkina@mail.ru", "89111122111", 50000, 39),
                new Employee("Волкова", "Мария", "Алексеевна", "director", "volkova@mail.ru", "89111111122", 120000, 45),
                new Employee("Родин", "Денис", "Игоревич", "engineer", "rodin@mail.ru", "89111133111", 60000, 28)
        };
        getAllEmployee(persArray);
        getAgeEmployee(persArray, 40);
    }


    private static void getAllEmployee (Employee[] persArray) {
        System.out.println("All employees:");
        for (int i = 0; i < persArray.length; i++)
        System.out.println((i+1)+" . "+ persArray[i].getInfo());
    }

    private static void getAgeEmployee (Employee[] persArray, int ageSelection) {
        System.out.println("Employees by age:");
        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].getAge() > ageSelection)
            System.out.println(persArray[i].getInfo());
    }
    }

