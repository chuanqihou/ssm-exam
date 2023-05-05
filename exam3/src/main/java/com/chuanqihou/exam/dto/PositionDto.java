package com.chuanqihou.exam.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionDto {

  @NotNull(message = "职位名称不能为空")
  private String pname;
  @NotNull(message = "最低薪资不能为空")
  private double minsal;
  @NotNull(message = "最高薪资不能为空")
  private double maxsal;
  @NotNull(message = "公司不能为空")
  private long cid;
}
