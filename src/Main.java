public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilderImpl()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(12)
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

    }
}
