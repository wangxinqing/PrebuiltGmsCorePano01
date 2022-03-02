package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwipeDismissBehavior extends ahj {
    public sd a;
    public int b = 2;
    public float c = 0.5f;
    public float d = 0.0f;
    public float e = 0.5f;
    public akan f;
    private boolean g;
    private final sc h = new ajsv(this);

    public static float a(float f2) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        sd sdVar = this.a;
        if (sdVar == null) {
            return false;
        }
        sdVar.b(motionEvent);
        return true;
    }

    public boolean d(View view) {
        return true;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (qb.f(view) != 0) {
            return false;
        }
        qb.b(view, 1);
        qb.c(view, 1048576);
        if (!d(view)) {
            return false;
        }
        qb.a(view, qp.f, (rf) new ajsw(this));
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = sd.a((ViewGroup) coordinatorLayout, this.h);
        }
        return this.a.a(motionEvent);
    }
}
