package defpackage;

/* renamed from: ajfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajfm {
    public final int a;
    public final long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final int h;
    private final long i;

    public ajfm(int i2, long j, int i3, long j2) {
        this.a = i2;
        this.b = j;
        this.h = i3;
        this.i = j2;
    }

    /* access modifiers changed from: package-private */
    public final ajfm a(int i2, long j) {
        ajfm ajfm = new ajfm(this.a, this.b, this.h, this.i);
        ajfm.c = j - this.i;
        ajfm.d = i2;
        ajfm.e = i2 - this.h;
        ajfm.f = this.f;
        ajfm.g = this.g;
        return ajfm;
    }
}
