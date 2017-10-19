package com.maple.myapplicationasdad.pressenter;

import com.maple.myapplicationasdad.MainActivity;
import com.maple.myapplicationasdad.model.ChuLi;
import com.maple.myapplicationasdad.model.Model;
import com.maple.myapplicationasdad.view.Get_view;

/**
 * Created by maple on 2017/10/19.
 */

public class Presenter implements Presenter_GetData,ChuLi{
    private Model model;
    private Get_view get_view;
    public Presenter(MainActivity mainActivity) {
        new Model(mainActivity);
        get_view=mainActivity;
    }

    @Override
    public void helpViewCallToModel(String name, String psw) {
        get_view.getUI();
    }

    @Override
    public void UpData(String name, String psw) {

    }
}
