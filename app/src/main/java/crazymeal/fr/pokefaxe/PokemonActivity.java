package crazymeal.fr.pokefaxe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import crazymeal.fr.pokefaxe.model.Pokemon;

public class PokemonActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView pokemonNumberView;
    private TextView pokemonNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.toolbar = findViewById(R.id.toolbar);
        this.pokemonNumberView = findViewById(R.id.text_pokemon_number);
        this.pokemonNameView = findViewById(R.id.text_pokemon_name);

        this.initActivityFromIntent();

        setContentView(R.layout.activity_pokemon);
        setSupportActionBar(this.toolbar);
    }

    private void initActivityFromIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            final Pokemon pokemon = intent.getParcelableExtra("pokemon");
            if (pokemon != null) {
                this.pokemonNumberView.setText(String.valueOf(pokemon.getId()));
                this.pokemonNameView.setText(pokemon.getName());
            }
        }
    }
}
