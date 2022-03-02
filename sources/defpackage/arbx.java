package defpackage;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: arbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbx implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ AndroidInertialAnchor b;

    public arbx(AndroidInertialAnchor androidInertialAnchor, float f) {
        this.b = androidInertialAnchor;
        this.a = f;
    }

    public final void run() {
        synchronized (this.b.h) {
            for (arce a2 : this.b.h) {
                a2.a(this.a);
            }
        }
    }
}
