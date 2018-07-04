package com.ll.components.components;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class MyFragmentObserver implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(LifecycleOwner owner) {
        Log.e("TAG-----onCreate ", " onCreate " + owner.getClass().getSimpleName() + " , " + getClass().getSimpleName());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner owner) {
        Log.e("TAG-----onStart ", " onStart " + owner.getClass().getSimpleName() + " , " + getClass().getSimpleName());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner owner) {
        Log.e("TAG-----onResume ", " onResume " + owner.getClass().getSimpleName() + " , " + getClass().getSimpleName());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner owner) {
        Log.e("TAG-----onPause ", " onPause " + owner.getClass().getSimpleName() + " , " + getClass().getSimpleName());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner owner) {
        Log.e("TAG-----onStop ", " onStop " + owner.getClass().getSimpleName() + " , " + getClass().getSimpleName());
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner owner) {
        Log.e("TAG-----onDestroy ", " onDestroy " + owner.getClass().getSimpleName() + " , " + getClass().getSimpleName());
    }


}