public class Test {
    public static void main(String[] args) {
        db db = new db();
        db.insert("pop, stenlol", "username, password", "user");
        //System.out.print(db.read("username", "user"));
        String table = "user";
        String columns = "username, password";
        String values = "pop, sten";
        System.out.println("INSERT INTO " + table + " (" + columns + ") " + "VALUES (" + values + ")");
    }
}
