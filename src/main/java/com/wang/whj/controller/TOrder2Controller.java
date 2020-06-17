package com.wang.whj.controller;

import com.wang.whj.entity.TOrder2;
import com.wang.whj.service.TOrder2Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TOrder2)表控制层
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
@RestController
@RequestMapping("tOrder2")
public class TOrder2Controller {
    /**
     * 服务对象
     */
    @Resource
    private TOrder2Service tOrder2Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TOrder2 selectOne(Long id) {
        return this.tOrder2Service.queryById(id);
    }

}