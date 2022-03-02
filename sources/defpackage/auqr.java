package defpackage;

import android.util.Log;

/* renamed from: auqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auqr implements aora {
    final /* synthetic */ auqs a;

    public auqr(auqs auqs) {
        this.a = auqs;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.a.a.a;
        String valueOf = String.valueOf((Boolean) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Opt-in status future for ");
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
    }

    public final void a(Throwable th) {
        String valueOf = String.valueOf(this.a.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Could not resolve opt-in status future. Client options: ");
        sb.append(valueOf);
        Log.e("SherlogClientImpl", sb.toString(), th);
    }
}
