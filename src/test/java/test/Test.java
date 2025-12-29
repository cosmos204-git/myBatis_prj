package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;

import kr.co.sist.board.BoardDAO;
import kr.co.sist.board.RangeDTO;

public class Test {

	@org.junit.Test
	@DisplayName("Select 테스트")
	public void test() {
//		SelectService ss=SelectService.getInstance();
//		assertNotNull(ss.scsr(10));
//		assertEquals(ss.scsr(10),"ACCOUNTING");
//		assertNotNull(ss.scmr(10));
		
//		SelectDAO sDAO=SelectDAO.getInstance();
//		EmpDTO eDTO=sDAO.mcsr(7788);
//		assertNotNull(sDAO.mcsr(7788));
//		List<EmpDTO> list=sDAO.mcmr(10);
//		System.out.println(list);
//		assertNotNull(list);
//		assertEquals(list.size(), 3);
	
//		day1226.EmpDTO eDTO=new day1226.EmpDTO();
//		eDTO.setEmpno(7521);
//		eDTO.setDeptno(30);
		
//		SelectDAO2 sDAO=SelectDAO2.getInstance();
//		EmpDomain ed=sDAO.useDomain(eDTO);
//		assertNotNull(ed);
//		assertNotNull(sDAO.useLike("대치동"));
//		assertNotNull(sDAO.lessThan(3000));
//		assertNotNull(sDAO.subquery());
//		assertNotNull(sDAO.union());
//		assertNotNull(sDAO.join());
//		CarDAO cDAO=CarDAO.getInstance();
		
		BoardDAO bDAO=BoardDAO.getInstance();
//		CarService cs=CarService.getInstance();
		try {
//			assertNotNull(cDAO.selectMaker("국산"));
//			assertNotNull(cs.searchModel("현대"));
//			assertNotNull(cDAO.selectCar("K5"));
//			assertNotNull(sd3.dollar("cp_emp5"));
//			assertNotNull(sd3.dynamicIf(0));
			assertNotNull(bDAO.selectBoardTotalCnt(new RangeDTO()));
//		  se.join());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

