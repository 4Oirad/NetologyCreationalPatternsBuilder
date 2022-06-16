public class PersonBuilderImpl implements PersonBuilder {

    Person person;

    @Override
    public PersonBuilder setName(String name) {
        person = new Person(name, null);
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        return null;
    }

    @Override
    public PersonBuilder setAge(int age) {
        return null;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        return null;
    }

    @Override
    public Person build() {
        return null;
    }
}