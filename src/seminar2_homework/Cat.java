package seminar2_homework;

public class Cat extends PetAnimal{
    public Cat(String nickName, int age){
        super(nickName, age);
    }

    @Override
    public void respond() {
        System.out.println("Meow-meow-meow");
    }

}
