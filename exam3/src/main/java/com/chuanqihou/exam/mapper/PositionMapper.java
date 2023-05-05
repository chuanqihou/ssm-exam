package com.chuanqihou.exam.mapper;

import com.chuanqihou.exam.domain.Position;
import com.chuanqihou.exam.dto.PositionDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 传奇后
 * @date 2023/5/5 14:53
 * @description
 */
public interface PositionMapper {

    /**
     * 分页查询+职位名称模糊查询
     */
    List<Position> selectPosition(@Param("pname") String pname);

    /**
     * 插入职位信息
     */
    int insertPosition(PositionDto positionDto);

    /**
     * 根据职位id删除职位信息
     */
    int deletePosition(@Param("pid") Integer pid);

}
