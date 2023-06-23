package designPatterns.singleton.eagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = new DatabaseConnection();  //will load at class load time hence make the class loading slower
    private DatabaseConnection() {}

    //going to work in a concurrent environment
    public static DatabaseConnection getInstance() {
        return databaseConnection;
    }
}

