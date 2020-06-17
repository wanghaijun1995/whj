package com.wang.whj.service.impl;

import com.wang.whj.entity.TOrder2;
import com.wang.whj.dao.TOrder2Dao;
import com.wang.whj.service.TOrder2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TOrder2)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
@Service("tOrder2Service")
public class TOrder2ServiceImpl implements TOrder2Service {
    @Resource
    private TOrder2Dao tOrder2Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TOrder2 queryById(Long orderId) {
        return this.tOrder2Dao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TOrder2> queryAllByLimit(int offset, int limit) {
        return this.tOrder2Dao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tOrder2 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder2 insert(TOrder2 tOrder2) {
        this.tOrder2Dao.insert(tOrder2);
        return tOrder2;
    }

    /**
     * 修改数据
     *
     * @param tOrder2 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder2 update(TOrder2 tOrder2) {
        this.tOrder2Dao.update(tOrder2);
        return this.queryById(tOrder2.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long orderId) {
        return this.tOrder2Dao.deleteById(orderId) > 0;
    }
}