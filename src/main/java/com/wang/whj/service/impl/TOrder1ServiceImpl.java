package com.wang.whj.service.impl;

import com.wang.whj.entity.TOrder1;
import com.wang.whj.dao.TOrder1Dao;
import com.wang.whj.service.TOrder1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TOrder1)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
@Service("tOrder1Service")
public class TOrder1ServiceImpl implements TOrder1Service {
    @Resource
    private TOrder1Dao tOrder1Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TOrder1 queryById(Long orderId) {
        return this.tOrder1Dao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TOrder1> queryAllByLimit(int offset, int limit) {
        return this.tOrder1Dao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tOrder1 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder1 insert(TOrder1 tOrder1) {
        this.tOrder1Dao.insert(tOrder1);
        return tOrder1;
    }

    /**
     * 修改数据
     *
     * @param tOrder1 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder1 update(TOrder1 tOrder1) {
        this.tOrder1Dao.update(tOrder1);
        return this.queryById(tOrder1.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long orderId) {
        return this.tOrder1Dao.deleteById(orderId) > 0;
    }
}