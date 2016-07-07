package model;

import java.util.ArrayList;

/**
 * Created by MelleyMell on 7/5/16.
 */
public class UserDB {

    public static ArrayList <User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {

        return users;
    }

    public static void setUsers(ArrayList<User> users) { UserDB.users = users; }

}
