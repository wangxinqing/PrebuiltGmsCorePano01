package defpackage;

import android.view.View;

/* renamed from: aket  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aket implements View.OnLayoutChangeListener {
    final /* synthetic */ akey a;

    public aket(akey akey) {
        this.a = akey;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        akey akey = this.a;
        akey.i = false;
        akey.a(0.0f);
    }
}
