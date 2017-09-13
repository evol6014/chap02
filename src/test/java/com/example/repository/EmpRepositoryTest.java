package com.example.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;
import java.util.function.Consumer;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ActiveProfiles("oracle")
@ActiveProfiles("mysql-ec2")
public class EmpRepositoryTest {

	@Inject
	EmpRepository empRepository;
	
	@Test
	public void findAll() {
		System.out.println(empRepository.getClass());
		empRepository.findAll().forEach(e -> {
			System.out.println(e);
		});;
	}

}
