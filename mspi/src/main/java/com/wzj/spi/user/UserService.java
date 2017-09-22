package com.wzj.spi.user;

import java.io.Serializable;
import java.util.List;

/**
 * 用户服务
 */
public interface UserService<T, ID extends Serializable> {

    /**
     * 根据id查找
     *
     * @param ID
     * @return
     */
    T findOne(Long ID);

    /**
     * 查找所有
     *
     * @return
     */
    List<T> findAll();

    /**
     * 保存
     * @param t
     * @return
     */
    T save(T t);
}
