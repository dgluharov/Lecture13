public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("The name of Person should contains at least 2 symbols");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("You can not create a Person with negative age");
        }
        this.age = age;
    }
}
