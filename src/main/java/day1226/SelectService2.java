package day1226;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

public class SelectService2 {
	private static SelectService2 ss;
	
	private SelectService2() {
		
	}
	
	public static SelectService2 getInstance() {
		if( ss==null) {
			ss=new SelectService2();
		}//end if
		return ss;
	}//getInstance
	
	
	/**
	 * 부서번호를 입력하면 부서명을 검색
	 * @param deptno
	 * @return
	 */
	public String scsr(int deptno) {
		String dname="";
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			dname=sDAO.scsr(deptno);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return dname;
	}
	
	

	
	/**
	 * 부서번호와 사원번호를 입력하면 사원정보을 검색
	 * @param deptno
	 * @return
	 */
	public EmpDomain useDomain(EmpDTO empDTO) {
		EmpDomain EmpDomain=null;
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			EmpDomain=sDAO.useDomain(empDTO);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return EmpDomain;
	}

	
	/**
	 * 부서번호와 사원번호를 입력하면 사원정보을 검색
	 * @param deptno
	 * @return
	 */
	public List<ZipcodeDomain> useLike(String dong) {
		List<ZipcodeDomain> zipList=null;
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			zipList=sDAO.useLike(dong);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return zipList;
	}
	
	/**
	 * 부서번호와 사원번호를 입력하면 사원정보을 검색
	 * @param deptno
	 * @return
	 */
	public List<EmpDomain> lessThan(int sal) {
		List<EmpDomain> empList=null;
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			empList=sDAO.lessThan(sal);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return empList;
	}

	public List<EmpDomain> greaterThan(int sal) {
		List<EmpDomain> empList=null;
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			empList=sDAO.greaterThan(sal);
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return empList;
	}

	public List<EmpDomain> subquery() {
		List<EmpDomain> empList=null;
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			empList=sDAO.subquery();
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return empList;
	}

	public List<EmpAllDomain> union() {
		List<EmpAllDomain> empList=null;
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			empList=sDAO.union();
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return empList;
	}//union	
	
	
	public List<CarModelDomain> join() {
		List<CarModelDomain> carList=null;
		SelectDAO2 sDAO=SelectDAO2.getInstance();
		
		try {
			carList=sDAO.join();
		}catch(PersistenceException pe) {
			pe.printStackTrace();
		}//end catch
		return carList;
	}//join	
	
	
}//class
