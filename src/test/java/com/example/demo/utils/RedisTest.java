package com.example.demo.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
	@Resource
    RedisUtil redisUtil;
	
	@Test
	public void testRedis() {
		redisUtil.set("睡觉了喂","女神");
		String name = (String) redisUtil.get("睡觉了喂");      //print 男神
		System.out.println(name);
	}
	
	 @Test
	 public void testList() {
		 int i = 0;
 		 List<String> list = new ArrayList();
 		 String[] song = {"我和你心连心","I love you","I want to meet you","You are my only one","飞雪连天恋白露"};
		 while(i < 10) {
			 int n = new Random().nextInt(4);
			 System.out.println(n);
			 list.add(song[n]);
			 i++;
		 }
		 redisUtil.set("number", list);
		 List<String> list1 = (List<String>) redisUtil.get("number");
		 
		 for(String str : list1) {
			 System.out.println(str);
		 }
	 }
	
}
