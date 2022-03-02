package defpackage;

import android.location.GnssClock;
import android.location.GnssMeasurement;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: ahtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahtf implements ahuj {
    private int A = -1;
    private float B = Float.MAX_VALUE;
    private float C = Float.MAX_VALUE;
    private float D = Float.MAX_VALUE;
    private long E = Long.MAX_VALUE;
    private long F = Long.MAX_VALUE;
    private long G = Long.MAX_VALUE;
    private long H = 0;
    private final ahtg I;
    private final ahte J;
    private final aqek K;
    public final aizy a;
    public aqek b;
    public aqek c;
    public aqek d;
    private final String e;
    private final String f;
    private final String g;
    private final Integer h;
    private boolean i = false;
    private long j = 0;
    private int k = 1;
    private boolean l = false;
    private final long m;
    private final ahum n;
    private aqek o;
    private aqek p = null;
    private final ahth q;
    private final ahth r;
    private final ahth s;
    private final ahth t;
    private final ahth u;
    private final ahth v;
    private final ahth w;
    private final ahth x;
    private final ahth y;
    private int z = -1;

    public ahtf(ahum ahum, String str, String str2, Integer num, aqek aqek, aizy aizy) {
        aqek aqek2 = aqek;
        this.n = ahum;
        int i2 = ahvx.b;
        this.e = str;
        this.f = ahvx.b(str);
        this.g = str2;
        this.h = num;
        this.a = aizy;
        this.I = new ahtg();
        this.J = new ahte(this);
        if (aqek2 != null) {
            aqem aqem = ajck.ab;
            if (!amqx.a(aqek2.b, aqem)) {
                String valueOf = String.valueOf(aqem);
                String valueOf2 = String.valueOf(aqek2.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
                sb.append("Wrong protocol buffer type. Expected ");
                sb.append(valueOf);
                sb.append(" but was ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.K = aqek2;
        this.q = new ahth(this.I, ajck.bA, 8, 2, 4, 7, 8, 9, 10);
        this.r = new ahth(this.I, ajck.bB, 8, 3, 4, 7, 8, 9, 10);
        this.s = new ahth(this.I, ajck.bC, 8, 4, 4, 7, 8, 9, 10);
        this.t = new ahth(this.I, ajck.bF, 4, 11, 2, 3, 4, 5, 6);
        this.u = new ahth(this.I, ajck.bG, 4, 13, 2, 3, 4, 5, 6);
        this.v = new ahth(this.I, ajck.bH, 4, 14, 2, 3, 4, 5, 6);
        this.w = new ahth(this.I, ajck.bI, 4, 16, 2, 3, 4, 5, 6);
        this.x = new ahth(this.I, ajck.bJ, 4, 23, 5, 6, 7, 8, 9);
        this.y = new ahth(this.I, ajck.bK, 4, 17, 2, 3, 4, 5, 6);
        e();
        f();
        this.m = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private static final int a(long j2, long j3) {
        return (int) ((j3 - j2) / 1000);
    }

    private static final int b(long j2, long j3) {
        return (int) ((j3 - j2) % 1000);
    }

    private final synchronized void d() {
        ahss ahss;
        boolean a2 = this.J.a();
        boolean z2 = false;
        if (ayez.c() && amsk.a(",").c(ayez.a.a().sensorCollectionSizeLimitedPackages()).contains(this.e) && this.H + this.J.a > ayez.a.a().maxSensorTraceSizeBytes()) {
            ahum ahum = this.n;
            if (ahum == null || (ahss = ahum.h) == null) {
                a2 = true;
                z2 = true;
            } else {
                ahss.j();
                a2 = true;
                z2 = true;
            }
        }
        if (a2) {
            this.H += this.J.a;
            b();
            f();
            a(z2);
            e();
        }
    }

    private final synchronized void e() {
        this.J.b();
        this.b = new aqek(ajck.al);
        aqek aqek = new aqek(ajck.ae);
        this.o = aqek;
        aqek.b(2, (Object) ahtz.a);
        this.o.b(5, (Object) Locale.getDefault().toString());
        this.o.b(1, (Object) "1.0");
        this.o.b(11, (Object) TimeZone.getDefault().getID());
        aqek aqek2 = this.K;
        if (aqek2 != null) {
            this.o.b(10, (Object) aqek2);
        }
        this.b.b(1, (Object) this.o);
        aqek aqek3 = new aqek(ajck.af);
        aqek3.b(1, (Object) this.f);
        if (!ahvx.a(this.g)) {
            aqek aqek4 = new aqek(ajck.ag);
            aqek4.b(1, (Object) this.g);
            this.b.b(3, (Object) aqek4);
        }
        this.b.a(2, (Object) aqek3);
    }

    private final synchronized void f() {
        this.c = new aqek(ajck.ah);
        this.d = new aqek(ajck.bz);
        this.r.a();
        this.q.a();
        this.s.a();
        this.t.a();
        this.u.a();
        this.v.a();
        this.w.a();
        this.x.a();
        this.y.a();
        this.E = Long.MAX_VALUE;
        this.F = Long.MAX_VALUE;
        if (this.h != null && !this.i) {
            this.i = true;
            aqek aqek = new aqek(ajck.U);
            aqek.g(1, this.h.intValue());
            this.c.b(99, (Object) aqek);
        }
    }

    private final synchronized long g() {
        long b2 = this.m + this.I.b();
        if (b2 > this.j) {
            return b2;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = {Long.valueOf(b2), Long.valueOf(b2 + 1)};
        return this.j + 1;
    }

    public final synchronized long c() {
        return this.I.a();
    }

    private final synchronized void a(boolean z2) {
        this.j = g();
        aqek aqek = new aqek(ajck.ak);
        aqek.b(1, this.j);
        aqek.b(4, this.I.c() + this.m);
        if (z2) {
            aqek.g(3, 0);
            this.H = 0;
        } else {
            aqek.g(3, this.k);
            this.k++;
        }
        ahum ahum = this.n;
        if (ahum != null) {
            ahum.b(this.b, aqek);
            if (z2) {
                this.n.c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void b() {
        if (this.d.j(2) > 0 || this.d.j(3) > 0 || this.d.j(4) > 0 || this.d.j(5) > 0 || this.d.j(6) > 0 || this.d.j(7) > 0 || this.d.j(8) > 0 || this.d.j(10) > 0 || this.d.j(16) > 0 || this.d.j(23) > 0 || this.d.j(11) > 0 || this.d.j(13) > 0 || this.d.j(14) > 0 || this.d.j(15) > 0 || this.d.j(17) > 0 || this.d.j(12) > 0 || this.d.j(18) > 0 || this.d.j(20) > 0 || this.d.j(19) > 0 || this.d.j(24) > 0) {
            this.c.b(9, (Object) this.d);
        }
        if (this.c.c() != 0) {
            this.b.a(4, (Object) this.c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r1.z != r0) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(float r16, float r17, float r18, int r19, long r20, long r22) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            r2 = r20
            r4 = r22
            monitor-enter(r15)
            boolean r6 = r1.l     // Catch:{ all -> 0x00c8 }
            if (r6 != 0) goto L_0x00c6
            ahtg r6 = r1.I     // Catch:{ all -> 0x00c8 }
            r6.a(r4)     // Catch:{ all -> 0x00c8 }
            ahtg r6 = r1.I     // Catch:{ all -> 0x00c8 }
            r6.a(r2, r4)     // Catch:{ all -> 0x00c8 }
            aqek r6 = new aqek     // Catch:{ all -> 0x00c8 }
            aqem r7 = defpackage.ajck.bD     // Catch:{ all -> 0x00c8 }
            r8 = 9
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00c8 }
            long r9 = r1.G     // Catch:{ all -> 0x00c8 }
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0032
            ahtg r7 = r1.I     // Catch:{ all -> 0x00c8 }
            long r9 = r7.c(r2, r4)     // Catch:{ all -> 0x00c8 }
            r1.G = r9     // Catch:{ all -> 0x00c8 }
        L_0x0032:
            aqek r7 = r1.d     // Catch:{ all -> 0x00c8 }
            r9 = 1
            boolean r7 = r7.i(r9)     // Catch:{ all -> 0x00c8 }
            if (r7 != 0) goto L_0x0048
            aqek r7 = r1.d     // Catch:{ all -> 0x00c8 }
            ahtg r10 = r1.I     // Catch:{ all -> 0x00c8 }
            long r13 = r1.G     // Catch:{ all -> 0x00c8 }
            long r13 = r10.b(r2, r13)     // Catch:{ all -> 0x00c8 }
            r7.b((int) r9, (long) r13)     // Catch:{ all -> 0x00c8 }
        L_0x0048:
            aqek r7 = r1.d     // Catch:{ all -> 0x00c8 }
            r10 = 5
            boolean r7 = r7.i(r10)     // Catch:{ all -> 0x00c8 }
            if (r7 != 0) goto L_0x0060
            r7 = 10
            r6.b((int) r7, (long) r2)     // Catch:{ all -> 0x00c8 }
            r7 = 11
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r13
            r6.b((int) r7, (long) r4)     // Catch:{ all -> 0x00c8 }
        L_0x0060:
            long r4 = r1.E     // Catch:{ all -> 0x00c8 }
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x007d
            aqek r4 = r1.d     // Catch:{ all -> 0x00c8 }
            long r4 = r4.c(r9)     // Catch:{ all -> 0x00c8 }
            ahtg r7 = r1.I     // Catch:{ all -> 0x00c8 }
            long r11 = r1.G     // Catch:{ all -> 0x00c8 }
            long r11 = r7.b(r2, r11)     // Catch:{ all -> 0x00c8 }
            int r7 = a((long) r4, (long) r11)     // Catch:{ all -> 0x00c8 }
            int r4 = b(r4, r11)     // Catch:{ all -> 0x00c8 }
            goto L_0x0087
        L_0x007d:
            int r7 = a((long) r4, (long) r2)     // Catch:{ all -> 0x00c8 }
            long r4 = r1.E     // Catch:{ all -> 0x00c8 }
            int r4 = b(r4, r2)     // Catch:{ all -> 0x00c8 }
        L_0x0087:
            if (r7 == 0) goto L_0x008e
            r5 = 8
            r6.g(r5, r7)     // Catch:{ all -> 0x00c8 }
        L_0x008e:
            if (r4 != 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r6.g(r8, r4)     // Catch:{ all -> 0x00c8 }
        L_0x0095:
            r1.E = r2     // Catch:{ all -> 0x00c8 }
            aqek r2 = r1.d     // Catch:{ all -> 0x00c8 }
            int r2 = r2.j(r10)     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x00a0
            goto L_0x00a4
        L_0x00a0:
            int r2 = r1.z     // Catch:{ all -> 0x00c8 }
            if (r2 == r0) goto L_0x00aa
        L_0x00a4:
            r2 = 4
            r6.g(r2, r0)     // Catch:{ all -> 0x00c8 }
            r1.z = r0     // Catch:{ all -> 0x00c8 }
        L_0x00aa:
            r0 = r16
            r6.b((int) r9, (float) r0)     // Catch:{ all -> 0x00c8 }
            r0 = 2
            r2 = r17
            r6.b((int) r0, (float) r2)     // Catch:{ all -> 0x00c8 }
            r0 = 3
            r2 = r18
            r6.b((int) r0, (float) r2)     // Catch:{ all -> 0x00c8 }
            aqek r0 = r1.d     // Catch:{ all -> 0x00c8 }
            r0.a((int) r10, (java.lang.Object) r6)     // Catch:{ all -> 0x00c8 }
            r15.d()     // Catch:{ all -> 0x00c8 }
            monitor-exit(r15)
            return
        L_0x00c6:
            monitor-exit(r15)
            return
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtf.c(float, float, float, int, long, long):void");
    }

    public final synchronized void b(float f2, float f3, float f4, int i2, long j2, long j3) {
        synchronized (this) {
            if (!this.l) {
                aqek a2 = this.r.a(this.d, i2, j2, j3);
                float f5 = f2;
                a2.b(1, f2);
                float f6 = f3;
                a2.b(2, f3);
                float f7 = f4;
                a2.b(3, f4);
                this.d.a(3, (Object) a2);
                d();
            }
        }
    }

    public final synchronized void a() {
        if (!this.l) {
            this.l = true;
            b();
            a(true);
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public final synchronized void a(float f2, float f3, float f4, float f5) {
        aqek aqek = new aqek(ajck.bD);
        aqek.b(1, f2);
        aqek.b(2, f3);
        aqek.b(3, f4);
        aqek.b(7, f5);
        this.d.b(9, (Object) aqek);
        d();
    }

    public final synchronized void b(float f2, int i2, long j2, long j3) {
        if (!this.l) {
            aqek a2 = this.u.a(this.d, i2, j2, j3);
            a2.b(1, f2);
            this.d.a(13, (Object) a2);
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        if (r1.A != r4) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(float r17, float r18, float r19, float r20, float r21, float r22, int r23, long r24, long r26) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r26
            monitor-enter(r16)
            boolean r9 = r1.l     // Catch:{ all -> 0x0120 }
            if (r9 != 0) goto L_0x011e
            ahtg r9 = r1.I     // Catch:{ all -> 0x0120 }
            r9.a(r7)     // Catch:{ all -> 0x0120 }
            ahtg r9 = r1.I     // Catch:{ all -> 0x0120 }
            r9.a(r5, r7)     // Catch:{ all -> 0x0120 }
            aqek r9 = new aqek     // Catch:{ all -> 0x0120 }
            aqem r10 = defpackage.ajck.bD     // Catch:{ all -> 0x0120 }
            r11 = 9
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0120 }
            long r12 = r1.G     // Catch:{ all -> 0x0120 }
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x0039
            ahtg r10 = r1.I     // Catch:{ all -> 0x0120 }
            long r12 = r10.c(r5, r7)     // Catch:{ all -> 0x0120 }
            r1.G = r12     // Catch:{ all -> 0x0120 }
        L_0x0039:
            aqek r10 = r1.d     // Catch:{ all -> 0x0120 }
            r12 = 1
            boolean r10 = r10.i(r12)     // Catch:{ all -> 0x0120 }
            if (r10 != 0) goto L_0x004f
            aqek r10 = r1.d     // Catch:{ all -> 0x0120 }
            ahtg r13 = r1.I     // Catch:{ all -> 0x0120 }
            long r14 = r1.G     // Catch:{ all -> 0x0120 }
            long r13 = r13.b(r5, r14)     // Catch:{ all -> 0x0120 }
            r10.b((int) r12, (long) r13)     // Catch:{ all -> 0x0120 }
        L_0x004f:
            aqek r10 = r1.d     // Catch:{ all -> 0x0120 }
            r13 = 5
            boolean r10 = r10.i(r13)     // Catch:{ all -> 0x0120 }
            if (r10 != 0) goto L_0x0067
            r10 = 10
            r9.b((int) r10, (long) r5)     // Catch:{ all -> 0x0120 }
            r10 = 11
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r13
            r9.b((int) r10, (long) r7)     // Catch:{ all -> 0x0120 }
        L_0x0067:
            long r7 = r1.F     // Catch:{ all -> 0x0120 }
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r10 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0089
            aqek r7 = r1.d     // Catch:{ all -> 0x0120 }
            long r7 = r7.c(r12)     // Catch:{ all -> 0x0120 }
            ahtg r10 = r1.I     // Catch:{ all -> 0x0120 }
            long r13 = r1.G     // Catch:{ all -> 0x0120 }
            long r13 = r10.b(r5, r13)     // Catch:{ all -> 0x0120 }
            int r10 = a((long) r7, (long) r13)     // Catch:{ all -> 0x0120 }
            int r7 = b(r7, r13)     // Catch:{ all -> 0x0120 }
            goto L_0x0093
        L_0x0089:
            int r10 = a((long) r7, (long) r5)     // Catch:{ all -> 0x0120 }
            long r7 = r1.F     // Catch:{ all -> 0x0120 }
            int r7 = b(r7, r5)     // Catch:{ all -> 0x0120 }
        L_0x0093:
            if (r10 == 0) goto L_0x009a
            r8 = 8
            r9.g(r8, r10)     // Catch:{ all -> 0x0120 }
        L_0x009a:
            if (r7 != 0) goto L_0x009d
            goto L_0x00a1
        L_0x009d:
            r9.g(r11, r7)     // Catch:{ all -> 0x0120 }
        L_0x00a1:
            r1.F = r5     // Catch:{ all -> 0x0120 }
            aqek r5 = r1.d     // Catch:{ all -> 0x0120 }
            r6 = 12
            int r5 = r5.j(r6)     // Catch:{ all -> 0x0120 }
            r7 = 4
            if (r5 != 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            int r5 = r1.A     // Catch:{ all -> 0x0120 }
            if (r5 == r4) goto L_0x00b9
        L_0x00b3:
            r9.g(r7, r4)     // Catch:{ all -> 0x0120 }
            r1.A = r4     // Catch:{ all -> 0x0120 }
        L_0x00b9:
            r4 = r17
            r9.b((int) r12, (float) r4)     // Catch:{ all -> 0x0120 }
            r4 = 2
            r5 = r18
            r9.b((int) r4, (float) r5)     // Catch:{ all -> 0x0120 }
            r5 = 3
            r8 = r19
            r9.b((int) r5, (float) r8)     // Catch:{ all -> 0x0120 }
            aqek r8 = new aqek     // Catch:{ all -> 0x0120 }
            aqem r10 = defpackage.ajck.bE     // Catch:{ all -> 0x0120 }
            r8.<init>(r10, r7)     // Catch:{ all -> 0x0120 }
            r8.b((int) r12, (java.lang.Object) r9)     // Catch:{ all -> 0x0120 }
            aqek r9 = r1.d     // Catch:{ all -> 0x0120 }
            int r9 = r9.j(r6)     // Catch:{ all -> 0x0120 }
            if (r9 == 0) goto L_0x0104
            float r9 = r1.B     // Catch:{ all -> 0x0120 }
            float r9 = r0 - r9
            float r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0120 }
            r10 = 897988541(0x358637bd, float:1.0E-6)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x0104
            float r9 = r1.C     // Catch:{ all -> 0x0120 }
            float r9 = r2 - r9
            float r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0120 }
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x0104
            float r9 = r1.D     // Catch:{ all -> 0x0120 }
            float r9 = r3 - r9
            float r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0120 }
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0114
        L_0x0104:
            r8.b((int) r4, (float) r0)     // Catch:{ all -> 0x0120 }
            r8.b((int) r5, (float) r2)     // Catch:{ all -> 0x0120 }
            r8.b((int) r7, (float) r3)     // Catch:{ all -> 0x0120 }
            r1.B = r0     // Catch:{ all -> 0x0120 }
            r1.C = r2     // Catch:{ all -> 0x0120 }
            r1.D = r3     // Catch:{ all -> 0x0120 }
        L_0x0114:
            aqek r0 = r1.d     // Catch:{ all -> 0x0120 }
            r0.a((int) r6, (java.lang.Object) r8)     // Catch:{ all -> 0x0120 }
            r16.d()     // Catch:{ all -> 0x0120 }
            monitor-exit(r16)
            return
        L_0x011e:
            monitor-exit(r16)
            return
        L_0x0120:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtf.a(float, float, float, float, float, float, int, long, long):void");
    }

    public final synchronized void d(float f2, float f3, float f4, int i2, long j2, long j3) {
        synchronized (this) {
            if (!this.l) {
                aqek a2 = this.s.a(this.d, i2, j2, j3);
                float f5 = f2;
                a2.b(1, f2);
                float f6 = f3;
                a2.b(2, f3);
                float f7 = f4;
                a2.b(3, f4);
                this.d.a(4, (Object) a2);
                d();
            }
        }
    }

    public final synchronized void d(float f2, int i2, long j2, long j3) {
        if (!this.l) {
            aqek a2 = this.w.a(this.d, i2, j2, j3);
            a2.b(1, f2);
            this.d.a(16, (Object) a2);
            d();
        }
    }

    public final synchronized void e(float f2, int i2, long j2, long j3) {
        if (!this.l) {
            aqek a2 = this.y.a(this.d, i2, j2, j3);
            a2.b(1, f2);
            this.d.a(17, (Object) a2);
            d();
        }
    }

    public final synchronized void c(float f2, int i2, long j2, long j3) {
        if (!this.l) {
            aqek a2 = this.v.a(this.d, i2, j2, j3);
            a2.b(1, f2);
            this.d.a(14, (Object) a2);
            d();
        }
    }

    public final synchronized void a(float f2, float f3, float f4, float f5, int i2, long j2, long j3) {
        synchronized (this) {
            if (!this.l) {
                aqek a2 = this.x.a(this.d, i2, j2, j3);
                float f6 = f2;
                a2.b(1, f2);
                float f7 = f3;
                a2.b(2, f3);
                float f8 = f4;
                a2.b(3, f4);
                float f9 = f5;
                a2.b(4, f5);
                this.d.a(23, (Object) a2);
                d();
            }
        }
    }

    public final synchronized void a(float f2, float f3, float f4, int i2, long j2, long j3) {
        synchronized (this) {
            if (!this.l) {
                aqek a2 = this.q.a(this.d, i2, j2, j3);
                float f5 = f2;
                a2.b(1, f2);
                float f6 = f3;
                a2.b(3, f3);
                float f7 = f4;
                a2.b(2, f4);
                this.d.a(2, (Object) a2);
                d();
            }
        }
    }

    public final synchronized void a(float f2, int i2, long j2, long j3) {
        if (!this.l) {
            aqek a2 = this.t.a(this.d, i2, j2, j3);
            a2.b(1, f2);
            this.d.a(11, (Object) a2);
            d();
        }
    }

    public final void a(int i2, int i3) {
        if (this.o.h(12)) {
            this.p = this.o.e(12);
        } else {
            aqek aqek = new aqek(ajck.ac);
            this.p = aqek;
            this.o.b(12, (Object) aqek);
        }
        this.p.g(3, i2);
        this.p.g(4, i3);
    }

    public final void a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 < 0 || i2 > 9) {
            z2 = false;
        } else {
            z2 = true;
        }
        amrl.a(z2, (Object) String.format(Locale.ENGLISH, "Audio source: %d is not valid.", new Object[]{Integer.valueOf(i2)}));
        if (this.o.h(12)) {
            this.p = this.o.e(12);
        } else {
            aqek aqek = new aqek(ajck.ac);
            this.p = aqek;
            this.o.b(12, (Object) aqek);
        }
        this.p.g(1, i2);
        this.p.g(2, i3);
        this.p.g(5, i4);
    }

    public final void a(int i2, int i3, long j2) {
        if (!this.l) {
            this.I.a(j2);
            aqek aqek = new aqek(ajck.bQ);
            aqek.g(3, (int) (j2 - c()));
            aqek.g(1, i2);
            aqek.g(2, i3);
            this.d.a(21, (Object) aqek);
            d();
        }
    }

    public final void a(int i2, long j2) {
        if (!this.l) {
            this.I.a(j2);
            aqek aqek = new aqek(ajck.bO, 2);
            aqek.g(1, i2);
            aqek.g(2, (int) (j2 - c()));
            this.d.a(18, (Object) aqek);
            d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r8, java.lang.String r9, android.telephony.CellLocation r10, int r11, long r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.l     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a5
            ahtg r0 = r7.I     // Catch:{ all -> 0x00a7 }
            r0.a(r12)     // Catch:{ all -> 0x00a7 }
            r0 = 3
            r1 = -1
            if (r9 != 0) goto L_0x0011
            r9 = -1
            r2 = -1
            goto L_0x002b
        L_0x0011:
            int r2 = r9.length()     // Catch:{ all -> 0x00a7 }
            if (r2 <= r0) goto L_0x0029
            r2 = 0
            java.lang.String r2 = r9.substring(r2, r0)     // Catch:{ all -> 0x00a7 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = r9.substring(r0)     // Catch:{ all -> 0x00a7 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ all -> 0x00a7 }
            goto L_0x002b
        L_0x0029:
            r9 = -1
            r2 = -1
        L_0x002b:
            if (r10 != 0) goto L_0x0030
            r10 = -1
            r3 = -1
            goto L_0x0054
        L_0x0030:
            boolean r3 = r10 instanceof android.telephony.gsm.GsmCellLocation     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x003f
            android.telephony.gsm.GsmCellLocation r10 = (android.telephony.gsm.GsmCellLocation) r10     // Catch:{ all -> 0x00a7 }
            int r3 = r10.getLac()     // Catch:{ all -> 0x00a7 }
            int r10 = r10.getCid()     // Catch:{ all -> 0x00a7 }
            goto L_0x0054
        L_0x003f:
            boolean r3 = r10 instanceof android.telephony.cdma.CdmaCellLocation     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0052
            android.telephony.cdma.CdmaCellLocation r10 = (android.telephony.cdma.CdmaCellLocation) r10     // Catch:{ all -> 0x00a7 }
            int r9 = r10.getSystemId()     // Catch:{ all -> 0x00a7 }
            int r3 = r10.getNetworkId()     // Catch:{ all -> 0x00a7 }
            int r10 = r10.getBaseStationId()     // Catch:{ all -> 0x00a7 }
            goto L_0x0054
        L_0x0052:
            r10 = -1
            r3 = -1
        L_0x0054:
            aqek r4 = new aqek     // Catch:{ all -> 0x00a7 }
            aqem r5 = defpackage.ajck.Q     // Catch:{ all -> 0x00a7 }
            r4.<init>(r5)     // Catch:{ all -> 0x00a7 }
            aqek r5 = new aqek     // Catch:{ all -> 0x00a7 }
            aqem r6 = defpackage.ajck.P     // Catch:{ all -> 0x00a7 }
            r5.<init>(r6)     // Catch:{ all -> 0x00a7 }
            r6 = 1
            r5.g(r6, r3)     // Catch:{ all -> 0x00a7 }
            r3 = 2
            r5.g(r3, r10)     // Catch:{ all -> 0x00a7 }
            r5.g(r0, r9)     // Catch:{ all -> 0x00a7 }
            r9 = 4
            r5.g(r9, r2)     // Catch:{ all -> 0x00a7 }
            r10 = 5
            r5.g(r10, r11)     // Catch:{ all -> 0x00a7 }
            r11 = 12
            if (r8 == r11) goto L_0x0085
            r11 = 15
            if (r8 == r11) goto L_0x0083
            switch(r8) {
                case 1: goto L_0x0082;
                case 2: goto L_0x0082;
                case 3: goto L_0x0083;
                case 4: goto L_0x0085;
                case 5: goto L_0x0085;
                case 6: goto L_0x0085;
                case 7: goto L_0x0085;
                case 8: goto L_0x0083;
                case 9: goto L_0x0083;
                case 10: goto L_0x0083;
                default: goto L_0x0080;
            }     // Catch:{ all -> 0x00a7 }
        L_0x0080:
            r0 = -1
            goto L_0x0086
        L_0x0082:
            goto L_0x0086
        L_0x0083:
            r0 = 5
            goto L_0x0086
        L_0x0085:
            r0 = 4
        L_0x0086:
            if (r0 >= 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r8 = 10
            r5.g(r8, r0)     // Catch:{ all -> 0x00a7 }
        L_0x008e:
            r4.b((int) r6, (java.lang.Object) r5)     // Catch:{ all -> 0x00a7 }
            long r8 = r7.c()     // Catch:{ all -> 0x00a7 }
            long r12 = r12 - r8
            r4.b((int) r3, (long) r12)     // Catch:{ all -> 0x00a7 }
            aqek r8 = r7.d     // Catch:{ all -> 0x00a7 }
            r9 = 6
            r8.a((int) r9, (java.lang.Object) r4)     // Catch:{ all -> 0x00a7 }
            r7.d()     // Catch:{ all -> 0x00a7 }
            monitor-exit(r7)
            return
        L_0x00a5:
            monitor-exit(r7)
            return
        L_0x00a7:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtf.a(int, java.lang.String, android.telephony.CellLocation, int, long):void");
    }

    public final void a(int i2, long[] jArr, float[][] fArr) {
        throw new UnsupportedOperationException("addAllSensorSnapshot() cannot be called from GLocRequestComposer.");
    }

    public final void a(aizo aizo, int i2, long j2) {
        if (!this.l) {
            this.I.a(j2);
            int c2 = (int) (j2 - c());
            aqek aqek = new aqek(ajck.bP);
            aqek.b(1, (Object) aizo.a());
            aqek.b(10, (Object) aizo.b());
            aqek.g(2, 0);
            aqek.g(5, aizo.d());
            aqek.g(8, i2);
            aqek.b(6, (Object) aizo.c());
            aqek.g(3, aizo.e());
            aqek.g(4, aizo.f());
            String[] g2 = aizo.g();
            if (g2 != null) {
                for (String a2 : g2) {
                    aqek.a(7, (Object) a2);
                }
            }
            aqek.g(9, c2);
            this.d.a(20, (Object) aqek);
            d();
        }
    }

    public final synchronized void a(GnssMeasurementsEvent gnssMeasurementsEvent, long j2) {
        Iterator<GnssMeasurement> it;
        long j3 = j2;
        synchronized (this) {
            if (!this.l && gnssMeasurementsEvent != null) {
                this.I.a(j3);
                if (Build.VERSION.SDK_INT >= 24) {
                    aqek aqek = new aqek(ajck.bw);
                    GnssClock clock = gnssMeasurementsEvent.getClock();
                    aqek aqek2 = new aqek(ajck.bu);
                    int i2 = 1;
                    if (clock.hasLeapSecond()) {
                        aqek2.g(1, clock.getLeapSecond());
                    }
                    int i3 = 2;
                    aqek2.b(2, clock.getTimeNanos());
                    if (clock.hasTimeUncertaintyNanos()) {
                        aqek2.b(10, clock.getTimeUncertaintyNanos());
                    }
                    int i4 = 4;
                    if (clock.hasFullBiasNanos()) {
                        aqek2.b(4, clock.getFullBiasNanos());
                    }
                    if (clock.hasBiasNanos()) {
                        aqek2.b(5, clock.getBiasNanos());
                    }
                    if (clock.hasBiasUncertaintyNanos()) {
                        aqek2.b(6, clock.getBiasUncertaintyNanos());
                    }
                    if (clock.hasDriftNanosPerSecond()) {
                        aqek2.b(7, clock.getDriftNanosPerSecond());
                    }
                    if (clock.hasDriftUncertaintyNanosPerSecond()) {
                        aqek2.b(8, clock.getDriftUncertaintyNanosPerSecond());
                    }
                    double hardwareClockDiscontinuityCount = (double) clock.getHardwareClockDiscontinuityCount();
                    int i5 = 9;
                    aqek2.b(9, hardwareClockDiscontinuityCount);
                    aqek.b(2, (Object) aqek2);
                    Iterator<GnssMeasurement> it2 = gnssMeasurementsEvent.getMeasurements().iterator();
                    while (it2.hasNext()) {
                        GnssMeasurement next = it2.next();
                        aqek aqek3 = new aqek(ajck.bv);
                        aqek3.g(i2, next.getSvid());
                        aqek3.g(i3, next.getConstellationType());
                        aqek3.b(3, next.getTimeOffsetNanos());
                        aqek3.g(i4, next.getState());
                        aqek3.b(5, next.getReceivedSvTimeNanos());
                        aqek3.b(6, next.getReceivedSvTimeUncertaintyNanos());
                        aqek3.b(7, next.getCn0DbHz());
                        aqek3.b(8, next.getPseudorangeRateMetersPerSecond());
                        aqek3.b(i5, next.getPseudorangeRateUncertaintyMetersPerSecond());
                        if (next.getAccumulatedDeltaRangeState() != 0) {
                            aqek3.g(10, next.getAccumulatedDeltaRangeState());
                            it = it2;
                            aqek3.b(11, next.getAccumulatedDeltaRangeMeters());
                            aqek3.b(12, next.getAccumulatedDeltaRangeUncertaintyMeters());
                        } else {
                            it = it2;
                        }
                        if (next.hasCarrierFrequencyHz()) {
                            aqek3.b(13, next.getCarrierFrequencyHz());
                        }
                        if (next.hasCarrierCycles()) {
                            aqek3.b(14, next.getCarrierCycles());
                        }
                        if (next.hasCarrierPhase()) {
                            aqek3.b(15, next.getCarrierPhase());
                        }
                        if (next.hasCarrierPhaseUncertainty()) {
                            aqek3.b(16, next.getCarrierPhaseUncertainty());
                        }
                        aqek3.g(17, next.getMultipathIndicator());
                        if (next.hasSnrInDb()) {
                            aqek3.b(18, next.getSnrInDb());
                        }
                        aqek.a(1, (Object) aqek3);
                        it2 = it;
                        i5 = 9;
                        i3 = 2;
                        i2 = 1;
                        i4 = 4;
                    }
                    aqek aqek4 = new aqek(ajck.bx);
                    aqek4.g(1, (int) (j3 - c()));
                    aqek4.b(3, (Object) aqek);
                    this.d.a(19, (Object) aqek4);
                    d();
                }
            }
        }
    }

    public final synchronized void a(GnssNavigationMessage gnssNavigationMessage, long j2) {
        if (!this.l && gnssNavigationMessage != null) {
            this.I.a(j2);
        }
    }

    public final synchronized void a(GpsStatus gpsStatus, long j2) {
        if (!this.l) {
            this.I.a(j2);
            Iterable<GpsSatellite> satellites = gpsStatus.getSatellites();
            aqek aqek = new aqek(ajck.bt);
            aqek.g(1, (int) (j2 - c()));
            for (GpsSatellite next : satellites) {
                aqek aqek2 = new aqek(ajck.bs);
                aqek2.b(4, next.getAzimuth());
                aqek2.b(3, next.getElevation());
                aqek2.g(1, next.getPrn());
                aqek2.b(2, next.getSnr());
                aqek.a(2, (Object) aqek2);
            }
            this.d.a(10, (Object) aqek);
            d();
        }
    }

    public final synchronized void a(Location location, long j2) {
        if (location != null) {
            aqek aqek = new aqek(ajck.X);
            aqek aqek2 = new aqek(ajck.O);
            aqek2.g(1, aell.b(location.getLatitude()));
            aqek2.g(2, aell.b(location.getLongitude()));
            aqek.b(1, (Object) aqek2);
            if (location.hasAccuracy()) {
                aqek.g(3, (int) location.getAccuracy());
            }
            if (location.hasAltitude()) {
                aqek.g(10, (int) location.getAltitude());
            }
            if (location.hasBearing()) {
                aqek.g(13, (int) location.getBearing());
            }
            if (location.hasSpeed()) {
                aqek.b(16, location.getSpeed());
            }
            aqek.g(8, 0);
            a(aqek, j2);
        }
    }

    public final synchronized void a(aqek aqek, long j2) {
        if (!this.l) {
            this.I.a(j2);
            aqek.b(6, j2 - c());
            this.d.a(8, (Object) aqek);
            d();
        }
    }

    public final synchronized void a(List list, List list2, long j2) {
        aibv aibv;
        long j3 = j2;
        synchronized (this) {
            if (!this.l && !list.isEmpty()) {
                this.I.a(j3);
                aqek aqek = new aqek(ajck.N);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ScanResult scanResult = (ScanResult) it.next();
                    long a2 = arvy.a(scanResult.BSSID);
                    if (a2 != -1) {
                        aqek a3 = aibu.a(Long.valueOf(a2));
                        a3.g(9, scanResult.level);
                        aibu.a(a3, scanResult.frequency);
                        String str = scanResult.BSSID;
                        aqek aqek2 = null;
                        if (list2 != null) {
                            long a4 = arvy.a(str);
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                aibv = (aibv) it2.next();
                                if (a4 == aibv.a) {
                                    break;
                                }
                            }
                        }
                        aibv = null;
                        if (aibv != null) {
                            aqek aqek3 = new aqek(ajck.L);
                            if (aibv.b == 0 && aibv.a != -1) {
                                aqek3.g(1, aibv.g);
                                aqek3.b(2, aibv.a);
                                aqek3.b(3, (System.currentTimeMillis() * 1000) + aibv.c);
                                aqek3.g(7, aibv.e);
                                aqek3.g(8, aibv.f);
                                aqek3.g(10, aibv.d);
                                aqek3.g(13, aibv.h);
                                aqek3.g(14, aibv.i);
                                aqek2 = aqek3;
                            }
                            a3.a(19, (Object) aqek2);
                        }
                        aqek.a(2, (Object) a3);
                    }
                }
                aqek.b(1, j3 - c());
                this.d.a(7, (Object) aqek);
                d();
            }
        }
    }

    public final synchronized void a(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long j2) {
        if (!this.l) {
            this.I.a(j2);
            aqek aqek = new aqek(ajck.bL, 6);
            for (double a2 : dArr) {
                aqek.a(1, a2);
            }
            for (double a3 : dArr2) {
                aqek.a(2, a3);
            }
            for (double a4 : dArr3) {
                aqek.a(3, a4);
            }
            for (double a5 : dArr4) {
                aqek.a(4, a5);
            }
            for (double a6 : dArr5) {
                aqek.a(5, a6);
            }
            aqek.g(6, (int) (j2 - c()));
            this.d.a(15, (Object) aqek);
            d();
        }
    }

    public final void a(float[] fArr, long j2, int i2) {
        boolean z2;
        amrl.a((Object) this.p);
        amrl.a(this.p.h(5));
        amrl.a(this.p.h(4));
        int length = fArr.length;
        if (length % i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.a(z2);
        if (!this.l) {
            if (!this.o.h(12)) {
                this.o.b(12, (Object) this.p);
            }
            this.I.a(j2);
            aqek aqek = new aqek(ajck.bM);
            int i3 = length / i2;
            for (int i4 = 0; i4 < i2; i4++) {
                aqek aqek2 = new aqek(ajck.bN);
                for (int i5 = 0; i5 < i3; i5++) {
                    aqek2.a(1, fArr[(i2 * i5) + i4]);
                }
                aqek.a(1, (Object) aqek2);
            }
            aqek.a(2, (int) (j2 - c()));
            this.d.a(24, (Object) aqek);
            d();
        }
    }
}
