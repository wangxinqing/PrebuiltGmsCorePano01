package defpackage;

/* renamed from: cbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cbp implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ cbs b;

    public cbp(cbs cbs, long j) {
        this.b = cbs;
        this.a = j;
    }

    public final void run() {
        while (!this.b.a.isEmpty()) {
            ((cbr) this.b.a.poll()).a(this.a);
        }
        this.b.a();
    }
}
