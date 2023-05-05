package com.chuanqihou.exam.controller;

import com.chuanqihou.exam.common.Result;
import com.chuanqihou.exam.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 传奇后
 * @date 2023/5/5 15:25
 * @description company控制器
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /**
     * 获取所有公司信息
     * @return result
     */
    @RequestMapping("/getAllCompany.do")
    public Result getAllCompany() {
        return companyService.findAllCompany();
    }

}
