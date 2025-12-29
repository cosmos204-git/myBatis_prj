package kr.co.sist.board;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;


public class BoardDAO {
	private static BoardDAO bDAO;
	
	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		if(bDAO==null) {
			   bDAO=new BoardDAO();
			}
			return bDAO;		
		
	}

	public int selectBoardTotalCnt (RangeDTO rDTO) throws SQLException {
		int totalCnt=0;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		totalCnt=ss.selectOne("kr.co.sist.board.selectBoardTotalCnt",rDTO);
		if( ss!= null) {ss.close(); } //end if
		
		return totalCnt;
	}//selectBoardTotalCnt

	
	public List<BoardDomain> selectRangeBoard( RangeDTO rDTO ) throws SQLException{
		List<BoardDomain> list=null;

		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(false);
		list=ss.selectList("kr.co.sist.board.selectRangeBoard",rDTO);
		if( ss!= null) {ss.close(); } //end if
		
		return list;
	}//selectRangeBoard
	
	

	public void insertBoard( BoardDomain bDTO ) throws PersistenceException {
		//1.MyBatis Handler 얻기
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHaSession(true);
		//2.쿼리문 수행 후 결과 얻기
		ss.insert("kr.co.sist.board.parameter",bDTO);
		//3.결과 작업
		//4.MyBatis Handler 닫기
		if( ss!= null ) { ss.close(); } 
		
	}//insertBoard

	
	
	public BoardDomain selectBoardDetail(int num) throws SQLException {
		BoardDomain bDTO=null;
////		
//		DbConn dbCon=DbConn.getInstance("jdbc/dbcp");
//		
//		Connection con=null;
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		
//		try {
//		
//		//1.JNDI 사용객체 생성
//		//2.DataSource 얻기
//		//3.DataSource 에서 Connection 얻기
//			con=dbCon.getConn();
//		//4.쿼리문 생성객체 얻기
//			StringBuilder selectDetail=new StringBuilder();
//			selectDetail
//			.append(" select TITLE, CONTENT, INPUT_DATE, IP, CNT, ID ")
//			.append(" from board ")
//			.append(" WHERE NUM = ?");
//
//			pstmt=con.prepareStatement(selectDetail.toString());
//		//5.바인드변수 값 설정
//			pstmt.setInt(1, num);
//			
//		//6.쿼리문 수행 후 결과 얻기
//			rs=pstmt.executeQuery();
//			if(rs.next()) {
//				bDTO=new BoardDTO(); 
//				bDTO.setTitle(rs.getString("title"));
//				BufferedReader br=null;
//				
//				StringBuilder content=new StringBuilder();
//				try {
//					
//				br= new BufferedReader(rs.getClob("content").getCharacterStream());
//				String readLine="";
//				
//				while( ( readLine=br.readLine()) !=null ) {
//					content.append(readLine);
//				}//end while
//				if (br != null ) { br.close(); } //end if
//				}catch ( IOException ie ) {
//					ie.printStackTrace();
//				}catch (NullPointerException npe ) {
//					npe.printStackTrace();
//				}//end catch
//				bDTO.setContent(content.toString());
//				bDTO.setInput_date(rs.getDate("input_date"));
//				bDTO.setId(rs.getString("id"));
//				bDTO.setIp(rs.getString("ip"));
//				bDTO.setCnt(rs.getInt("cnt"));
//				
//			}
//		}finally {
//		//7.연결끊기
//			dbCon.dbClose(rs, pstmt, con);
//		}//end finally
//		
////		
		return bDTO;
	}//selectBoardDetail

	
	
	/**
	 * 게시글 읽기 했을 때 cnt 증가
	 * @param num
	 * @throws SQLException
	 */
	public void updateBoardCnt(int num) throws SQLException {
//		
//		DbConn dbCon=DbConn.getInstance("jdbc/dbcp");
////		
////		Connection con=null;
//		PreparedStatement pstmt=null;
//		
//		try {
//		
//		//1.JNDI 사용객체 생성
//		//2.DataSource 얻기
//		//3.DataSource 에서 Connection 얻기
//			con=dbCon.getConn();
//		//4.쿼리문 생성객체 얻기
//			StringBuilder updateCnt=new StringBuilder();
//			updateCnt
//			.append(" update board ")
//			.append(" set cnt=cnt+1 ")
//			.append(" where num =?");
//
//			pstmt=con.prepareStatement(updateCnt.toString());
//		//5.바인드변수 값 설정
//			pstmt.setInt(1, num);
//			
//		//6.쿼리문 수행 후 결과 얻기
//			pstmt.executeUpdate();
//		}finally {
//		//7.연결끊기
//			dbCon.dbClose(null, pstmt, con);
//		}//end finally
		
		
	}//updateBoardCnt
//	
	
	public int updateBoard( BoardDomain bDTO ) throws PersistenceException {
		int cnt=0;
//		
//		DbConn dbCon=DbConn.getInstance("jdbc/dbcp");
//		
//		Connection con=null;
//		PreparedStatement pstmt=null;
//		
//		try {
//		
//		//1.JNDI 사용객체 생성
//		//2.DataSource 얻기
//		//3.DataSource 에서 Connection 얻기
//			con=dbCon.getConn();
//		//4.쿼리문 생성객체 얻기
//			StringBuilder updateBoard=new StringBuilder();
//			updateBoard
//			.append(" 	update 	board  				")
//			.append(" 	set		content=?,ip=?  	")
//			.append("   where	num=?	and id=?    ");
//			
//			pstmt=con.prepareStatement(updateBoard.toString());
//		//5.바인드변수 값 설정
//			pstmt.setString(1, bDTO.getContent());
//			pstmt.setString(2, bDTO.getIp());
//			pstmt.setInt(3, bDTO.getNum());
//			pstmt.setString(4, bDTO.getId());
//		//6.쿼리문 수행 후 결과 얻기
//			cnt=pstmt.executeUpdate();
//			
//		}finally {
//		//7.연결끊기
//			dbCon.dbClose(null, pstmt, con);
//		}//end finally
//		
		return cnt;
	}//updateBoard
//
//
	public int deleteBoard( BoardDomain bDTO ) throws SQLException {
		int cnt=0;
////		
//		DbConn dbCon=DbConn.getInstance("jdbc/dbcp");
//		
//		Connection con=null;
//		PreparedStatement pstmt=null;
//		
//		try {
//		
//		//1.JNDI 사용객체 생성
//		//2.DataSource 얻기
//		//3.DataSource 에서 Connection 얻기
//			con=dbCon.getConn();
//		//4.쿼리문 생성객체 얻기
//			StringBuilder deleteBoard=new StringBuilder();
//			deleteBoard
//			.append(" 	delete 	from board  			")
//			.append("   where	num=?	and id=?        ");
//			
//			pstmt=con.prepareStatement(deleteBoard.toString());
//		//5.바인드변수 값 설정
//			pstmt.setInt(1, bDTO.getNum());
//			pstmt.setString(2, bDTO.getId());
//		//6.쿼리문 수행 후 결과 얻기
//			cnt=pstmt.executeUpdate();
//			
//		}finally {
//		//7.연결끊기
//			dbCon.dbClose(null, pstmt, con);
////		}//end finally
//		
		return cnt;
	}//deleteBoard

	
	
	

}//class
