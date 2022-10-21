package vip.epss.dao;


import vip.epss.pojo.Admin;
import vip.epss.utils.DButil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDao implements  DaoImpl<Admin> {
    public static void main(String[] args) {
        AdminDao adminDao = new AdminDao();
        Admin admin = new Admin("qiq", "123321");
        admin.setId(4);
        adminDao.updateSelective(admin);
        adminDao.closeRes();
        //adminDao.insertSelective(new Admin("qiq","123321"));
        //adminDao.deleteByPrimaryKey(3);
        /*for (Admin A:adminDao.selectALL()){
            System.out.println(A);
        }*/

        //System.out.println(adminDao.selectByPrimaryKey(1));
    }
    private Connection conn = null;
    private Statement stat = null;
    private ResultSet rs = null;
    private PreparedStatement ps=null;
    public void closeRes(){
        DButil.close(null,stat,conn);
    }
    public  AdminDao() {
        conn = DButil.getConn();
        try {
            stat = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Boolean deleteByPrimaryKey(Integer PrimaryKey) {
        String sql="delete from admin where id=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,PrimaryKey);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }finally {
            DButil.close(ps,null);
        }
        return true;
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        String sql="select * from admin where id=?";
        Admin admin = null;
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            rs.next();
            admin=new Admin(rs.getString("adminname"),rs.getString("password"));
            admin.setId(rs.getInt("id"));
            admin.setUptime(rs.getTimestamp("uptime"));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //DButil.close();
        }
        return admin;
    }

    @Override
    public Boolean insertSelective(Admin obj) {
        String sql="insert into admin(adminname,password) value(?,?)";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,obj.getAdminname());
            ps.setString(2,obj.getPassword());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }finally {
            DButil.close(ps,null);
        }
        return true;
    }

    @Override
    public Boolean updateSelective(Admin obj) {
        String sql="update admin set adminname=?,password=? where id=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,obj.getAdminname());
            ps.setString(2,obj.getPassword());
            ps.setInt(3,obj.getId());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }finally {
            DButil.close(ps,null);
        }
        return true;
    }

    @Override
    public List<Admin> selectALL() {
        String sql="select * from admin";
        List<Admin> adminlist=new ArrayList<>();
        Admin admin;
        try {
            rs=stat.executeQuery(sql);
            while (rs.next()){
                admin=new Admin(rs.getString("adminname"),rs.getString("password"));
                admin.setId(rs.getInt("id"));
                admin.setUptime(rs.getTimestamp("uptime"));
                adminlist.add(admin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(rs,null,null);
        }
        return adminlist;
    }
}
