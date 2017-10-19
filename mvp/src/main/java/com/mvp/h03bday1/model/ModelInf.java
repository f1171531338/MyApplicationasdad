package com.mvp.h03bday1.model;

/**
 * Created by mwt on 2017/10/17.
 * model 用于处理数据业务
 *
 * 假如：现在是登录业务，
 *
 */

public interface ModelInf {

    public void getData(String userName,String pwd,CallBackLister lister);

}
