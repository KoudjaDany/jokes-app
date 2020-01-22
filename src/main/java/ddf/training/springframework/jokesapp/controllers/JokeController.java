package ddf.training.springframework.jokesapp.controllers;

import ddf.training.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "chucknorris";
    }
}
