package defpackage;

/* renamed from: kir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kir implements kip {
    final /* synthetic */ kis a;

    public kir(kis kis) {
        this.a = kis;
    }

    public final void a(int i) {
        if (kiq.a(i)) {
            kis kis = this.a;
            kis.c = i;
            kis.b.countDown();
        }
    }

    public final void a(long j, long j2) {
    }
}
