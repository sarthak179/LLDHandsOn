package designPatterns.singleton.doubleCheckLoading;


public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection = null;

    private DataBaseConnection() {}

    private static DataBaseConnection getInstance() {
        if(dataBaseConnection == null) {
            synchronized (DataBaseConnection.class){
                if(dataBaseConnection==null) {
                    dataBaseConnection = new DataBaseConnection();
                }
            }
        }
        return dataBaseConnection;
    }
}
