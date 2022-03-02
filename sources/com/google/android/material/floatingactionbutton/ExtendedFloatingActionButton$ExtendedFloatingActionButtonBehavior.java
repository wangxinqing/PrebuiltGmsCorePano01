package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends ahj {
    private Rect a;
    private boolean b;
    private boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    private final boolean a(View view, ajwo ajwo) {
        ahm ahm = (ahm) ajwo.getLayoutParams();
        if ((!this.b && !this.c) || ahm.f != view.getId()) {
            return false;
        }
        return true;
    }

    private final boolean b(View view, ajwo ajwo) {
        if (!a(view, ajwo)) {
            return false;
        }
        if (view.getTop() < (ajwo.getHeight() / 2) + ((ahm) ajwo.getLayoutParams()).topMargin) {
            a(ajwo);
            return true;
        }
        b(ajwo);
        return true;
    }

    private static boolean d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ahm) {
            return ((ahm) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    public final void a(ahm ahm) {
        if (ahm.h == 0) {
            ahm.h = 80;
        }
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajxe.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    private final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ajwo ajwo) {
        if (!a((View) appBarLayout, ajwo)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        ajxk.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
        if (rect.bottom <= appBarLayout.f()) {
            a(ajwo);
            return true;
        }
        b(ajwo);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void b(ajwo ajwo) {
        if (this.c) {
            int i = ajwo.h;
            ajxd ajxd = ajwo.e;
        } else {
            int i2 = ajwo.h;
            ajxd ajxd2 = ajwo.f;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void a(ajwo ajwo) {
        if (this.c) {
            int i = ajwo.h;
            ajxd ajxd = ajwo.d;
        } else {
            int i2 = ajwo.h;
            ajxd ajxd2 = ajwo.g;
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
        ajwo ajwo = (ajwo) view;
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        ajwo ajwo = (ajwo) view;
        List b2 = coordinatorLayout.b((View) ajwo);
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) b2.get(i2);
            if (!(view2 instanceof AppBarLayout)) {
                if (d(view2) && b(view2, ajwo)) {
                    break;
                }
            } else if (a(coordinatorLayout, (AppBarLayout) view2, ajwo)) {
                break;
            }
        }
        coordinatorLayout.b(ajwo, i);
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ajwo ajwo = (ajwo) view;
        if (view2 instanceof AppBarLayout) {
            a(coordinatorLayout, (AppBarLayout) view2, ajwo);
            return false;
        } else if (!d(view2)) {
            return false;
        } else {
            b(view2, ajwo);
            return false;
        }
    }
}
