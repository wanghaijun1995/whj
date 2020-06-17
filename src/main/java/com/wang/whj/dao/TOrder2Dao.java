package com.wang.whj.dao;

import com.wang.whj.entity.TOrder2;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TOrder2)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
public interface TOrder2Dao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TOrder2 queryById(Long orderId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TOrder2> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tOrder2 实例对象
     * @return 对象列表
     */
    List<TOrder2> queryAll(TOrder2 tOrder2);

    /**
     * 新增数据
     *
     * @param tOrder2 实例对象
     * @return 影响行数
     */
    int insert(TOrder2 tOrder2);

    /**
     * 修改数据
     *
     * @param tOrder2 实例对象
     * @return 影响行数
     */
    int update(TOrder2 tOrder2);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(Long orderId);

}