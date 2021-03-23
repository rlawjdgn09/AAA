package org.spring5.service;

import java.util.List;

import org.spring5.domain.BoardAttachVO;
import org.spring5.domain.Criteria;
import org.spring5.domain.BoardVO;

public interface PostBoardService {
	
	
	
	public List<BoardVO> postBoardGetList(Criteria cri);
	
	public int postBoardGetTotalCount(Criteria cri);
	

	public BoardVO postBoardRead(Long bno);	
	public boolean viewCount(Long bno);
	

	public void postBoardInsert(BoardVO boardVO);
	
	
	public boolean postBoardModify(BoardVO BoardVO);
	

	public boolean postBoardDelete(Long bno);
	

	public List<BoardAttachVO> postGetAttachList(Long bno);
}
