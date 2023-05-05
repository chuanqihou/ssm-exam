package com.chuanqihou.exam.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {

  private long pid;
  private String pname;
  private double minsal;
  private double maxsal;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date releasedate;
  private long cid;

  private String cname;
  private String loc;

}
