package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Switcher;
import com.tencent.wxcloudrun.service.SwitcherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * counter控制器
 */
@RestController

public class SwitcherController {

  final SwitcherService switcherService;
  final Logger logger;

  public SwitcherController(@Autowired SwitcherService switcherService) {
    this.switcherService = switcherService;
    this.logger = LoggerFactory.getLogger(SwitcherController.class);
  }

  /**
   * 获取当前类型
   * @return API response json
   */
  @GetMapping(value = "/api/type")
  ApiResponse get() {
    logger.info("/api/count get request");
    Optional<Switcher> switcher = switcherService.getSwitcher(1);
    Integer type = 0;
    if (switcher.isPresent()) {
      type = switcher.get().getSwithctype();
    }

    return ApiResponse.ok(type);
  }
}