package com.mvp.h03bday1.presenter;

/**
 * Created by mwt on 2017/10/17.
 * 桥梁作用
 * presenter 对model 和view 层有一个引用
 */

public interface PresenterInf {

    public void helpViewCallToModel(String userName,String pwd);


}
