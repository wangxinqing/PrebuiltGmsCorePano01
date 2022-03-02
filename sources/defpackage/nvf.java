package defpackage;

/* renamed from: nvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nvf implements Runnable {
    final /* synthetic */ nvi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ nux c;
    final /* synthetic */ nvh d;

    public nvf(nvh nvh, nvi nvi, boolean z, nux nux) {
        this.d = nvh;
        this.a = nvi;
        this.b = z;
        this.c = nux;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c);
        this.a.o.clear();
    }
}
