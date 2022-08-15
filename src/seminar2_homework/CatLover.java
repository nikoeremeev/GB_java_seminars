package seminar2_homework;

public class CatLover extends Human implements CallPetAnimal {

    public CatLover(String name, int age){
        super(name, age);
    }
    @Override
    public void callPetAnimal(PetAnimal pet) {
        if (pet instanceof Cat){
            System.out.printf("%s позвал %s по имени\"кис-кис\", домашний питомец ответил:\n", super.getName(), pet.getNickName());
            pet.respond();
        }
        else {
            System.out.printf("%s позвал %s, но домашний питомец не ответил", super.getName(), pet.getNickName());
        }

    }
}
