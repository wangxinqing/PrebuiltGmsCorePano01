package defpackage;

/* renamed from: aiat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiat {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final aizx e;
    public long f;
    public long g;
    public final boolean h;

    public aiat(long j, long j2, long j3) {
        this(j, j2, j3, j, false, (aizx) null);
    }

    public final long a(long j) {
        long j2 = this.a;
        if (j2 != Long.MAX_VALUE) {
            return j + j2;
        }
        return Long.MAX_VALUE;
    }

    public final long b(long j) {
        long j2 = this.c;
        if (j2 != Long.MAX_VALUE) {
            return j + j2;
        }
        return Long.MAX_VALUE;
    }

    public final boolean b() {
        return this.a < Long.MAX_VALUE;
    }

    public final boolean c() {
        return this.c < Long.MAX_VALUE;
    }

    public final boolean d() {
        return e() > 0;
    }

    public final int e() {
        long j = this.d;
        long j2 = 0;
        if (j == 0 || j == Long.MAX_VALUE) {
            return 0;
        }
        long j3 = j / this.a;
        if (j3 != 1) {
            j2 = Math.min(j3, 10);
        }
        return (int) j2;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.b;
        StringBuilder sb = new StringBuilder(165);
        sb.append("periodMillis: ");
        sb.append(j);
        sb.append(", lowPowerPeriodMillis: ");
        sb.append(j2);
        sb.append(", batchIntervalMillis: ");
        sb.append(j3);
        sb.append(", originalPeriodMillis: ");
        sb.append(j4);
        return sb.toString();
    }

    public aiat(long j, long j2, long j3, long j4, boolean z, aizx aizx) {
        this.a = j;
        this.c = j2;
        this.d = j3;
        this.b = j4;
        this.h = z;
        this.e = aizx;
        this.g = Long.MAX_VALUE;
        this.f = Long.MAX_VALUE;
    }

    public final boolean a() {
        return b() || c();
    }
}
