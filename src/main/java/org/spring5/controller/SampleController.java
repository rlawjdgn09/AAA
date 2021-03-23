package org.spring5.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/sample/*")
@Controller
public class SampleController {

		@GetMapping("/all")
		public void doAll() {
			log.info("do all can access everybody");
		}
		@GetMapping("/member")
		public void doMember() {
			log.info("do member");
		}
		@GetMapping("/admin")
		public void doAdmin() {
			log.info("do admin");
		}
		
		
		@GetMapping("/APISample")
		public void doAPI() {
			log.info("api");
		}
		@GetMapping("/email")
		public void doEmail() {
			log.info("email");
		}
		@Autowired
		private JavaMailSender mailSender;
		
		@GetMapping("/mailCheck")
		@ResponseBody
		public String mailCheckGET(String email) throws Exception{
			log.info("이메일 데이터 전송");
			log.info("인증번호: "+email);
			//인증 번호(난수) 생성
			Random random = new Random();
			
			int checkNum = random.nextInt(888888)+111111;
			
			log.info("인증번호 "+checkNum);
			
			
			//이메일 보내기
			
			String setFrom = "scg03009@naver.com";
			String toMail=email;
			String title="회원가입 인증 이메일 입니다.";
			String content="홈페이지를 방문해주셔서 감사합니다."
						   +"<br><br>"
					       +"인증 번호는 "+checkNum+ "입니다.<br>"
					       +"해당 인증번호를 인증번호 확인란에 기입하여 주세요.";
//							
//			try {
//				MimeMessage message = mailSender.createMimeMessage();
//				MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
//				helper.setFrom(setFrom);
//				helper.setTo(toMail);
//				helper.setSubject(title);
//				helper.setText(content,true);
//				mailSender.send(message);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			
			String num = Integer.toString(checkNum);
				
			return num;
		}
		
}
