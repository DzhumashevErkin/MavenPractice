package com.db;

import com.model.Application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DateBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "123";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static boolean addApplication(Application application){
        String sql = "INSERT INTO \"JV2020_ClassWork52\".applications(full_name, course, is_online, email)" +
                " values(?,?,?,?)";
        try(Connection connection = connect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,application.getFullName());
            preparedStatement.setString(2,application.getCourse());
            preparedStatement.setBoolean(3,application.isOnline());
            preparedStatement.setString(4,application.getEmail());

            preparedStatement.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public List<Application> getAllApplications(){
        String sql = "Select * From \"JV2020_ClassWork52\".applications";
        List<Application> result = new ArrayList<>();
        try(Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)){

            while(resultSet.next()){
                Application application = new Application();
                application.setApplicationId(resultSet.getInt("application_id"));
                application.setFullName(resultSet.getString("full_name"));
                application.setCourse(resultSet.getString("course"));
                application.setOnline(resultSet.getBoolean("is_online"));
                application.setEmail(resultSet.getString("email"));
                result.add(application);
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
