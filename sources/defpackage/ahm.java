package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ahm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahm extends ViewGroup.MarginLayoutParams {
    public ahj a;
    public boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public final Rect o = new Rect();
    private boolean p;
    private boolean q;

    public ahm() {
        super(-2, -2);
    }

    public final void a() {
        this.n = false;
    }

    public final void a(int i2, boolean z) {
        if (i2 == 0) {
            this.p = z;
        } else if (i2 == 1) {
            this.q = z;
        }
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.p;
        }
        if (i2 != 1) {
            return false;
        }
        return this.q;
    }

    public ahm(ahm ahm) {
        super(ahm);
    }

    public final void a(ahj ahj) {
        ahj ahj2 = this.a;
        if (ahj2 != ahj) {
            if (ahj2 != null) {
                ahj2.a();
            }
            this.a = ahj;
            this.b = true;
            if (ahj != null) {
                ahj.a(this);
            }
        }
    }

    public ahm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahg.b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        ahj ahj = this.a;
        if (ahj != null) {
            ahj.a(this);
        }
    }

    public ahm(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public ahm(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
