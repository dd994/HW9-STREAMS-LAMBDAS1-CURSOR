package main.java.userfilter;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginDate;
    private  Team team;

    User(String email, LocalDate loginDate, Team team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    String getEmail() {
        return email;
    }


    LocalDate getLoginDate() {
        return loginDate;
    }


    String getTeam() {
        return team.getName();
    }


    @Override
    public String toString() {
        return "User{" + "email='" + email + '\'' + ", loginDate=" + loginDate + ", team='" + team + '\'' + '}';
    }
}

