package com.yz.sophia.bsf.core.base.model;

/**
 * Created by yanglikai on 2019/5/28.
 */
public abstract class GeneralDTO extends GeneralObject {

  public <T> T tRequest(Class<? extends GeneralObject> target) {
    return map(target);
  }
}
