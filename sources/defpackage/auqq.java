package defpackage;

import android.util.Log;

/* renamed from: auqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auqq implements aora {
    final /* synthetic */ Runnable a;
    final /* synthetic */ auqs b;

    public auqq(auqs auqs, Runnable runnable) {
        this.b = auqs;
        this.a = runnable;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.a.run();
        }
    }

    public final void a(Throwable th) {
        String valueOf = String.valueOf(this.b.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Could not resolve opt-in status future. Client options: ");
        sb.append(valueOf);
        Log.e("SherlogClientImpl", sb.toString(), th);
    }
}
