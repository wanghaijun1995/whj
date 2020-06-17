package com.wang.whj.controller;

import com.wang.whj.entity.TDict;
import com.wang.whj.service.TDictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TDict)表控制层
 *
 * @author makejava
 * @since 2020-06-17 15:23:59
 */
@RestController
@RequestMapping("tDict")
public class TDictController {
    /**
     * 服务对象
     */
    @Resource
    private TDictService tDictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TDict selectOne(Long id) {
        return this.tDictService.queryById(id);
    }

}