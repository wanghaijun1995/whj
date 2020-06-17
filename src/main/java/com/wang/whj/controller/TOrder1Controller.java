package com.wang.whj.controller;

import com.wang.whj.entity.TOrder1;
import com.wang.whj.service.TOrder1Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TOrder1)表控制层
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
@RestController
@RequestMapping("tOrder1")
public class TOrder1Controller {
    /**
     * 服务对象
     */
    @Resource
    private TOrder1Service tOrder1Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TOrder1 selectOne(Long id) {
        return this.tOrder1Service.queryById(id);
    }

}