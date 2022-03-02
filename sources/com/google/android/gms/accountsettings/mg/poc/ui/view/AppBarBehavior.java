package com.google.android.gms.accountsettings.mg.poc.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppBarBehavior extends AppBarLayout.Behavior {
    public dbp a;
    private boolean d;

    public AppBarBehavior(Context context, AttributeSet attributeSet) {
    }

    public final /* bridge */ /* synthetic */ boolean a(View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        dbp dbp = this.a;
        if (dbp == null || !dbp.a()) {
            return false;
        }
        this.d = true;
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if (this.d && motionEvent.getActionMasked() == 0) {
            this.d = false;
        }
        return super.a(coordinatorLayout, appBarLayout, motionEvent);
    }

    public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return a(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return !this.d && super.a(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }
}
