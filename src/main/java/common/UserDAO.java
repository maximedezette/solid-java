package common;

public class UserDAO {
    public void save(User user) {
        Database database = new Database();
        database.save(user);
    }
}
