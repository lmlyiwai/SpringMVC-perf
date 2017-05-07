package com.jxust.svsh.service;

import com.jxust.svsh.dao.*;
import com.jxust.svsh.entity.AppBranchGitdb;
import com.jxust.svsh.entity.AppLpThrputdb;
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
    @Autowired
    public AppLpThrputdbDAO appLpThrputdbDAO;
    @Autowired
    public AppBranchGitdbDAO appBranchGitdbDAO;
    @Autowired
    public AppBranchThrputdbDAO appBranchThrputdbDAO;
    @Autowired
    public AppBranchLpThrputdbDAO appBranchLpThrputdbDAO;
    public  Map<String,Object> getMasterGitInfo(String date){
        Map<String,Object>  rst = appGitdbDAO.getInfoByDate(date);
        return  rst;
    }
    public List<Map<String, Object>> getMasterResult(String startDate,String endDate) {
        List<Map<String, Object>> res = appThrputdbDAO.getResultByDate(startDate,endDate);
        return res;
    }
    public  List<Map<String,Object>> getMasterLoopbackResult(String startDate,String endDate){
        List<Map<String, Object>> res = appLpThrputdbDAO.getResultByDate(startDate,endDate);
        return res;
    }
}
