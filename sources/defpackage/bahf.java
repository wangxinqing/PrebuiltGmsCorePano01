package defpackage;

/* renamed from: bahf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahf implements Runnable {
    final /* synthetic */ bahv a;

    public bahf(bahv bahv) {
        this.a = bahv;
    }

    public final void run() {
        if (this.a.n.a == azxz.TRANSIENT_FAILURE) {
            this.a.e();
            this.a.d.a(2, "CONNECTING; backoff interrupted");
            this.a.a(azxz.CONNECTING);
            this.a.c();
        }
    }
}
