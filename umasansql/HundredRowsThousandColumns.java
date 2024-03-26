package umasansql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class HundredRowsThousandColumns {
    
    private String url;
    private String userName;
    private String password;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pStatement;
    String query;
    int columns;
    int rows;

    public HundredRowsThousandColumns(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public void addColumns() {
        try {
            connection = DriverManager.getConnection(url, userName, password);
            query = "alter table binaryshopping add column Item? tinyint(1)";
            pStatement = connection.prepareStatement(query);
            for (int i = 0; i < 1000; i++) {
                pStatement.setInt(1,i+1);
                pStatement.addBatch();
            }
            pStatement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public String randomInsert() {
        StringBuilder queryValue = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            int num = random.nextInt(2);
            queryValue.append(num);
            if (i < 999) {
                queryValue.append(",");
            }
        }
        
        return queryValue.toString();
    }

    private void insertData() {
        try {
            String values=""; 
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            for (int i = 0; i < 100; i++) {
                query = "insert into binaryshopping values$value";
                values = "('Customer"+(i+1)+"',"+randomInsert()+")";
                query = query.replace("$value",values);
                statement.addBatch(query);
            }
            statement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    private void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HundredRowsThousandColumns object = new HundredRowsThousandColumns("jdbc:mysql://localhost:3306/customerdata", "root", "mysql@123");
        object.addColumns();
        object.insertData();
    }
}
