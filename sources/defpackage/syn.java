package defpackage;

/* renamed from: syn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syn implements Runnable {
    final long a;
    final /* synthetic */ syo b;

    public syn(syo syo, long j) {
        this.b = syo;
        this.a = j;
    }

    public final void run() {
        this.b.b.F().a((Runnable) new sym(this));
    }
}
