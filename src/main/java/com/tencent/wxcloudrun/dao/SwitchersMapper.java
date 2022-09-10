package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Switcher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SwitchersMapper {

  Switcher getSwitcher(@Param("id") Integer id);
}
