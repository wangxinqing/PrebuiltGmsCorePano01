package defpackage;

/* renamed from: bavd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavd implements Runnable {
    final /* synthetic */ bawd a;
    final /* synthetic */ bawc b;

    public bavd(bawc bawc, bawd bawd) {
        this.b = bawc;
        this.a = bawd;
    }

    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.a(th);
        }
    }
}
