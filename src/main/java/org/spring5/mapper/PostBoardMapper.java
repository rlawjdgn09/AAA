package org.spring5.mapper;

import java.util.List;

import org.spring5.domain.BoardVO;
import org.spring5.domain.Criteria;

public interface PostBoardMapper {

	
	public List<BoardVO> postBoardGetList(Criteria cri);
	
	public List<BoardVO> postBoardGetListWithPagingAndSearching(Criteria cri);
	

	public int postBoardGetTotalCount(Criteria cri);
	
	//공지 사항 게시판 삽입
	public int postBoardInsert(BoardVO boardVO);
	
	//공지 사항 게시판 상세 페이지
	public BoardVO postBoardRead(Long bno);
	
	//공지 사항 조회수
	public int viewCount(Long bno);
	
	//공지 사항 게시판 수정
	public int postBoardModify(BoardVO boardVO);
	
	//공지 사항 게시판 삭제
	public int postBoardDelete(Long bno);
	
}

