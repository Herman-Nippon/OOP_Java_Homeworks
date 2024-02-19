package sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<Stream> streamList = getStreamList();

        System.out.println("Foreach loop of stream 2:\n");
        for (StudentGroup studentGroup : streamList.get(1)) {
            System.out.println("studentGroup = " + studentGroup);
        }

        System.out.println("-------------------------------");
        System.out.println("List of streams before sorting: ");
        for (int i = 0; i < streamList.size(); i++) {
            System.out.printf("stream's number %d size: %d\n", i + 1, streamList.get(i).getStreamSize());
        }

        StreamService.sortStreamOfStudentGroup(streamList);

        System.out.println("\nList of streams after sorting: ");
        for (int i = 0; i < streamList.size(); i++) {
            System.out.printf("stream's number %d size: %d\n", i + 1, streamList.get(i).getStreamSize());
        }
    }

    private static List<Stream> getStreamList() {
        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(1, "German", "Stanislavovich", "Puzikov"),
                new Student(2, "Artyom", "Ivanovich", "Garmash"),
                new Student(3, "John", "Man", "Weak")
        )));

        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(7, "Lily", "Johnson", "Martinez"),
                new Student(8, "Ethan", "Clarke", "Rodriguez"),
                new Student(9, "Sophia", "Thompson", "Nguyen")
        )));

        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(4, "Lucas", "Patel", "Brown"),
                new Student(5, "Olivia", "Murphy", "Smith"),
                new Student(6, "Noah", "Garcia", "Campbell")
        )));

        Stream stream1 = new Stream(new ArrayList<>(Arrays.asList(studentGroup1, studentGroup2)));
        Stream stream2 = new Stream(new ArrayList<>(Arrays.asList(studentGroup3, studentGroup1, studentGroup2)));
        Stream stream3 = new Stream(new ArrayList<>(Arrays.asList(studentGroup3)));

        return new ArrayList<>(Arrays.asList(stream1, stream2, stream3));
    }
}
