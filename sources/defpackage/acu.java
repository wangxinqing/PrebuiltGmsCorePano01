package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: acu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acu extends ViewGroup.MarginLayoutParams {
    public adl c;
    public final Rect d = new Rect();
    public boolean e = true;
    boolean f = false;

    public acu(int i, int i2) {
        super(i, i2);
    }

    public final boolean a() {
        return this.c.n();
    }

    public final boolean b() {
        return this.c.u();
    }

    public final int c() {
        return this.c.c();
    }

    @Deprecated
    public final int d() {
        return this.c.d();
    }

    public acu(acu acu) {
        super(acu);
    }

    public acu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public acu(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public acu(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
