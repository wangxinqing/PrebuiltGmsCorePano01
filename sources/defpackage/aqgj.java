package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: aqgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgj implements aqgg {
    static final long a = TimeUnit.SECONDS.toNanos(15);
    static final long b = TimeUnit.SECONDS.toNanos(60);
    static final long c = TimeUnit.SECONDS.toNanos(60);
    static final long d = TimeUnit.SECONDS.toNanos(10);
    private aqgf e = aqgf.IN_VEHICLE;
    private long f = Long.MAX_VALUE;
    private float g = Float.NaN;
    private long h = Long.MAX_VALUE;
    private long i = Long.MAX_VALUE;
    private float j = Float.MAX_VALUE;
    private long k = Long.MAX_VALUE;

    public final float a(long j2) {
        boolean b2 = b(j2);
        this.e.toString();
        for (aqjv aqjv : aqju.a) {
        }
        if (b2) {
            return this.g;
        }
        long j3 = this.f;
        if (j3 == Long.MAX_VALUE || j2 - j3 >= b) {
            return 30.0f;
        }
        long j4 = this.i;
        if (j4 != Long.MAX_VALUE && j2 - j4 < d && this.e.equals(aqgf.STILL)) {
            return 2.5f;
        }
        float f2 = this.j;
        if (f2 != Float.MAX_VALUE && f2 < 5.0f) {
            long j5 = this.k;
            if (j5 != Long.MAX_VALUE && j2 - j5 < c && (this.e.equals(aqgf.ON_BICYCLE) || this.e.equals(aqgf.IN_VEHICLE))) {
                return 2.5f;
            }
        }
        aqgf aqgf = this.e;
        aqgf aqgf2 = aqgf.UNKNOWN;
        int ordinal = aqgf.ordinal();
        if (ordinal == 0) {
            return 2.5f;
        }
        if (ordinal == 1) {
            return 0.0f;
        }
        if (ordinal == 2) {
            return 2.5f;
        }
        if (ordinal != 3) {
            return 30.0f;
        }
        return 10.0f;
    }

    public final int a(long j2, int i2) {
        return 0;
    }

    public final void a(long j2, float f2, float f3) {
        this.i = j2;
    }

    public final void a(long j2, aqgf aqgf) {
        this.e = aqgf;
        this.f = j2;
    }

    public final long b() {
        throw new UnsupportedOperationException("Speed estimator don't support estimating positions and their time.");
    }

    public final boolean b(long j2) {
        long j3 = this.h;
        return j3 != Long.MAX_VALUE && j2 - j3 < a;
    }

    public final void c() {
        this.e = aqgf.IN_VEHICLE;
        this.f = Long.MAX_VALUE;
        this.g = Float.NaN;
        this.h = Long.MAX_VALUE;
        this.i = Long.MAX_VALUE;
        this.j = Float.MAX_VALUE;
        this.k = Long.MAX_VALUE;
    }

    public final void d() {
        c();
    }

    public final aqey a() {
        throw new UnsupportedOperationException("Speed estimator don't support estimating positions and their time.");
    }

    public final void a(long j2, aqey aqey) {
        if (aqey.a() && aqey.d()) {
            this.g = aqey.e;
            this.h = j2;
        }
    }

    public final void a(long j2, aqfq aqfq) {
        float f2 = 0.0f;
        if (aqfq.a != 0) {
            float[] fArr = aqfq.c;
            if (fArr.length != 0) {
                f2 = fArr[0];
            }
        }
        float f3 = this.j;
        if (f3 != Float.MAX_VALUE) {
            f2 = (f2 * 0.100000024f) + (f3 * 0.9f);
        }
        this.j = f2;
        this.k = j2;
    }

    public final void a(long j2, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("SpeedEstimator");
        long j3 = this.f;
        if (j3 != Long.MAX_VALUE) {
            String valueOf = String.valueOf(this.e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append(" activity{");
            sb2.append(j3);
            sb2.append(",");
            sb2.append(valueOf);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long j4 = this.h;
        if (j4 != Long.MAX_VALUE) {
            float f2 = this.g;
            StringBuilder sb3 = new StringBuilder(44);
            sb3.append(" speed{");
            sb3.append(j4);
            sb3.append(",");
            sb3.append(f2);
            sb3.append("}");
            sb.append(sb3.toString());
        }
        long j5 = this.k;
        if (j5 != Long.MAX_VALUE) {
            float f3 = this.j;
            StringBuilder sb4 = new StringBuilder(42);
            sb4.append(" snr{");
            sb4.append(j5);
            sb4.append(",");
            sb4.append(f3);
            sb4.append("}");
            sb.append(sb4.toString());
        }
        long j6 = this.i;
        if (j6 != Long.MAX_VALUE) {
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append(" steps at ");
            sb5.append(j6);
            sb.append(sb5.toString());
        }
    }
}
