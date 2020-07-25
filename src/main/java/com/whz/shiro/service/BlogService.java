package com.whz.shiro.service;

import com.whz.shiro.pojo.Blog;
import com.whz.shiro.pojo.BlogCollection;
import com.whz.shiro.pojo.BlogGoods;
import com.whz.shiro.utils.Page;
import com.whz.shiro.vo.BlogVo;


import java.util.List;

/**
 * <p>
 * 博客表服务层接口
 * </p>
 *
 * @author 卫宏哲
 * @date 2020-02-07 14:04:12
 * @Version 1.0
 */
public interface BlogService {

    /**
     * 保存
     * @param blog
     */
    void save(Blog blog);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Blog getById(String id);

    /**
     * 更新
     * @param blog
     */
    void update(Blog blog);

    /**
     * 阅读
     * @param id
     * @return
     */
    BlogVo readById(String id);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(String id);

    /**
     * 分页查询
     * @param page
     * @return
     */
    Page<BlogVo> getByPage(Page<BlogVo> page);


    /**
     * 推荐阅读
     * @return
     */
    List<BlogVo> recomRead();

    /**
     * 查询时间轴
     * @return
     */
    List<BlogVo> getTimeLine();

    /**
     * 根据博客id和用户id点赞
     * @param blogGoods
     */
    void goodByBlogAndUser(BlogGoods blogGoods);

    /**
     * 根据博客id查询点赞数
     * @param blogId
     * @return
     */
    int getGoodsCount(String blogId);

    /**
     * 收藏
     * @param blogCollection
     */
    void collectionByBlogId(BlogCollection blogCollection);

    /**
     * 查询收藏数
     * @param blogId
     * @return
     */
    int getCollectionCount(String blogId);

    /**
     * 分页查询收藏
     * @param page
     * @return
     */
    Page<BlogCollection> getCollectionByPage(Page<BlogCollection> page);

}
