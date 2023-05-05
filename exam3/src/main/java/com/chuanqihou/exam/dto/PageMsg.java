package com.chuanqihou.exam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 传奇后
 * @date 2023/5/5 15:03
 * @description 分页查询+职位名称模糊查询 DTO
 */
@Data
@AllArgsConstructor
public class PageMsg {
    private Integer pageNum;
    private Integer pageSize;

    private String pname;

    public PageMsg() {
        this.pageNum = 1;
        this.pageSize = 4;
    }
}
