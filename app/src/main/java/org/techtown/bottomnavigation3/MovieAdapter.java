package org.techtown.bottomnavigation3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ItemViewHolder>{
    private List<MovieList> movies;
    private Context context;

    public MovieAdapter(List<MovieList> movies){
        this.movies=movies;
        //this.context=context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        MovieList movie=movies.get(position);
        holder.num.setText(position+1+"");
        holder.title.setText(movie.getTitle());
        holder.director.setText(movie.getDirector());
        holder.released_date.setText(movie.getReleaseDate());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView num;
        private TextView title;
        private TextView director;
        private TextView released_date;


        ItemViewHolder(View itemView) {
            super(itemView);
            num = itemView.findViewById(R.id.num);
            title = itemView.findViewById(R.id.title);
            director = itemView.findViewById(R.id.director);
            released_date = itemView.findViewById(R.id.released_date);

        }

        void onBind(MovieList data) {
            title.setText(data.getTitle());
            director.setText(data.getDirector());
            released_date.setText(data.getReleaseDate());

        }
    }
}
