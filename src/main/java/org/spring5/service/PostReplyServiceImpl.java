package org.spring5.service;

import org.spring5.domain.Criteria;
import org.spring5.domain.ReplyPageDTO;
import org.spring5.domain.ReplyVO;
import org.spring5.mapper.PostReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class PostReplyServiceImpl implements PostReplyService {

	@Setter(onMethod_ = @Autowired)
	private PostReplyMapper postReplyMapper;
	

	@Override
	public int postReplyInsert(ReplyVO replyVO) {
		log.info("����Է�====> " + replyVO);
		
		return postReplyMapper.postReplyInsert(replyVO);
	}
	
	@Override
	public ReplyVO postReplyRead(Long rno) {
		return postReplyMapper.postReplyRead(rno);
	}
	
	
	
		@Override
		public ReplyPageDTO postReplyGetList(Criteria cri, Long bno) {
			
			return new ReplyPageDTO(
					postReplyMapper.postReplyGetCountByBno(bno),
					postReplyMapper.postReplyGetList(cri, bno));
		}

	
	@Override
	public int postReplyDelete(Long rno) {
		log.info("��ۻ��� : rno : " + rno);
		
		return postReplyMapper.postReplyDelete(rno);
	}

	
	@Override
	public int postReplyModify(ReplyVO replyVO) {
		log.info("��ۼ��� =====> " + replyVO);
		
		return postReplyMapper.postReplyModify(replyVO);
	}
	
	
}
