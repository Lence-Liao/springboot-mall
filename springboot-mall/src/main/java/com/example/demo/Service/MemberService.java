package com.example.demo.Service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dto.MemberDto;

@Service
public class MemberService {

	@Transactional
	public String addMember(MemberDto memberDto) {
		
		
		
		return "yes";
	}
	
}
