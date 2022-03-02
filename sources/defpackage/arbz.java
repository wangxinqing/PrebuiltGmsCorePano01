package defpackage;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: arbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbz implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ float b;
    final /* synthetic */ AndroidInertialAnchor c;

    public arbz(AndroidInertialAnchor androidInertialAnchor, long j, float f) {
        this.c = androidInertialAnchor;
        this.a = j;
        this.b = f;
    }

    public final void run() {
        synchronized (this.c.h) {
            for (arce a2 : this.c.h) {
                a2.a(this.a, this.b);
            }
        }
    }
}
