package com.ll.components.components;


import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.util.Log;

public class MyActivityGenericObserver implements GenericLifecycleObserver {
    @Override
    public void onStateChanged(LifecycleOwner owner, Lifecycle.Event event) {
        Log.e("TAG-----"+ event.name().toLowerCase(), event.name() + " , " + owner.getClass().getSimpleName() + " , " + getClass().getSimpleName().toLowerCase());
    }
}
