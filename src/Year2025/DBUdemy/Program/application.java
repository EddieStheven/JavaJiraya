package Year2025.DBUdemy.Program;

import Year2025.DBUdemy.db.DB;

import java.sql.Connection;

public class application {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        DB.closeConnections();


    }

}
