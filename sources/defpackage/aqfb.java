package defpackage;

import java.io.PrintWriter;

/* renamed from: aqfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfb implements aqgg {
    public final long a;
    public final long b;
    public aqey c = null;
    public long d = 0;
    public aqey e = null;
    public long f = 0;
    public final long g;
    public String h = null;
    public String i = null;
    public long j = 0;

    public aqfb(long j2, long j3, long j4) {
        this.a = j2;
        this.b = j3;
        this.g = j4;
    }

    static aqey a(aqey aqey, aqey aqey2) {
        if (!aqey2.f()) {
            return aqey;
        }
        aqew j2 = aqey.j();
        j2.a(aqey2.g);
        if (!aqey2.g()) {
            j2.j = 0.0d;
            j2.n &= -17;
        } else {
            j2.b(aqey2.h);
        }
        return j2.a();
    }

    public final int a(long j2, int i2) {
        return 0;
    }

    public final void a(long j2, float f2, float f3) {
    }

    public final void a(long j2, aqfq aqfq) {
    }

    public final void a(long j2, aqgf aqgf) {
    }

    public final long b() {
        throw new UnsupportedOperationException("AlititudeFilter does not support estimating positions and their time.");
    }

    public final void c() {
        this.c = null;
        this.d = 0;
        this.e = null;
        this.f = 0;
        this.h = null;
        this.i = null;
        this.j = 0;
    }

    public final void d() {
        c();
    }

    public final aqey a() {
        throw new UnsupportedOperationException("AltitudeFilter does not support estimating positions and their time.");
    }

    public final void a(long j2, aqey aqey) {
        String str;
        if (aqey.b() && aqey.f()) {
            this.c = aqey;
            this.d = j2;
        }
        if (aqey.a() && aqey.f()) {
            this.e = aqey;
            this.f = j2;
        }
        if (this.g > 0 && (str = aqey.k) != null) {
            this.h = str;
            this.i = aqey.i;
            this.j = j2;
        }
    }

    public final void a(long j2, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("AltitudeFilter");
        if (this.c != null) {
            sb.append(" wifi{");
            sb.append(this.d);
            sb.append("}");
        }
        if (this.e != null) {
            sb.append(" gps{");
            sb.append(this.f);
            sb.append("}");
        }
        if (this.h != null) {
            sb.append(" floor{");
            sb.append(this.j);
            sb.append("}");
        }
    }
}
