package builder;

// Builder Pattern
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(PersonBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private int age;

        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
