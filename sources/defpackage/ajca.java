package defpackage;

/* renamed from: ajca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajca {
    private final long a;
    private final ajcc b;
    private long c = 0;

    public ajca(ajcc ajcc, long j) {
        this.b = ajcc;
        this.a = j;
    }

    public final synchronized long a(long j) {
        if (j < 0) {
            return 0;
        }
        long min = Math.min(this.a - this.c, j);
        this.c = Math.min(this.c + min, this.a);
        return this.b.d(min);
    }
}
