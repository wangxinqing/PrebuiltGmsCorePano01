package defpackage;

/* renamed from: bahj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahj implements Runnable {
    final /* synthetic */ baep a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bahv c;

    public bahj(bahv bahv, baep baep, boolean z) {
        this.c = bahv;
        this.a = baep;
        this.b = z;
    }

    public final void run() {
        this.c.k.a(this.a, this.b);
    }
}
