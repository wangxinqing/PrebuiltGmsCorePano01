package defpackage;

import android.os.SystemClock;

/* renamed from: ahkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahkz extends ahle {
    boolean a;
    private long b;
    private final ahjm c;
    private final ahla k;
    private boolean l;
    private final long m;
    private final long n;

    public ahkz(ahix ahix) {
        this(ahix, false, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q() {
        /*
            r15 = this;
            ahjm r0 = r15.c
            boolean r1 = r15.l
            r2 = -1
            if (r1 == 0) goto L_0x000b
            long r4 = r15.m
            goto L_0x000c
        L_0x000b:
            r4 = r2
        L_0x000c:
            ahjl r0 = r0.a(r4)
            long r4 = r0.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r6 = 67
            r1.<init>(r6)
            java.lang.String r6 = "setNextTriggerTime, scheduleInfo.detectorTypes="
            r1.append(r6)
            r1.append(r4)
            r1.toString()
            long r4 = r0.a
            r15.b = r4
            boolean r1 = r15.a
            r6 = 0
            if (r1 == 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            ahla r1 = r15.k
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x00a2
            boolean r1 = r15.j
            if (r1 != 0) goto L_0x0039
            goto L_0x00a2
        L_0x0039:
            r7 = 2
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0042
            r4 = 450(0x1c2, double:2.223E-321)
            goto L_0x0045
        L_0x0042:
            r4 = 36000(0x8ca0, double:1.77864E-319)
        L_0x0045:
            r7 = 1500(0x5dc, double:7.41E-321)
            long r4 = r4 + r7
            r7 = 0
            aiac r1 = r0.b
            long r9 = r1.a
            long r9 = r9 - r4
            long r7 = java.lang.Math.max(r7, r9)
            long r9 = defpackage.ajbt.e()
            java.util.Locale r1 = java.util.Locale.US
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            long r11 = defpackage.ajqz.a((long) r7, (long) r9)
            r1.setTimeInMillis(r11)
            r11 = 14
            r1.set(r11, r6)
            r11 = 13
            r1.set(r11, r6)
            long r11 = r1.getTimeInMillis()
            long r11 = r11 - r9
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r11 - r9
            r13 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r9 = 172(0xac, float:2.41E-43)
            r1.<init>(r9)
            java.lang.String r9 = "Prefer to disable sensor batching: minDurationMillis="
            r1.append(r9)
            r1.append(r4)
            java.lang.String r4 = " timeToReenableBatching="
            r1.append(r4)
            r1.append(r7)
            java.lang.String r4 = " timeToReenableBatchingRoundedDown="
            r1.append(r4)
            r1.append(r11)
            r1.toString()
            goto L_0x00a3
        L_0x00a2:
            r11 = r2
        L_0x00a3:
            int r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00bf
            r0 = 1
            r15.a = r0
            ahix r1 = r15.d
            aiac r2 = new aiac
            r3 = -1000(0xfffffffffffffc18, double:NaN)
            long r11 = r11 + r3
            r3 = 2000(0x7d0, double:9.88E-321)
            r2.<init>(r11, r3)
            r1.a((defpackage.aiac) r2)
            ahix r1 = r15.d
            r1.b((boolean) r0)
            return
        L_0x00bf:
            boolean r1 = r15.a
            if (r1 != 0) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            ahix r1 = r15.d
            r1.b((boolean) r6)
        L_0x00c9:
            r15.a = r6
            ahix r1 = r15.d
            aiac r0 = r0.b
            r1.a((defpackage.aiac) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkz.q():void");
    }

    public final void A() {
        q();
    }

    public final void B() {
        this.l = false;
        q();
    }

    public final void C() {
        q();
    }

    /* access modifiers changed from: protected */
    public final void D() {
        if (!this.a) {
            new Object[1][0] = Long.valueOf(this.b);
            b(this.b);
            return;
        }
        this.d.b(false);
        this.a = false;
        q();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aibl r8, defpackage.aibl r9) {
        /*
            r7 = this;
            ahix r0 = r7.d
            ajaj r0 = r0.B
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0092
            if (r8 == 0) goto L_0x0092
            int r0 = r8.b
            r1 = 3
            if (r0 == r1) goto L_0x0092
            int r2 = r9.b
            if (r2 == r1) goto L_0x0092
            if (r0 == r2) goto L_0x0092
            ahix r0 = r7.d
            com.google.android.gms.location.ActivityRecognitionResult r0 = r0.u
            r2 = 4
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.location.DetectedActivity r0 = r0.a()
            int r0 = r0.a()
            goto L_0x0028
        L_0x0027:
            r0 = 4
        L_0x0028:
            int r3 = r9.b
            r4 = 0
            r5 = 1
            if (r0 == r2) goto L_0x0038
            r2 = 5
            if (r0 != r2) goto L_0x0033
            r2 = 1
            goto L_0x0039
        L_0x0033:
            if (r0 != r1) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            r6 = 2
            if (r3 != r6) goto L_0x003f
            if (r2 == 0) goto L_0x003f
            goto L_0x004b
        L_0x003f:
            if (r3 == r5) goto L_0x0043
            r2 = 0
            goto L_0x0044
        L_0x0043:
            r2 = 1
        L_0x0044:
            if (r0 == r1) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r4 = 1
        L_0x0048:
            if (r2 != r4) goto L_0x004b
            goto L_0x0092
        L_0x004b:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 110
            int r0 = r0 + r1
            r2.<init>(r0)
            java.lang.String r0 = "Travel mode change and inconsistent with last activity detection. Running activity detection early: last="
            r2.append(r0)
            r2.append(r8)
            java.lang.String r8 = " cur="
            r2.append(r8)
            r2.append(r9)
            r2.toString()
            long r8 = android.os.SystemClock.elapsedRealtime()
            ahix r0 = r7.d
            long r0 = r0.ak
            long r8 = r8 - r0
            r0 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            r8 = 39
            r7.b(r8)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkz.a(aibl, aibl):void");
    }

    public final void g() {
        super.g();
        ahix ahix = this.d;
        if (ahix.ak == -1) {
            ahix.ak = SystemClock.elapsedRealtime();
        }
        ahix ahix2 = this.d;
        if (ahix2.al == -1) {
            ahix2.al = SystemClock.elapsedRealtime();
        }
        ahix ahix3 = this.d;
        if (ahix3.am == -1) {
            ahix3.am = SystemClock.elapsedRealtime();
        }
        ahix ahix4 = this.d;
        if (ahix4.an == -1) {
            ahix4.an = SystemClock.elapsedRealtime();
        }
        ahix ahix5 = this.d;
        if (ahix5.ao == -1) {
            ahix5.ao = SystemClock.elapsedRealtime();
        }
        ahix ahix6 = this.d;
        if (Math.min(ahix6.U, ahix6.V) != Long.MAX_VALUE && !this.d.B.d() && SystemClock.elapsedRealtime() >= this.n && this.d.B.b() && this.d.t()) {
            this.d.b(false);
        }
        q();
    }

    /* access modifiers changed from: protected */
    public final void k() {
        long j = this.b;
        if (j == 2) {
            this.b = 39;
            j = 39;
        }
        c(j);
    }

    public final String p() {
        return "ScheduledState";
    }

    /* access modifiers changed from: protected */
    public final void t() {
        q();
    }

    /* access modifiers changed from: protected */
    public final void u() {
        ahix ahix = this.d;
        if (ahix.au == -1) {
            ahix.a(SystemClock.elapsedRealtime());
            ahix ahix2 = this.d;
            if (ahix2.ae && !this.j && (ahix2.a(9) || this.d.a(10))) {
                ahkc ahkc = new ahkc(this.d);
                if (a((ahjt) ahkc)) {
                    a((ahle) ahkc);
                    return;
                }
            }
        }
        q();
    }

    /* access modifiers changed from: protected */
    public final void v() {
        if (axwx.i() && axwx.h()) {
            this.c.a = SystemClock.elapsedRealtime();
            q();
        }
    }

    public final void y() {
        this.d.ai = Long.MAX_VALUE;
        q();
    }

    public final void z() {
        this.d.n();
        k();
    }

    public ahkz(ahix ahix, boolean z, long j) {
        super(ahix);
        this.a = false;
        this.b = 0;
        this.k = ahix.r;
        if (this.j) {
            this.c = new ahlx(ahix, this.g);
        } else {
            this.c = new ahkf(ahix, this.g);
        }
        this.l = z;
        this.m = SystemClock.elapsedRealtime();
        this.n = SystemClock.elapsedRealtime() + j;
    }

    /* access modifiers changed from: protected */
    public final void a(ajbe ajbe) {
        if (ajbe == ajbe.LOCATOR) {
            q();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        new Object[1][0] = Boolean.valueOf(z);
        if (!this.d.B.d()) {
            q();
            if (z) {
                k();
            }
        } else if (!this.d.a(9) && !this.d.c()) {
            this.d.B.g();
            ahix ahix = this.d;
            ajao ajao = ahix.av;
            if (ajao != null && ajao.c) {
                ahix.w();
            }
        } else if (!z) {
            a((ahle) new ahkz(this.d));
        } else {
            k();
        }
    }
}
