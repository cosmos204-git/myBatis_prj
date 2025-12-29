package day1226;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;

public class SelectDAO2 {
	private static SelectDAO2 sDAO;
	
	private SelectDAO2() {
		
	}
	
	public static SelectDAO2 getInstance() {
		if ( sDAO==null ) {
			sDAO=new SelectDAO2();
		}//end if
		return sDAO;
	}//getInsance

	
	/**
	 * 컬럼 하나에 한 행 조회 
	 * @param deptno 부서번호
	 * @return 부서명
	 */
	public String scsr(int deptno) throws PersistenceException {
		String dname="";
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		dname=ss.selectOne("day1224.scsr", deptno);

		if(ss!=null) {ss.close();} //end if
		
		return dname;
	}

	

	/**
	 * 사원번호와 부서번호에 대한 사원 정보 조회
	 * @param empno
	 * @return
	 * @throws PersistenceException
	 */
	public EmpDomain useDomain(EmpDTO empDTO ) throws PersistenceException {
		EmpDomain empDomain=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		empDomain=ss.selectOne("day1226.useDomain", empDTO);

		if(ss!=null) {ss.close();} //end if
		
		return empDomain;
	}//useDomain

	
	public List<ZipcodeDomain> useLike(String dong) throws PersistenceException {
		List<ZipcodeDomain> zipList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		zipList=ss.selectList("day1226.like", dong);
		
		if(ss!=null) {ss.close();} //end if
		
		return zipList;
	}//useDomain
	
	
	/**
	 * 사원번호와 부서번호에 대한 사원 정보 조회
	 * @param empno
	 * @return
	 * @throws PersistenceException
	 */
	public List<EmpDomain> lessThan(int sal) throws PersistenceException {
		List<EmpDomain> empList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		empList=ss.selectList("day1226.lessThan", sal);

		if(ss!=null) {ss.close();} //end if
		
		return empList;
	}//useDomain	
	
	public List<EmpDomain> greaterThan(int sal) throws PersistenceException {
		List<EmpDomain> empList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		empList=ss.selectList("day1226.greaterThan", sal);

		if(ss!=null) {ss.close();} //end if
		
		return empList;
	}//useDomain	

	public List<EmpDomain> subquery() throws PersistenceException {
		List<EmpDomain> empList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		empList=ss.selectList("day1226.subquery");

		if(ss!=null) {ss.close();} //end if
		
		return empList;
	}//useDomain	

	public List<EmpAllDomain> union() throws PersistenceException {
		List<EmpAllDomain> empList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		empList=ss.selectList("day1226.union");

		if(ss!=null) {ss.close();} //end if
		
		return empList;
	}//union	

	
	public List<CarModelDomain> join() throws PersistenceException {
		List<CarModelDomain> carList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		carList=ss.selectList("day1226.join");

		if(ss!=null) {ss.close();} //end if
		
		return carList;
	}//join	
	
	
	
}//class
