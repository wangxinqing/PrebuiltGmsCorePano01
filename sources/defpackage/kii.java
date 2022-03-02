package defpackage;

/* renamed from: kii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kii implements kip {
    final /* synthetic */ Object a;
    final /* synthetic */ kij b;

    public kii(kij kij, Object obj) {
        this.b = kij;
        this.a = obj;
    }

    public final void a(int i) {
        if (kiq.a(i)) {
            synchronized (this.b.a) {
                this.b.a.remove(this.a);
            }
        }
    }

    public final void a(long j, long j2) {
    }
}
