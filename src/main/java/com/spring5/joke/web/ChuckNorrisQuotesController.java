package com.spring5.joke.web;

import com.spring5.joke.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisQuotesController {
    JokeService  jokeService;

    public ChuckNorrisQuotesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/rendomeJoke")
    public String getRendomeJoke(Model model){
        model.addAttribute("joke",this.jokeService.getRendomeJoke());
        return "jokePage";
    }
}
