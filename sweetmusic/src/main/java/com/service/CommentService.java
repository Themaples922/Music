package com.service;

import com.entity.Comment;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rachel
 * @since 2022-03-26
 */

public interface CommentService {

    boolean addComment(Comment comment);

    boolean updateCommentMsg(Comment comment);

    boolean deleteComment(Integer id);

    List<Comment> allComment();

    List<Comment> commentOfSongId(Integer songId);

    List<Comment> commentOfSongListId(Integer songListId);

}
