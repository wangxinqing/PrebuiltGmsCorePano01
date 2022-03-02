package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.contextmanager.producer.module.indooroutdoor.WifiFeatureGroupGenerator;

/* renamed from: cgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgn {
    public final cgp a;
    public final WifiFeatureGroupGenerator b;
    public final cgl c;
    public final cgj d;
    public volatile boolean e;
    private final cgd f;
    private final cdy g;

    public cgn(Context context, cdy cdy, Looper looper) {
        cgm cgm = new cgm(this);
        this.a = new cgp(context, looper);
        this.b = new WifiFeatureGroupGenerator(context, cgm, this.a, looper);
        this.c = new cgl(context);
        this.d = new cgj(context, cgm, looper);
        this.g = cdy;
        this.f = new cgd(new cgs(cgd.a(context, cgr.FULL), cgd.a(context, cgr.NO_GPS), cgd.a(context, cgr.NO_WIFI)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r4 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (defpackage.cgr.c.equals(r5) != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        r3.addAll(r1.b.b);
        r3.add(java.lang.Float.valueOf((float) r1.b.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r4 = new float[r3.size()];
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        if (r8 >= r3.size()) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        r4[r8] = ((java.lang.Float) r3.get(r8)).floatValue();
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        if (r2.a.length == 2) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        r3 = new java.util.HashMap();
        r9 = r2.a();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        if (r10 >= r9) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d4, code lost:
        defpackage.ahmu.a(r3, r2.b.a(r10, r4).a, 1.0f);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r3 = new java.util.HashMap();
        r9 = r2.a();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
        if (r10 >= r9) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        r11 = r2.a(r10, r4);
        r12 = r11.a;
        r11 = r11.b;
        r13 = r2.a;
        r14 = r13[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
        if (r12 != r14) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        r14 = r13[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        defpackage.ahmu.a(r3, r12, r11);
        defpackage.ahmu.a(r3, r14, 1.0f - r11);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        r2 = r2.a();
        r4 = new java.util.ArrayList();
        r3 = r3.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0122, code lost:
        if (r3.hasNext() == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0124, code lost:
        r8 = (java.util.Map.Entry) r3.next();
        r4.add(new defpackage.ahms((java.lang.Comparable) r8.getKey(), ((java.lang.Float) r8.getValue()).floatValue() / ((float) r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0145, code lost:
        java.util.Collections.sort(r4);
        r2 = r4.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014d, code lost:
        if (r3 >= r2) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014f, code lost:
        r8 = (defpackage.ahms) r4.get(r3);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015b, code lost:
        if (r8.a != defpackage.cgv.a) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015d, code lost:
        r2 = r8.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0160, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0161, code lost:
        r3 = r0.g;
        r8 = android.os.SystemClock.elapsedRealtime();
        r10 = r8 - r3.a;
        r4 = r3.b;
        r4.b.add(new defpackage.cge(r8, (double) r2));
        r12 = r4.b.iterator();
        r13 = 0.0d;
        r15 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0185, code lost:
        if (r12.hasNext() == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0187, code lost:
        r7 = (defpackage.cge) r12.next();
        r5 = (double) (r8 - r7.a);
        r0 = r4.a;
        java.lang.Double.isNaN(r5);
        r0 = java.lang.Math.pow(0.5d, r5 / r0);
        r15 = r15 + r0;
        r13 = r13 + (r0 * r7.b);
        r0 = r19;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b0, code lost:
        r18 = r1;
        r13 = r13 / r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b7, code lost:
        if (r10 >= defpackage.cdz.b) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b9, code lost:
        r0 = new java.lang.Object[]{java.lang.Float.valueOf(r2), java.lang.Long.valueOf(r10)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01cb, code lost:
        r3.a = r8;
        r0 = (float) r13;
        r1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r2 = r18.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r2 == null) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r2 = r2.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01da, code lost:
        if (r2 == 0) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01dd, code lost:
        if (r2 == 1) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e0, code lost:
        if (r2 == 2) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e2, code lost:
        r4 = 0;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e7, code lost:
        r2 = r18;
        r4 = r2.b.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ee, code lost:
        r2 = r18;
        r4 = r2.a.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f5, code lost:
        r2 = r18;
        r4 = java.lang.Math.max(r2.b.a, r2.a.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0203, code lost:
        r4 = r1.toMillis(r4);
        r1 = defpackage.atry.e.o();
        r6 = java.lang.Math.round(100.0f * r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0217, code lost:
        if (r1.c == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0219, code lost:
        r1.c();
        r1.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021f, code lost:
        r7 = (defpackage.atry) r1.b;
        r7.a |= 1;
        r7.b = r6;
        r6 = r2.a();
        r7 = r6.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0235, code lost:
        if (r7 == 0) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0237, code lost:
        if (r7 == 1) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023a, code lost:
        if (r7 != 2) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023c, code lost:
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023e, code lost:
        r1 = java.lang.String.valueOf(r6);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 14);
        r3.append("Unknown model ");
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0262, code lost:
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0263, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0265, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0268, code lost:
        if (r1.c != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026b, code lost:
        r1.c();
        r1.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0271, code lost:
        r7 = (defpackage.atry) r1.b;
        r7.c = r6 - 1;
        r7.a |= 2;
        r2 = r2.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0285, code lost:
        if (r1.c != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0288, code lost:
        r1.c();
        r1.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028e, code lost:
        r6 = (defpackage.atry) r1.b;
        r2.getClass();
        r6.a |= 4;
        r6.d = r2;
        r1 = (defpackage.atry) r1.i();
        r2 = new java.lang.Object[]{java.lang.Float.valueOf(r0), r1, java.lang.Long.valueOf(r4)};
        r0 = new defpackage.jti(3, 57, 2);
        r0.a(defpackage.jut.a(r4));
        r0.a(defpackage.atry.f, r1);
        r3.c.c(r0.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d9, code lost:
        throw new java.lang.IllegalStateException("getNanos() undefined");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x0357
            cgq r1 = new cgq
            com.google.android.contextmanager.producer.module.indooroutdoor.WifiFeatureGroupGenerator r2 = r0.b
            cgz r2 = r2.d
            cgj r3 = r0.d
            cgt r3 = r3.c
            r1.<init>(r2, r3)
            cgr r2 = r1.a()
            if (r2 == 0) goto L_0x032c
            cgd r2 = r0.f
            cgs r2 = r2.a
            cgr r3 = r1.a()
            java.lang.String r4 = "No model available for "
            if (r3 == 0) goto L_0x0303
            int r5 = r3.ordinal()
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x005c
            if (r5 == r7) goto L_0x0059
            if (r5 != r6) goto L_0x0034
            ahmu r2 = r2.c
            goto L_0x005e
        L_0x0034:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 21
            r4.<init>(r3)
            java.lang.String r3 = "Unhandled model type "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0059:
            ahmu r2 = r2.b
            goto L_0x005e
        L_0x005c:
            ahmu r2 = r2.a
        L_0x005e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            cgr r5 = r1.a()
            if (r5 == 0) goto L_0x02da
            cgr r4 = defpackage.cgr.FULL
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0079
            cgr r8 = defpackage.cgr.NO_GPS
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0089
        L_0x0079:
            cgz r8 = r1.a
            java.util.List r8 = r8.b
            r3.addAll(r8)
            cgz r8 = r1.a
            java.util.List r8 = r8.d
            r3.addAll(r8)
            if (r4 != 0) goto L_0x0091
        L_0x0089:
            cgr r4 = defpackage.cgr.NO_WIFI
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00a4
        L_0x0091:
            cgt r4 = r1.b
            java.util.List r4 = r4.b
            r3.addAll(r4)
            cgt r4 = r1.b
            int r4 = r4.c
            float r4 = (float) r4
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.add(r4)
        L_0x00a4:
            int r4 = r3.size()
            float[] r4 = new float[r4]
            r5 = 0
            r8 = 0
        L_0x00ac:
            int r9 = r3.size()
            if (r8 >= r9) goto L_0x00c1
            java.lang.Object r9 = r3.get(r8)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r4[r8] = r9
            int r8 = r8 + 1
            goto L_0x00ac
        L_0x00c1:
            java.lang.Comparable[] r3 = r2.a
            int r3 = r3.length
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r6) goto L_0x00e3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            int r9 = r2.a()
            r10 = 0
        L_0x00d2:
            if (r10 >= r9) goto L_0x00e2
            ahmt r11 = r2.b
            ahms r11 = r11.a(r10, r4)
            java.lang.Comparable r11 = r11.a
            defpackage.ahmu.a(r3, r11, r8)
            int r10 = r10 + 1
            goto L_0x00d2
        L_0x00e2:
            goto L_0x010d
        L_0x00e3:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            int r9 = r2.a()
            r10 = 0
        L_0x00ed:
            if (r10 >= r9) goto L_0x010c
            ahms r11 = r2.a(r10, r4)
            java.lang.Comparable r12 = r11.a
            float r11 = r11.b
            java.lang.Comparable[] r13 = r2.a
            r14 = r13[r5]
            if (r12 != r14) goto L_0x0100
            r14 = r13[r7]
            goto L_0x0101
        L_0x0100:
        L_0x0101:
            defpackage.ahmu.a(r3, r12, r11)
            float r11 = r8 - r11
            defpackage.ahmu.a(r3, r14, r11)
            int r10 = r10 + 1
            goto L_0x00ed
        L_0x010c:
        L_0x010d:
            int r2 = r2.a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x011e:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0145
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getValue()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            ahms r10 = new ahms
            java.lang.Object r8 = r8.getKey()
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            float r11 = (float) r2
            float r9 = r9 / r11
            r10.<init>(r8, r9)
            r4.add(r10)
            goto L_0x011e
        L_0x0145:
            java.util.Collections.sort(r4)
            int r2 = r4.size()
            r3 = 0
        L_0x014d:
            if (r3 >= r2) goto L_0x0160
            java.lang.Object r8 = r4.get(r3)
            ahms r8 = (defpackage.ahms) r8
            int r3 = r3 + 1
            java.lang.Comparable r9 = r8.a
            cgv r10 = defpackage.cgv.INDOOR
            if (r9 != r10) goto L_0x014d
            float r2 = r8.b
            goto L_0x0161
        L_0x0160:
            r2 = 0
        L_0x0161:
            cdy r3 = r0.g
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r10 = r3.a
            long r10 = r8 - r10
            cgf r4 = r3.b
            cge r12 = new cge
            double r13 = (double) r2
            r12.<init>(r8, r13)
            java.util.Collection r13 = r4.b
            r13.add(r12)
            java.util.Collection r12 = r4.b
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
            r15 = r13
        L_0x0181:
            boolean r17 = r12.hasNext()
            if (r17 == 0) goto L_0x01b0
            java.lang.Object r17 = r12.next()
            r7 = r17
            cge r7 = (defpackage.cge) r7
            long r5 = r7.a
            long r5 = r8 - r5
            double r5 = (double) r5
            r18 = r1
            double r0 = r4.a
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = java.lang.Math.pow(r0, r5)
            double r15 = r15 + r0
            double r5 = r7.b
            double r0 = r0 * r5
            double r13 = r13 + r0
            r0 = r19
            r1 = r18
            r5 = 0
            r6 = 2
            r7 = 1
            goto L_0x0181
        L_0x01b0:
            r18 = r1
            double r13 = r13 / r15
            long r0 = defpackage.cdz.b
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x01cb
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r2 = 0
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r2 = 1
            r0[r2] = r1
            return
        L_0x01cb:
            r3.a = r8
            float r0 = (float) r13
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            cgr r2 = r18.a()
            if (r2 == 0) goto L_0x02d2
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x01f5
            r4 = 1
            if (r2 == r4) goto L_0x01ee
            r4 = 2
            if (r2 == r4) goto L_0x01e7
            r4 = 0
            r2 = r18
            goto L_0x0203
        L_0x01e7:
            r2 = r18
            cgt r4 = r2.b
            long r4 = r4.a
            goto L_0x0203
        L_0x01ee:
            r2 = r18
            cgz r4 = r2.a
            long r4 = r4.a
            goto L_0x0203
        L_0x01f5:
            r2 = r18
            cgt r4 = r2.b
            long r4 = r4.a
            cgz r6 = r2.a
            long r6 = r6.a
            long r4 = java.lang.Math.max(r4, r6)
        L_0x0203:
            long r4 = r1.toMillis(r4)
            atry r1 = defpackage.atry.e
            aucd r1 = r1.o()
            r6 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            boolean r7 = r1.c
            if (r7 == 0) goto L_0x021f
            r1.c()
            r7 = 0
            r1.c = r7
        L_0x021f:
            aucj r7 = r1.b
            atry r7 = (defpackage.atry) r7
            int r8 = r7.a
            r9 = 1
            r8 = r8 | r9
            r7.a = r8
            r7.b = r6
            cgr r6 = r2.a()
            int r7 = r6.ordinal()
            r8 = 4
            r10 = 3
            if (r7 == 0) goto L_0x0265
            if (r7 == r9) goto L_0x0263
            r9 = 2
            if (r7 != r9) goto L_0x023e
            r6 = 4
            goto L_0x0266
        L_0x023e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 14
            r3.<init>(r2)
            java.lang.String r2 = "Unknown model "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0263:
            r6 = 3
            goto L_0x0266
        L_0x0265:
            r6 = 2
        L_0x0266:
            boolean r7 = r1.c
            if (r7 != 0) goto L_0x026b
            goto L_0x0271
        L_0x026b:
            r1.c()
            r7 = 0
            r1.c = r7
        L_0x0271:
            aucj r7 = r1.b
            atry r7 = (defpackage.atry) r7
            int r6 = r6 + -1
            r7.c = r6
            int r6 = r7.a
            r9 = 2
            r6 = r6 | r9
            r7.a = r6
            java.lang.String r2 = r2.b()
            boolean r6 = r1.c
            if (r6 != 0) goto L_0x0288
            goto L_0x028e
        L_0x0288:
            r1.c()
            r6 = 0
            r1.c = r6
        L_0x028e:
            aucj r6 = r1.b
            atry r6 = (defpackage.atry) r6
            r2.getClass()
            int r7 = r6.a
            r7 = r7 | r8
            r6.a = r7
            r6.d = r2
            aucj r1 = r1.i()
            atry r1 = (defpackage.atry) r1
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6 = 0
            r2[r6] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r6 = 2
            r2[r6] = r0
            jti r0 = new jti
            r2 = 57
            r0.<init>(r10, r2, r6)
            jut r2 = defpackage.jut.a(r4)
            r0.a((defpackage.jut) r2)
            auci r2 = defpackage.atry.f
            r0.a(r2, r1)
            com.google.android.gms.contextmanager.ContextData r0 = r0.a()
            cdz r1 = r3.c
            r1.c(r0)
            return
        L_0x02d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getNanos() undefined"
            r0.<init>(r1)
            throw r0
        L_0x02da:
            r2 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r2.b()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 88
            r3.<init>(r2)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ". You must check getBestModel() before calling getFeatureValues()"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0303:
            r2 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.b()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 83
            r3.<init>(r2)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ". You must check isValid() before calling getFeatureValues()"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x032c:
            r2 = r1
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 79
            r3.<init>(r2)
            java.lang.String r2 = "Invalid instance: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ". Did WiFi or GPS generator incorrectly provide a null group?"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgn.a():void");
    }

    public final void a(boolean z) {
        cgp cgp = this.a;
        cgp.d = z;
        cgp.a();
    }
}
