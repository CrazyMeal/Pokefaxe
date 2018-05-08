package crazymeal.fr.pokefaxe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import crazymeal.fr.pokefaxe.model.Pokemon;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PokemonActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView pokemonNumberView;
    private TextView pokemonNameView;
    private ImageView pokemonImage;
    private int mPokemonPosition;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.action_next) {
            this.moveNext();
        }

        return super.onOptionsItemSelected(item);
    }

    private void moveNext() {
        this.loadPokemonAtPosition(this.mPokemonPosition + 1);
    }

    private void initActivityFromIntent() {
        log.debug("Calling init activity from intent");
        Intent intent = getIntent();
        if (intent != null) {
            final int pokemonPosition = intent.getIntExtra("pokemon_position", -1);
            this.loadPokemonAtPosition(pokemonPosition);
        }
    }

    private void loadPokemonAtPosition(final int pokemonPosition) {
        ArrayList<Pokemon> pokemonList = PokemonManager.getInstance().getPokemonList();
        if (!pokemonList.isEmpty() && pokemonPosition < pokemonList.size() && pokemonPosition >= 0) {
            final Pokemon pokemon = pokemonList.get(pokemonPosition);
            if (pokemon != null) {
                log.debug("Received pokemon: " + pokemon.toString());
                this.mPokemonPosition = pokemonPosition;
                String formattedPokemonId = String.format("%03d", pokemon.getId());

                this.pokemonNumberView.setText(formattedPokemonId);
                this.pokemonNameView.setText(pokemon.getName());
                this.setTitle(pokemon.getName());

                Context applicationContext = this.getApplicationContext();
                final int imageIdentifier = applicationContext.getResources().getIdentifier("pokemon_" + formattedPokemonId, "drawable", applicationContext.getPackageName());
                if (imageIdentifier != 0) {
                    this.pokemonImage.setImageDrawable(applicationContext.getDrawable(imageIdentifier));
                }
            } else {
                log.debug("Pokemon was not found");
                this.pokemonNumberView.setText("???");
                this.pokemonNameView.setText("?????");
            }
        }
    }
}
