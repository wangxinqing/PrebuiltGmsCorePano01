package defpackage;

import android.content.ComponentName;

/* renamed from: sxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxz implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ syd b;

    public sxz(syd syd, ComponentName componentName) {
        this.b = syd;
        this.a = componentName;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
