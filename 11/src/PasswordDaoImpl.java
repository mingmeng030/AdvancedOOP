import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordDaoImpl implements PasswordDAO{
    final static String DB_FILE_NAME = "ManagePassword.db";
    final static String DB_TABLE_NAME = "passwords";

    Connection connection = null;
    ResultSet rs = null;
    Statement statement = null;

    public PasswordDaoImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            final String table = "(url text PRIMARY KEY, id text, password text)";

            // create table
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void insert(PasswordInfo p){
        try {
            String fmt = "INSERT INTO %s VALUES('%s', '%s', '%s')";
            String q = String.format(fmt, DB_TABLE_NAME, p.getUrl(),p.getId(),p.getPassword());
            statement.execute(q);
        }catch (SQLException e) { e.printStackTrace(); }
    }

    public List<PasswordInfo> findAll(){
        ArrayList<PasswordInfo> passwordInfo = new ArrayList<PasswordInfo>();
        try {
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);
            while (rs.next()) {
                passwordInfo.add(new PasswordInfo(rs.getString("url"),
                        rs.getString("id"), rs.getString("password")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return passwordInfo;
    }

    public PasswordInfo findByKey(String url){
        PasswordInfo passwordInfo = null;
        try {
            String fmt = "SELECT * FROM %s WHERE url = '%s' ";
            String q = String.format(fmt, DB_TABLE_NAME, url);
            rs = statement.executeQuery(q);
            if (rs.next()) {
                passwordInfo = new PasswordInfo(rs.getString("url"),
                        rs.getString("id"), rs.getString("password"));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return passwordInfo;
    }

    public void update(PasswordInfo p, String url){
        PasswordInfo passwordInfo = findByKey(url);
        if (passwordInfo != null) {
            try {
                String fmt = "UPDATE %s SET id = '%s' WHERE url = '%s'";
                String q = String.format(fmt, DB_TABLE_NAME, p.getId(), p.getUrl());
                statement.execute(q);
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public void delete(String url){
        try {
            String fmt = "DELETE FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);
            statement.execute(q);
        }catch (SQLException e) {e.printStackTrace();}
    }

    public void delete(PasswordInfo p){
        delete(p.getUrl());
    }
}
