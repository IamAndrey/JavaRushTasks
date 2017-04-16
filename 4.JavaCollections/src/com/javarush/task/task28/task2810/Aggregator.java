package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.model.Strategy;

/**
 * Created by Andrey on 16.04.2017.
 */
public class Aggregator {

    public static void main(String[] args){
        Provider provider = new Provider(new Strategy() {
        });
        Controller controller = new Controller(provider);
        System.out.print(controller);
    }
}
