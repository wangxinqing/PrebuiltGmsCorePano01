package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final akaq g = new akaq(this);

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        akaq akaq = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                akba.a().b(akaq.a);
            }
        } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            akba.a().a(akaq.a);
        }
        return super.a(coordinatorLayout, view, motionEvent);
    }

    public final boolean d(View view) {
        return view instanceof akas;
    }
}
