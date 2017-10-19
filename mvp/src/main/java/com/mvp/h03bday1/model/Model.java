package com.mvp.h03bday1.model;

import android.text.TextUtils;

/**
 * Created by mwt on 2017/10/17.
 * model 专注于数据处理
 */

public class Model implements ModelInf {

    @Override
    public void getData(String userName, String pwd,CallBackLister lister) {
        if (TextUtils.isEmpty(userName) && TextUtils.isEmpty(pwd)){
            lister.take_Model_Data_ToPresenterToDoUpdateViewUI("ERROR");
        }else {
            lister.take_Model_Data_ToPresenterToDoUpdateViewUI("SUCCESS");
        }
    }
}
