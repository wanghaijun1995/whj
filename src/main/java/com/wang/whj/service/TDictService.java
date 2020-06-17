package com.wang.whj.service;

import com.wang.whj.entity.TDict;
import java.util.List;

/**
 * (TDict)表服务接口
 *
 * @author makejava
 * @since 2020-06-17 15:23:58
 */
public interface TDictService {

    /**
     * 通过ID查询单条数据
     *
     * @param dictId 主键
     * @return 实例对象
     */
    TDict queryById(Long dictId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tDict 实例对象
     * @return 实例对象
     */
    TDict insert(TDict tDict);

    /**
     * 修改数据
     *
     * @param tDict 实例对象
     * @return 实例对象
     */
    TDict update(TDict tDict);

    /**
     * 通过主键删除数据
     *
     * @param dictId 主键
     * @return 是否成功
     */
    boolean deleteById(Long dictId);

}