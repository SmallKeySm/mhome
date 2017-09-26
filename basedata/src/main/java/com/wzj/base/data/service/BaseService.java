package com.wzj.base.data.service;

import java.io.Serializable;

/**
 * 基类Service
 *
 * @param <T>  Domain对象
 * @param <ID> id
 */
public interface BaseService<T, ID extends Serializable> {

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    T findOne(ID id);

    /**
     * 查找所有
     *
     * @return
     */
    T findAll();

    /**
     * 保存
     *
     * @param t
     * @return
     */
    T save(T t);

    /**
     * 更新对象
     *
     * @param t
     * @return
     */
    T update(T t);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int delete(ID id);
}
