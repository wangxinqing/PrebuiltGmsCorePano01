package defpackage;

/* renamed from: ng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ng implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ nh b;

    public ng(nh nhVar, Object obj) {
        this.b = nhVar;
        this.a = obj;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
