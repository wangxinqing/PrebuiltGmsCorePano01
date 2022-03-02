package defpackage;

/* renamed from: nvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nvg implements Runnable {
    final /* synthetic */ nvh a;
    final /* synthetic */ int b;

    public nvg(nvh nvh, int i) {
        this.a = nvh;
        this.b = i;
    }

    public final void run() {
        nvh nvh = this.a;
        nvh.b(nvh.a, this.b);
    }
}
