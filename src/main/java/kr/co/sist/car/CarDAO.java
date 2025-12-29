package kr.co.sist.car;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import day1226.CarModelDomain;
import day1226.EmpAllDomain;
import day1226.EmpDomain;
import day1226.ZipcodeDomain;
import kr.co.sist.dao.MyBatisHandler;

public class CarDAO {
	private static CarDAO cDAO;
	
	private CarDAO() {
		
	}
	
	public static CarDAO getInstance() {
		if ( cDAO==null ) {
			cDAO=new CarDAO();
		}//end if
		return cDAO;
	}//getInsance


	
	/**
	 * 제조국에 따른 제조사 검색
	 * @param country
	 * @return
	 * @throws PersistenceException
	 */
	public List<String> selectMaker(String country) throws PersistenceException {
		List<String> makerList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		makerList=ss.selectList("kr.co.sist.car.selectMaker", country);

		
	
		if(ss!=null) {ss.close();} //end if
		
		return makerList;
	}//useDomain	

	public List<String> selectModel(String maker) throws PersistenceException {
		List<String> modelList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		modelList=ss.selectList("kr.co.sist.car.selectModel", maker);

		if(ss!=null) {ss.close();} //end if
		
		return modelList;
	}//useDomain	
	
	public List<CarModelDomain> selectCar(String model) throws PersistenceException {
		List<CarModelDomain> carList=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		carList=ss.selectList("kr.co.sist.car.selectCar", model);

		if(ss!=null) {ss.close();} //end if
		
		return carList;
	}//useDomain	

	
	
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
