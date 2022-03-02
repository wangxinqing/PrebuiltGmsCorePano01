package defpackage;

/* renamed from: rh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rh {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e = Long.MIN_VALUE;
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public long i = -1;
    public float j;
    public int k;

    public final float a(long j2) {
        long j3 = this.e;
        if (j2 < j3) {
            return 0.0f;
        }
        long j4 = this.i;
        if (j4 < 0 || j2 < j4) {
            return rj.a(((float) (j2 - j3)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.j;
        return (1.0f - f2) + (f2 * rj.a(((float) (j2 - j4)) / ((float) this.k), 0.0f, 1.0f));
    }
}
