package com.site.blog.my.lnh.service;

import com.site.blog.my.lnh.entity.BlogTagCount;
import com.site.blog.my.lnh.util.PageQueryUtil;
import com.site.blog.my.lnh.util.PageResult;

import java.util.List;

public interface TagService {

    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
