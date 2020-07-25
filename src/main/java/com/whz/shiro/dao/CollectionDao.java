package com.whz.shiro.dao;

import com.whz.shiro.pojo.BlogCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author 卫宏哲
 * @Date: 2020/2/16 10:57
 * @Version 1.0
 */
@Repository
public interface CollectionDao extends MongoRepository<BlogCollection, String> {

    /**
     * 根据博客id和用户id查询
     * @param blogId
     * @param userId
     * @return
     */
    int countByBlogIdAndUserId(String blogId, Integer userId);

    /**
     * 根据用户id查询数量
     * @param userId
     * @return
     */
    int countByUserId(Integer userId);

}
