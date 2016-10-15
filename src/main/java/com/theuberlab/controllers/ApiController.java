package com.theuberlab.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author TheSporkboy
 */
@RestController
public class ApiController {
	
	/**
	 * Answers requests for the root of the application.
	 *
	 * @return
	 */
	@RequestMapping(value = "/")
	public String index() {
		return "<!DOCTYPE HTML>" +
				"<html>\n" +
				"         <head>\n" +
				"            <title>AZN Servers JSON Parsticator. The parser for servers.json</title>\n" +
				"         </head>\n" +
				"         <body>\n" +
				"            <p>AZN Servers JSON Parsticator. The parser for servers.json.</p>" +
				"         </body>\n" +
				"      </html>" +
				"";
	}
}
