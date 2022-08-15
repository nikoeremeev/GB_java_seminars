package seminar2_homework;

public class DogLover extends Human implements CallPetAnimal{

    public DogLover(String name, int age){
        super(name, age);
    }
    @Override
    public void callPetAnimal(PetAnimal pet) {
        if (pet instanceof Dog){
            System.out.printf("%s позвал %s по имени\"%s\", домашний питомец ответил:\n", super.getName(), pet.getNickName(),pet.getNickName());
            pet.respond();
        }
        else {
            System.out.printf("%s позвал %s, но домашний питомец не ответил", super.getName(), pet.getNickName());
        }

    }
}
