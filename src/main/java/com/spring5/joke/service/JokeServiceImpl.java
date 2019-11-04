package com.spring5.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    public String getRendomeJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
