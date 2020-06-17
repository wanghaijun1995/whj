package com.wang.whj.dao;

import com.wang.whj.entity.TOrder1;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TOrder1)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
public interface TOrder1Dao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TOrder1 queryById(Long orderId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TOrder1> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tOrder1 实例对象
     * @return 对象列表
     */
    List<TOrder1> queryAll(TOrder1 tOrder1);

    /**
     * 新增数据
     *
     * @param tOrder1 实例对象
     * @return 影响行数
     */
    int insert(TOrder1 tOrder1);

    /**
     * 修改数据
     *
     * @param tOrder1 实例对象
     * @return 影响行数
     */
    int update(TOrder1 tOrder1);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(Long orderId);

}