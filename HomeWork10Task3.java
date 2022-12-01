package homeWork10;

import java.util.*;

public class HomeWork10Task3 {
    public static void main(String[] args) {
        User user1 = new User("John", "Smith");
        User user2 = new User("John", "Smith");
        User user3 = new User("Adam", "Vector");

        Set<User> userSet1 = new HashSet<>();
        userSet1.add(user1);
        userSet1.add(user2);
        userSet1.add(user3);
        System.out.println(userSet1);

        Set<User> userSet2 = new TreeSet<>();
        userSet2.add(user1);
        userSet2.add(user2);
        userSet2.add(user3);
        System.out.println(userSet2);


    }
}

class User implements Comparable<User> {

    private String firstName;
    private String lastName;

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
            return true;
        } else if (objectToCompare == null || getClass() != objectToCompare.getClass()) {
            return false;
        }
        User user = (User) objectToCompare;
        return Objects.equals(firstName, user.firstName)
                && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int compareTo(User objectToCompare) {
        int result = this.firstName.compareTo(objectToCompare.firstName);
        if (result == 0) {
            result = this.lastName.compareTo(objectToCompare.lastName);
        }
        return result;
    }
}
