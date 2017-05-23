package com.example.samsung.protocolsmakerfree.presentation.presenter.home;


import android.view.View;

import com.example.samsung.protocolsmakerfree.R;
import com.example.samsung.protocolsmakerfree.presentation.Messager;
import com.example.samsung.protocolsmakerfree.presentation.view.home.HomeView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class HomePresenter extends MvpPresenter<HomeView> {

    public static void onClickBtn(final View view) {

        String msg = "";

        switch (view.getId()) {

            case R.id.btnBrouse:
                msg = view.getResources().getString(R.string.existing_rotocol);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnInputName:
                msg = view.getResources().getString(R.string.enter_name_new_protocol);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnInBegin:
                msg = view.getResources().getString(R.string.go_to_the_beginning);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnPrev:
                msg = view.getResources().getString(R.string.word_to_left);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnRec:
                msg = view.getResources().getString(R.string.record_with_mic);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnPlay:
                msg = view.getResources().getString(R.string.playback_recording);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnPause:
                msg = view.getResources().getString(R.string.pause_recording);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnNext:
                msg = view.getResources().getString(R.string.word_to_right);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            case R.id.btnInEnd:
                msg = view.getResources().getString(R.string.go_to_the_end);
                Messager.sendToOnlyToast(view.getContext(), msg);
                break;
            default:
                break;
        }
    }
}
