package com.tfckr.rxbase2.sample.ui.activities;

import android.os.Bundle;

import com.tfckr.rxbase2.android.libs.qualifiers.RequiresPresenter;
import com.tfckr.rxbase2.android.ui.activities.TfcBaseActivity;
import com.tfckr.rxbase2.sample.R;
import com.tfckr.rxbase2.sample.ui.presenters.MainPresenter;
import com.tfckr.rxbase2.sample.ui.views.MainView;

@RequiresPresenter(MainPresenter.class)
public class MainActivity extends TfcBaseActivity<MainPresenter> implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
