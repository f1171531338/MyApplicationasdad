package com.mvp.h03bday1.model;

/**
 * Created by mwt on 2017/10/17.
 * 接口回调
 * 用于返回数据，具体是把数据从model层传给presenter
 */

public interface CallBackLister {

    void take_Model_Data_ToPresenterToDoUpdateViewUI(String message);


}
