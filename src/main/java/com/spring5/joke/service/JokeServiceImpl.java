package com.spring5.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes=chuckNorrisQuotes;
    }

    public String getRendomeJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
