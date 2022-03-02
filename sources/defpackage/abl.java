package defpackage;

import android.view.View;

/* renamed from: abl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abl implements Runnable {
    final /* synthetic */ abs a;

    public abl(abs abs) {
        this.a = abs;
    }

    public final void run() {
        View view = this.a.l;
        if (view != null && view.getWindowToken() != null) {
            this.a.ar();
        }
    }
}
