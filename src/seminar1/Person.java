package seminar1;

public class Person {
    private final String firstName;
    private final String surName;
    private final String birthDate;
    private final Gender gender;

    public Person(String firstName, String surName, String birthDate, Gender gender) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surName;
    }

    public String getBirthdate() {
        return this.birthDate;
    }

    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", firstName, surName, birthDate, gender);
    }
}
