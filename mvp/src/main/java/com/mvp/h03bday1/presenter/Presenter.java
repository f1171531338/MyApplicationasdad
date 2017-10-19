package com.mvp.h03bday1.presenter;

import com.mvp.h03bday1.MainActivity;
import com.mvp.h03bday1.model.CallBackLister;
import com.mvp.h03bday1.model.Model;
import com.mvp.h03bday1.model.ModelInf;
import com.mvp.h03bday1.view.ViewInf;

/**
 * Created by mwt on 2017/10/17.
 */

public class Presenter implements PresenterInf ,CallBackLister{

    private ModelInf modelInf;
    private ViewInf viewInf;

    public Presenter(MainActivity activity){
        modelInf = new Model();
        viewInf = activity;
    }

    @Override
    public void helpViewCallToModel(String userName, String pwd) {
        modelInf.getData(userName,pwd,this);
        modelInf.getData(userName,pwd,this);
        modelInf.getData(userName,pwd,this);
        modelInf.getData(userName,pwd,this);
        modelInf.getData(userName,pwd,this);
    }


    @Override
    public void take_Model_Data_ToPresenterToDoUpdateViewUI(String message) {
        viewInf.updateUI(message);
    }
}
