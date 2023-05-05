package com.chuanqihou.exam.service.impl;

import com.chuanqihou.exam.common.Result;
import com.chuanqihou.exam.domain.Company;
import com.chuanqihou.exam.mapper.CompanyMapper;
import com.chuanqihou.exam.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 传奇后
 * @date 2023/5/5 15:25
 * @description company业务层
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 查询所有公司信息
     * @return result
     */
    @Override
    public Result findAllCompany() {
        //调用sql
        List<Company> companies = companyMapper.selectAllCompany();
        //返回结果
        return new Result(200,"success",companies);
    }
}
