public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("Test")
                .setSurname("Test")
                .build();
    }
}
