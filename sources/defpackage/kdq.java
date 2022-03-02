package defpackage;

/* renamed from: kdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kdq implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ kdv b;

    public kdq(kdv kdv, long j) {
        this.b = kdv;
        this.a = j;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
