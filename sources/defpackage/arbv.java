package defpackage;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: arbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbv implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ AndroidInertialAnchor b;

    public arbv(AndroidInertialAnchor androidInertialAnchor, long j) {
        this.b = androidInertialAnchor;
        this.a = j;
    }

    public final void run() {
        synchronized (this.b) {
            this.b.g.stopOnlineEstimator(this.a);
            AndroidInertialAnchor androidInertialAnchor = this.b;
            androidInertialAnchor.e = false;
            androidInertialAnchor.f = null;
        }
    }
}
