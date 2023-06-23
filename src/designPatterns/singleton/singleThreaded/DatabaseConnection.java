package designPatterns.singleton.singleThreaded;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;
    private DatabaseConnection() {}

    //not going to work in a concurrent environment
    public static DatabaseConnection getInstance() {
        if(databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
}
