package sem3;

import java.util.Collections;
import java.util.List;

public class StreamService {
    public static void sortStreamOfStudentGroup(List<Stream> streamList) {
        Collections.sort(streamList, new StreamComparator());
    }
}
