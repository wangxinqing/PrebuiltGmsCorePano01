package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aqah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqah extends azxi {
    private final amju a;
    private final String b;
    private final Executor c;

    public aqah(apyp apyp, apyo apyo, Executor executor) {
        apxw apxw = (apxw) apyo;
        this.b = apxw.a.getAuthority();
        this.c = apxw.b;
        this.a = new amju(new apzx(apyp, apyo), executor);
    }

    public final String a() {
        return this.b;
    }

    public final azxl a(baaj baaj, azxh azxh) {
        Executor executor = azxh.c;
        aorr a2 = this.a.a();
        apzy apzy = new apzy(baaj, azxh);
        if (executor == null) {
            executor = this.c;
        }
        return new aqag(aopr.a(a2, (amqy) apzy, executor));
    }
}
