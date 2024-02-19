package sem3;

public class Student {
    private int studentId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Student {" + studentId +
                ", " + firstName +
                " " + secondName +
                " " + lastName +
                "}";
    }
}
