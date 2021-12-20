package Homework5;

public class Employee {
    private String surname;
    private String name;
    private String name2;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;



    public Employee(String surname, String name, String name2, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name=name;
        this.name2=name2;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }


    int getAge() {
        return this.age;
    }
    String getInfo () {
        return this.surname+" "+
        this.name+" "+
        this.name2+" "+","+
        this.position+" , "+"email:"+
        this.email+" , "+" phone: "+
        this.phone+" , "+ "salary:"+
        this.salary+"rub"+" , "+
        this.age+" years old";
    }
}

