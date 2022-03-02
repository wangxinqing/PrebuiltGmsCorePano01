package defpackage;

import android.view.View;

/* renamed from: deu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class deu implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ dev b;

    public deu(dev dev, View view) {
        this.b = dev;
        this.a = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i4 && i3 != i) {
            this.a.removeOnLayoutChangeListener(this);
            if (this.b.isResumed()) {
                this.a.postDelayed(new det(this), 0);
            }
        }
    }
}
