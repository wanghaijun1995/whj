package com.wang.whj.service;

import com.wang.whj.entity.TOrder2;
import java.util.List;

/**
 * (TOrder2)表服务接口
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
public interface TOrder2Service {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TOrder2 queryById(Long orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TOrder2> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tOrder2 实例对象
     * @return 实例对象
     */
    TOrder2 insert(TOrder2 tOrder2);

    /**
     * 修改数据
     *
     * @param tOrder2 实例对象
     * @return 实例对象
     */
    TOrder2 update(TOrder2 tOrder2);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(Long orderId);

}