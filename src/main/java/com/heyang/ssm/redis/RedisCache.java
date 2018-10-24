package com.heyang.ssm.redis;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
@Service("redisCache")
public class RedisCache {

    @Resource
    private JedisPool jedisPool;


    /**
     * 设置数据到redis
     * @param key
     * @param value
     */
    public void setDataToRedis(String key,String value){
        //先获得池中jedis对象
        Jedis jedis = jedisPool.getResource();
        //在进行jedis操作

        jedis.set(key,value);
        jedis.expireAt(key,100);
        jedis.ttl(key);
    }

    /**
     * 获得redis中的数据
     * @param key
     * @return
     */
    public String getDataFromRedis(String key){
        Jedis jedis = jedisPool.getResource();
        return jedis.get(key);
    }




}
