package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Locale;

/* renamed from: ahwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwu extends ahwp {
    boolean A = false;
    final ahws B;
    long C = -1;
    aiwz D = null;
    public aiwz E = null;
    private long F = 480000;
    public long k = 0;
    long l = -1;
    int m = 0;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    aiaj q = null;
    aibt r = null;
    ActivityRecognitionResult s = null;
    public final ahwt t = new ahwt((int) axxy.b());
    aqek u;
    boolean v = false;
    long w = -1;
    boolean x = false;
    long y = -1;
    boolean z = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahwu(ajbd ajbd, aizy aizy, ajbg ajbg, ahqq ahqq, ajbx ajbx, ajph ajph, ahwm ahwm, aizk aizk) {
        super("BurstCollector", ajbd, aizy, ajbg, ahqq, ajbx, ajph, ahwm, ahwo.IDLE);
        this.B = new ahws(ajbd, aizy, ajbg, ajbx, ahqq.c, aizk);
    }

    private final boolean h(long j) {
        long burstCollectorMinIdleTimeOnBatteryMillis = axxy.a.a().burstCollectorMinIdleTimeOnBatteryMillis();
        if (this.o) {
            burstCollectorMinIdleTimeOnBatteryMillis = this.F;
        }
        long j2 = this.l;
        return j2 == -1 || j - j2 > burstCollectorMinIdleTimeOnBatteryMillis;
    }

    private final void i() {
        if (this.x) {
            this.d.a(ajbe.BURST_COLLECTOR);
            this.x = false;
            this.d.c(ajbe.BURST_COLLECTOR);
        }
    }

    private final void j(long j) {
        if (this.j == ahwo.GPS_WAIT || this.j == ahwo.UPLOAD_WAIT) {
            aiwz aiwz = this.E;
            if (aiwz != null) {
                aiwz aiwz2 = this.D;
                if (aiwz2 != null) {
                    if (ahwp.a(aiwz, aiwz2, 25)) {
                        this.m++;
                    } else {
                        aiwz = this.E;
                    }
                }
                this.D = aiwz;
                this.m = 1;
            }
            this.l = j;
        }
        this.E = null;
        this.k = 0;
        this.j = ahwo.IDLE;
        this.u = null;
        this.A = false;
        this.C = -1;
        this.y = -1;
        this.z = false;
        this.d.a(ajbe.BURST_COLLECTOR);
    }

    public final void a(int i, int i2, boolean z2) {
        double burstCollectorMinBatteryLevel = axxy.a.a().burstCollectorMinBatteryLevel();
        float a = ajqz.a(i, i2);
        boolean z3 = false;
        if (a >= 0.0f) {
            this.n = z2 || ((double) a) >= burstCollectorMinBatteryLevel;
            this.o = z2 && ((double) a) >= 0.9d;
        }
        this.p = z2;
        ahws ahws = this.B;
        double burstCollectionTriggerMinBatteryLevel = axxy.a.a().burstCollectionTriggerMinBatteryLevel();
        float a2 = ajqz.a(i, i2);
        if (a2 >= 0.0f) {
            double d = (double) a2;
            if (!z2 ? d >= burstCollectionTriggerMinBatteryLevel : d >= 0.20000000298023224d) {
                z3 = true;
            }
            ahws.d = z3;
        }
        ahws.a();
    }

    public final void a(aibt aibt) {
        this.r = aibt;
    }

    public final void a(aqek aqek) {
        this.u = null;
    }

    public final void b(boolean z2) {
        this.B.a();
    }

    public final void c(boolean z2) {
    }

    public final void d() {
        super.d();
        ahws ahws = this.B;
        ahws.e = false;
        ahws.a();
    }

    public final void e(boolean z2) {
        this.v = z2;
        ahws ahws = this.B;
        ahws.b = z2;
        ahws.a();
    }

    /* access modifiers changed from: protected */
    public final boolean f(long j) {
        if (this.u == null || !a()) {
            j(j);
            this.w = -1;
            i();
            return true;
        } else if (j - this.w < 15000) {
            this.d.a(ajbe.BURST_COLLECTOR, this.w + 15000, (aizx) null);
            return false;
        } else {
            i();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fb, code lost:
        if (r6.a(r7, r5) != false) goto L_0x01fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(long r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            ahwt r3 = r0.t
            aiwz r3 = r3.a()
            boolean r4 = r25.i(r26)
            r9 = 0
            if (r4 != 0) goto L_0x015f
            ahws r4 = r0.B
            r4.b()
            ahwt r4 = r0.t
            boolean r10 = r0.z
            aizy r11 = r0.c
            long r21 = r11.d()
            long r11 = r0.k
            boolean r15 = r0.p
            ajbd r13 = r0.b
            ajbj r13 = r13.m()
            int r23 = r13.a()
            aiwz r14 = r0.D
            r13 = 0
        L_0x0031:
            java.util.ArrayList r5 = r4.a
            int r5 = r5.size()
            r6 = -1
            if (r13 >= r5) goto L_0x004d
            java.util.ArrayList r5 = r4.a
            java.lang.Object r5 = r5.get(r13)
            aiwz r5 = (defpackage.aiwz) r5
            long r7 = r5.b
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x004b
            int r13 = r13 + 1
            goto L_0x0031
        L_0x004b:
            r5 = r13
            goto L_0x004e
        L_0x004d:
            r5 = -1
        L_0x004e:
            if (r5 == r6) goto L_0x00e9
            aqek r7 = new aqek
            aqem r8 = defpackage.ajck.al
            r7.<init>(r8)
            r8 = 0
        L_0x0058:
            java.util.ArrayList r11 = r4.a
            int r11 = r11.size()
            if (r8 >= r11) goto L_0x00e8
            java.util.ArrayList r11 = r4.a
            java.lang.Object r11 = r11.get(r8)
            aiwz r11 = (defpackage.aiwz) r11
            java.util.HashMap r12 = r4.b
            java.lang.Object r12 = r12.get(r11)
            r16 = r12
            aiaj r16 = (defpackage.aiaj) r16
            java.util.HashMap r12 = r4.c
            java.lang.Object r12 = r12.get(r11)
            r17 = r12
            aibt r17 = (defpackage.aibt) r17
            java.util.HashMap r12 = r4.d
            java.lang.Object r12 = r12.get(r11)
            r18 = r12
            com.google.android.gms.location.ActivityRecognitionResult r18 = (com.google.android.gms.location.ActivityRecognitionResult) r18
            if (r8 >= r5) goto L_0x008d
            r12 = 17
            r19 = 17
            goto L_0x00c7
        L_0x008d:
            if (r8 == r5) goto L_0x00bd
            java.util.ArrayList r13 = r4.a
            int r13 = r13.size()
            int r13 = r13 + r6
            if (r8 == r13) goto L_0x009d
            r12 = 8
            r19 = 8
            goto L_0x00c7
        L_0x009d:
            if (r14 == 0) goto L_0x00ba
            java.util.ArrayList r13 = r4.a
            int r19 = r13.size()
            int r12 = r19 + -1
            java.lang.Object r12 = r13.get(r12)
            aiwz r12 = (defpackage.aiwz) r12
            r13 = 25
            boolean r12 = defpackage.ahwp.a((defpackage.aiwz) r12, (defpackage.aiwz) r14, (int) r13)
            if (r12 == 0) goto L_0x00ba
            r12 = 10
            r19 = 10
            goto L_0x00c7
        L_0x00ba:
            r19 = 9
            goto L_0x00c7
        L_0x00bd:
            if (r10 != 0) goto L_0x00c3
            r12 = 6
            r19 = 6
            goto L_0x00c7
        L_0x00c3:
            r12 = 19
            r19 = 19
        L_0x00c7:
            r12 = 4
            r6 = 4
            r12 = r21
            r24 = r14
            r14 = r11
            r11 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r11
            r20 = r23
            aqek r12 = defpackage.ahwp.a(r12, r14, r15, r16, r17, r18, r19, r20)
            r7.a((int) r6, (java.lang.Object) r12)
            int r8 = r8 + 1
            r15 = r11
            r14 = r24
            r6 = -1
            goto L_0x0058
        L_0x00e8:
            goto L_0x00ea
        L_0x00e9:
            r7 = 0
        L_0x00ea:
            r0.u = r7
            if (r7 == 0) goto L_0x0139
            ajph r4 = r0.f
            aizy r5 = r0.c
            r4.a(r5, r7)
            ajbd r4 = r0.b
            aita r4 = (defpackage.aita) r4
            ajqs r4 = r4.r()
            ajbx r5 = r0.g
            r4.a(r7, r5)
            java.util.Locale r4 = java.util.Locale.ENGLISH
            r5 = 1
            java.lang.Object[] r4 = new java.lang.Object[r5]
            ahwt r5 = r0.t
            java.util.ArrayList r5 = r5.a
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r9] = r5
            ahwo r4 = defpackage.ahwo.UPLOAD_WAIT
            r0.j = r4
            ajbg r4 = r0.d
            ajbe r5 = defpackage.ajbe.BURST_COLLECTOR
            r6 = 60000(0xea60, double:2.9644E-319)
            r8 = 0
            r4.b(r5, r6, r8)
            r4 = 1
            r0.x = r4
            aizy r4 = r0.c
            long r4 = r4.c()
            r0.w = r4
            ahwt r4 = r0.t
            aiwz r4 = r4.a()
            r0.E = r4
            r4 = 1
            goto L_0x013a
        L_0x0139:
            r4 = 0
        L_0x013a:
            ahwt r5 = r0.t
            java.util.ArrayList r6 = r5.a
            r6.clear()
            java.util.HashMap r6 = r5.b
            r6.clear()
            java.util.HashMap r6 = r5.c
            r6.clear()
            java.util.HashMap r6 = r5.d
            r6.clear()
            r6 = 0
            r5.e = r6
            if (r4 != 0) goto L_0x015c
            r25.j(r26)
            r8 = 1
            goto L_0x025c
        L_0x015c:
            r8 = 1
            goto L_0x025c
        L_0x015f:
            boolean r4 = r0.A
            if (r4 == 0) goto L_0x025b
            ahwt r4 = r0.t
            aiwz r5 = r4.a()
            ahwm r6 = r0.i
            aiaj r7 = r0.q
            aibt r8 = r0.r
            com.google.android.gms.location.ActivityRecognitionResult r10 = r0.s
            if (r5 == 0) goto L_0x025b
            long r11 = defpackage.axxy.b()
            if (r10 == 0) goto L_0x0197
            boolean r13 = defpackage.ayag.c()
            if (r13 == 0) goto L_0x0197
            boolean r13 = defpackage.ahwp.a((com.google.android.gms.location.ActivityRecognitionResult) r10, (defpackage.aiwz) r5)
            if (r13 == 0) goto L_0x0197
            long r13 = r4.e
            long r13 = r1 - r13
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 < 0) goto L_0x0197
            java.util.HashMap r13 = r4.d
            boolean r13 = r13.containsKey(r5)
            if (r13 != 0) goto L_0x0197
            r13 = 1
            goto L_0x0198
        L_0x0197:
            r13 = 0
        L_0x0198:
            if (r8 == 0) goto L_0x01de
            boolean r14 = defpackage.ahwp.a((defpackage.aibt) r8, (defpackage.aiwz) r5)
            if (r14 == 0) goto L_0x01de
            long r14 = r4.e
            long r14 = r1 - r14
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x01de
            java.util.HashMap r14 = r4.c
            boolean r14 = r14.containsKey(r5)
            if (r14 != 0) goto L_0x01de
            java.util.HashMap r14 = r4.b
            boolean r14 = r14.containsKey(r5)
            if (r14 != 0) goto L_0x01de
            int r14 = r8.b()
            if (r14 == 0) goto L_0x01de
            int r14 = r6.a((defpackage.aibt) r8, (long) r1)
            double r14 = (double) r14
            int r9 = r8.b()
            r17 = r8
            double r8 = (double) r9
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r8)
            double r14 = r14 / r8
            r8 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r18 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r18 > 0) goto L_0x01dc
            r8 = 0
            goto L_0x01e1
        L_0x01dc:
            r8 = 1
            goto L_0x01e1
        L_0x01de:
            r17 = r8
            r8 = 0
        L_0x01e1:
            if (r7 == 0) goto L_0x01fd
            java.util.HashMap r9 = r4.b
            boolean r9 = r9.containsKey(r5)
            if (r9 != 0) goto L_0x01fd
            long r14 = r4.e
            long r14 = r1 - r14
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x01f5
            r7 = 0
            goto L_0x01fe
        L_0x01f5:
            if (r8 != 0) goto L_0x01fe
            boolean r9 = r6.a((defpackage.aiaj) r7, (defpackage.aiwz) r5)
            if (r9 == 0) goto L_0x01fe
        L_0x01fd:
            r7 = 0
        L_0x01fe:
            if (r8 == 0) goto L_0x0203
            r9 = r17
            goto L_0x0204
        L_0x0203:
            r9 = 0
        L_0x0204:
            if (r13 != 0) goto L_0x0208
            r10 = 0
            goto L_0x0209
        L_0x0208:
        L_0x0209:
            if (r7 == 0) goto L_0x021e
            java.util.HashMap r11 = r4.b
            r11.put(r5, r7)
            java.util.Locale r11 = java.util.Locale.ENGLISH
            r12 = 1
            java.lang.Object[] r11 = new java.lang.Object[r12]
            long r12 = r7.g
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 0
            r11[r13] = r12
        L_0x021e:
            if (r9 == 0) goto L_0x0233
            java.util.HashMap r11 = r4.c
            r11.put(r5, r9)
            java.util.Locale r11 = java.util.Locale.ENGLISH
            r12 = 1
            java.lang.Object[] r11 = new java.lang.Object[r12]
            long r12 = r9.a
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 0
            r11[r13] = r12
        L_0x0233:
            if (r10 == 0) goto L_0x0248
            java.util.HashMap r11 = r4.d
            r11.put(r5, r10)
            java.util.Locale r11 = java.util.Locale.ENGLISH
            r12 = 1
            java.lang.Object[] r11 = new java.lang.Object[r12]
            long r12 = r10.c
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 0
            r11[r13] = r12
        L_0x0248:
            if (r9 == 0) goto L_0x024b
            goto L_0x024f
        L_0x024b:
            if (r7 != 0) goto L_0x024f
            if (r10 == 0) goto L_0x0251
        L_0x024f:
            r4.e = r1
        L_0x0251:
            r6.a(r5, r7, r9)
            if (r8 == 0) goto L_0x0259
            r4 = 0
            r0.r = r4
        L_0x0259:
            r8 = 0
            goto L_0x025c
        L_0x025b:
            r8 = 0
        L_0x025c:
            ahwo r4 = r0.j
            ahwo r5 = defpackage.ahwo.GPS_WAIT
            if (r4 != r5) goto L_0x028d
            long r4 = r0.y
            r6 = -1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x027f
            long r4 = defpackage.axxy.b()
            r6 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4 + r6
            ajbg r6 = r0.d
            ajbe r7 = defpackage.ajbe.BURST_COLLECTOR
            if (r3 == 0) goto L_0x0279
            long r1 = r3.b
        L_0x0279:
            long r1 = r1 + r4
            r3 = 0
            r6.a(r7, r1, r3)
            goto L_0x028d
        L_0x027f:
            r3 = 0
            ajbg r1 = r0.d
            ajbe r2 = defpackage.ajbe.BURST_COLLECTOR
            long r4 = r0.y
            r6 = 60000(0xea60, double:2.9644E-319)
            long r4 = r4 + r6
            r1.a(r2, r4, r3)
        L_0x028d:
            r1 = 0
            r0.A = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwu.c(long):boolean");
    }

    private final boolean i(long j) {
        boolean z2;
        boolean z3;
        if (!ahxc.a(2) || !a()) {
            return false;
        }
        ahwo ahwo = ahwo.OFF;
        int ordinal = this.j.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                long j2 = this.y;
                if (j2 != -1) {
                    z2 = j - j2 >= 60000;
                } else {
                    aiwz a = this.t.a();
                    if (a != null) {
                        if (j - a.b >= axxy.b() + 10000) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (j - this.k >= axxy.a.a().burstCollectorMaxBurstTimeMillis()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!this.b.l().bf() || z2 || z3) {
                    Locale locale = Locale.ENGLISH;
                    Object[] objArr = {Boolean.valueOf(z2), Boolean.valueOf(z3)};
                    return false;
                }
            } else if (ordinal != 5) {
                return false;
            } else {
                return true;
            }
        }
        if (!this.v || !this.n) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b(long j) {
        long j2;
        ActivityRecognitionResult activityRecognitionResult;
        long j3 = j;
        aiwz a = this.t.a();
        boolean z2 = false;
        if (i(j)) {
            long j4 = this.C;
            if (j4 != -1 && j3 - j4 <= 60000 && axxv.a.a().burstCollectorActiveModeEnabled()) {
                this.C = -1;
                ahws ahws = this.B;
                if (ahws.r != 4 || !ahws.a.l().bf()) {
                    this.B.b();
                } else {
                    ahws.g = true;
                    ahws.a();
                    this.y = j3;
                    this.z = true;
                    z2 = true;
                }
            } else if (h(j) && a != null) {
                long j5 = a.b;
                if (j3 - j5 < 30000) {
                    aiwz aiwz = this.i.c;
                    if (aiwz != null) {
                        j2 = aiwz.b;
                    } else {
                        j2 = -1;
                    }
                    if (j5 > j2 && axxv.a.a().burstCollectorPassiveModeEnabled() && (!axxv.a.a().burstCollectorPassiveModeActivityCheckEnabled() || ((activityRecognitionResult = this.s) != null && activityRecognitionResult.a().a() == 0))) {
                        this.y = -1;
                        this.z = false;
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = {Long.valueOf(j), Long.valueOf(a.b)};
                        z2 = true;
                    }
                }
            }
            if (z2) {
                this.j = ahwo.GPS_WAIT;
                this.k = j3;
            }
        }
        long j6 = this.C;
        if (((j6 != -1 && j3 - j6 > 60000) || !ahxc.a(2)) && !z2) {
            this.C = -1;
            this.B.b();
        }
        return z2;
    }

    public final void d(boolean z2) {
        ahws ahws = this.B;
        ahws.c = z2;
        ahws.a();
    }

    public final void a(ahqp ahqp) {
        StringBuilder sb = new StringBuilder(27);
        sb.append("Idle time collection: false");
        sb.toString();
        this.B.a();
        this.F = ((long) ahqp.j()) * 1000;
        Locale locale = Locale.ENGLISH;
        new Object[1][0] = Long.valueOf(this.F);
    }

    public final void a(aiaj aiaj) {
        if (aiaj == null || !aiaj.e()) {
            this.q = null;
        } else {
            this.q = aiaj;
        }
    }

    public final void a(aiwz aiwz) {
        if (aiwz != null && a()) {
            this.e.c.r();
            boolean h = h(this.c.c());
            if ((this.j == ahwo.IDLE && h) || this.j == ahwo.GPS_WAIT) {
                aiwz aiwz2 = this.D;
                if (aiwz2 == null || !ahwp.a(aiwz2, aiwz, 25) || this.m < 2) {
                    ahwt ahwt = this.t;
                    if (ahwt.a.size() <= 1) {
                        ahwt.a.add(aiwz);
                        Locale locale = Locale.ENGLISH;
                        new Object[1][0] = Long.valueOf(aiwz.b);
                    } else {
                        int size = ahwt.a.size();
                        int i = size - 1;
                        aiwz aiwz3 = (aiwz) ahwt.a.get(i);
                        long j = aiwz3.b;
                        long j2 = j - ((aiwz) ahwt.a.get(size - 2)).b;
                        long j3 = aiwz.b - j;
                        if ((j2 + j3 <= ((long) (ahwt.f + 500)) || (j2 >= 60000 && j3 >= 60000)) && !ahwt.b.containsKey(aiwz3) && !ahwt.c.containsKey(aiwz3) && !ahwt.d.containsKey(aiwz3)) {
                            ahwt.a(i);
                        }
                        ahwt.a.add(aiwz);
                        Locale locale2 = Locale.ENGLISH;
                        new Object[1][0] = Long.valueOf(aiwz.b);
                    }
                    if (ahwt.a.size() > 100) {
                        ahwt.a(0);
                    }
                    this.A = true;
                    this.y = -1;
                }
            }
        }
    }

    public final void a(ajbe ajbe) {
        ahws ahws = this.B;
        if (ajbe == ajbe.BURST_COLLECTION_TRIGGER) {
            ahws.a();
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        if (activityRecognitionResult != null && activityRecognitionResult.b().a() != 5) {
            this.s = activityRecognitionResult;
            ahws ahws = this.B;
            int i = ahws.r;
            if (i == 2 || i == 3 || i == 4) {
                int a = activityRecognitionResult.a().a();
                ahws.i = a;
                if (a == 0) {
                    ahws.h = true;
                }
                ahws.a();
            }
        }
    }

    public final void a(Object obj) {
        if (this.j == ahwo.IDLE) {
            this.C = this.c.c();
        } else {
            this.B.b();
        }
    }

    public final void a(boolean z2) {
        this.h = z2;
        ahws ahws = this.B;
        ahws.q = z2;
        ahws.a();
    }
}
