package com.lu.mydough.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * Created by Lu on 2016/8/10.
 */
public class TestJedis {

    private static final Logger logger = LoggerFactory.getLogger(TestJedis.class);
    JedisPool jedisPool;


    @Test
    public void testJedis() {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/application.xml");
        jedisPool = (JedisPool) context.getBean("jedisPool");
        Jedis jedis = jedisPool.getResource();
        logger.debug("=====writing redis");

        jedis.set("age2", "6");

    }

}
