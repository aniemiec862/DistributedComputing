package com.agh.lab2_pokemonrestapp.datafinder;

import com.agh.lab2_pokemonrestapp.Commons;
import com.agh.lab2_pokemonrestapp.datafinder.request.RequestMaker;
import com.agh.lab2_pokemonrestapp.model.PokemonType;
import com.agh.lab2_pokemonrestapp.model.TypeData;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;

public class TypeDataFinder {
    public TypeData findData(PokemonType pokemonType) throws IOException {
        String typeId = Commons.TYPE_ID_MAP.get(pokemonType.getTypes().get(0));
        URL url = new URL(Commons.POKEAPI_TYPE_DATA + typeId);
        RequestMaker requestMaker = new RequestMaker();
        String json = requestMaker.sendGetRequest(url);
        TypeData typeData = new Gson().fromJson(json, TypeData.class);
        return typeData;
    }
}
