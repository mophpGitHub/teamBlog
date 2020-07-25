package com.whz.shiro.mapper;

import com.whz.shiro.pojo.Log;
import com.whz.shiro.utils.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 卫宏哲
 * @date 2020/3/8 14:13
 */

@Component
public interface LogMapper {
    /**
     * 保存
     * @param logger
     */
    void save(Log logger);

    /**
     * 分页查询
     * @param page
     * @return
     */
    List<Log> getByPage(Page<Log> page);

    /**
     * 查询总数
     * @param page
     * @return
     */
    int getCountByPage(Page<Log> page);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 根据id列表删除
     * @param ids
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 查询全部
     * @return
     */
    List<Log> getAll();
}
