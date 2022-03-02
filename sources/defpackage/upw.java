package defpackage;

/* renamed from: upw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class upw implements Runnable {
    private final uqb a;
    private final ampi b;

    public upw(uqb uqb, ampi ampi) {
        this.a = uqb;
        this.b = ampi;
    }

    public final void run() {
        uqb uqb = this.a;
        ampi ampi = this.b;
        uqd uqd = uqb.a;
        uqe uqe = uqd.a;
        if (uqd.d.get()) {
            ampi.b();
            return;
        }
        uqr a2 = uqq.a(ampi, new upx(uqb, ampi), new upy(uqb));
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("uqb", "b", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create an incoming MultiplexBleSocket from connection %s.", (Object) ampi.c());
        } else {
            uqb.a.b.put(ampi.c(), a2);
        }
    }
}
