public class Test {
    /**
     * Database test.
     * @param args
     */
    public static void main(String[] args) {
        Db db = new Db();
        db.insert("'Tja'", "username", "users");
        System.out.println(db.read("username","users"));
    }
}
