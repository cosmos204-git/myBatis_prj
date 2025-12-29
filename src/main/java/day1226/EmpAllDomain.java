package day1226;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmpAllDomain {
	private int deptno, empno, mgr, sal, comm;
	private String ename, job, officeType;
	private Date hiredate;

}
