package defpackage;

/* renamed from: lf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lf implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ lg b;

    public lf(lg lgVar, int i) {
        this.b = lgVar;
        this.a = i;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
