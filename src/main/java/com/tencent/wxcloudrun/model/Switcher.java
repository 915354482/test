package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Switcher implements Serializable {

  private Integer id;

  private Integer swithctype;
}
