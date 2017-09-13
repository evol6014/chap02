package com.example.scala

import com.example.domain.Dept
import java.math.BigDecimal

object DeptExample {

	def main(args: Array[String]): Unit = {

		var dept = new Dept(new BigDecimal(10), "xxx", "yyy")
		
		println(dept)
		println(dept.getDeptno)
	}

}
