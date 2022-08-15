package seminar2_homework;

abstract public class Human {
    private final String name;
    private final int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Имя человека: " + this.name+ ", возраст: " + this.age);
    }
}
