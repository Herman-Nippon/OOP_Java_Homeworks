package sem4.view;

import sem4.people.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendToConsole(List<T> users);
}
