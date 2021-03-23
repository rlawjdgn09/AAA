package org.spring5.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReplyVO {

	private Long rno;
	private String replyContent;
	private Timestamp replyDate;
	private Timestamp updateDate;
	private String memberId;
	private Long bno;
	
}
