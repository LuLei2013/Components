package com.ll.components.components;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyV4Fragment extends android.support.v4.app.Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new MyFragmentObserver());
        getLifecycle().addObserver(new MyFragmentGenericObserver());
    }
}
