package com.atguigu;

import com.atguigu.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigDemo1ApplicationTests {

	@Autowired
	private Person person;

	@Value("${person.age}")
	private int age;

	public ConfigDemo1ApplicationTests() {
	}

	@Test
	public void contextLoads() {
		System.out.println(age*100);
		System.out.println(person);
	}

}

