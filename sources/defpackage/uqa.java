package defpackage;

/* renamed from: uqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqa implements Runnable {
    private final uqb a;
    private final ampi b;

    public uqa(uqb uqb, ampi ampi) {
        this.a = uqb;
        this.b = ampi;
    }

    public final void run() {
        uqb uqb = this.a;
        ampi ampi = this.b;
        uqd uqd = uqb.a;
        uqe uqe = uqd.a;
        uqd.b.remove(ampi.c());
    }
}
