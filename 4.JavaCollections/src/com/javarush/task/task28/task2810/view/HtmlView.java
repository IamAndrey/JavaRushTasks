package com.javarush.task.task28.task2810.view;

import com.javarush.task.task28.task2810.Controller;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Andrey on 19.04.2017.
 */
public class HtmlView implements View {

    private Controller controller;
    private final String filePath = "./src/" + getClass().getPackage().getName().replaceAll("\\.", "/") + "/vacancies.html";

    @Override
    public void update(List<Vacancy> vacancies) {
        System.out.println(vacancies.size());
        try {
            String newFile = getUpdatedFileContent(vacancies);
            updateFile(newFile);
        }
        catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void userCitySelectEmulationMethod(){
        controller.onCitySelect("Odessa");
    }

    private String getUpdatedFileContent(List<Vacancy> list){
        return null;
    }

    private void updateFile(String s) {

        try (FileOutputStream outputStream = new FileOutputStream(filePath)){
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
