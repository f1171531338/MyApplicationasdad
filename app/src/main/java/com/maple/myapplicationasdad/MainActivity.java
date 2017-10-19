package com.maple.myapplicationasdad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.maple.myapplicationasdad.pressenter.Presenter;
import com.maple.myapplicationasdad.pressenter.Presenter_GetData;
import com.maple.myapplicationasdad.view.Get_view;

public class MainActivity extends AppCompatActivity implements Get_view, View.OnClickListener {

    private TextView tv_Text;
    private Presenter_GetData presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter = new Presenter(this);
    }

    private void initView() {
        tv_Text = (TextView) findViewById(R.id.tv_Text);
        tv_Text.setOnClickListener(this);
    }

    @Override
    public void getUI(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        presenter.helpViewCallToModel("","");
    }
}
