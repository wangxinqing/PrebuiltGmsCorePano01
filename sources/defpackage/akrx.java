package defpackage;

/* renamed from: akrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akrx implements Runnable {
    final /* synthetic */ Throwable a;
    final /* synthetic */ akrz b;

    public akrx(akrz akrz, Throwable th) {
        this.b = akrz;
        this.a = th;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
