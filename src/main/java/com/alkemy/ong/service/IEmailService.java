package com.alkemy.ong.service;

public interface IEmailService {

	void sendText(String from, String to, String subject, String body);
    void sendHTML(String from, String to, String subject, String body);
	
}
