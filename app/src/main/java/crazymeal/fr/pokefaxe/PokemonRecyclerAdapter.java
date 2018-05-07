package crazymeal.fr.pokefaxe;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import crazymeal.fr.pokefaxe.model.Pokemon;

public class PokemonRecyclerAdapter extends RecyclerView.Adapter<PokemonRecyclerAdapter.PokemonViewHolder> {

    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    private final List<Pokemon> mPokemons;

    public PokemonRecyclerAdapter(Context mContext, List<Pokemon> mPokemons) {
        this.mContext = mContext;
        this.mPokemons = mPokemons;
        this.mLayoutInflater = LayoutInflater.from(this.mContext);
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = this.mLayoutInflater.inflate(R.layout.item_pokemon, parent, false);
        return new PokemonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = this.mPokemons.get(position);
        holder.mPokemonId.setText(String.format("%03d", pokemon.getId()));
        holder.mPokemonName.setText(pokemon.getName());
        holder.mCurrentPosition = position;
    }

    @Override
    public int getItemCount() {
        return this.mPokemons.size();
    }


    public class PokemonViewHolder extends RecyclerView.ViewHolder {

        public final TextView mPokemonId;
        public final TextView mPokemonName;
        public int mCurrentPosition;

        public PokemonViewHolder(View itemView) {
            super(itemView);
            this.mPokemonId = itemView.findViewById(R.id.text_pokemon_id);
            this.mPokemonName = itemView.findViewById(R.id.text_pokemon_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, PokemonActivity.class);
                    intent.putExtra("pokemon_position", mCurrentPosition);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
