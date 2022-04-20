import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {

        try {
            Person person = new Person("Test", -2);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        List<Person> personList = new ArrayList<>();

        try {
            personList.add(new Person("Ted", 20));
            personList.add(new Person("A", 30));
            personList.add(new Person("Jack", -5));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }


    }
}
