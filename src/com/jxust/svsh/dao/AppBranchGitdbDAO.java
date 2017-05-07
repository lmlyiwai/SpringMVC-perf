package com.jxust.svsh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mengleil on 56/2017.
 */
@Repository
public class AppBranchGitdbDAO {
    @Resource
    private SessionFactory sessionFactory;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    public Map<String,Object> getGitByCommit(List<String> list){
        Map<String,Object> map = new HashMap<String, Object>();
        if(list.size() == 0){
            return map;
        }else{
            String sql = "SELECT * FROM app_branchgitdb WHERE commit='" + list.get(0) + "'";
            try {
                map = jdbcTemplate.queryForMap(sql);
                return map;
            }catch (Exception e){
                e.printStackTrace();
                return map;
            }
        }
    }
}
