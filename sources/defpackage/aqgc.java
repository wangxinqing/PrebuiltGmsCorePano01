package defpackage;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aqgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqgc extends aqfd {
    static final long b = TimeUnit.SECONDS.toNanos(60);
    static final long c = TimeUnit.SECONDS.toNanos(60);
    static final long d = TimeUnit.MINUTES.toNanos(2);
    private static final Long e = Long.MIN_VALUE;
    private static final List f = Arrays.asList(new aqgf[]{aqgf.STILL, aqgf.ON_FOOT, aqgf.UNKNOWN});
    private static final long g = e.longValue();
    private static final long h = e.longValue();
    private static final long i = e.longValue();
    private final aqgg j;
    private final aqgg k;
    private final boolean l;
    private boolean m;
    private long n;
    private int o;
    private long p;
    private long q;
    private float r;
    private final int s;
    private aqfq t;

    public aqgc(aqgg aqgg, aqgg aqgg2, boolean z, int i2) {
        this.j = aqgg;
        this.k = aqgg2;
        this.l = z;
        this.s = i2;
        this.a = new aqgg[]{aqgg, aqgg2};
        c();
    }

    private final boolean a(long j2) {
        long j3 = this.p;
        return j3 != h && j2 <= j3 + d;
    }

    private final aqgg e() {
        return (!f() || this.j.a() == null) ? this.k : this.j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f() {
        /*
            r11 = this;
            aqgg r0 = r11.k
            aqey r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L_0x0075
            aqgg r0 = r11.k
            long r2 = r0.b()
            boolean r0 = r11.a(r2)
            r4 = 1
            if (r0 != 0) goto L_0x003b
            boolean r0 = r11.m
            if (r0 == 0) goto L_0x003b
            long r5 = r11.n
            long r7 = g
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            long r5 = r2 - r5
            long r7 = b
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x003b
            long r5 = r11.p
            long r7 = h
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            long r7 = d
            long r5 = r5 + r7
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
        L_0x0039:
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            boolean r5 = r11.l
            if (r5 == 0) goto L_0x0074
            float r5 = r11.r
            r6 = 1
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            long r7 = r11.q
            long r9 = i
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0074
        L_0x004f:
            float r5 = r11.r
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x006d
            long r6 = r11.q
            long r8 = i
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x006d
            int r8 = r11.s
            float r8 = (float) r8
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x006d
            long r2 = r2 - r6
            long r5 = c
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x006d
            r2 = 1
            goto L_0x006e
        L_0x006d:
            r2 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x0073
            if (r2 == 0) goto L_0x0073
            return r4
        L_0x0073:
            return r1
        L_0x0074:
            return r0
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqgc.f():boolean");
    }

    public final void a(long j2, float f2, float f3) {
    }

    public final long b() {
        return e().b();
    }

    public final void c() {
        this.m = false;
        this.o = 0;
        this.n = g;
        this.p = h;
        this.q = i;
        this.r = Float.MIN_VALUE;
        this.t = null;
        this.j.c();
        this.k.c();
        super.c();
    }

    public int a(long j2, int i2) {
        int i3;
        if (f()) {
            i3 = e().a(j2, i2) | this.j.a(j2, i2);
        } else {
            i3 = this.k.a(j2, i2);
        }
        return !a(j2) ? i3 | 16 : i3;
    }

    public final aqey a() {
        return e().a();
    }

    public final void a(long j2, aqey aqey) {
        if (aqey.a() && aqey.d() && aqey.e > 5.0f) {
            this.p = j2;
        }
        super.a(j2, aqey);
    }

    public final void a(long j2, aqfq aqfq) {
        if (this.l) {
            int i2 = aqfq.a;
            if (i2 == 0 || aqfq.c.length == 0) {
                int i3 = this.o + 1;
                this.o = i3;
                if (i3 <= 3) {
                    return;
                }
            } else {
                this.o = 0;
            }
            this.q = j2;
            this.t = aqfq;
            float f2 = 0.0f;
            if (i2 >= 5) {
                float[] fArr = aqfq.c;
                if (fArr.length >= 5) {
                    f2 = fArr[4];
                }
            }
            float f3 = this.r;
            if (f3 != Float.MIN_VALUE) {
                f2 = (f2 * 0.050000012f) + (f3 * 0.95f);
            }
            this.r = f2;
            super.a(j2, aqfq);
        }
    }

    public final void a(long j2, aqgf aqgf) {
        super.a(j2, aqgf);
        this.m = f.contains(aqgf);
        this.n = j2;
    }

    public final void a(long j2, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("PedestrianSwitchingFusion:");
        long j3 = this.n;
        if (j3 != g) {
            boolean z = this.m;
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append(" activity{time(ns)=");
            sb2.append(j3);
            sb2.append(", activity=");
            sb2.append(z);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long j4 = this.p;
        if (j4 != h) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append(" lastHighSpeedTime(ns)=");
            sb3.append(j4);
            sb.append(sb3.toString());
        }
        if (this.q != i) {
            aqfq aqfq = this.t;
            String aqfq2 = aqfq != null ? aqfq.toString() : "null";
            long j5 = this.q;
            String format = String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(this.r)});
            StringBuilder sb4 = new StringBuilder(String.valueOf(format).length() + 66 + String.valueOf(aqfq2).length());
            sb4.append(" snr{time(ns)=");
            sb4.append(j5);
            sb4.append(", filteredSnr=");
            sb4.append(format);
            sb4.append(", lastGpsStatus=");
            sb4.append(aqfq2);
            sb4.append("} ");
            sb.append(sb4.toString());
        }
        boolean f2 = f();
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append(" pedestrianFusion:");
        sb5.append(f2);
        sb.append(sb5.toString());
        printWriter.println(sb);
        e().a(j2, printWriter);
    }
}
