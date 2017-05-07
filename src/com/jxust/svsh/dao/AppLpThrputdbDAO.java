package com.jxust.svsh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by mengleil on 4/6/2017.
 */
@Repository
public class AppLpThrputdbDAO {
    @Resource
    private SessionFactory sessionFactory;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    public List<String> getCommitByDate(String date){
        List<String> rst ;
        String sql = "SELECT commit_id FROM app_lpthrputdb WHERE mydate='" + date + "'";
        try{
            rst = jdbcTemplate.queryForList(sql,String.class);
            return  rst;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<Map<String, Object>> getResultByDate(String start,String end) {
        List<Map<String, Object>> res;
        String sql = "SELECT  * FROM app_lpthrputdb WHERE  mydate in (SELECT  mydate  FROM  app_gitdb WHERE mydate>='" + start + "' AND  mydate<='" + end + "' ORDER BY mydate ) ";
        try {
            System.out.println("------------------" + sql);
            res = jdbcTemplate.queryForList(sql);
            return  res;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
