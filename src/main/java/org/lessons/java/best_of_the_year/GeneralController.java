package org.lessons.java.best_of_the_year;

import org.lessons.java.best_of_the_year.Classes.Movie;
import org.lessons.java.best_of_the_year.Classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@Controller
public class GeneralController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Best of the Year by Agostino");
        return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }
    @GetMapping("/movies/{id}")
    public String movieDetails(Model model, @PathVariable int id) {
        List<Movie> movies = getBestMovies();
        Movie movie = movies.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
        model.addAttribute("movie", movie);
        return "movieDetails";
    }

    @GetMapping("/songs")
    public String songs(Model model){
        List<Song> songs = getBestSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }
    @GetMapping("/songs/{id}")
    public String songDetails(Model model, @PathVariable int id) {
        List<Song> songs = getBestSongs();
        Song song = songs.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        model.addAttribute("song", song);
        return "songDetails";
    }

    private List<Movie> getBestMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "The Shawshank Redemption"));
        movies.add(new Movie(2, "The Godfather"));
        movies.add(new Movie(3, "The Dark Knight"));
        movies.add(new Movie(4, "Pulp Fiction"));
        movies.add(new Movie(5, "Forrest Gump"));
        movies.add(new Movie(6, "Inception"));
        return movies;
    }
    private List<Song> getBestSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "We are the Champions"));
        songs.add(new Song(2, "Bohemian Rhapsody"));
        songs.add(new Song(3, "Stairway to Heaven"));
        songs.add(new Song(4, "Hotel California"));
        songs.add(new Song(5, "Imagine"));
        songs.add(new Song(6, "Hey Jude"));
        return songs;
    }
}

