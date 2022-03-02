package defpackage;

/* renamed from: gpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpo implements Runnable {
    final /* synthetic */ gqa a;

    public gpo(gqa gqa) {
        this.a = gqa;
    }

    public final void run() {
        if (!this.a.c()) {
            this.a.t.n();
        }
    }
}
