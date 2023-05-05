package com.chuanqihou.exam.controller;

import com.chuanqihou.exam.common.Result;
import com.chuanqihou.exam.dto.PageMsg;
import com.chuanqihou.exam.dto.PositionDto;
import com.chuanqihou.exam.service.PositionService;
import com.chuanqihou.exam.util.DataValidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 传奇后
 * @date 2023/5/5 15:07
 * @description position控制器
 */
@RestController
@RequestMapping("/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    /**
     * 分页查询/职位条件查询
     * @param pageMsg 职位名称
     * @return result
     */
    @PostMapping("/getPositionByPageAndSearch.do")
    public Result getPositionByPageAndSearch(PageMsg pageMsg) {
        return positionService.findPositionByPageAndSearch(pageMsg);
    }

    /**
     * 添加职位信息
     * @param positionDto 职位信息
     * @param bindingResult 数据效验
     * @return result
     */
    @PostMapping("/addPosition.do")
    public Result addPosition(@Valid PositionDto positionDto, BindingResult bindingResult) {
        //数据效验
        Result result = DataValidUtil.dataValid(bindingResult);
        if (result != null) {
            return result;
        }
        return positionService.savePosition(positionDto);
    }

    /**
     * 根据id删除职位信息
     * @param pid 职位id
     * @return result
     */
    @PostMapping("/cutPosition.do")
    public Result cutPosition(String pid) {
        return positionService.removePosition(pid);
    }

}
