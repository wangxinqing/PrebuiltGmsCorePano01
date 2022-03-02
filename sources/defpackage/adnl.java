package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: adnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adnl {
    public final CountDownLatch a = new CountDownLatch(1);
    final /* synthetic */ adnn b;
    private final jks c;

    public adnl(adnn adnn, jks jks) {
        this.b = adnn;
        this.c = jks;
    }

    public final boolean a() {
        return this.c.a(this.b);
    }
}
