package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.MemberDto;
import com.example.demo.Service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
		@Autowired  MemberService memberService;
	

		@RequestMapping("/signUp")
		public String memberSignUp(MemberDto memberDto) {
			
			System.out.println(memberDto.getAccount());
			memberService.addMember(memberDto);
			
			return null;
		}
}
