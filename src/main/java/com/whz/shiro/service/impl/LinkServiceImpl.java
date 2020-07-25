package com.whz.shiro.service.impl;

import com.whz.shiro.mapper.LinkMapper;
import com.whz.shiro.pojo.Link;
import com.whz.shiro.service.LinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author 卫宏哲
 * @date 2020-02-07 14:04:12
 * @Version 1.0
 *
 */
@Service
@Slf4j
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkMapper linkMapper;

    @Override
    public void save(Link link) {
        linkMapper.save(link);
    }

    @Override
    public void update(Link link) {
        linkMapper.update(link);
    }

    @Override
    public Link getById(Integer id) {
        return linkMapper.getById(id);
    }

    @Override
    public List<Link> getAll() {
        return linkMapper.getAll();
    }

    @Override
    public void deleteById(Integer id) {
        linkMapper.deleteById(id);
    }
}
