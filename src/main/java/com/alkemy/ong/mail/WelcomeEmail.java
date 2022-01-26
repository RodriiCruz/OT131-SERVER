package com.alkemy.ong.mail;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class WelcomeEmail {
	
	@Id
	private final String subject = "Welcome to ONG Alkemy";
	@Column (length = 20000)
	private final String body = "<!doctype html>\r\n"
	+ "<html xmlns='http://www.w3.org/1999/xhtml' xmlns:v='urn:schemas-microsoft-com:vml'\r\n"
	+ "	xmlns:o='urn:schemas-microsoft-com:office:office'>\r\n"
	+ "\r\n"
	+ "<head>\r\n"
	+ "	<title>\r\n"
	+ "\r\n"
	+ "	</title>\r\n"
	+ "\r\n"
	+ "	<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>\r\n"
	+ "	<meta name='viewport' content='width=device-width, initial-scale=1'>\r\n"
	+ "	<style type='text/css'>\r\n"
	+ "		#outlook a {\r\n"
	+ "			padding: 0;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		.ReadMsgBody {\r\n"
	+ "			width: 100%;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		.ExternalClass {\r\n"
	+ "			width: 100%;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		.ExternalClass * {\r\n"
	+ "			line-height: 100%;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		body {\r\n"
	+ "			margin: 0;\r\n"
	+ "			padding: 0;\r\n"
	+ "			-webkit-text-size-adjust: 100%;\r\n"
	+ "			-ms-text-size-adjust: 100%;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		table,\r\n"
	+ "		td {\r\n"
	+ "			border-collapse: collapse;\r\n"
	+ "			mso-table-lspace: 0pt;\r\n"
	+ "			mso-table-rspace: 0pt;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		img {\r\n"
	+ "			border: 0;\r\n"
	+ "			height: auto;\r\n"
	+ "			line-height: 100%;\r\n"
	+ "			outline: none;\r\n"
	+ "			text-decoration: none;\r\n"
	+ "			-ms-interpolation-mode: bicubic;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		p {\r\n"
	+ "			display: block;\r\n"
	+ "			margin: 13px 0;\r\n"
	+ "		}\r\n"
	+ "	</style>\r\n"
	+ "\r\n"
	+ "	<!--[if !mso]><!-->\r\n"
	+ "	<link href='https://fonts.googleapis.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>\r\n"
	+ "	<link href='https://fonts.googleapis.com/css?family=Cabin:400,700' rel='stylesheet' type='text/css'>\r\n"
	+ "	<style type='text/css'>\r\n"
	+ "		@import url(https://fonts.googleapis.com/css?family=Ubuntu:300,400,500,700);\r\n"
	+ "		@import url(https://fonts.googleapis.com/css?family=Cabin:400,700);\r\n"
	+ "	</style>\r\n"
	+ "	<!--<![endif]-->\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "	<style type='text/css'>\r\n"
	+ "		@media only screen and (min-width:480px) {\r\n"
	+ "			.mj-column-per-100 {\r\n"
	+ "				width: 100% !important;\r\n"
	+ "				max-width: 100%;\r\n"
	+ "			}\r\n"
	+ "		}\r\n"
	+ "	</style>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "	<style type='text/css'>\r\n"
	+ "		@media only screen and (max-width:480px) {\r\n"
	+ "			table.full-width-mobile {\r\n"
	+ "				width: 100% !important;\r\n"
	+ "			}\r\n"
	+ "\r\n"
	+ "			td.full-width-mobile {\r\n"
	+ "				width: auto !important;\r\n"
	+ "			}\r\n"
	+ "		}\r\n"
	+ "	</style>\r\n"
	+ "	<style type='text/css'>\r\n"
	+ "		.hide_on_mobile {\r\n"
	+ "			display: none !important;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		@media only screen and (min-width: 480px) {\r\n"
	+ "			.hide_on_mobile {\r\n"
	+ "				display: block !important;\r\n"
	+ "			}\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		.hide_section_on_mobile {\r\n"
	+ "			display: none !important;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		@media only screen and (min-width: 480px) {\r\n"
	+ "			.hide_section_on_mobile {\r\n"
	+ "				display: table !important;\r\n"
	+ "			}\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		.hide_on_desktop {\r\n"
	+ "			display: block !important;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		@media only screen and (min-width: 480px) {\r\n"
	+ "			.hide_on_desktop {\r\n"
	+ "				display: none !important;\r\n"
	+ "			}\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		.hide_section_on_desktop {\r\n"
	+ "			display: table !important;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		@media only screen and (min-width: 480px) {\r\n"
	+ "			.hide_section_on_desktop {\r\n"
	+ "				display: none !important;\r\n"
	+ "			}\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		[owa] .mj-column-per-100 {\r\n"
	+ "			width: 100% !important;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		[owa] .mj-column-per-50 {\r\n"
	+ "			width: 50% !important;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		[owa] .mj-column-per-33 {\r\n"
	+ "			width: 33.333333333333336% !important;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		p,\r\n"
	+ "		h1,\r\n"
	+ "		h2,\r\n"
	+ "		h3 {\r\n"
	+ "			margin: 0px;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		a {\r\n"
	+ "			text-decoration: none;\r\n"
	+ "			color: inherit;\r\n"
	+ "		}\r\n"
	+ "\r\n"
	+ "		@media only print and (min-width:480px) {\r\n"
	+ "			.mj-column-per-100 {\r\n"
	+ "				width: 100% !important;\r\n"
	+ "			}\r\n"
	+ "\r\n"
	+ "			.mj-column-per-40 {\r\n"
	+ "				width: 40% !important;\r\n"
	+ "			}\r\n"
	+ "\r\n"
	+ "			.mj-column-per-60 {\r\n"
	+ "				width: 60% !important;\r\n"
	+ "			}\r\n"
	+ "\r\n"
	+ "			.mj-column-per-50 {\r\n"
	+ "				width: 50% !important;\r\n"
	+ "			}\r\n"
	+ "\r\n"
	+ "			mj-column-per-33 {\r\n"
	+ "				width: 33.333333333333336% !important;\r\n"
	+ "			}\r\n"
	+ "		}\r\n"
	+ "	</style>\r\n"
	+ "\r\n"
	+ "</head>\r\n"
	+ "\r\n"
	+ "<body style='background-color:#52c0f7;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "	<div style='background-color:#52c0f7;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "		<div style='Margin:0px auto;max-width:600px;'>\r\n"
	+ "\r\n"
	+ "			<table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\r\n"
	+ "				<tbody>\r\n"
	+ "					<tr>\r\n"
	+ "						<td\r\n"
	+ "							style='direction:ltr;font-size:0px;padding:9px 0px 9px 0px;text-align:center;vertical-align:top;'>\r\n"
	+ "\r\n"
	+ "							<div class='mj-column-per-100 outlook-group-fix'\r\n"
	+ "								style='font-size:13px;text-align:left;direction:ltr;display:inline-block;vertical-align:top;width:100%;'>\r\n"
	+ "\r\n"
	+ "								<table border='0' cellpadding='0' cellspacing='0' role='presentation'\r\n"
	+ "									style='vertical-align:top;' width='100%'>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td style='font-size:0px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "											<div style='height:50px;'>\r\n"
	+ "												&nbsp;\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "								</table>\r\n"
	+ "\r\n"
	+ "							</div>\r\n"
	+ "\r\n"
	+ "						</td>\r\n"
	+ "					</tr>\r\n"
	+ "				</tbody>\r\n"
	+ "			</table>\r\n"
	+ "\r\n"
	+ "		</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "		<div style='background:#FFFFFF;background-color:#FFFFFF;Margin:0px auto;max-width:600px;'>\r\n"
	+ "\r\n"
	+ "			<table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation'\r\n"
	+ "				style='background:#FFFFFF;background-color:#FFFFFF;width:100%;'>\r\n"
	+ "				<tbody>\r\n"
	+ "					<tr>\r\n"
	+ "						<td\r\n"
	+ "							style='direction:ltr;font-size:0px;padding:9px 0px 9px 0px;text-align:center;vertical-align:top;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "							<div class='mj-column-per-100 outlook-group-fix'\r\n"
	+ "								style='font-size:13px;text-align:left;direction:ltr;display:inline-block;vertical-align:top;width:100%;'>\r\n"
	+ "\r\n"
	+ "								<table border='0' cellpadding='0' cellspacing='0' role='presentation'\r\n"
	+ "									style='vertical-align:top;' width='100%'>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td style='font-size:0px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "											<div style='height:30px;'>\r\n"
	+ "												&nbsp;\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td align='center'\r\n"
	+ "											style='font-size:0px;padding:0px 0px 0px 0px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "											<table border='0' cellpadding='0' cellspacing='0' role='presentation'\r\n"
	+ "												style='border-collapse:collapse;border-spacing:0px;'>\r\n"
	+ "												<tbody>\r\n"
	+ "													<tr>\r\n"
	+ "														<td style='width:312px;'>\r\n"
	+ "\r\n"
	+ "															<img height='auto'\r\n"
	+ "																src='https://s3-eu-west-1.amazonaws.com/topolio/uploads/6082338c1a7ee/1619145692.jpg'\r\n"
	+ "																style='border:0;display:block;outline:none;text-decoration:none;height:auto;width:100%;font-size:13px;'\r\n"
	+ "																width='312'>\r\n"
	+ "\r\n"
	+ "														</td>\r\n"
	+ "													</tr>\r\n"
	+ "												</tbody>\r\n"
	+ "											</table>\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td style='font-size:0px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "											<div style='height:50px;'>\r\n"
	+ "												&nbsp;\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td align='left'\r\n"
	+ "											style='font-size:0px;padding:15px 15px 15px 15px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "											<div\r\n"
	+ "												style='font-family:Ubuntu, Helvetica, Arial, sans-serif;font-size:11px;line-height:1.5;text-align:left;color:#000000;'>\r\n"
	+ "												<p style='text-align: center;'><span\r\n"
	+ "														style='font-size: 24px;'><strong>T&iacute;tulo</strong></span>\r\n"
	+ "												</p>\r\n"
	+ "												<p style='text-align: center;'>&nbsp;</p>\r\n"
	+ "												<p style='text-align: center;'><span style='font-size: 16px;'>Texto del\r\n"
	+ "														email</span></p>\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td style='font-size:0px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "											<div style='height:30px;'>\r\n"
	+ "												&nbsp;\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td align='left'\r\n"
	+ "											style='font-size:0px;padding:15px 15px 15px 15px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "											<div\r\n"
	+ "												style='font-family:Ubuntu, Helvetica, Arial, sans-serif;font-size:11px;line-height:1.5;text-align:left;color:#000000;'>\r\n"
	+ "												<p style='text-align: center;'>Datos de contacto de ONG</p>\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td style='font-size:0px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "											<div style='height:30px;'>\r\n"
	+ "												&nbsp;\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "								</table>\r\n"
	+ "\r\n"
	+ "							</div>\r\n"
	+ "\r\n"
	+ "						</td>\r\n"
	+ "					</tr>\r\n"
	+ "				</tbody>\r\n"
	+ "			</table>\r\n"
	+ "\r\n"
	+ "		</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "		<div style='Margin:0px auto;max-width:600px;'>\r\n"
	+ "\r\n"
	+ "			<table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\r\n"
	+ "				<tbody>\r\n"
	+ "					<tr>\r\n"
	+ "						<td\r\n"
	+ "							style='direction:ltr;font-size:0px;padding:9px 0px 9px 0px;text-align:center;vertical-align:top;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "							<div class='mj-column-per-100 outlook-group-fix'\r\n"
	+ "								style='font-size:13px;text-align:left;direction:ltr;display:inline-block;vertical-align:top;width:100%;'>\r\n"
	+ "\r\n"
	+ "								<table border='0' cellpadding='0' cellspacing='0' role='presentation'\r\n"
	+ "									style='vertical-align:top;' width='100%'>\r\n"
	+ "\r\n"
	+ "									<tr>\r\n"
	+ "										<td style='font-size:0px;word-break:break-word;'>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "											<div style='height:50px;'>\r\n"
	+ "												&nbsp;\r\n"
	+ "											</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "										</td>\r\n"
	+ "									</tr>\r\n"
	+ "\r\n"
	+ "								</table>\r\n"
	+ "\r\n"
	+ "							</div>\r\n"
	+ "\r\n"
	+ "						</td>\r\n"
	+ "					</tr>\r\n"
	+ "				</tbody>\r\n"
	+ "			</table>\r\n"
	+ "\r\n"
	+ "		</div>\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "\r\n"
	+ "	</div>\r\n"
	+ "\r\n"
	+ "</body>\r\n"
	+ "\r\n"
	+ "</html>";
	
	public String getSubject() {
		return subject;
	}
	public String getBody() {
		return body;
	}

	
	
}
