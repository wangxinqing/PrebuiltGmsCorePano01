package defpackage;

import android.os.Handler;

/* renamed from: ahsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahsr extends qvr {
    public final ahuj a;
    public boolean b = false;
    private final Runnable c;

    public ahsr(ahuj ahuj, Handler handler) {
        this.a = ahuj;
        int i = ahvx.b;
        this.c = new ahsh(this, ahuj, handler);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        post(this.c);
    }
}
