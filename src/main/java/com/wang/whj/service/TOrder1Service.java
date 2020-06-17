package com.wang.whj.service;

import com.wang.whj.entity.TOrder1;
import java.util.List;

/**
 * (TOrder1)表服务接口
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
public interface TOrder1Service {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TOrder1 queryById(Long orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TOrder1> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tOrder1 实例对象
     * @return 实例对象
     */
    TOrder1 insert(TOrder1 tOrder1);

    /**
     * 修改数据
     *
     * @param tOrder1 实例对象
     * @return 实例对象
     */
    TOrder1 update(TOrder1 tOrder1);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(Long orderId);

}