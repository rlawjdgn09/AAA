package org.spring5.mapper;

import java.util.List;

import org.spring5.domain.BoardAttachVO;

public interface PostAttachMapper {

		//공지사항 첨부파일 삽입
		public void attachInsert(BoardAttachVO vo);
		
		//공지사항 첨부파일 삭제
		public void attachDelete(String uuid);
		
		//공지사항 첨부파일 게시물 번호 찾기
		public List<BoardAttachVO> attachFindByBno(Long bno);
		
		//공지 사항 첨부파일 삭제
		public void attachDeleteAll(Long bno);
		
		
		//공지사항 첨부파일 추가
		public int imageFileUpate(Long bno);
	
}
