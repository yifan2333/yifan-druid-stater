package com.yifan;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yifan.po.OauthClientDetailsPo;
import com.yifan.repository.BaseDao;

/**
 * 
 *
 * @author: wuyifan
 * @date: 2019年09月25日 下午3:52
 * @version 1.0
 */ 
@RestController
public class TestController {

    @Resource
    private BaseDao baseDao;


    @GetMapping("dao")
    public OauthClientDetailsPo dao(@RequestParam String id){
        return baseDao.selectById(OauthClientDetailsPo.class, id);
    }
}
