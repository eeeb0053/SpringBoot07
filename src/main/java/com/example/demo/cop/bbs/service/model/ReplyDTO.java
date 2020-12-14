package com.example.demo.cop.bbs.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class ReplyDTO extends ArticleDTO{
    private String replyNum, content, artNum;
}
