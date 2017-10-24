package com.umsa.mispeliculas.movies.adapters;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.umsa.mispeliculas.R;
import com.umsa.mispeliculas.movies.models.Movie;

import org.w3c.dom.Comment;
import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by growcallisaya on 10/24/17.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private List<Movie> mDataset;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;
        public ImageView mImagen;

        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.info_text);
            mImagen = (ImageView) view.findViewById(R.id.imagen);
        }
    }



    public MovieAdapter(List<Movie> myDataset, Context context) {
        mDataset = myDataset;
        this.context = context;

    }


    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tarjeta, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = mDataset.get(position);
        holder.mTextView.setText(movie.getName());

        Glide.with(context).load(movie.getCover()).into(holder.mImagen);

    }




    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}


