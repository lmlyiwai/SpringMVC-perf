package com.jxust.svsh.service;

import com.jxust.svsh.dao.AppGitdbDAO;
import com.jxust.svsh.dao.AppThrputdbDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by mengleil on 4/6/2017.
 */
@Transactional
@Service
public class HChartService {
    @Autowired
    public AppGitdbDAO appGitdbDAO;
    @Autowired
    public AppThrputdbDAO appThrputdbDAO;
    public  Map<String,Object> getGitInfo(String date){
        List<String> list = appThrputdbDAO.getCommitByDate(date);
        return  appGitdbDAO.getGitByCommit(list);
    }
    public List<Map<String, Object>> getResult(String startDate,String endDate) {
        List<Map<String, Object>> res = appThrputdbDAO.getResultByDate(startDate,endDate);
        return res;
    }
}
