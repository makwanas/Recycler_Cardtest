package com.example.recyclercardtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>{

    private Context mCtx;
    private List<Recipe> recipeList;

    public RecipeAdapter(Context mCtx, List<Recipe> recipeList) {
        this.mCtx = mCtx;
        this.recipeList = recipeList;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.items,null, false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Recipe recipe = recipeList.get(position);

        holder.Title.setText(recipe.getTitle());
        holder.Tags.setText(recipe.getTags());
        holder.Cooking_time.setText(recipe.getCooking_time());
        holder.Servings.setText(recipe.getServing());

        holder.Recipe_image.setImageDrawable(mCtx.getResources().getDrawable(recipe.getImage()));

    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder{

        ImageView Recipe_image;
        TextView Title, Tags, Cooking_time, Servings;




        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            Recipe_image=itemView.findViewById(R.id.Recipe_image);
            Title=itemView.findViewById(R.id.Title);
            Tags=itemView.findViewById(R.id.Tags);
            Cooking_time=itemView.findViewById(R.id.Cooking_time);
            Servings=itemView.findViewById(R.id.Servings);



        }
    }


}
