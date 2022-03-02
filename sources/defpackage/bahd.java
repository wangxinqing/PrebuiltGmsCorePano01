package defpackage;

/* renamed from: bahd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahd implements Runnable {
    final /* synthetic */ bahv a;

    public bahd(bahv bahv) {
        this.a = bahv;
    }

    public final void run() {
        bahv bahv = this.a;
        bahv.i = null;
        bahv.d.a(2, "CONNECTING after backoff");
        this.a.a(azxz.CONNECTING);
        this.a.c();
    }
}
