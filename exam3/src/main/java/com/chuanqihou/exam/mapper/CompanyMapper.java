package com.chuanqihou.exam.mapper;

import com.chuanqihou.exam.domain.Company;

import java.util.List;

/**
 * @author 传奇后
 * @date 2023/5/5 14:53
 * @description
 */
public interface CompanyMapper {

    /**
     * 查询所有公司信息
     */
    List<Company> selectAllCompany();
}
