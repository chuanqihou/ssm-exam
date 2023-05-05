package com.chuanqihou.exam.service.impl;

import com.chuanqihou.exam.common.Result;
import com.chuanqihou.exam.domain.Position;
import com.chuanqihou.exam.dto.PageMsg;
import com.chuanqihou.exam.dto.PositionDto;
import com.chuanqihou.exam.mapper.PositionMapper;
import com.chuanqihou.exam.service.PositionService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 传奇后
 * @date 2023/5/5 15:04
 * @description position业务层
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionMapper positionMapper;

    /**
     * 分页查询/根据职位名称模糊查询
     * @param pageMsg 实体
     * @return result
     */
    @Override
    public Result findPositionByPageAndSearch(PageMsg pageMsg) {
        //开启分页
/*        已经再spring-context.xml文件中配置了 pageSizeZero：默认值为 false，当该参数设置为 true 时，如果 pageSize=0 或者 RowBounds.limit = 0
        就会查询出全部的结果（相当于没有执行分页查询，但是返回结果仍然是 Page 类型*/

        Page<Position> positionPage = PageHelper.startPage(pageMsg.getPageNum(), pageMsg.getPageSize());
        //调用mapper
        positionMapper.selectPosition(pageMsg.getPname());
        //获取pageInfo
        PageInfo<Position> positionPageInfo = positionPage.toPageInfo();
        //返回数据
        return new Result(200, "success", positionPageInfo.getList(), positionPage.getTotal());
    }

    /**
     * 保存职位信息
     * @param positionDto 职位信息
     * @return result
     */
    @Override
    public Result savePosition(PositionDto positionDto) {

        //执行保存
        int i = positionMapper.insertPosition(positionDto);
        if (i == 0) {
            return new Result(-1, "发布失败");
        }
        //返回结果
        return new Result();
    }

    /**
     * 根据id删除职位信息
     * @param pid 职位id
     * @return result
     */
    @Override
    public Result removePosition(String pid) {
        //数据效验
        if (pid == null) {
            return Result.DATE_FORMAT_ERROR;
        }

        //执行mapper
        int i = positionMapper.deletePosition(Integer.valueOf(pid));
        if (i == 0) {
            return new Result(-1, "删除失败");
        }
        //返回结果
        return new Result();
    }

}
