package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Switcher;

import java.util.Optional;

public interface SwitcherService {

  Optional<Switcher> getSwitcher(Integer id);
}
