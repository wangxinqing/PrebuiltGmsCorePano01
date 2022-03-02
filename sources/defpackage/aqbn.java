package defpackage;

/* renamed from: aqbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbn implements Runnable {
    private final aqbq a;

    public aqbn(aqbq aqbq) {
        this.a = aqbq;
    }

    public final void run() {
        aqbq aqbq = this.a;
        if (!aqbq.g) {
            aqbq.f = true;
            aqbq.c();
        }
    }
}
