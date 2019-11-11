package com.example.recyclercardtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecipeAdapter adapter;

    List<Recipe> recipeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeList = new ArrayList<>();


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recipeList.add(
                new Recipe(
                        1,
                        "Burgers",
                        "American",
                        "30 mins",
                        "4",
                        R.drawable.burgers));

        recipeList.add(
                new Recipe(
                        2,
                        "Cake",
                        "Deserts",
                        "1 hour",
                        "2",
                        R.drawable.cake));

        recipeList.add(
                new Recipe(
                        3,
                        "Chole Masala",
                        "Indian",
                        "1 hour",
                        "4",
                        R.drawable.chole));

        recipeList.add(
                new Recipe(
                        4,
                        "Pizza",
                        "Italian",
                        "45 mins",
                        "2",
                        R.drawable.pizza));

        recipeList.add(
                new Recipe(
                        5,
                        "Spaghetti",
                        "Chinese",
                        "45 mins",
                        "2",
                        R.drawable.spaghetti));


        recipeList.add(
                new Recipe(
                        6,
                        "Pasta",
                        "Italian",
                        "30 mins",
                        "2",
                        R.drawable.pasta));

        recipeList.add(
                new Recipe(
                        7,
                        "Momos",
                        "Starter",
                        "30 mins",
                        "2",
                        R.drawable.momos));

        recipeList.add(
                new Recipe(
                        8,
                        "Boiled Egg",
                        "Breakfast",
                        "10 mins",
                        "2",
                        R.drawable.egg));

        recipeList.add(
                new Recipe(
                        9,
                        "Fries",
                        "American",
                        "30 mins",
                        "2",
                        R.drawable.fries));

        recipeList.add(
                new Recipe(
                        10,
                        "Kheer",
                        "Desert, Indian",
                        "15 mins",
                        "2",
                        R.drawable.kheer));

        recipeList.add(
                new Recipe(
                        11,
                        "Vegetable rice",
                        "Dinner",
                        "30 mins",
                        "2",
                        R.drawable.rice));

        recipeList.add(
                new Recipe(
                        12,
                        "Hot dogs",
                        "American",
                        "15 mins",
                        "2",
                        R.drawable.hotdogs));

        adapter =  new RecipeAdapter(this, recipeList);
        recyclerView.setAdapter(adapter);


    }
}
