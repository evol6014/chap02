package com.example.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Emp {

	@Id
	@Column(precision=4)
	private BigDecimal empno;
	@Column(length=10, nullable=false)
	private String ename;
	@Column(length=1)
	private char  gender;
	@Column(length=9)
	private String job;
	@Column(precision=4)
	private BigDecimal mgr;
	private Date hiredate;
	@Column(precision=7)
	private BigDecimal sal;
	@Column(precision=7)
	private BigDecimal comm;
	@Column(precision=2)
	private BigDecimal deptno;
}
//EMPNO	 	NUMBER(4) 				CONSTRAINT EMP_EMPNO_PK PRIMARY KEY,
//ENAME 	VARCHAR2(10 CHAR) 	NOT NULL, -- CHAR을 추가함으로써 글자단위로 변경.
// GENDER	CHAR(1 CHAR)			CONSTRAINT EMP_GENDER_CK CHECK (GENDER IN ('M', 'F')),
//JOB   	VARCHAR2(9 CHAR), 	-- 글자단위로 변경.
//MGR  		NUMBER(4),
//HIREDATE 	DATE,
//SAL 		NUMBER(7,2),
//COMM 		NUMBER(7,2),
//DEPTNO 	NUMBER(2) 				CONSTRAINT EMP_DEPTNO_FK REFERENCES DEPT);