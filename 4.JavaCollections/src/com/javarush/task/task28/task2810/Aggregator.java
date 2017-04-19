package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.HHStrategy;
import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.view.HtmlView;

/**
 * Created by Andrey on 16.04.2017.
 */
public class Aggregator {

    public static void main(String[] args){
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()));
        Controller controller = new Controller(model);
        view.setController(controller);
        view.userCitySelectEmulationMethod();



    }
}
