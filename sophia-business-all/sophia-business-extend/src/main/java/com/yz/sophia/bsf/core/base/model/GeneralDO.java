package com.yz.sophia.bsf.core.base.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by yanglikai on 2019/5/28.
 */
@Data
public abstract class GeneralDO extends GeneralObject {

  private Date createTime; // 创建时间

  private String createBy; // 创建者

  private Date updateTime; // 更新时间

  private String updateBy; // 更新者

  public <T> T tResponse(Class<? extends GeneralObject> target) {
    return map(target);
  }
}
