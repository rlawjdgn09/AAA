package org.spring5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring5.domain.Criteria;
import org.spring5.domain.ReplyVO;

public interface PostReplyMapper {

	//공지사항 댓글 추가
	public int postReplyInsert(ReplyVO replyVO);
	
	//공지 사항 댓글 상세 보기
	public ReplyVO postReplyRead(Long rno);
	
	//공지 사항 댓글 리스트 
	public List<ReplyVO> postReplyGetList(@Param("cri") Criteria cri,
									  @Param("bno") Long bno);
	
	//공지 사항 게시물 별 댓글 수
	public Long postReplyGetCountByBno(Long bno);

	//공지 사항 댓글 삭제
	public int postReplyDelete(Long rno);
	
	//공지 사항 수
	public int postReplyModify(ReplyVO replyVO);
	
	

}
