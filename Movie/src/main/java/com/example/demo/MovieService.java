package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public abstract class MovieService implements userService {

    @Autowired
    userService Userservice;

    //@Service
    //public class MovieService {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        public MovieService() {
            Movie pulpfiction = new Movie("Pulp Fiction", 1998, "Thriller");
            Movie pulpfiction2 = new Movie("Pulp Fiction", 1998, "Thriller");
            movies.add(pulpfiction);
            movies.add(pulpfiction2);
            movies.add(new Movie("Faisal", 1999, "12346578"));

        }

        public ArrayList<Movie> findAll() {
            return movies;
        }

        public void addMovie() {

        }

        @Override
        public ArrayList<Movie> fetchAllUsers() {
            return movies;
        }

        @Override
        public void save(Movie movies) {
            Userservice.save(movies);
        }

    }

