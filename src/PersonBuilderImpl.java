public class PersonBuilderImpl implements PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilderImpl() {
    }

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (name == null) throw  new IllegalStateException("Не заполнено поле имя. Поле имя обязательное");
        if (surname == null) throw  new IllegalStateException("Не заполнено поле фамилия. Поле фамилия обязательное");
        if (age < 0) throw  new IllegalArgumentException("Возраст не может быть отрицательным значением");
        return new Person(name, surname, age, address);
    }
}