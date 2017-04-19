package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Model;

/**
 * Created by Andrey on 16.04.2017.
 */

public class Controller {

    private Model model;

    public Controller(Model model) {
        this.model = model;
        if (model == null)
            throw new IllegalArgumentException();
    }

    public void onCitySelect(String cityName){
        model.selectCity(cityName);
    }
}
