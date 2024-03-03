package sem5.model;

public abstract class User {
    private String firstName;
    private String middleName;
    private String surname;

    public User(String firstName, String middleName, String surname) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return  firstName + " " +
                middleName + " " +
                surname;
    }
}
