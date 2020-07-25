package com.whz.shiro.service;

import com.whz.shiro.pojo.Log;
import com.whz.shiro.utils.Page;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

/**
 * @author 卫宏哲
 * @date 2020/3/8 13:59
 */
public interface LogService {
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
    Page<Log> getByPage(Page<Log> page);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 根据id集合删除
     * @param ids
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 查询数据，构建成workbook用于导出
     * @return
     */
    Workbook export();
}
