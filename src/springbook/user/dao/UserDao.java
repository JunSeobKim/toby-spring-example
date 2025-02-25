package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.SQLException;

public class UserDao {
    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        // TODO: DB Connection
    }
}
