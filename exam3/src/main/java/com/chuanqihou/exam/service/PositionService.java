package com.chuanqihou.exam.service;

import com.chuanqihou.exam.common.Result;
import com.chuanqihou.exam.dto.PageMsg;
import com.chuanqihou.exam.dto.PositionDto;

/**
 * @author 传奇后
 * @date 2023/5/5 15:02
 * @description
 */
public interface PositionService {

    /**
     * 分页查询+职位名称模糊查询
     */
    Result findPositionByPageAndSearch(PageMsg pageMsg);

    /**
     * 插入职位信息
     */
    Result savePosition(PositionDto positionDto);

    /**
     * 根据职位id删除职位信息
     */
    Result removePosition(String pid);

}
