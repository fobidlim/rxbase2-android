package com.tfckr.rxbase2.android.libs;

import com.trello.rxlifecycle2.android.ActivityEvent;

import io.reactivex.Observable;

/**
 * A type implements this interface when it can describe its lifecycle in terms of
 * creation, starting, stopping and destroying.
 */
public interface ActivityLifecycleType {

    /**
     * An observable that describes the lifecycle of the object, from CREATE to DESTROY.
     */
    Observable<ActivityEvent> lifecycle();
}
