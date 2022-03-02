package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwq implements aizs, arne, arnb {
    public final jfo a;
    public Runnable b;
    arnh c = null;
    private final Context d;
    private final arnd e;
    private final jfp f;
    private final List g = new ArrayList();
    private long h = 0;
    private boolean i = false;

    private aiwq(Context context, arnd arnd) {
        this.d = context;
        this.e = arnd;
        jfp jfp = new jfp("CCC_Handler", 10);
        this.f = jfp;
        jfp.start();
        this.a = new jfo(this.f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.aiwq a(defpackage.arnf r4, android.content.Context r5) {
        /*
            java.lang.Class<aiwq> r0 = defpackage.aiwq.class
            monitor-enter(r0)
            axyb r1 = defpackage.axyb.a     // Catch:{ all -> 0x002b }
            axyg r1 = r1.a()     // Catch:{ all -> 0x002b }
            boolean r1 = r1.chreCcSupported()     // Catch:{ all -> 0x002b }
            r2 = 0
            if (r1 == 0) goto L_0x0029
            arnd r4 = r4.a(r5)     // Catch:{ all -> 0x002b }
            if (r4 == 0) goto L_0x0029
            aiwq r1 = new aiwq     // Catch:{ all -> 0x002b }
            r1.<init>(r5, r4)     // Catch:{ all -> 0x002b }
            arnd r4 = r1.e     // Catch:{ all -> 0x002b }
            r2 = 5147455389092024333(0x476f6f676c00100d, double:1.3057659520462466E36)
            jfo r5 = r1.a     // Catch:{ all -> 0x002b }
            r4.a(r2, r1, r5)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            return r1
        L_0x0029:
            monitor-exit(r0)
            return r2
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwq.a(arnf, android.content.Context):aiwq");
    }

    static arky f() {
        aucd o = arky.c.o();
        aucd o2 = arkx.c.o();
        auay au = axyc.a.a().chreCcConfig().au();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arkx arkx = (arkx) o2.b;
        au.getClass();
        arkx.a |= 1;
        arkx.b = au;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arky arky = (arky) o.b;
        arkx arkx2 = (arkx) o2.i();
        arkx2.getClass();
        arky.b = arkx2;
        arky.a = 1;
        return (arky) o.i();
    }

    private final synchronized void g() {
        arnk a2;
        arnh arnh = this.c;
        if (!(arnh == null || (a2 = arnh.a(1, 1, (audx) null)) == null)) {
            a2.a(new aiwo(this));
        }
    }

    private final void h() {
        arnh arnh = this.c;
        if (arnh != null) {
            arnh.b(this);
        }
        this.c = null;
    }

    public final synchronized boolean a() {
        return this.c != null;
    }

    public final synchronized void b() {
        if (this.c != null) {
            a(f());
        }
        this.i = true;
    }

    public final synchronized void be() {
        arnh a2 = this.e.a(5147455389092024333L);
        this.c = a2;
        if (a2 != null) {
            a2.a(this, this.a);
            if (this.i) {
                a(f());
            }
        }
    }

    public final void c(int i2) {
        int i3 = i2 - 1;
        String valueOf = String.valueOf(Integer.toString(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("logPingFailed, errorCode=");
        sb.append(valueOf);
        sb.toString();
        if (axyi.b()) {
            aucd o = arec.q.o();
            aucd o2 = arfd.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arfd arfd = (arfd) o2.b;
            arfd.b = i3;
            arfd.a |= 1;
            boolean f2 = jhg.f();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arfd arfd2 = (arfd) o2.b;
            arfd2.a |= 8;
            arfd2.e = f2;
            boolean f3 = jgu.f(ihs.b());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arfd arfd3 = (arfd) o2.b;
            arfd3.a |= 16;
            arfd3.f = f3;
            arnh arnh = this.c;
            if (arnh != null) {
                int c2 = arnh.c();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arfd arfd4 = (arfd) o2.b;
                arfd4.a |= 4;
                arfd4.d = c2;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            arec arec = (arec) o.b;
            arfd arfd5 = (arfd) o2.i();
            arfd5.getClass();
            arec.h = arfd5;
            arec.a |= 128;
            a((arec) o.i(), 10);
        }
    }

    public final synchronized void d() {
        if (this.c != null) {
            aucd o = arky.c.o();
            aucd o2 = arkw.a.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arky arky = (arky) o.b;
            arkw arkw = (arkw) o2.i();
            arkw.getClass();
            arky.b = arkw;
            arky.a = 2;
            a((arky) o.i());
        }
        this.i = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0028 }
            long r2 = r7.h     // Catch:{ all -> 0x0028 }
            long r2 = r0 - r2
            axyb r4 = defpackage.axyb.a     // Catch:{ all -> 0x0028 }
            axyg r4 = r4.a()     // Catch:{ all -> 0x0028 }
            long r4 = r4.chreCcPingIntervalMillis()     // Catch:{ all -> 0x0028 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0026
            r7.h = r0     // Catch:{ all -> 0x0028 }
            arnh r0 = r7.c     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0023
            r0 = 6
            r7.c(r0)     // Catch:{ all -> 0x0028 }
            monitor-exit(r7)
            return
        L_0x0023:
            r7.g()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r7)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwq.e():void");
    }

    public final synchronized void b(int i2) {
        h();
    }

    private final void a(arec arec, int i2) {
        ahom ahom;
        if (!axyi.a.a().chreCcClearcutAccountEnabled()) {
            hoi a2 = ahol.a(this.d).a.a((audx) arec);
            a2.b(i2 - 1);
            a2.b();
            return;
        }
        Context context = this.d;
        synchronized (ahom.a) {
            if (ahom.b == null) {
                ahom.b = new ahom(context.getApplicationContext());
            }
            ahom = ahom.b;
        }
        hoi a3 = ahom.c.a((audx) arec);
        a3.b(i2 - 1);
        a3.b();
    }

    private final void a(arkn arkn, long j, long j2, int i2, boolean z, boolean z2) {
        arkn arkn2 = arkn;
        aucd o = arec.q.o();
        aucd o2 = arex.t.o();
        float f2 = arkn2.a;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arex arex = (arex) o2.b;
        int i3 = arex.a | 1;
        arex.a = i3;
        arex.b = f2;
        long j3 = arkn2.b;
        int i4 = i3 | 2;
        arex.a = i4;
        arex.c = (j2 + j3) - j;
        long j4 = arkn2.b;
        int i5 = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        arex.a = i5;
        arex.q = j4;
        float f3 = arkn2.g;
        int i6 = i5 | 4;
        arex.a = i6;
        arex.h = f3;
        float f4 = arkn2.h;
        int i7 = i6 | 8;
        arex.a = i7;
        arex.i = f4;
        float f5 = arkn2.k;
        arex.a = i7 | 16;
        arex.l = f5;
        for (int i8 = 0; i8 < arkn2.c.size(); i8++) {
            arlc arlc = (arlc) arkn2.c.get(i8);
            aucd o3 = arfg.g.o();
            long j5 = (j2 + arlc.a) - j;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            arfg arfg = (arfg) o3.b;
            int i9 = arfg.a | 1;
            arfg.a = i9;
            arfg.b = j5;
            float f6 = arlc.b;
            int i10 = i9 | 2;
            arfg.a = i10;
            arfg.c = f6;
            float f7 = arlc.c;
            int i11 = i10 | 4;
            arfg.a = i11;
            arfg.d = f7;
            float f8 = arlc.d;
            arfg.a = i11 | 8;
            arfg.e = f8;
            arfg arfg2 = (arfg) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arex arex2 = (arex) o2.b;
            arfg2.getClass();
            if (!arex2.d.a()) {
                arex2.d = aucj.a(arex2.d);
            }
            arex2.d.add(arfg2);
        }
        aucx aucx = arkn2.d;
        int size = aucx.size();
        for (int i12 = 0; i12 < size; i12++) {
            arlc arlc2 = (arlc) aucx.get(i12);
            aucd o4 = arfg.g.o();
            long j6 = (j2 + arlc2.a) - j;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            arfg arfg3 = (arfg) o4.b;
            int i13 = arfg3.a | 1;
            arfg3.a = i13;
            arfg3.b = j6;
            float f9 = arlc2.b;
            int i14 = i13 | 2;
            arfg3.a = i14;
            arfg3.c = f9;
            float f10 = arlc2.c;
            int i15 = i14 | 4;
            arfg3.a = i15;
            arfg3.d = f10;
            float f11 = arlc2.d;
            int i16 = i15 | 8;
            arfg3.a = i16;
            arfg3.e = f11;
            long j7 = arlc2.e;
            arfg3.a = i16 | 16;
            arfg3.f = j7;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arex arex3 = (arex) o2.b;
            arfg arfg4 = (arfg) o4.i();
            arfg4.getClass();
            if (!arex3.e.a()) {
                arex3.e = aucj.a(arex3.e);
            }
            arex3.e.add(arfg4);
        }
        aucx aucx2 = arkn2.e;
        int size2 = aucx2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            arlc arlc3 = (arlc) aucx2.get(i17);
            aucd o5 = arfg.g.o();
            long j8 = (j2 + arlc3.a) - j;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            arfg arfg5 = (arfg) o5.b;
            int i18 = arfg5.a | 1;
            arfg5.a = i18;
            arfg5.b = j8;
            float f12 = arlc3.b;
            int i19 = i18 | 2;
            arfg5.a = i19;
            arfg5.c = f12;
            long j9 = arlc3.e;
            arfg5.a = i19 | 16;
            arfg5.f = j9;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arex arex4 = (arex) o2.b;
            arfg arfg6 = (arfg) o5.i();
            arfg6.getClass();
            if (!arex4.f.a()) {
                arex4.f = aucj.a(arex4.f);
            }
            arex4.f.add(arfg6);
        }
        for (int i20 = 0; i20 < arkn2.f.size(); i20++) {
            arkz arkz = (arkz) arkn2.f.get(i20);
            aucd o6 = arfe.f.o();
            long j10 = (j2 + arkz.a) - j;
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            arfe arfe = (arfe) o6.b;
            int i21 = arfe.a | 1;
            arfe.a = i21;
            arfe.b = j10;
            int i22 = arkz.b;
            int i23 = i21 | 2;
            arfe.a = i23;
            arfe.c = i22;
            int i24 = arkz.c;
            int i25 = i23 | 4;
            arfe.a = i25;
            arfe.d = i24;
            float f13 = arkz.d;
            arfe.a = i25 | 8;
            arfe.e = f13;
            arfe arfe2 = (arfe) o6.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arex arex5 = (arex) o2.b;
            arfe2.getClass();
            if (!arex5.g.a()) {
                arex5.g = aucj.a(arex5.g);
            }
            arex5.g.add(arfe2);
        }
        for (int i26 = 0; i26 < arkn2.i.size(); i26++) {
            arkk arkk = (arkk) arkn2.i.get(i26);
            aucd o7 = arev.e.o();
            long j11 = (j2 + arkk.a) - j;
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            arev arev = (arev) o7.b;
            int i27 = arev.a | 1;
            arev.a = i27;
            arev.b = j11;
            int i28 = arkk.b;
            int i29 = i27 | 2;
            arev.a = i29;
            arev.c = i28;
            float f14 = arkk.c;
            arev.a = i29 | 4;
            arev.d = f14;
            arev arev2 = (arev) o7.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arex arex6 = (arex) o2.b;
            arev2.getClass();
            if (!arex6.j.a()) {
                arex6.j = aucj.a(arex6.j);
            }
            arex6.j.add(arev2);
        }
        for (int i30 = 0; i30 < arkn2.j.size(); i30++) {
            arkk arkk2 = (arkk) arkn2.j.get(i30);
            aucd o8 = arev.e.o();
            long j12 = (j2 + arkk2.a) - j;
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            arev arev3 = (arev) o8.b;
            int i31 = arev3.a | 1;
            arev3.a = i31;
            arev3.b = j12;
            int i32 = arkk2.b;
            int i33 = i31 | 2;
            arev3.a = i33;
            arev3.c = i32;
            float f15 = arkk2.c;
            arev3.a = i33 | 4;
            arev3.d = f15;
            arev arev4 = (arev) o8.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arex arex7 = (arex) o2.b;
            arev4.getClass();
            if (!arex7.k.a()) {
                arex7.k = aucj.a(arex7.k);
            }
            arex7.k.add(arev4);
        }
        for (int i34 = 0; i34 < arkn2.l.size(); i34++) {
            arkl arkl = (arkl) arkn2.l.get(i34);
            aucd o9 = arew.e.o();
            long j13 = (j2 + arkl.a) - j;
            if (o9.c) {
                o9.c();
                o9.c = false;
            }
            arew arew = (arew) o9.b;
            int i35 = arew.a | 1;
            arew.a = i35;
            arew.b = j13;
            String str = arkl.c;
            str.getClass();
            arew.a = i35 | 2;
            arew.d = str;
            for (int i36 = 0; i36 < arkl.b.size(); i36++) {
                float c2 = arkl.b.c(i36);
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                arew arew2 = (arew) o9.b;
                if (!arew2.c.a()) {
                    arew2.c = aucj.a(arew2.c);
                }
                arew2.c.a(c2);
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arex arex8 = (arex) o2.b;
            arew arew3 = (arew) o9.i();
            arew3.getClass();
            if (!arex8.o.a()) {
                arex8.o = aucj.a(arex8.o);
            }
            arex8.o.add(arew3);
        }
        arex arex9 = (arex) o2.i();
        aucd aucd = (aucd) arex9.c(5);
        aucd.a((aucj) arex9);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        arex arex10 = (arex) aucd.b;
        int i37 = arex10.a | 64;
        arex10.a = i37;
        arex10.n = i2;
        int i38 = i37 | 32;
        arex10.a = i38;
        arex10.m = z;
        arex10.a = i38 | 128;
        arex10.p = z2;
        boolean f16 = jhg.f();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        arex arex11 = (arex) aucd.b;
        arex11.a |= 512;
        arex11.r = f16;
        boolean f17 = jgu.f(ihs.b());
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        arex arex12 = (arex) aucd.b;
        arex12.a |= 1024;
        arex12.s = f17;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arec arec = (arec) o.b;
        arex arex13 = (arex) aucd.i();
        arex13.getClass();
        arec.i = arex13;
        arec.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a((arec) o.i(), 11);
    }

    private final void a(arky arky) {
        arnk a2;
        arnh arnh = this.c;
        if (arnh != null && (a2 = arnh.a(144, 1, (audx) arky)) != null) {
            try {
                int intValue = ((Integer) a2.get(1, TimeUnit.SECONDS)).intValue();
                if (intValue != 0) {
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("Failed to send message to nanoapp: request result=");
                    sb.append(intValue);
                    sb.toString();
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Failed to send message to nanoapp: ");
                } else {
                    "Failed to send message to nanoapp: ".concat(valueOf);
                }
            }
        }
    }

    public final synchronized void a(int i2) {
        h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r1 = 67
            r0.<init>(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "Battery status, scale="
            r0.append(r1)     // Catch:{ all -> 0x006d }
            r0.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = ", level="
            r0.append(r1)     // Catch:{ all -> 0x006d }
            r0.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = ", plugged="
            r0.append(r1)     // Catch:{ all -> 0x006d }
            r0.append(r8)     // Catch:{ all -> 0x006d }
            r0.toString()     // Catch:{ all -> 0x006d }
            arnh r0 = r5.c     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x006b
            boolean r1 = r5.i     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x006b
            arkm r1 = defpackage.arkm.e     // Catch:{ all -> 0x006d }
            aucd r1 = r1.o()     // Catch:{ all -> 0x006d }
            boolean r2 = r1.c     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r1.c()     // Catch:{ all -> 0x006d }
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x006d }
        L_0x003c:
            aucj r2 = r1.b     // Catch:{ all -> 0x006d }
            arkm r2 = (defpackage.arkm) r2     // Catch:{ all -> 0x006d }
            int r3 = r2.a     // Catch:{ all -> 0x006d }
            r4 = 1
            r3 = r3 | r4
            r2.a = r3     // Catch:{ all -> 0x006d }
            r2.b = r8     // Catch:{ all -> 0x006d }
            r8 = r3 | 2
            r2.a = r8     // Catch:{ all -> 0x006d }
            r2.c = r6     // Catch:{ all -> 0x006d }
            r6 = r8 | 4
            r2.a = r6     // Catch:{ all -> 0x006d }
            r2.d = r7     // Catch:{ all -> 0x006d }
            r6 = 3
            aucj r7 = r1.i()     // Catch:{ all -> 0x006d }
            arkm r7 = (defpackage.arkm) r7     // Catch:{ all -> 0x006d }
            arnk r6 = r0.a((int) r6, (int) r4, (defpackage.audx) r7)     // Catch:{ all -> 0x006d }
            if (r6 == 0) goto L_0x0069
            aiwp r7 = new aiwp     // Catch:{ all -> 0x006d }
            r7.<init>()     // Catch:{ all -> 0x006d }
            r6.a(r7)     // Catch:{ all -> 0x006d }
        L_0x0069:
            monitor-exit(r5)
            return
        L_0x006b:
            monitor-exit(r5)
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwq.a(int, int, boolean):void");
    }

    public final synchronized void a(aizr aizr) {
        if (!this.g.contains(aizr)) {
            this.g.add(aizr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5, types: [int] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final synchronized void a(defpackage.arnd r19, defpackage.arnh r20, defpackage.arnt r21) {
        /*
            r18 = this;
            r10 = r18
            r0 = r21
            monitor-enter(r18)
            if (r20 == 0) goto L_0x0027
            int r1 = r0.a     // Catch:{ all -> 0x03f4 }
            r2 = 0
            r3 = 7
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 == r6) goto L_0x02c0
            r9 = 146(0x92, float:2.05E-43)
            if (r1 == r9) goto L_0x0029
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f4 }
            r2 = 33
            r0.<init>(r2)     // Catch:{ all -> 0x03f4 }
            java.lang.String r2 = "Unknown message type: "
            r0.append(r2)     // Catch:{ all -> 0x03f4 }
            r0.append(r1)     // Catch:{ all -> 0x03f4 }
            r0.toString()     // Catch:{ all -> 0x03f4 }
        L_0x0027:
            monitor-exit(r18)
            return
        L_0x0029:
            arkr r1 = defpackage.arkr.g     // Catch:{ all -> 0x03f4 }
            java.lang.Object r1 = r1.c(r3)     // Catch:{ all -> 0x03f4 }
            auef r1 = (defpackage.auef) r1     // Catch:{ all -> 0x03f4 }
            audx r0 = r0.a(r1)     // Catch:{ all -> 0x03f4 }
            arkr r0 = (defpackage.arkr) r0     // Catch:{ all -> 0x03f4 }
            int r1 = r0.b     // Catch:{ all -> 0x03f4 }
            int r1 = defpackage.arkq.a(r1)     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            int r1 = r1 + -1
            if (r1 == r7) goto L_0x020e
            if (r1 == r6) goto L_0x020e
            r3 = 3
            if (r1 == r3) goto L_0x01f6
            if (r1 == r5) goto L_0x01d4
            r5 = 5
            if (r1 == r5) goto L_0x007f
            int r0 = r0.b     // Catch:{ all -> 0x03f4 }
            int r0 = defpackage.arkq.a(r0)     // Catch:{ all -> 0x03f4 }
            if (r0 != 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r7 = r0
        L_0x0059:
            int r7 = r7 + -1
            java.lang.String r0 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x03f4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03f4 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03f4 }
            int r1 = r1.length()     // Catch:{ all -> 0x03f4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f4 }
            int r1 = r1 + 20
            r2.<init>(r1)     // Catch:{ all -> 0x03f4 }
            java.lang.String r1 = "Unknown event type: "
            r2.append(r1)     // Catch:{ all -> 0x03f4 }
            r2.append(r0)     // Catch:{ all -> 0x03f4 }
            r2.toString()     // Catch:{ all -> 0x03f4 }
            monitor-exit(r18)
            return
        L_0x007f:
            boolean r1 = defpackage.axyi.b()     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x02be
            arku r0 = r0.f     // Catch:{ all -> 0x03f4 }
            if (r0 != 0) goto L_0x008b
            arku r0 = defpackage.arku.d     // Catch:{ all -> 0x03f4 }
        L_0x008b:
            int r1 = r20.c()     // Catch:{ all -> 0x03f4 }
            arec r5 = defpackage.arec.q     // Catch:{ all -> 0x03f4 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x03f4 }
            arfa r9 = defpackage.arfa.f     // Catch:{ all -> 0x03f4 }
            aucd r9 = r9.o()     // Catch:{ all -> 0x03f4 }
            boolean r11 = r9.c     // Catch:{ all -> 0x03f4 }
            if (r11 != 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            r9.c()     // Catch:{ all -> 0x03f4 }
            r9.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x00a5:
            aucj r11 = r9.b     // Catch:{ all -> 0x03f4 }
            arfa r11 = (defpackage.arfa) r11     // Catch:{ all -> 0x03f4 }
            int r12 = r11.a     // Catch:{ all -> 0x03f4 }
            r12 = r12 | r7
            r11.a = r12     // Catch:{ all -> 0x03f4 }
            r11.d = r1     // Catch:{ all -> 0x03f4 }
            int r1 = r0.c     // Catch:{ all -> 0x03f4 }
            int r1 = defpackage.arkt.a(r1)     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r1 = 1
        L_0x00ba:
            int r1 = r1 + -1
            int r1 = defpackage.arez.a(r1)     // Catch:{ all -> 0x03f4 }
            boolean r11 = r9.c     // Catch:{ all -> 0x03f4 }
            if (r11 != 0) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            r9.c()     // Catch:{ all -> 0x03f4 }
            r9.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x00ca:
            aucj r11 = r9.b     // Catch:{ all -> 0x03f4 }
            arfa r11 = (defpackage.arfa) r11     // Catch:{ all -> 0x03f4 }
            int r12 = r1 + -1
            if (r1 == 0) goto L_0x01d2
            r11.e = r12     // Catch:{ all -> 0x03f4 }
            int r1 = r11.a     // Catch:{ all -> 0x03f4 }
            r1 = r1 | r6
            r11.a = r1     // Catch:{ all -> 0x03f4 }
            int r1 = r0.a     // Catch:{ all -> 0x03f4 }
            if (r1 != r3) goto L_0x01a6
            arff r1 = defpackage.arff.d     // Catch:{ all -> 0x03f4 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x03f4 }
            int r2 = r0.a     // Catch:{ all -> 0x03f4 }
            if (r2 != r3) goto L_0x00ec
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x03f4 }
            arlb r2 = (defpackage.arlb) r2     // Catch:{ all -> 0x03f4 }
            goto L_0x00ee
        L_0x00ec:
            arlb r2 = defpackage.arlb.c     // Catch:{ all -> 0x03f4 }
        L_0x00ee:
            int r2 = r2.a     // Catch:{ all -> 0x03f4 }
            boolean r6 = r1.c     // Catch:{ all -> 0x03f4 }
            if (r6 != 0) goto L_0x00f5
            goto L_0x00fa
        L_0x00f5:
            r1.c()     // Catch:{ all -> 0x03f4 }
            r1.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x00fa:
            aucj r6 = r1.b     // Catch:{ all -> 0x03f4 }
            arff r6 = (defpackage.arff) r6     // Catch:{ all -> 0x03f4 }
            int r11 = r6.a     // Catch:{ all -> 0x03f4 }
            r11 = r11 | r7
            r6.a = r11     // Catch:{ all -> 0x03f4 }
            r6.b = r2     // Catch:{ all -> 0x03f4 }
            int r2 = r0.a     // Catch:{ all -> 0x03f4 }
            if (r2 != r3) goto L_0x010e
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x03f4 }
            arlb r0 = (defpackage.arlb) r0     // Catch:{ all -> 0x03f4 }
            goto L_0x0110
        L_0x010e:
            arlb r0 = defpackage.arlb.c     // Catch:{ all -> 0x03f4 }
        L_0x0110:
            aucx r0 = r0.b     // Catch:{ all -> 0x03f4 }
            int r2 = r0.size()     // Catch:{ all -> 0x03f4 }
            r6 = 0
        L_0x0117:
            if (r6 >= r2) goto L_0x018b
            java.lang.Object r11 = r0.get(r6)     // Catch:{ all -> 0x03f4 }
            arlc r11 = (defpackage.arlc) r11     // Catch:{ all -> 0x03f4 }
            arfg r12 = defpackage.arfg.g     // Catch:{ all -> 0x03f4 }
            aucd r12 = r12.o()     // Catch:{ all -> 0x03f4 }
            long r13 = r11.a     // Catch:{ all -> 0x03f4 }
            boolean r15 = r12.c     // Catch:{ all -> 0x03f4 }
            if (r15 != 0) goto L_0x012c
            goto L_0x0131
        L_0x012c:
            r12.c()     // Catch:{ all -> 0x03f4 }
            r12.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x0131:
            aucj r15 = r12.b     // Catch:{ all -> 0x03f4 }
            arfg r15 = (defpackage.arfg) r15     // Catch:{ all -> 0x03f4 }
            int r4 = r15.a     // Catch:{ all -> 0x03f4 }
            r4 = r4 | r7
            r15.a = r4     // Catch:{ all -> 0x03f4 }
            r15.b = r13     // Catch:{ all -> 0x03f4 }
            float r13 = r11.b     // Catch:{ all -> 0x03f4 }
            r4 = r4 | 2
            r15.a = r4     // Catch:{ all -> 0x03f4 }
            r15.c = r13     // Catch:{ all -> 0x03f4 }
            float r13 = r11.c     // Catch:{ all -> 0x03f4 }
            r4 = r4 | 4
            r15.a = r4     // Catch:{ all -> 0x03f4 }
            r15.d = r13     // Catch:{ all -> 0x03f4 }
            float r13 = r11.d     // Catch:{ all -> 0x03f4 }
            r4 = r4 | 8
            r15.a = r4     // Catch:{ all -> 0x03f4 }
            r15.e = r13     // Catch:{ all -> 0x03f4 }
            long r13 = r11.e     // Catch:{ all -> 0x03f4 }
            r4 = r4 | 16
            r15.a = r4     // Catch:{ all -> 0x03f4 }
            r15.f = r13     // Catch:{ all -> 0x03f4 }
            boolean r4 = r1.c     // Catch:{ all -> 0x03f4 }
            if (r4 != 0) goto L_0x0161
            goto L_0x0166
        L_0x0161:
            r1.c()     // Catch:{ all -> 0x03f4 }
            r1.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x0166:
            aucj r4 = r1.b     // Catch:{ all -> 0x03f4 }
            arff r4 = (defpackage.arff) r4     // Catch:{ all -> 0x03f4 }
            aucj r11 = r12.i()     // Catch:{ all -> 0x03f4 }
            arfg r11 = (defpackage.arfg) r11     // Catch:{ all -> 0x03f4 }
            r11.getClass()     // Catch:{ all -> 0x03f4 }
            aucx r12 = r4.c     // Catch:{ all -> 0x03f4 }
            boolean r12 = r12.a()     // Catch:{ all -> 0x03f4 }
            if (r12 != 0) goto L_0x0183
            aucx r12 = r4.c     // Catch:{ all -> 0x03f4 }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x03f4 }
            r4.c = r12     // Catch:{ all -> 0x03f4 }
        L_0x0183:
            aucx r4 = r4.c     // Catch:{ all -> 0x03f4 }
            r4.add(r11)     // Catch:{ all -> 0x03f4 }
            int r6 = r6 + 1
            goto L_0x0117
        L_0x018b:
            boolean r0 = r9.c     // Catch:{ all -> 0x03f4 }
            if (r0 != 0) goto L_0x0190
            goto L_0x0195
        L_0x0190:
            r9.c()     // Catch:{ all -> 0x03f4 }
            r9.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x0195:
            aucj r0 = r9.b     // Catch:{ all -> 0x03f4 }
            arfa r0 = (defpackage.arfa) r0     // Catch:{ all -> 0x03f4 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x03f4 }
            arff r1 = (defpackage.arff) r1     // Catch:{ all -> 0x03f4 }
            r1.getClass()     // Catch:{ all -> 0x03f4 }
            r0.c = r1     // Catch:{ all -> 0x03f4 }
            r0.b = r3     // Catch:{ all -> 0x03f4 }
        L_0x01a6:
            aucj r0 = r9.i()     // Catch:{ all -> 0x03f4 }
            arfa r0 = (defpackage.arfa) r0     // Catch:{ all -> 0x03f4 }
            boolean r1 = r5.c     // Catch:{ all -> 0x03f4 }
            if (r1 != 0) goto L_0x01b1
            goto L_0x01b6
        L_0x01b1:
            r5.c()     // Catch:{ all -> 0x03f4 }
            r5.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x01b6:
            aucj r1 = r5.b     // Catch:{ all -> 0x03f4 }
            arec r1 = (defpackage.arec) r1     // Catch:{ all -> 0x03f4 }
            r0.getClass()     // Catch:{ all -> 0x03f4 }
            r1.m = r0     // Catch:{ all -> 0x03f4 }
            int r0 = r1.a     // Catch:{ all -> 0x03f4 }
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.a = r0     // Catch:{ all -> 0x03f4 }
            aucj r0 = r5.i()     // Catch:{ all -> 0x03f4 }
            arec r0 = (defpackage.arec) r0     // Catch:{ all -> 0x03f4 }
            r1 = 16
            r10.a((defpackage.arec) r0, (int) r1)     // Catch:{ all -> 0x03f4 }
            monitor-exit(r18)
            return
        L_0x01d2:
            throw r2     // Catch:{ all -> 0x03f4 }
        L_0x01d4:
            boolean r1 = defpackage.axyi.b()     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x02be
            arkn r1 = r0.d     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x01e0
            r2 = r1
            goto L_0x01e3
        L_0x01e0:
            arkn r1 = defpackage.arkn.m     // Catch:{ all -> 0x03f4 }
            r2 = r1
        L_0x01e3:
            long r3 = r0.e     // Catch:{ all -> 0x03f4 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03f4 }
            int r7 = r20.c()     // Catch:{ all -> 0x03f4 }
            r8 = 0
            r9 = 1
            r1 = r18
            r1.a(r2, r3, r5, r7, r8, r9)     // Catch:{ all -> 0x03f4 }
            monitor-exit(r18)
            return
        L_0x01f6:
            java.util.List r0 = r10.g     // Catch:{ all -> 0x03f4 }
            int r1 = r0.size()     // Catch:{ all -> 0x03f4 }
        L_0x01fc:
            if (r8 >= r1) goto L_0x02be
            java.lang.Object r2 = r0.get(r8)     // Catch:{ all -> 0x03f4 }
            aizr r2 = (defpackage.aizr) r2     // Catch:{ all -> 0x03f4 }
            int r3 = r20.c()     // Catch:{ all -> 0x03f4 }
            r2.a((int) r3)     // Catch:{ all -> 0x03f4 }
            int r8 = r8 + 1
            goto L_0x01fc
        L_0x020e:
            int r1 = r0.a     // Catch:{ all -> 0x03f4 }
            r2 = r1 & 4
            if (r2 == 0) goto L_0x027d
            arkn r1 = r0.d     // Catch:{ all -> 0x03f4 }
            if (r1 != 0) goto L_0x021a
            arkn r1 = defpackage.arkn.m     // Catch:{ all -> 0x03f4 }
        L_0x021a:
            int r16 = r20.c()     // Catch:{ all -> 0x03f4 }
            int r2 = r0.b     // Catch:{ all -> 0x03f4 }
            int r2 = defpackage.arkq.a(r2)     // Catch:{ all -> 0x03f4 }
            if (r2 != 0) goto L_0x0229
            r17 = 0
            goto L_0x0230
        L_0x0229:
            if (r2 != r6) goto L_0x022e
            r17 = 1
            goto L_0x0230
        L_0x022e:
            r17 = 0
        L_0x0230:
            aizq r2 = new aizq     // Catch:{ all -> 0x03f4 }
            float r12 = r1.a     // Catch:{ all -> 0x03f4 }
            float r13 = r1.k     // Catch:{ all -> 0x03f4 }
            float r14 = r1.g     // Catch:{ all -> 0x03f4 }
            float r15 = r1.h     // Catch:{ all -> 0x03f4 }
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x03f4 }
            java.util.List r1 = r10.g     // Catch:{ all -> 0x03f4 }
            int r3 = r1.size()     // Catch:{ all -> 0x03f4 }
            r4 = 0
            r5 = 0
        L_0x0246:
            if (r4 >= r3) goto L_0x0256
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x03f4 }
            aizr r6 = (defpackage.aizr) r6     // Catch:{ all -> 0x03f4 }
            boolean r6 = r6.a((defpackage.aizq) r2)     // Catch:{ all -> 0x03f4 }
            r5 = r5 | r6
            int r4 = r4 + 1
            goto L_0x0246
        L_0x0256:
            boolean r1 = defpackage.axyi.b()     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x02be
            arkn r1 = r0.d     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x0262
            r2 = r1
            goto L_0x0265
        L_0x0262:
            arkn r1 = defpackage.arkn.m     // Catch:{ all -> 0x03f4 }
            r2 = r1
        L_0x0265:
            long r3 = r0.e     // Catch:{ all -> 0x03f4 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03f4 }
            int r0 = r20.c()     // Catch:{ all -> 0x03f4 }
            if (r5 != 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r8 = 1
        L_0x0273:
            r9 = 0
            r1 = r18
            r5 = r11
            r7 = r0
            r1.a(r2, r3, r5, r7, r8, r9)     // Catch:{ all -> 0x03f4 }
            monitor-exit(r18)
            return
        L_0x027d:
            r1 = r1 & r6
            if (r1 == 0) goto L_0x02be
            arko r1 = r0.c     // Catch:{ all -> 0x03f4 }
            if (r1 != 0) goto L_0x0286
            arko r1 = defpackage.arko.e     // Catch:{ all -> 0x03f4 }
        L_0x0286:
            int r16 = r20.c()     // Catch:{ all -> 0x03f4 }
            int r0 = r0.b     // Catch:{ all -> 0x03f4 }
            int r0 = defpackage.arkq.a(r0)     // Catch:{ all -> 0x03f4 }
            if (r0 != 0) goto L_0x0295
            r17 = 0
            goto L_0x029c
        L_0x0295:
            if (r0 != r6) goto L_0x029a
            r17 = 1
            goto L_0x029c
        L_0x029a:
            r17 = 0
        L_0x029c:
            aizq r0 = new aizq     // Catch:{ all -> 0x03f4 }
            float r12 = r1.a     // Catch:{ all -> 0x03f4 }
            float r13 = r1.b     // Catch:{ all -> 0x03f4 }
            float r14 = r1.c     // Catch:{ all -> 0x03f4 }
            float r15 = r1.d     // Catch:{ all -> 0x03f4 }
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x03f4 }
            java.util.List r1 = r10.g     // Catch:{ all -> 0x03f4 }
            int r2 = r1.size()     // Catch:{ all -> 0x03f4 }
        L_0x02b0:
            if (r8 >= r2) goto L_0x02be
            java.lang.Object r3 = r1.get(r8)     // Catch:{ all -> 0x03f4 }
            aizr r3 = (defpackage.aizr) r3     // Catch:{ all -> 0x03f4 }
            r3.a((defpackage.aizq) r0)     // Catch:{ all -> 0x03f4 }
            int r8 = r8 + 1
            goto L_0x02b0
        L_0x02be:
            monitor-exit(r18)
            return
        L_0x02c0:
            monitor-enter(r18)     // Catch:{ all -> 0x03f4 }
            java.lang.Runnable r1 = r10.b     // Catch:{ all -> 0x03f1 }
            if (r1 == 0) goto L_0x02cc
            jfo r4 = r10.a     // Catch:{ all -> 0x03f1 }
            r4.removeCallbacks(r1)     // Catch:{ all -> 0x03f1 }
            r10.b = r2     // Catch:{ all -> 0x03f1 }
        L_0x02cc:
            monitor-exit(r18)     // Catch:{ all -> 0x03f1 }
            arla r1 = defpackage.arla.c     // Catch:{ all -> 0x03f4 }
            java.lang.Object r1 = r1.c(r3)     // Catch:{ all -> 0x03f4 }
            auef r1 = (defpackage.auef) r1     // Catch:{ all -> 0x03f4 }
            audx r0 = r0.a(r1)     // Catch:{ all -> 0x03f4 }
            arla r0 = (defpackage.arla) r0     // Catch:{ all -> 0x03f4 }
            int r1 = r0.a     // Catch:{ all -> 0x03f4 }
            r1 = r1 & r7
            if (r1 == 0) goto L_0x03eb
            arkv r0 = r0.b     // Catch:{ all -> 0x03f4 }
            if (r0 != 0) goto L_0x02e6
            arkv r0 = defpackage.arkv.f     // Catch:{ all -> 0x03f4 }
        L_0x02e6:
            boolean r1 = defpackage.axyi.b()     // Catch:{ all -> 0x03f4 }
            if (r1 == 0) goto L_0x03e9
            arec r1 = defpackage.arec.q     // Catch:{ all -> 0x03f4 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x03f4 }
            arfd r2 = defpackage.arfd.g     // Catch:{ all -> 0x03f4 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x03f4 }
            boolean r3 = r2.c     // Catch:{ all -> 0x03f4 }
            if (r3 == 0) goto L_0x0301
            r2.c()     // Catch:{ all -> 0x03f4 }
            r2.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x0301:
            aucj r3 = r2.b     // Catch:{ all -> 0x03f4 }
            arfd r3 = (defpackage.arfd) r3     // Catch:{ all -> 0x03f4 }
            r3.b = r7     // Catch:{ all -> 0x03f4 }
            int r4 = r3.a     // Catch:{ all -> 0x03f4 }
            r4 = r4 | r7
            r3.a = r4     // Catch:{ all -> 0x03f4 }
            arfb r3 = defpackage.arfb.g     // Catch:{ all -> 0x03f4 }
            aucd r3 = r3.o()     // Catch:{ all -> 0x03f4 }
            boolean r4 = r0.a     // Catch:{ all -> 0x03f4 }
            boolean r9 = r3.c     // Catch:{ all -> 0x03f4 }
            if (r9 != 0) goto L_0x0319
            goto L_0x031e
        L_0x0319:
            r3.c()     // Catch:{ all -> 0x03f4 }
            r3.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x031e:
            aucj r9 = r3.b     // Catch:{ all -> 0x03f4 }
            arfb r9 = (defpackage.arfb) r9     // Catch:{ all -> 0x03f4 }
            int r11 = r9.a     // Catch:{ all -> 0x03f4 }
            r7 = r7 | r11
            r9.a = r7     // Catch:{ all -> 0x03f4 }
            r9.b = r4     // Catch:{ all -> 0x03f4 }
            long r11 = r0.b     // Catch:{ all -> 0x03f4 }
            r4 = r7 | 2
            r9.a = r4     // Catch:{ all -> 0x03f4 }
            r9.c = r11     // Catch:{ all -> 0x03f4 }
            int r7 = r0.c     // Catch:{ all -> 0x03f4 }
            r4 = r4 | r5
            r9.a = r4     // Catch:{ all -> 0x03f4 }
            r9.d = r7     // Catch:{ all -> 0x03f4 }
            long r11 = r0.d     // Catch:{ all -> 0x03f4 }
            r4 = r4 | 8
            r9.a = r4     // Catch:{ all -> 0x03f4 }
            r9.e = r11     // Catch:{ all -> 0x03f4 }
            long r11 = r0.e     // Catch:{ all -> 0x03f4 }
            r0 = 16
            r4 = r4 | r0
            r9.a = r4     // Catch:{ all -> 0x03f4 }
            r9.f = r11     // Catch:{ all -> 0x03f4 }
            aucj r0 = r3.i()     // Catch:{ all -> 0x03f4 }
            arfb r0 = (defpackage.arfb) r0     // Catch:{ all -> 0x03f4 }
            boolean r3 = r2.c     // Catch:{ all -> 0x03f4 }
            if (r3 != 0) goto L_0x0354
            goto L_0x0359
        L_0x0354:
            r2.c()     // Catch:{ all -> 0x03f4 }
            r2.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x0359:
            aucj r3 = r2.b     // Catch:{ all -> 0x03f4 }
            arfd r3 = (defpackage.arfd) r3     // Catch:{ all -> 0x03f4 }
            r0.getClass()     // Catch:{ all -> 0x03f4 }
            r3.c = r0     // Catch:{ all -> 0x03f4 }
            int r0 = r3.a     // Catch:{ all -> 0x03f4 }
            r0 = r0 | r6
            r3.a = r0     // Catch:{ all -> 0x03f4 }
            boolean r0 = defpackage.jhg.f()     // Catch:{ all -> 0x03f4 }
            boolean r3 = r2.c     // Catch:{ all -> 0x03f4 }
            if (r3 != 0) goto L_0x0370
            goto L_0x0375
        L_0x0370:
            r2.c()     // Catch:{ all -> 0x03f4 }
            r2.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x0375:
            aucj r3 = r2.b     // Catch:{ all -> 0x03f4 }
            arfd r3 = (defpackage.arfd) r3     // Catch:{ all -> 0x03f4 }
            int r4 = r3.a     // Catch:{ all -> 0x03f4 }
            r4 = r4 | 8
            r3.a = r4     // Catch:{ all -> 0x03f4 }
            r3.e = r0     // Catch:{ all -> 0x03f4 }
            ihs r0 = defpackage.ihs.b()     // Catch:{ all -> 0x03f4 }
            boolean r0 = defpackage.jgu.f(r0)     // Catch:{ all -> 0x03f4 }
            boolean r3 = r2.c     // Catch:{ all -> 0x03f4 }
            if (r3 != 0) goto L_0x038e
            goto L_0x0393
        L_0x038e:
            r2.c()     // Catch:{ all -> 0x03f4 }
            r2.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x0393:
            aucj r3 = r2.b     // Catch:{ all -> 0x03f4 }
            arfd r3 = (defpackage.arfd) r3     // Catch:{ all -> 0x03f4 }
            int r4 = r3.a     // Catch:{ all -> 0x03f4 }
            r6 = 16
            r4 = r4 | r6
            r3.a = r4     // Catch:{ all -> 0x03f4 }
            r3.f = r0     // Catch:{ all -> 0x03f4 }
            arnh r0 = r10.c     // Catch:{ all -> 0x03f4 }
            if (r0 == 0) goto L_0x03bd
            int r0 = r0.c()     // Catch:{ all -> 0x03f4 }
            boolean r3 = r2.c     // Catch:{ all -> 0x03f4 }
            if (r3 != 0) goto L_0x03ad
            goto L_0x03b2
        L_0x03ad:
            r2.c()     // Catch:{ all -> 0x03f4 }
            r2.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x03b2:
            aucj r3 = r2.b     // Catch:{ all -> 0x03f4 }
            arfd r3 = (defpackage.arfd) r3     // Catch:{ all -> 0x03f4 }
            int r4 = r3.a     // Catch:{ all -> 0x03f4 }
            r4 = r4 | r5
            r3.a = r4     // Catch:{ all -> 0x03f4 }
            r3.d = r0     // Catch:{ all -> 0x03f4 }
        L_0x03bd:
            boolean r0 = r1.c     // Catch:{ all -> 0x03f4 }
            if (r0 != 0) goto L_0x03c2
            goto L_0x03c7
        L_0x03c2:
            r1.c()     // Catch:{ all -> 0x03f4 }
            r1.c = r8     // Catch:{ all -> 0x03f4 }
        L_0x03c7:
            aucj r0 = r1.b     // Catch:{ all -> 0x03f4 }
            arec r0 = (defpackage.arec) r0     // Catch:{ all -> 0x03f4 }
            aucj r2 = r2.i()     // Catch:{ all -> 0x03f4 }
            arfd r2 = (defpackage.arfd) r2     // Catch:{ all -> 0x03f4 }
            r2.getClass()     // Catch:{ all -> 0x03f4 }
            r0.h = r2     // Catch:{ all -> 0x03f4 }
            int r2 = r0.a     // Catch:{ all -> 0x03f4 }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r0.a = r2     // Catch:{ all -> 0x03f4 }
            aucj r0 = r1.i()     // Catch:{ all -> 0x03f4 }
            arec r0 = (defpackage.arec) r0     // Catch:{ all -> 0x03f4 }
            r1 = 10
            r10.a((defpackage.arec) r0, (int) r1)     // Catch:{ all -> 0x03f4 }
            monitor-exit(r18)
            return
        L_0x03e9:
            monitor-exit(r18)
            return
        L_0x03eb:
            r10.c(r5)     // Catch:{ all -> 0x03f4 }
            monitor-exit(r18)
            return
        L_0x03f1:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x03f1 }
            throw r0     // Catch:{ all -> 0x03f4 }
        L_0x03f4:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x03f8
        L_0x03f7:
            throw r0
        L_0x03f8:
            goto L_0x03f7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwq.a(arnd, arnh, arnt):void");
    }
}
