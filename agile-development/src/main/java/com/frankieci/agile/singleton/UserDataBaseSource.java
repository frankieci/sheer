package com.frankieci.agile.singleton;

public class UserDataBaseSource implements DataBase<User> {

    private static DataBase dataBase = new UserDataBaseSource();

    private UserDataBaseSource() {
    }

    public static UserDataBaseSource getInstance() {
        return (UserDataBaseSource) dataBase;
    }

    @Override
    public User read(String name) {
        //no-op
        return null;
    }

    @Override
    public void write(User user) {
        //no-op
    }
}
