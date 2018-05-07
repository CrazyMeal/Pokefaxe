package crazymeal.fr.pokefaxe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import crazymeal.fr.pokefaxe.model.Pokemon;
import lombok.extern.java.Log;

@Log
public class PokemonActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView pokemonNumberView;
    private TextView pokemonNameView;
    private ImageView pokemonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        this.toolbar = findViewById(R.id.toolbar);
        this.pokemonNumberView = findViewById(R.id.text_pokemon_number);
        this.pokemonNameView = findViewById(R.id.text_pokemon_name);
        this.pokemonImage = findViewById(R.id.image_pokemon);

        this.initActivityFromIntent();

        setSupportActionBar(this.toolbar);
    }

    private void initActivityFromIntent() {
        log.info("Calling init activity from intent");
        Intent intent = getIntent();
        if (intent != null) {
            final Pokemon pokemon = intent.getParcelableExtra("pokemon");
            if (pokemon != null) {
                log.info("Received pokemon: " + pokemon.toString());
                this.pokemonNumberView.setText(String.format("%03d", pokemon.getId()));
                this.pokemonNameView.setText(pokemon.getName());

                Context applicationContext = this.getApplicationContext();
                int imageIdentifier = applicationContext.getResources().getIdentifier("pokemon_" + String.format("%03d", pokemon.getId()), "drawable", applicationContext.getPackageName());
                if (imageIdentifier != 0) {
                    this.pokemonImage.setImageDrawable(applicationContext.getDrawable(imageIdentifier));
                }
            } else {
                this.pokemonNumberView.setText("???");
                this.pokemonNameView.setText("?????");
            }
        }
    }
}
