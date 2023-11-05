package com.example.demo.Dto;

import java.util.Date;

import lombok.Data;

@Data
public class MemberDto {

	private String account;
	private String password;
	private String name;
    private String  phoneNumber;
    private Date birthday;
    private String address;
    private String eMail;
	
}
