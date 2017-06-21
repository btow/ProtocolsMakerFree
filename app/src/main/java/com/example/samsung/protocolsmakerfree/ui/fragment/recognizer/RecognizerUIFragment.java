package com.example.samsung.protocolsmakerfree.ui.fragment.recognizer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.example.samsung.protocolsmakerfree.R;
import com.example.samsung.protocolsmakerfree.presentation.view.recognizer.RecognizerUiView;
import com.example.samsung.protocolsmakerfree.presentation.presenter.recognizer.RecognizerUiPresenter;

import com.arellomobile.mvp.presenter.InjectPresenter;

import ru.yandex.speechkit.*;

public class RecognizerUIFragment extends MvpAppCompatFragment implements RecognizerUiView {

    public static final String TAG = "RecognizerUIFragment";

    @InjectPresenter
    RecognizerUiPresenter mRecognizerUiPresenter;

    public static RecognizerUIFragment newInstance() {
        RecognizerUIFragment fragment = new RecognizerUIFragment();

        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SpeechKit.getInstance().configure(getContext(), getString(R.string.api_kay));

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recognizer_ui, container, false);
    }

    @Override
    public void onViewCreated(final View view, final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
