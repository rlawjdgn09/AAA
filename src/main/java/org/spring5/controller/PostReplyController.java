package org.spring5.controller;

import org.spring5.domain.ReplyPageDTO;
import org.spring5.domain.ReplyVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PostReplyController {
	
	//공지 게시판 댓글 리스트
	public ResponseEntity<ReplyPageDTO> postReplyGetList (@PathVariable("page") int page,
		  												  @PathVariable("bno") Long bno);
		
	//공지 게시판 댓글 삽입
	public ResponseEntity<String> postReplyInsert(@RequestBody ReplyVO replyVO);
	
	//공지 게시판 상세 페이지
	public ResponseEntity<ReplyVO> postReplyRead(@PathVariable("rno") Long rno);
	
	//공지 게시판 댓글 수정
	public ResponseEntity<String> postReplyModify (@RequestBody ReplyVO replyVO,
			  								   @PathVariable("rno") Long rno);
	//공지 게시판 댓글 삭ㄱ
	public ResponseEntity<String> postReplyDelete(@PathVariable("rno") Long rno);
	
	
}
