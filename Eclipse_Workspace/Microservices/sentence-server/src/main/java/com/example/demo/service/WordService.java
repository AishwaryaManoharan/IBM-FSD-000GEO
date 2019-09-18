package com.example.demo.service;

import com.example.demo.model.Word;

public interface WordService {

	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();

}