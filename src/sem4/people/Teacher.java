package sem4.people;

public class Teacher extends User {
    private int teacherID;

    public Teacher( String firstName, String middleName, String surname, int id) {
        super(firstName, middleName, surname);
        this.teacherID = id;
    }

    @Override
    public String toString() {
        return "Teacher {" + teacherID +
                ", " + super.getFirstName() +
                " " + super.getSecondName() +
                " " + super.getLastName() +
                "}";
    }

    public int getTeacherID() {
        return teacherID;
    }
}
