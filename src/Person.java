public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String currentCity;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if (age != 0) return true;
        return false;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCurrentCity() {
        return currentCity;
    }
}