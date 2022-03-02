package com.google.android.places.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TouchableMapView extends MapView {
    public View.OnTouchListener a = null;

    public TouchableMapView(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.a;
        if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.a = onTouchListener;
    }

    public TouchableMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchableMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TouchableMapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
    }
}
