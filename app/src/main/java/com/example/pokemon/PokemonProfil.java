package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class PokemonProfil extends AppCompatActivity {



    private int idPokemon;
    private int imagePokemon;
    private String nomPokemon;
    private String descriptionPokemon;
    private String heightPokemon;
    private String weightPokemon;
    private String genderPokemon;
    private String categoryPokemon;
    private String abilitiesPokemon;
    private String[] typePokemon;
    private String[] weaknessesPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokemon_profil);

        Intent intent = getIntent();
        this.typePokemon=new String[2];
        this.weaknessesPokemon=new String[4];
        this.typePokemon[0]="Grass";
        this.typePokemon[1]="Poison";
        this.weaknessesPokemon[0]="Fire";
        this.weaknessesPokemon[1]="Psychic";
        this.weaknessesPokemon[2]="Flying";
        this.weaknessesPokemon[3]="Ice";

        this.abilitiesPokemon="Overgrow";
        this.categoryPokemon="Seed         ";
        this.genderPokemon="♂  ♀ ";
        this.weightPokemon="15.2 lbs";
        this.heightPokemon="2' 04''";
        this.descriptionPokemon="There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.";
        this.idPokemon = intent.getIntExtra("Id", 0);
        this.nomPokemon="Bulbasaur";
        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText("#"+this.idPokemon);
        TextView textViewNom = findViewById(R.id.textViewNom);
        textViewNom.setText(this.nomPokemon);
        if(this.idPokemon==1001) {
            this.imagePokemon=R.drawable._05;

        }else if(this.idPokemon==1002) {
            this.imagePokemon=R.drawable._04;

        }else if(this.idPokemon==1003) {
            this.imagePokemon=R.drawable._03;
        }else if(this.idPokemon==1004) {
            this.imagePokemon=R.drawable._02;
        }else if(this.idPokemon==1005) {
            this.imagePokemon=R.drawable._01;
        }else if(this.idPokemon==1006) {
            this.imagePokemon=R.drawable._06;
        }else if(this.idPokemon==1007) {
            this.imagePokemon=R.drawable._07;
        }else if(this.idPokemon==1008) {
            this.imagePokemon=R.drawable._08;
        }
        ImageView imageViewPokemon = findViewById(R.id.image10);
        imageViewPokemon.setImageResource(this.imagePokemon);

        TextView textViewDescription=findViewById(R.id.textViewDescription);
        textViewDescription.setText(this.descriptionPokemon);

        TextView textViewHeight=findViewById(R.id.textViewHeightValue);
        textViewHeight.setText(this.heightPokemon);

        TextView textViewWeight=findViewById(R.id.textViewWeightValue);
        textViewWeight.setText(this.weightPokemon);

        TextView textViewGender=findViewById(R.id.textViewGenderValue);
        textViewGender.setText(this.genderPokemon);

        TextView textViewCategory=findViewById(R.id.textViewCategoryValue);
        textViewCategory.setText(this.categoryPokemon);

        TextView textViewAbilities=findViewById(R.id.textViewAbilitiesValue);
        textViewAbilities.setText(this.abilitiesPokemon);

        TextView textViewType1=findViewById(R.id.textTypeValue1);
        textViewType1.setText(this.typePokemon[0]);
        TextView textViewType2=findViewById(R.id.textTypeValue2);
        textViewType2.setText(this.typePokemon[1]);

        TextView textViewWeak1=findViewById(R.id.textWeaknessesValue1);
        textViewWeak1.setText(this.weaknessesPokemon[0]);
        TextView textViewWeak2=findViewById(R.id.textWeaknessesValue2);
        textViewWeak2.setText(this.weaknessesPokemon[1]);
        TextView textViewWeak3=findViewById(R.id.textWeaknessesValue3);
        textViewWeak3.setText(this.weaknessesPokemon[2]);
        TextView textViewWeak4=findViewById(R.id.textWeaknessesValue4);
        textViewWeak4.setText(this.weaknessesPokemon[3]);

    }
}