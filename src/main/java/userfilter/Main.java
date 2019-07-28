package main.java.userfilter;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import  static main.java.userfilter.UserCreater.createUsers;

public class Main {
    public static void main(String[] args) {

        List<User> users = createUsers();

        Map<String, List<String>> usersOfLastWeek = users.stream()
                .filter(user -> user.getLoginDate().isAfter(LocalDate.of(2019, 07, 12)))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));
        System.out.println(usersOfLastWeek);
    }

}
