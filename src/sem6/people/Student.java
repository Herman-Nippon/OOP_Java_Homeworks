package sem6.people;

public class Student extends User implements Comparable<Student> {
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student {" + studentId +
                ", " + super.getFirstName() +
                " " + super.getSecondName() +
                " " + super.getLastName() +
                "}";
    }

    public int getStudentId() {
        return studentId;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.studentId, o.getStudentId());
    }
}
