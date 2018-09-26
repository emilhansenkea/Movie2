package com.example.demo;

import java.util.ArrayList;

public interface userService {

    ArrayList<Movie> fetchAllUsers();
    void save(Movie mov);
    Movie findById(int id);

}

