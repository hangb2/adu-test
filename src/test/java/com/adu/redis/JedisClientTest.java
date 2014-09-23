package com.adu.redis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.JedisCluster;

public class JedisClientTest {
	private JedisCluster jedisCluster;
	private String PREFIX_KEY = "YUNJIEDU:TEST:";
	private final Log logger = LogFactory.getLog(this.getClass());

	@Before
	public void init() {
		this.jedisCluster = JedisClusterUtil.getCluster();
	}

	@Test
	public void set() {
		String key = PREFIX_KEY + "test";
		String value = "hello,world";
		String ret = this.jedisCluster.set(key, value);
		logger.debug("ret=" + ret);
	}

	@Test
	public void get() {
		String key = PREFIX_KEY + "test";
		String ret = this.jedisCluster.get(key);
		logger.debug("ret=" + ret);
	}

	@Test
	public void del() {
		String key = PREFIX_KEY + "test";
		Long ret = this.jedisCluster.del(key);
		logger.debug("ret=" + ret);
	}
}
