package com.example.demo.cop.bbs.service.impl;

import java.util.List;

import com.example.demo.cop.bbs.service.model.ArticleDTO;
import com.example.demo.cop.bbs.service.model.ReplyDTO;
import com.example.demo.cop.bbs.service.ArticleService;

import org.springframework.stereotype.Service;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public void writeArticle(ArticleDTO article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyArticle(ArticleDTO article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeArticle(ArticleDTO article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeReply(ReplyDTO reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeReply(ReplyDTO reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public ArticleDTO readArticle(int artId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArticleDTO fetchArticleList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ReplyDTO> readReply(int artId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
