package main.java.userfilter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class UserCreater {

    static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("somebody@gmail.com", LocalDate.of(2019, 07, 15), new Team("Dnipro")));
        users.add(new User("okletsgo@gmail.com", LocalDate.of(2019, 07, 16), new Team("Karpaty")));
        users.add(new User("moves@gmail.com", LocalDate.of(2019, 07, 14), new Team("Dynamo")));
        users.add(new User("likejagger@gmail.com", LocalDate.of(2019, 07, 14), new Team("Dnipro")));
        users.add(new User("bells@gmail.com", LocalDate.of(2019, 07, 12), new Team("Dynamo")));
        users.add(new User("capitan@gmail.com", LocalDate.of(2019, 07, 12), new Team("Karpaty")));
        users.add(new User("kinder@gmail.com", LocalDate.of(2019, 04, 16), new Team("Karpaty")));
        users.add(new User("graylife@gmail.com", LocalDate.of(2019, 07, 17), new Team("Karpaty")));
        users.add(new User("bullshit@gmail.com", LocalDate.of(2019, 07, 12), new Team("Dnipro")));
        users.add(new User("mrnobody@gmail.com", LocalDate.of(2019, 07, 12), new Team("Karpaty")));
        users.add(new User("hellsbell@gmail.com", LocalDate.of(2019, 02, 28), new Team("Karpaty")));
        users.add(new User("whatagoal@gmail.com", LocalDate.of(2019, 06, 15), new Team("Karpaty")));
        return users;
    }
}
