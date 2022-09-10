package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.SwitchersMapper;
import com.tencent.wxcloudrun.model.Switcher;
import com.tencent.wxcloudrun.service.SwitcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SwitcherServiceImpl implements SwitcherService {

  final SwitchersMapper switchersMapper;

  public SwitcherServiceImpl(@Autowired SwitchersMapper switchersMapper) {
    this.switchersMapper = switchersMapper;
  }

  @Override
  public Optional<Switcher> getSwitcher(Integer id) {
    return Optional.ofNullable(switchersMapper.getSwitcher(id));
  }

}
