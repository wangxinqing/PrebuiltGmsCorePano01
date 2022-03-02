package defpackage;

/* renamed from: bahe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahe implements Runnable {
    final /* synthetic */ bahv a;

    public bahe(bahv bahv) {
        this.a = bahv;
    }

    public final void run() {
        if (this.a.n.a == azxz.IDLE) {
            this.a.d.a(2, "CONNECTING as requested");
            this.a.a(azxz.CONNECTING);
            this.a.c();
        }
    }
}
