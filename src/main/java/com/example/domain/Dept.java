package com.example.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	//	아래 정보들로 테이블을 create하겟다.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
	
	@Id		//	프라이머리키
	@Column(precision=2)
	private BigDecimal deptno;
	@Column(length=14, nullable=false)
	private String dname;
	@Column(length=13)
	private String loc;
}
