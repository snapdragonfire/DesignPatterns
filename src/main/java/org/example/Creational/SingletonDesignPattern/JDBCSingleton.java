package org.example.Creational.SingletonDesignPattern;

import java.sql.*;

public class JDBCSingleton {
    private static JDBCSingleton jdbc;

    protected JDBCSingleton(){}

    public static JDBCSingleton getInstance(){
        if(jdbc == null){
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con;
//        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdatabasetable", "root", "Amansharma@123");
        return con;
    }

    public int insert(String name, String password) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int recordCounter=0;

        try{
            conn = getConnection();
            ps = conn.prepareStatement("insert into userdata(uid,uname,upassword)values(?,?,?)");
            ps.setString(2, name);
            ps.setInt(1, 1);
            ps.setString(3, password);

            recordCounter = ps.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(ps != null){
                ps.close();
            }
            if(conn != null) {
                conn.close();
            }
        }
        return recordCounter;
    }

    public void viewByName(String name) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            con = getConnection();
            ps=con.prepareStatement("select * from userdata where uname=?");

            ps.setString(1, name);

            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("Name= "+rs.getString(2)+"\t"+"Paasword= "+rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if (con != null){
                con.close();
            }
        }
    }

    public int update(String name, String password) throws SQLException  {
        Connection c=null;
        PreparedStatement ps=null;

        int recordCounter=0;
        try {
            c=this.getConnection();
            ps=c.prepareStatement(" update userdata set upassword=? where uname='"+name+"' ");
            ps.setString(1, password);
            recordCounter=ps.executeUpdate();
        } catch (Exception e) {  e.printStackTrace(); } finally{

            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }

    public int delete(int userid) throws SQLException{
        Connection c=null;
        PreparedStatement ps=null;
        int recordCounter=0;
        try {
            c=this.getConnection();
            ps=c.prepareStatement(" delete from userdata where uid='"+userid+"' ");
            recordCounter=ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
        finally{
            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
}
