package vip.epss.utils;

import java.sql.*;

public class DButil {
    static Connection conn = null;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public  static Connection getConn(){
        String url="jdbc:mysql://localhost:3310/ele_se?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user="root";
        String password="111111";
       if (conn==null){
           try {
           conn=DriverManager.getConnection(url,user,password);
           }catch (SQLException e){
               e.printStackTrace();
           }
       }
       return  conn;
    }
    public static void close(ResultSet rs, Statement st,Connection conn){
        try {
            if (rs!=null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }finally {
            close(st,conn);
        }
    }
    public static void close(Statement st,Connection conn){
        try {
            if (st!=null){
                try {
                    st.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
