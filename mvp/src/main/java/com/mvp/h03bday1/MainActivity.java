package com.mvp.h03bday1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mvp.h03bday1.presenter.Presenter;
import com.mvp.h03bday1.presenter.PresenterInf;
import com.mvp.h03bday1.view.ViewInf;

public class MainActivity extends AppCompatActivity implements ViewInf, View.OnClickListener {

    private Button button;
    PresenterInf presenterInf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenterInf = new Presenter(this);

    }

    @Override
    public void updateUI(String data) {
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                presenterInf.helpViewCallToModel("","");
                break;
        }
    }
}
