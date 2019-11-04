package com.spring5.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    public String getRendomeJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
