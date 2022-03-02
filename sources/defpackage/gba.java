package defpackage;

import android.util.Log;

/* renamed from: gba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gba implements Runnable {
    private final gbb a;

    public gba(gbb gbb) {
        this.a = gbb;
    }

    public final void run() {
        gbb gbb = this.a;
        Log.i("AuthZeroTouch", "Module request does not call back before timeout.");
        if (gbb.b.a()) {
            gbb.a.onRequestComplete(0);
        } else {
            gbb.a.onRequestComplete(-1);
        }
    }
}
