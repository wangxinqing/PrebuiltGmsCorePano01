package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;

/* renamed from: zk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zk implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ zm a;

    public zk(zm zmVar) {
        this.a = zmVar;
    }

    public final void onGlobalLayout() {
        zm zmVar = this.a;
        AppCompatSpinner appCompatSpinner = zmVar.d;
        if (!qb.D(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(zmVar.c)) {
            this.a.d();
            return;
        }
        this.a.h();
        zk.super.ar();
    }
}
