package com.iszhouhua.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.iszhouhua.blog.model.Comment;
import com.iszhouhua.blog.model.dto.CommentDto;

import java.util.List;

/**
 * <p>
 * 评论表 服务类
 * </p>
 *
 * @author ZhouHua
 * @since 2018-12-01
 */
public interface CommentService extends IService<Comment> {

    /**
     * 分页查询当前文章的所有评论
     * @param page 分页信息
     * @param articleId 文章ID
     * @return
     */
    IPage<CommentDto> findPageByArticleId(Page<Comment> page, Long articleId);

    /**
     * 查询最新的评论
     * @param count 需要查询的评论数量
     * @return
     */
    List<CommentDto> findLatestComments(Integer count);
}