package com.ll.components.components;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new MyActivityObserver());
        getLifecycle().addObserver(new MyActivityGenericObserver());
        addFragment();
    }

    private void addFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(android.R.id.content, new MyV4Fragment(), MyV4Fragment.class.getSimpleName());
        transaction.addToBackStack(MyV4Fragment.class.getSimpleName());
        transaction.commitAllowingStateLoss();
    }
}
