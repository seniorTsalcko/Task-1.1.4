package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) throws SQLException {
        userService.createUsersTable();

        userService.saveUser("Name1", "LastName1", (byte) 30);
        userService.saveUser("Name2", "LastName2", (byte) 40);
        userService.saveUser("Name3", "LastName3", (byte) 50);
        userService.saveUser("Name4", "LastName4", (byte) 60);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
