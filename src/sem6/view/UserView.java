package sem6.view;

import sem6.people.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendToConsole(List<T> users);
}
