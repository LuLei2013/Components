package com.ll.components.components;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyV4Fragment extends android.support.v4.app.Fragment {

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "Ruby" + " onDestroy MyV4Fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("TAG", "Ruby" + " onPause MyV4Fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("TAG", "Ruby" + " onResume MyV4Fragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG", "Ruby" + " onCreate MyV4Fragment");
        getLifecycle().addObserver(new MyFragmentObserver());
        getLifecycle().addObserver(new MyFragmentGenericObserver());
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("TAG", "Ruby" + " onStart MyV4Fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("TAG", "Ruby" + " onStop MyV4Fragment");
    }
}
