package seminar2_homework;

public class Dog extends PetAnimal{

    public Dog(String nickName, int age) {
        super(nickName, age);
    }

    @Override
    public void respond() {
        System.out.println("Woof-woof");
    }
}
