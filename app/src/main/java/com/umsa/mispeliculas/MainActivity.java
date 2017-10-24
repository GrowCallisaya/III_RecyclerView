package com.umsa.mispeliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.umsa.mispeliculas.movies.adapters.MovieAdapter;
import com.umsa.mispeliculas.movies.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);


        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


//        String [] datos = {"Antonio","Cael","Rufino","Carla","Roxnaita"};


        List<Movie> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(new Movie("IT", "http://es.web.img2.acsta.net/pictures/16/01/27/16/14/443702.jpg"));
        listaPeliculas.add(new Movie("Guerra del GAs", "http://es.web.img2.acsta.net/pictures/16/01/27/16/14/443702.jpg"));
        listaPeliculas.add(new Movie("Cael Movie", "http://es.web.img2.acsta.net/pictures/16/01/27/16/14/443702.jpg"));
        mAdapter = new MovieAdapter(listaPeliculas,this);
        mRecyclerView.setAdapter(mAdapter);

    }


}
