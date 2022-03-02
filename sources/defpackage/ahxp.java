package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.PrintWriter;

/* renamed from: ahxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxp extends ahwp {
    public boolean A = false;
    public boolean B = false;
    final aizk C;
    long D = -1;
    public aqek E;
    long F = -1;
    aiwz G;
    private int H;
    private int I;
    private int J;
    public boolean k;
    boolean l;
    public aiaj m = null;
    aibt n = null;
    boolean o = false;
    long p = -1;
    public aibt q = null;
    ActivityRecognitionResult r = null;
    public boolean s = false;
    aqek t;
    long u = -1;
    boolean v = false;
    int w;
    int x;
    public boolean y = false;
    public boolean z = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahxp(ajbd ajbd, aizy aizy, ajbg ajbg, ahqq ahqq, ajbx ajbx, aizk aizk, ajph ajph, ahwm ahwm) {
        super("PassiveCollector", ajbd, aizy, ajbg, ahqq, ajbx, ajph, ahwm, ahwo.IDLE);
        aizk aizk2 = aizk;
        this.C = aizk2;
        if (ayag.c()) {
            aizk2.a(Long.MAX_VALUE, true);
        }
    }

    private final void a(int i, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        aiwz aiwz;
        aiaj aiaj;
        ActivityRecognitionResult activityRecognitionResult;
        aibt aibt;
        if (z3) {
            this.o = !z2;
            this.n = this.q;
        }
        if (z2) {
            aiwz = this.G;
        } else {
            aiwz = null;
        }
        if (z4) {
            aiaj = this.m;
        } else {
            aiaj = null;
        }
        if (z5) {
            activityRecognitionResult = this.r;
        } else {
            activityRecognitionResult = null;
        }
        if (z3) {
            aibt = this.q;
        } else {
            aibt = null;
        }
        if (aiaj != null) {
            this.J++;
        }
        if (aibt != null) {
            this.w++;
        }
        if (aiwz != null) {
            this.x++;
        }
        aqek a = ahwp.a(this.c.d(), aiwz, aiaj, aibt, activityRecognitionResult, this.l, i, this.b.m().a());
        this.i.a(aiwz, aiaj, aibt);
        if (this.E == null) {
            this.E = new aqek(ajck.al);
            this.F = j;
        }
        if (z3 && z4 && !z2) {
            long c = this.c.c() + 1000;
            this.p = c;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Non gps collections will be throttled until ");
            sb.append(c);
            sb.toString();
        }
        amrl.a((Object) this.E);
        this.E.a(4, (Object) a);
        if (z5) {
            this.r = null;
        }
    }

    private final boolean h(long j) {
        int i;
        long j2;
        aqek aqek = this.E;
        if (aqek != null) {
            i = aqek.j(4);
        } else {
            i = 0;
        }
        if (i > 10) {
            j2 = 900000;
        } else {
            j2 = 1800000;
        }
        aqek aqek2 = this.E;
        if (aqek2 == null || !aqek2.i(4)) {
            return false;
        }
        return i >= 30 || j - this.F >= j2;
    }

    private final void i() {
        int i;
        if (a()) {
            this.d.b(ajbe.PASSIVE_COLLECTOR, 60000, (aizx) null);
            this.j = ahwo.UPLOAD_WAIT;
            int i2 = this.I;
            aqek aqek = this.E;
            if (aqek != null) {
                i = aqek.j(4);
            } else {
                i = 0;
            }
            this.I = i2 + i;
            aqek aqek2 = this.E;
            this.t = aqek2;
            amrl.a((Object) aqek2);
            this.f.a(this.c, aqek2);
            ((aita) this.b).r().a(aqek2, this.g);
            this.F = -1;
            this.v = true;
            long c = this.c.c();
            this.u = c;
            i(c + 15000);
            this.H++;
        }
        this.E = null;
    }

    private final void j() {
        if (this.v) {
            this.d.a(ajbe.PASSIVE_COLLECTOR);
            this.D = -1;
            this.v = false;
            this.d.c(ajbe.PASSIVE_COLLECTOR);
        }
    }

    private final void k() {
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
    }

    public final void a(aqek aqek) {
        this.t = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0273, code lost:
        if (r3 == false) goto L_0x0296;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(long r28) {
        /*
            r27 = this;
            r8 = r27
            boolean r0 = r27.a()
            r9 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            if (r0 != 0) goto L_0x0011
            r27.k()
            return r9
        L_0x0011:
            boolean r0 = r27.h(r28)
            r10 = 1
            if (r0 != 0) goto L_0x02a3
            aibt r0 = r8.q
            if (r0 == 0) goto L_0x0028
            long r2 = r0.a
            ahwm r0 = r8.i
            long r4 = r0.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            aiaj r2 = r8.m
            if (r2 == 0) goto L_0x0039
            long r2 = r2.g
            ahwm r4 = r8.i
            long r4 = r4.b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            r2 = 0
            goto L_0x003a
        L_0x0039:
            r2 = 1
        L_0x003a:
            boolean r3 = r8.y
            if (r3 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r8.y = r9
            r3 = 0
        L_0x0044:
            boolean r4 = r8.z
            if (r4 == 0) goto L_0x004c
            if (r2 == 0) goto L_0x004c
            r8.z = r9
        L_0x004c:
            if (r0 != 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            if (r2 == 0) goto L_0x0057
            boolean r0 = r8.B
            if (r0 == 0) goto L_0x0057
            r8.B = r9
        L_0x0057:
            ayeb r0 = defpackage.ayeb.a
            ayec r0 = r0.a()
            boolean r0 = r0.passiveCollectorEnableWifiChangeUpload()
            r0 = r0 & r3
            r8.y = r0
            boolean r0 = r8.z
            ayeb r2 = defpackage.ayeb.a
            ayec r2 = r2.a()
            boolean r2 = r2.passiveCollectorEnableCellChangeUpload()
            r0 = r0 & r2
            r8.z = r0
            boolean r0 = r8.B
            ayeb r2 = defpackage.ayeb.a
            ayec r2 = r2.a()
            boolean r2 = r2.passiveCollectorEnableMovedTooFarChangeUpload()
            r0 = r0 & r2
            r8.B = r0
            boolean r2 = r8.y
            if (r2 == 0) goto L_0x0087
            goto L_0x0091
        L_0x0087:
            boolean r3 = r8.z
            if (r3 != 0) goto L_0x0091
            if (r0 != 0) goto L_0x0091
            boolean r3 = r8.A
            if (r3 == 0) goto L_0x02a1
        L_0x0091:
            r3 = -1
            r4 = 2
            if (r2 != 0) goto L_0x00ab
            boolean r2 = r8.A
            if (r2 != 0) goto L_0x00a8
            if (r0 != 0) goto L_0x00a3
            boolean r0 = r8.z
            if (r0 == 0) goto L_0x00a1
            r2 = 1
            goto L_0x00ac
        L_0x00a1:
            r2 = -1
            goto L_0x00ac
        L_0x00a3:
            r0 = 11
            r2 = 11
            goto L_0x00ac
        L_0x00a8:
            r0 = 4
            r2 = 4
            goto L_0x00ac
        L_0x00ab:
            r2 = 2
        L_0x00ac:
            if (r2 == r3) goto L_0x02a1
            aizy r0 = r8.c
            long r5 = r0.c()
            aiwz r0 = r8.G
            if (r0 == 0) goto L_0x00c5
            long r11 = r0.b
            long r11 = r5 - r11
            r13 = 720000(0xafc80, double:3.557273E-318)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00c5
            r7 = 1
            goto L_0x00c6
        L_0x00c5:
            r7 = 0
        L_0x00c6:
            com.google.android.gms.location.ActivityRecognitionResult r0 = r8.r
            if (r0 == 0) goto L_0x00da
            boolean r3 = defpackage.ayag.c()
            if (r3 == 0) goto L_0x00da
            aiwz r3 = r8.G
            boolean r0 = defpackage.ahwp.a((com.google.android.gms.location.ActivityRecognitionResult) r0, (defpackage.aiwz) r3)
            if (r0 == 0) goto L_0x00da
            r11 = 1
            goto L_0x00db
        L_0x00da:
            r11 = 0
        L_0x00db:
            aibt r0 = r8.q
            r3 = 0
            if (r0 != 0) goto L_0x00e1
            goto L_0x012d
        L_0x00e1:
            aiwz r12 = r8.G
            if (r12 == 0) goto L_0x012d
            long r14 = r12.b
            long r12 = r0.a
            aizk r0 = r8.C
            ahix r0 = (defpackage.ahix) r0
            ahzs r0 = r0.ay
            r18 = 2000(0x7d0, double:9.88E-321)
            r20 = r12
            r13 = r0
            r22 = r14
            r16 = r20
            java.lang.Boolean r12 = r13.a(r14, r16, r18)
            r18 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Boolean r24 = r13.b(r14, r16, r18)
            r18 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Boolean r0 = r13.c(r14, r16, r18)
            if (r12 != 0) goto L_0x010c
        L_0x010a:
            r0 = r3
            goto L_0x012f
        L_0x010c:
            if (r24 != 0) goto L_0x010f
            goto L_0x010a
        L_0x010f:
            if (r0 == 0) goto L_0x012b
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0125
            boolean r12 = r24.booleanValue()
            if (r12 != 0) goto L_0x0125
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0125
            r0 = 0
            goto L_0x0126
        L_0x0125:
            r0 = 1
        L_0x0126:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x012f
        L_0x012b:
            r0 = r3
            goto L_0x012f
        L_0x012d:
            r0 = r1
        L_0x012f:
            aibt r12 = r8.q
            if (r12 != 0) goto L_0x0137
            r4 = r7
            r12 = 0
            r13 = 0
            goto L_0x0173
        L_0x0137:
            if (r2 == r4) goto L_0x015a
            boolean r4 = r8.o
            if (r4 != 0) goto L_0x0141
        L_0x013d:
            r4 = r7
            r12 = 0
            r13 = 0
            goto L_0x0173
        L_0x0141:
            if (r7 != 0) goto L_0x0144
            goto L_0x013d
        L_0x0144:
            aiwz r4 = r8.G
            boolean r4 = defpackage.ahwp.a((defpackage.aibt) r12, (defpackage.aiwz) r4)
            if (r4 == 0) goto L_0x0156
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = r4.equals(r0)
            r0 = r0 ^ r10
            r12 = r0
            r4 = r7
            goto L_0x015e
        L_0x0156:
            r4 = r7
            r12 = 0
            r13 = 0
            goto L_0x0173
        L_0x015a:
            if (r0 != 0) goto L_0x0160
            r4 = r7
            r12 = 1
        L_0x015e:
            r13 = 1
            goto L_0x0173
        L_0x0160:
            if (r7 == 0) goto L_0x0165
            r0.booleanValue()
        L_0x0165:
            if (r7 == 0) goto L_0x016f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x016f
            r0 = 1
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            r4 = r0
            r12 = 1
            r13 = 1
        L_0x0173:
            aiaj r0 = r8.m
            if (r0 != 0) goto L_0x0178
            goto L_0x01ca
        L_0x0178:
            aiwz r14 = r8.G
            if (r14 == 0) goto L_0x01ca
            long r9 = r0.g
            long r14 = r14.b
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ca
            aizk r0 = r8.C
            ahix r0 = (defpackage.ahix) r0
            ahzs r0 = r0.ay
            r20 = 20000(0x4e20, double:9.8813E-320)
            r24 = r14
            r15 = r0
            r16 = r24
            r18 = r9
            java.lang.Boolean r14 = r15.a(r16, r18, r20)
            r20 = 80000(0x13880, double:3.95253E-319)
            java.lang.Boolean r26 = r15.b(r16, r18, r20)
            r20 = 200000(0x30d40, double:9.8813E-319)
            java.lang.Boolean r0 = r15.c(r16, r18, r20)
            if (r14 != 0) goto L_0x01a9
        L_0x01a7:
            r0 = r3
            goto L_0x01cc
        L_0x01a9:
            if (r26 != 0) goto L_0x01ac
            goto L_0x01a7
        L_0x01ac:
            if (r0 == 0) goto L_0x01c8
            boolean r9 = r14.booleanValue()
            if (r9 != 0) goto L_0x01c2
            boolean r9 = r26.booleanValue()
            if (r9 != 0) goto L_0x01c2
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01c2
            r0 = 0
            goto L_0x01c3
        L_0x01c2:
            r0 = 1
        L_0x01c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01cc
        L_0x01c8:
            r0 = r3
            goto L_0x01cc
        L_0x01ca:
            r0 = r1
        L_0x01cc:
            aibt r9 = r8.q
            aiaj r10 = r8.m
            if (r9 != 0) goto L_0x01d3
            goto L_0x0220
        L_0x01d3:
            if (r10 == 0) goto L_0x0220
            long r14 = r10.g
            long r9 = r9.a
            int r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r16 <= 0) goto L_0x0220
            aizk r1 = r8.C
            ahix r1 = (defpackage.ahix) r1
            ahzs r1 = r1.ay
            r19 = 2000(0x7d0, double:9.88E-321)
            r24 = r14
            r14 = r1
            r15 = r9
            r17 = r24
            java.lang.Boolean r21 = r14.a(r15, r17, r19)
            r19 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Boolean r26 = r14.b(r15, r17, r19)
            r19 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Boolean r1 = r14.c(r15, r17, r19)
            if (r21 != 0) goto L_0x01ff
        L_0x01fd:
            r1 = r3
            goto L_0x0222
        L_0x01ff:
            if (r26 != 0) goto L_0x0202
            goto L_0x01fd
        L_0x0202:
            if (r1 == 0) goto L_0x021e
            boolean r3 = r21.booleanValue()
            if (r3 != 0) goto L_0x0218
            boolean r3 = r26.booleanValue()
            if (r3 != 0) goto L_0x0218
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0218
            r1 = 0
            goto L_0x0219
        L_0x0218:
            r1 = 1
        L_0x0219:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0222
        L_0x021e:
            r1 = r3
            goto L_0x0222
        L_0x0220:
        L_0x0222:
            aiaj r3 = r8.m
            if (r3 == 0) goto L_0x0259
            ahwm r9 = r8.i
            aiwz r10 = r8.G
            boolean r3 = r9.a((defpackage.aiaj) r3, (defpackage.aiwz) r10)
            if (r12 == 0) goto L_0x023a
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x023a
            r0 = 1
            goto L_0x024a
        L_0x023a:
            if (r4 == 0) goto L_0x0249
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0245
            goto L_0x0249
        L_0x0245:
            if (r3 != 0) goto L_0x0249
            r0 = 1
            goto L_0x024a
        L_0x0249:
            r0 = 0
        L_0x024a:
            if (r13 == 0) goto L_0x024f
            r9 = r0
            r10 = 1
            goto L_0x025b
        L_0x024f:
            if (r7 != 0) goto L_0x0254
        L_0x0251:
            r9 = r0
            r10 = 0
            goto L_0x025b
        L_0x0254:
            if (r3 != 0) goto L_0x0251
            r9 = r0
            r10 = 1
            goto L_0x025b
        L_0x0259:
            r9 = 0
            r10 = 0
        L_0x025b:
            int r0 = r4 + r12
            int r0 = r0 + r9
            int r1 = r7 + r13
            int r1 = r1 + r10
            boolean r3 = r8.a(r2, r4, r12, r9)
            boolean r14 = r8.a(r2, r7, r13, r10)
            ahqq r15 = r8.e
            ahqp r15 = r15.c
            boolean r15 = r15.g()
            if (r15 == 0) goto L_0x0276
            if (r3 != 0) goto L_0x027b
            goto L_0x0296
        L_0x0276:
            if (r0 < r1) goto L_0x0286
            if (r3 != 0) goto L_0x027b
            goto L_0x0286
        L_0x027b:
            r0 = r27
            r1 = r2
            r2 = r5
            r5 = r12
            r6 = r9
            r7 = r11
            r0.a(r1, r2, r4, r5, r6, r7)
            goto L_0x0293
        L_0x0286:
            if (r14 == 0) goto L_0x0296
            r0 = r27
            r1 = r2
            r2 = r5
            r4 = r7
            r5 = r13
            r6 = r10
            r7 = r11
            r0.a(r1, r2, r4, r5, r6, r7)
        L_0x0293:
            r27.k()
        L_0x0296:
            boolean r0 = r27.h(r28)
            if (r0 == 0) goto L_0x02a1
            r27.i()
            r0 = 1
            return r0
        L_0x02a1:
            r0 = 0
            return r0
        L_0x02a3:
            r0 = 1
            r27.i()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxp.b(long):boolean");
    }

    public final void e(boolean z2) {
        this.s = z2;
    }

    /* access modifiers changed from: protected */
    public final boolean f(long j) {
        if (this.t != null && a()) {
            long j2 = this.u;
            if (j - j2 < 15000) {
                i(j2 + 15000);
                return false;
            }
            j();
            return false;
        }
        j();
        this.u = -1;
        this.j = ahwo.IDLE;
        return true;
    }

    private final void i(long j) {
        if (j != this.D) {
            this.D = j;
            this.d.a(ajbe.PASSIVE_COLLECTOR, this.D, (aizx) null);
        }
    }

    private final boolean a(int i, boolean z2, boolean z3, boolean z4) {
        if ((z2 ? 1 : 0) + (z3 ? 1 : 0) + (z4 ? 1 : 0) < 2) {
            return false;
        }
        if (!z4 && i == 1) {
            return false;
        }
        if (i == 4 && (!z3 || !z2)) {
            return false;
        }
        if (z3 && z4 && !z2) {
            long c = this.c.c();
            long j = this.p;
            if (c < j) {
                StringBuilder sb = new StringBuilder(60);
                sb.append("Not uploading non GNSS collection until ");
                sb.append(j);
                sb.toString();
                return false;
            }
        }
        return true;
    }

    public final void a(int i, int i2, boolean z2) {
        float a = ajqz.a(i, i2);
        if (a >= 0.0f) {
            boolean z3 = true;
            if (!z2 && ((double) a) < 0.2d) {
                z3 = false;
            }
            this.k = z3;
        }
        this.l = z2;
    }

    public final void a(aiaj aiaj) {
        if (aiaj == null || !aiaj.e()) {
            this.m = null;
            return;
        }
        aiaj aiaj2 = this.m;
        boolean z2 = false;
        if (aiaj2 != null && aiaj2.b(aiaj)) {
            if (this.m.j != aiaj.j) {
                z2 = true;
            } else {
                return;
            }
        }
        this.m = aiaj;
        if (a()) {
            if (!z2) {
                this.z = true;
            }
            String valueOf = String.valueOf(this.m);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("updateCellState(): Updated to ");
            sb.append(valueOf);
            sb.toString();
        }
    }

    public final void a(aibt aibt) {
        boolean z2;
        if (aibt != null && aibt.b() != 0) {
            this.q = aibt;
            if (a()) {
                aibt aibt2 = this.n;
                if (aibt2 == null || aibt.a - aibt2.a > 600000) {
                    boolean z3 = this.y;
                    if (this.i.a(aibt, this.c.c()) > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z4 = z3 | z2;
                    this.y = z4;
                    if (z4) {
                        int b = aibt.b();
                        StringBuilder sb = new StringBuilder(23);
                        sb.append("Updated ");
                        sb.append(b);
                        sb.append(" APs");
                        sb.toString();
                    }
                }
            }
        }
    }

    public final void a(aiwz aiwz) {
        if (aiwz != null) {
            this.G = aiwz;
            if (!a()) {
                return;
            }
            if (!this.o || !ahwp.a(this.q, this.G)) {
                aiwz aiwz2 = this.i.c;
                if (aiwz2 != null && aell.b(aiwz2.b(), aiwz2.c(), this.G.b(), this.G.c()) > 200.0d) {
                    this.B = true;
                    return;
                }
                return;
            }
            this.A = true;
        }
    }

    public final void a(ajbe ajbe) {
        if (ajbe == ajbe.PASSIVE_COLLECTOR) {
            this.D = -1;
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        if (activityRecognitionResult != null && activityRecognitionResult.b().a() != 5) {
            this.r = activityRecognitionResult;
        }
    }

    public final void a(PrintWriter printWriter) {
        int i = this.H;
        StringBuilder sb = new StringBuilder(29);
        sb.append("PC uploadCount is ");
        sb.append(i);
        printWriter.println(sb.toString());
        int i2 = this.I;
        StringBuilder sb2 = new StringBuilder(27);
        sb2.append("PC itemCount is ");
        sb2.append(i2);
        printWriter.println(sb2.toString());
        int i3 = this.J;
        StringBuilder sb3 = new StringBuilder(27);
        sb3.append("PC cellCount is ");
        sb3.append(i3);
        printWriter.println(sb3.toString());
        int i4 = this.w;
        StringBuilder sb4 = new StringBuilder(27);
        sb4.append("PC wifiCount is ");
        sb4.append(i4);
        printWriter.println(sb4.toString());
        int i5 = this.x;
        StringBuilder sb5 = new StringBuilder(27);
        sb5.append("PC gnssCount is ");
        sb5.append(i5);
        printWriter.println(sb5.toString());
    }

    public final boolean a() {
        return this.k && super.a() && this.s && ahxc.a(32);
    }
}
