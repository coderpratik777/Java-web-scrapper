package com.assignment.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class Scrapper {
	
	private String url="https://www.theverge.com/";
	
	public void scrape() {
		try {
			Document doc=Jsoup.connect(url).get();
			
			Elements articles=doc.select(".duet--content-cards--content-card h2");
			
			System.out.println("printing the a :");
			for(Element e:articles) {
				System.out.println(e);
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
