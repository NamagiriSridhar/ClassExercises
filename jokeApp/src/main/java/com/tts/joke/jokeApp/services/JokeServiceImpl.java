package com.tts.joke.jokeApp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService 
{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl()
	{
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	public String getJoke() 
	{
		return chuckNorrisQuotes.getRandomQuote();
	}

}
