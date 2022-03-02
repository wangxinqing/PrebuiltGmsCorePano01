package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: acpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acpq implements aora {
    final /* synthetic */ acpr a;

    public acpq(acpr acpr) {
        this.a = acpr;
    }

    public final void a(Object obj) {
    }

    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            this.a.a(th.toString());
        }
    }
}
