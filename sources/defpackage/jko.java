package defpackage;

/* renamed from: jko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jko implements Runnable {
    final /* synthetic */ jkm a;
    final /* synthetic */ int b;

    public jko(jkm jkm, int i) {
        this.a = jkm;
        this.b = i;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
