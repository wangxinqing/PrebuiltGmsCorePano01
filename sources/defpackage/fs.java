package defpackage;

import android.app.Application;

/* renamed from: fs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fs implements Runnable {
    final /* synthetic */ Application a;
    final /* synthetic */ fu b;

    public fs(Application application, fu fuVar) {
        this.a = application;
        this.b = fuVar;
    }

    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
