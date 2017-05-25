package com.example.samsung.protocolsmakerfree.ui.activity.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.samsung.protocolsmakerfree.R;
import com.example.samsung.protocolsmakerfree.presentation.view.home.HomeView;
import com.example.samsung.protocolsmakerfree.presentation.presenter.home.HomePresenter;

import com.arellomobile.mvp.presenter.InjectPresenter;

import ru.yandex.speechkit.SpeechKit;

public class HomeActivity extends MvpAppCompatActivity implements HomeView {

    public static final String TAG = "HomeActivity";

    @InjectPresenter
    HomePresenter mHomePresenter;

    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, HomeActivity.class);

        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SpeechKit.getInstance().configure(getBaseContext(), getString(R.string.api_kay));
    }

    public void onClickBtn(View view) {
        HomePresenter.onClickBtn(view);
    }
}
