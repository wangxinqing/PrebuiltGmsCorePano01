package defpackage;

import android.util.Log;

/* renamed from: qwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qwo implements aora {
    final /* synthetic */ qwp a;

    public qwo(qwp qwp) {
        this.a = qwp;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.a((qxp) obj);
    }

    public final void a(Throwable th) {
        Log.e("GmsTaskScheduler", "Exception when getting ipc strategy: ", th);
    }
}
