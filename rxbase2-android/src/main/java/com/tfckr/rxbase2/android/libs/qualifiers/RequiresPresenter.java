package com.tfckr.rxbase2.android.libs.qualifiers;

import com.tfckr.rxbase2.android.ui.presenters.TfcBaseActivityPresenter;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPresenter {
    Class<? extends TfcBaseActivityPresenter> value();
}