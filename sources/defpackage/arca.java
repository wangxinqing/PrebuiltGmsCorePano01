package defpackage;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: arca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arca implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ long c;
    final /* synthetic */ AndroidInertialAnchor d;

    public arca(AndroidInertialAnchor androidInertialAnchor, float f, float f2, long j) {
        this.d = androidInertialAnchor;
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final void run() {
        synchronized (this.d.h) {
            for (arce a2 : this.d.h) {
                a2.a(this.a, this.b, this.c);
            }
        }
    }
}
