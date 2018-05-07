package crazymeal.fr.pokefaxe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import crazymeal.fr.pokefaxe.model.Pokemon;

public class PokemonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Pokemon pokemon = intent.getParcelableExtra("pokemon");

        TextView pokemonNumberView = findViewById(R.id.text_pokemon_number);
        TextView pokemonNameView = findViewById(R.id.text_pokemon_name);

        pokemonNumberView.setText(String.valueOf(pokemon.getId()));
        pokemonNameView.setText(pokemon.getName());
    }

}
