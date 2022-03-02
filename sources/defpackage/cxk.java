package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Set;

/* renamed from: cxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cxk implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Set c;
    final /* synthetic */ cxl d;

    public cxk(cxl cxl, int i, int i2, Set set) {
        this.d = cxl;
        this.a = i;
        this.b = i2;
        this.c = set;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.d.s.removeOnLayoutChangeListener(this);
        int max = Math.max(i3 - i, i - i3);
        new qvr(Looper.getMainLooper()).post(new cxj(this, this.a, max, this.b, this.c));
    }
}
