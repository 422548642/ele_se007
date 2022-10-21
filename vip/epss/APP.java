package vip.epss;

import vip.epss.dao.AdminDao;

public class APP {
    public static void main(String[] args) {
        AdminDao adminDao = new AdminDao();
        /*Admin admin = new Admin("qiq", "123321");
        admin.setId(4);
        adminDao.updateSelective(admin);*/

        //adminDao.insertSelective(new Admin("qiq","123321"));
        //adminDao.deleteByPrimaryKey(3);
        /*for (Admin A:adminDao.selectALL()){
            System.out.println(A);
        }*/

        System.out.println(adminDao.selectByPrimaryKey(1));
        adminDao.closeRes();
    }
}
