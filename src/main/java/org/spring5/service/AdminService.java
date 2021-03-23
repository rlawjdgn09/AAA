package org.spring5.service;

import java.util.List;

import org.spring5.domain.BoardVO;
import org.spring5.domain.Criteria;
import org.spring5.domain.MemberVO;
import org.spring5.domain.ChartVO;


public interface AdminService {

	public List<MemberVO> memberList();
	
	public List<MemberVO> memberRemoveList();
	
	public List<BoardVO> boardList();
	
	public List<BoardVO> boardRemoveList();
	
	public List<BoardVO> cmBoardList();
	
	public List<BoardVO> cmBoardRemoveList();
	
	
	
	
	//
	
	//년,월
	public ChartVO chartYearMonth(String yearMonth);
	//월,일
	public ChartVO chartDay(String day);
	
	//
	public int memberDelete(String memberId);
	
	public int memberRestore(String memberId);
	
	public int boardDelete(Long bno);
	
	public int boardRestore(Long bno);
	
	public int cmBoardDelete(Long bno);
	
	public int cmBoardRestore(Long bno);
		
	
	
	
}
