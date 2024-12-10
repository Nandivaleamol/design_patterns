package builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("John")
                .lastName("Smith")
                .age(20)
                .build();

        System.out.println(person);
    }
}
