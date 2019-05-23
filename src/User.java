public class User {
    public int id;
    public String username;
    public String password;

    /**
     *
     * @param id  User id.
     * @param username usernmae of user.
     * @param password password of user.
     */

    User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    User() {

    }
}

