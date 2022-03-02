package defpackage;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: arbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbw implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ AndroidInertialAnchor b;

    public arbw(AndroidInertialAnchor androidInertialAnchor, long j) {
        this.b = androidInertialAnchor;
        this.a = j;
    }

    public final void run() {
        synchronized (this.b.h) {
            for (arce a2 : this.b.h) {
                a2.a(this.a);
            }
        }
    }
}
