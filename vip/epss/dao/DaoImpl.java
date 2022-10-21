package vip.epss.dao;

import java.util.List;

public interface DaoImpl<T> {
    Boolean deleteByPrimaryKey(Integer PrimaryKey);
    T selectByPrimaryKey(Integer id);
    Boolean insertSelective(T obj);
    Boolean updateSelective(T obj);
    List<T> selectALL();
}
