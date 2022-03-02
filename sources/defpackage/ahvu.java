package defpackage;

/* renamed from: ahvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvu extends ahvr {
    private final float[] a;
    private final long b;
    private final int c;

    public ahvu(float[] fArr, long j, int i) {
        this.a = fArr;
        this.b = j;
        this.c = i;
    }

    public final void a(ahsr ahsr) {
        ahsr.post(new ahso(ahsr, this.a, this.b, this.c));
    }
}
