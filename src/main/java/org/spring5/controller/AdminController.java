package org.spring5.controller;

import java.util.List;

import org.spring5.domain.BoardAttachVO;
import org.spring5.domain.BoardVO;
import org.spring5.domain.ChartVO;
import org.spring5.domain.Criteria;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface AdminController {
	//관리자 페이지 메인
	public void main(Model model);
	
	//전체 멤버 목록
	public void adminMemberGetList(Model model);
	
	
	//삭제 요청 멤버 목록
	public void adminMemberRemoveList(Model model);
	
	
	//전체 게시글 목록
	public void adminBoardGetList(Model model);
	
	
	//삭제 요청 게시글 목록
	public void adminBoardRemoveList(Model model);
	
	
	
	//전체 커뮤니티 게시글 목록
	public void adminCmBoardGetList(Model model);
	
	
	
	//삭제 요청 커뮤니티 게시글 목록
	public void adminCmBoardRemoveList(Model model);


	
	////////
	//관리자 페이지 메인 차트
   public  ResponseEntity<List<ChartVO>> mainChart();
   //년/월 차트
   public ResponseEntity<List<ChartVO>> allChartYear(String year);
   //월/일 차트
   public ResponseEntity<List<ChartVO>> allChartMonth(String yearMonth);
	
	
		
	//////////
		
	public ResponseEntity<Integer> restBoardGetTotalPageCnt(@ModelAttribute Criteria cri);
	
	  //커뮤니티 게시글 보기
	
	
	
	//
	public void chartYear(Model model);

	public void chartMonth(Model model);

	//
	public ResponseEntity<String> memberDelete(String memberId);
	
	public ResponseEntity<String> memberRestore(String memberId);

	public ResponseEntity<String> boardDelete(Long bno);
	
	public  ResponseEntity<String> boardRestore(Long bno);
	
	
	
	
	//==============================================================================
		


		//조회
	//read와 modify 페이지 불러오기
		public void boardRead(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model);
	//-------------------------------------------------------------------------------------------------------------
	
		//공지 게시물 조회
		public void postBoardGetList(Model model, Criteria cri);
		//public ResponseEntity<List<BoardVO>> restPostBoardGetList(@ModelAttribute Criteria cri);
		//public ResponseEntity<Integer> restPostBoardGetTotalPageCnt(@ModelAttribute Criteria cri);
		
		//공지 게시물 등록
		public void postBoardInsert();
		
		public String postBoardInsert(BoardVO boardVO, RedirectAttributes rttr);
		
		//공지 게시물 읽기 
		public void postBoardRead(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model);
		
		//공지 게시물 수정
		public void postBoardModify(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri,  Model model);
		public String postBoardModify(BoardVO boardVO, Criteria cri,  RedirectAttributes rttr);
		
		//공지 게시물 삭제
		public String postBoardDelete(Long bno, Criteria cri, RedirectAttributes rttr);
		
		//공지 게시물 첨부 파일
		public ResponseEntity<List<BoardAttachVO>> getAttachList(Long bno);
		
		public void deleteAttachFiles(List<BoardAttachVO> attachList);
		
		
		public  ResponseEntity<String> cmBoardDelete(Long bno);

		public  ResponseEntity<String> cmBoardRestore(Long bno);



		
		
		
}
