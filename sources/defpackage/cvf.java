package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: cvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cvf implements Callable {
    private final cvk a;
    private final aqsr b;
    private final long c;
    private final Set d;
    private final boolean e;

    public cvf(cvk cvk, aqsr aqsr, long j, Set set, boolean z) {
        this.a = cvk;
        this.b = aqsr;
        this.c = j;
        this.d = set;
        this.e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x04d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r2 = "google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource"
            cvk r0 = r1.a
            aqsr r9 = r1.b
            long r14 = r1.c
            java.util.Set r10 = r1.d
            boolean r3 = r1.e
            cts r12 = r0.l
            cvm r0 = r0.d
            dih r4 = r12.b
            boolean r4 = defpackage.dio.a((defpackage.dih) r4)
            if (r4 == 0) goto L_0x04e7
            java.lang.String r17 = defpackage.dja.b()
            boolean r18 = defpackage.qud.h()
            r11 = 1
            r13 = 0
            if (r3 == 0) goto L_0x008d
            cub r3 = r12.d
            dih r4 = r12.b
            java.lang.String r4 = r4.a
            java.lang.String r8 = r0.a
            r5 = r17
            r6 = r9
            r7 = r18
            cui r3 = r3.a(r4, r5, r6, r7, r8)
            if (r3 == 0) goto L_0x008d
            csl r4 = r3.f
            boolean r4 = r4.c()
            if (r4 != 0) goto L_0x007c
            aqrf r0 = defpackage.aqrf.d
            aucd r0 = r0.o()
            csl r2 = r3.f
            aqso r2 = r2.a
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r0.c()
            r0.c = r13
        L_0x0055:
            aucj r3 = r0.b
            aqrf r3 = (defpackage.aqrf) r3
            r2.getClass()
            r3.b = r2
            int r2 = r3.a
            r2 = r2 | r11
            r3.a = r2
            aucj r0 = r0.i()
            aqrf r0 = (defpackage.aqrf) r0
            iwd r2 = r12.a
            java.lang.Object[] r3 = new java.lang.Object[r11]
            int r4 = r9.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r13] = r4
            java.lang.String r4 = "requestResource(%s): serving early from DB"
            r2.a(r4, r3)
            goto L_0x039e
        L_0x007c:
            iwd r3 = r12.a
            java.lang.Object[] r4 = new java.lang.Object[r11]
            int r5 = r9.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r13] = r5
            java.lang.String r5 = "requestResource(%s): serving early from DB is in DB but stale"
            r3.a(r5, r4)
        L_0x008d:
            iwd r3 = r12.a
            java.lang.Object[] r4 = new java.lang.Object[r11]
            int r5 = r9.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r13] = r5
            java.lang.String r5 = "requestResource(%s): requesting via gRPC"
            r3.a(r5, r4)
            aqre r3 = defpackage.aqre.e
            aucd r3 = r3.o()
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x00ad
            r3.c()
            r3.c = r13
        L_0x00ad:
            aucj r4 = r3.b
            aqre r4 = (defpackage.aqre) r4
            r9.getClass()
            r4.c = r9
            int r5 = r4.a
            r6 = 2
            r5 = r5 | r6
            r4.a = r5
            amsv r4 = r12.e
            java.lang.Object r4 = r4.a()
            dje r4 = (defpackage.dje) r4
            java.lang.String r5 = r0.a
            aqsn r7 = defpackage.aqsn.k
            aucd r7 = r7.o()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x00d1
            goto L_0x00d6
        L_0x00d1:
            r7.c()
            r7.c = r13
        L_0x00d6:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            r8.b = r11
            int r6 = r8.a
            r6 = r6 | r11
            r8.a = r6
            aqqq r6 = r4.b()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x00ea
            goto L_0x00ef
        L_0x00ea:
            r7.c()
            r7.c = r13
        L_0x00ef:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            r6.getClass()
            r8.c = r6
            int r6 = r8.a
            r16 = 2
            r6 = r6 | 2
            r8.a = r6
            aqqr r6 = r4.a()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x0109
            goto L_0x010e
        L_0x0109:
            r7.c()
            r7.c = r13
        L_0x010e:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            r6.getClass()
            r8.d = r6
            int r6 = r8.a
            r6 = r6 | 4
            r8.a = r6
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            java.lang.String r6 = r6.getID()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x012a
            goto L_0x012f
        L_0x012a:
            r7.c()
            r7.c = r13
        L_0x012f:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            r6.getClass()
            int r11 = r8.a
            r11 = r11 | 8
            r8.a = r11
            r8.e = r6
            android.content.Context r6 = r4.c
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.densityDpi
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x014f
            goto L_0x0154
        L_0x014f:
            r7.c()
            r7.c = r13
        L_0x0154:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            int r11 = r8.a
            r11 = r11 | 16
            r8.a = r11
            r8.f = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            ihs r6 = defpackage.ihs.b()
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            r8 = 1
            if (r6 != r8) goto L_0x0177
            r6 = 1
            goto L_0x0178
        L_0x0177:
            r6 = 0
        L_0x0178:
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x017d
            goto L_0x0182
        L_0x017d:
            r7.c()
            r7.c = r13
        L_0x0182:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            int r11 = r8.a
            r11 = r11 | 64
            r8.a = r11
            r8.g = r6
            boolean r6 = defpackage.qud.h()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r7.c()
            r7.c = r13
        L_0x019c:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            int r11 = r8.a
            r11 = r11 | 256(0x100, float:3.59E-43)
            r8.a = r11
            r8.h = r6
            amsv r6 = r4.d
            java.lang.Object r6 = r6.a()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x01b9
            goto L_0x01be
        L_0x01b9:
            r7.c()
            r7.c = r13
        L_0x01be:
            aucj r8 = r7.b
            aqsn r8 = (defpackage.aqsn) r8
            int r11 = r8.a
            r11 = r11 | 1024(0x400, float:1.435E-42)
            r8.a = r11
            r8.i = r6
            boolean r6 = defpackage.awgy.i()
            if (r6 == 0) goto L_0x01e9
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x01d5
            goto L_0x01da
        L_0x01d5:
            r7.c()
            r7.c = r13
        L_0x01da:
            aucj r6 = r7.b
            aqsn r6 = (defpackage.aqsn) r6
            r5.getClass()
            int r8 = r6.a
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r6.a = r8
            r6.j = r5
        L_0x01e9:
            r4.c()
            aucj r4 = r7.i()
            aqsn r4 = (defpackage.aqsn) r4
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x01f7
            goto L_0x01fc
        L_0x01f7:
            r3.c()
            r3.c = r13
        L_0x01fc:
            aucj r5 = r3.b
            aqre r5 = (defpackage.aqre) r5
            r4.getClass()
            r5.b = r4
            int r4 = r5.a
            r6 = 1
            r4 = r4 | r6
            r5.a = r4
            aucx r4 = r5.d
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x021b
            aucx r4 = r5.d
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)
            r5.d = r4
        L_0x021b:
            aucx r4 = r5.d
            defpackage.auab.a((java.lang.Iterable) r10, (java.util.List) r4)
            aucj r3 = r3.i()
            r22 = r3
            aqre r22 = (defpackage.aqre) r22
            android.accounts.Account r3 = new android.accounts.Account
            dih r4 = r12.b
            java.lang.String r4 = r4.a
            java.lang.String r5 = "com.google"
            r3.<init>(r4, r5)
            com.google.android.gms.common.internal.ClientContext r4 = new com.google.android.gms.common.internal.ClientContext
            r4.<init>()
            java.lang.String r5 = "com.google.android.gms"
            r4.e = r5
            r4.f = r5
            int r5 = defpackage.jhg.a
            r4.b = r5
            r4.d = r3
            r4.c = r3
            awgs r3 = defpackage.awgs.a
            awgt r3 = r3.a()
            java.lang.String r3 = r3.n()
            r4.d(r3)
            long r5 = android.os.SystemClock.elapsedRealtime()
            crr r7 = r12.f     // Catch:{ Exception -> 0x03ba }
            baaj r8 = defpackage.crr.c     // Catch:{ Exception -> 0x03ba }
            if (r8 == 0) goto L_0x025e
            goto L_0x0272
        L_0x025e:
            baai r8 = defpackage.baai.UNARY     // Catch:{ Exception -> 0x03ba }
            aqre r10 = defpackage.aqre.e     // Catch:{ Exception -> 0x03ba }
            baah r10 = defpackage.baoq.a(r10)     // Catch:{ Exception -> 0x03ba }
            aqrf r11 = defpackage.aqrf.d     // Catch:{ Exception -> 0x03ba }
            baah r11 = defpackage.baoq.a(r11)     // Catch:{ Exception -> 0x03ba }
            baaj r8 = defpackage.baaj.a(r8, r2, r10, r11)     // Catch:{ Exception -> 0x03ba }
            defpackage.crr.c = r8     // Catch:{ Exception -> 0x03ba }
        L_0x0272:
            izd r7 = r7.a     // Catch:{ Exception -> 0x03ba }
            baaj r20 = defpackage.crr.c     // Catch:{ Exception -> 0x03ba }
            int r8 = defpackage.crr.b     // Catch:{ Exception -> 0x03ba }
            long r10 = (long) r8     // Catch:{ Exception -> 0x03ba }
            java.util.concurrent.TimeUnit r25 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x03ba }
            r19 = r7
            r21 = r4
            r23 = r10
            java.lang.Object r4 = r19.a(r20, r21, r22, r23, r25)     // Catch:{ Exception -> 0x03ba }
            aqrf r4 = (defpackage.aqrf) r4     // Catch:{ Exception -> 0x03ba }
            dis r7 = r12.g     // Catch:{ Exception -> 0x03ba }
            int r8 = r9.b     // Catch:{ Exception -> 0x03ba }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03ba }
            long r10 = r10 - r5
            aqna r19 = defpackage.aqna.d     // Catch:{ Exception -> 0x03ba }
            aucd r3 = r19.o()     // Catch:{ Exception -> 0x03ba }
            aqmz r19 = defpackage.aqmz.l     // Catch:{ Exception -> 0x03ba }
            aucd r19 = r19.o()     // Catch:{ Exception -> 0x03ba }
            r13 = r19
            aucf r13 = (defpackage.aucf) r13     // Catch:{ Exception -> 0x03ba }
            boolean r1 = r13.c     // Catch:{ Exception -> 0x03ba }
            if (r1 != 0) goto L_0x02a5
            goto L_0x02ab
        L_0x02a5:
            r13.c()     // Catch:{ Exception -> 0x03ba }
            r1 = 0
            r13.c = r1     // Catch:{ Exception -> 0x03ba }
        L_0x02ab:
            aucj r1 = r13.b     // Catch:{ Exception -> 0x03ba }
            aqmz r1 = (defpackage.aqmz) r1     // Catch:{ Exception -> 0x03ba }
            r22 = r5
            r5 = 5
            r1.b = r5     // Catch:{ Exception -> 0x03b8 }
            int r5 = r1.a     // Catch:{ Exception -> 0x03b8 }
            r6 = 1
            r5 = r5 | r6
            r1.a = r5     // Catch:{ Exception -> 0x03b8 }
            r6 = 2010(0x7da, float:2.817E-42)
            r1.c = r6     // Catch:{ Exception -> 0x03b8 }
            r6 = 2
            r5 = r5 | r6
            r1.a = r5     // Catch:{ Exception -> 0x03b8 }
            r5 = r5 | 8
            r1.a = r5     // Catch:{ Exception -> 0x03b8 }
            r1.e = r8     // Catch:{ Exception -> 0x03b8 }
            r5 = r5 | 16
            r1.a = r5     // Catch:{ Exception -> 0x03b8 }
            r5 = 1
            r1.f = r5     // Catch:{ Exception -> 0x03b8 }
            r1 = 0
            aqmh r1 = r7.a((java.lang.String) r2, (long) r10, (java.lang.String) r1)     // Catch:{ Exception -> 0x03b8 }
            boolean r5 = r13.c     // Catch:{ Exception -> 0x03b8 }
            if (r5 != 0) goto L_0x02d9
            goto L_0x02df
        L_0x02d9:
            r13.c()     // Catch:{ Exception -> 0x03b8 }
            r5 = 0
            r13.c = r5     // Catch:{ Exception -> 0x03b8 }
        L_0x02df:
            aucj r5 = r13.b     // Catch:{ Exception -> 0x03b8 }
            aqmz r5 = (defpackage.aqmz) r5     // Catch:{ Exception -> 0x03b8 }
            r1.getClass()     // Catch:{ Exception -> 0x03b8 }
            r5.g = r1     // Catch:{ Exception -> 0x03b8 }
            int r1 = r5.a     // Catch:{ Exception -> 0x03b8 }
            r1 = r1 | 32
            r5.a = r1     // Catch:{ Exception -> 0x03b8 }
            aqlq r1 = r7.a()     // Catch:{ Exception -> 0x03b8 }
            boolean r5 = r13.c     // Catch:{ Exception -> 0x03b8 }
            if (r5 != 0) goto L_0x02f7
            goto L_0x02fd
        L_0x02f7:
            r13.c()     // Catch:{ Exception -> 0x03b8 }
            r5 = 0
            r13.c = r5     // Catch:{ Exception -> 0x03b8 }
        L_0x02fd:
            aucj r5 = r13.b     // Catch:{ Exception -> 0x03b8 }
            aqmz r5 = (defpackage.aqmz) r5     // Catch:{ Exception -> 0x03b8 }
            r1.getClass()     // Catch:{ Exception -> 0x03b8 }
            r5.h = r1     // Catch:{ Exception -> 0x03b8 }
            int r1 = r5.a     // Catch:{ Exception -> 0x03b8 }
            r1 = r1 | 64
            r5.a = r1     // Catch:{ Exception -> 0x03b8 }
            aucj r1 = r13.i()     // Catch:{ Exception -> 0x03b8 }
            aqmz r1 = (defpackage.aqmz) r1     // Catch:{ Exception -> 0x03b8 }
            boolean r5 = r3.c     // Catch:{ Exception -> 0x03b8 }
            if (r5 != 0) goto L_0x0317
            goto L_0x031d
        L_0x0317:
            r3.c()     // Catch:{ Exception -> 0x03b8 }
            r5 = 0
            r3.c = r5     // Catch:{ Exception -> 0x03b8 }
        L_0x031d:
            aucj r5 = r3.b     // Catch:{ Exception -> 0x03b8 }
            aqna r5 = (defpackage.aqna) r5     // Catch:{ Exception -> 0x03b8 }
            r1.getClass()     // Catch:{ Exception -> 0x03b8 }
            r5.b = r1     // Catch:{ Exception -> 0x03b8 }
            int r1 = r5.a     // Catch:{ Exception -> 0x03b8 }
            r6 = 1
            r1 = r1 | r6
            r5.a = r1     // Catch:{ Exception -> 0x03b8 }
            aucj r1 = r3.i()     // Catch:{ Exception -> 0x03b8 }
            aqna r1 = (defpackage.aqna) r1     // Catch:{ Exception -> 0x03b8 }
            r7.a(r1)     // Catch:{ Exception -> 0x03b8 }
            iwd r1 = r12.a     // Catch:{ Exception -> 0x03b8 }
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x03b8 }
            int r3 = r9.b     // Catch:{ Exception -> 0x03b8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x03b8 }
            r6 = 0
            r5[r6] = r3     // Catch:{ Exception -> 0x03b8 }
            java.lang.String r3 = "GetResource(%s) RPC succeeded"
            r1.a(r3, r5)     // Catch:{ Exception -> 0x03b8 }
            aqso r1 = r4.b
            if (r1 == 0) goto L_0x034d
            goto L_0x034f
        L_0x034d:
            aqso r1 = defpackage.aqso.f
        L_0x034f:
            aqsr r1 = r1.d
            if (r1 != 0) goto L_0x0355
            aqsr r1 = defpackage.aqsr.d
        L_0x0355:
            boolean r1 = r1.equals(r9)
            defpackage.iva.a((boolean) r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r4.a
            r3 = 1
            r2 = r2 & r3
            if (r2 != 0) goto L_0x036b
            r5 = r12
            r6 = r14
            r3 = 0
            goto L_0x0386
        L_0x036b:
            aqso r2 = r4.b
            if (r2 == 0) goto L_0x0371
            r11 = r2
            goto L_0x0374
        L_0x0371:
            aqso r2 = defpackage.aqso.f
            r11 = r2
        L_0x0374:
            r10 = r12
            r5 = r12
            r3 = 0
            r12 = r14
            r6 = r14
            r14 = r17
            r15 = r18
            r16 = r0
            cui r2 = r10.a(r11, r12, r14, r15, r16)
            r1.add(r2)
        L_0x0386:
            aucx r8 = r4.c
            int r2 = r8.size()
        L_0x038c:
            if (r3 < r2) goto L_0x039f
            ctq r0 = new ctq
            r0.<init>(r5, r1)
            java.util.concurrent.ExecutorService r1 = r5.c
            ctr r2 = new ctr
            r2.<init>(r0)
            defpackage.acws.a((java.util.concurrent.Executor) r1, (java.util.concurrent.Callable) r2)
            r0 = r4
        L_0x039e:
            return r0
        L_0x039f:
            java.lang.Object r9 = r8.get(r3)
            r11 = r9
            aqso r11 = (defpackage.aqso) r11
            r10 = r5
            r12 = r6
            r14 = r17
            r15 = r18
            r16 = r0
            cui r9 = r10.a(r11, r12, r14, r15, r16)
            r1.add(r9)
            int r3 = r3 + 1
            goto L_0x038c
        L_0x03b8:
            r0 = move-exception
            goto L_0x03bd
        L_0x03ba:
            r0 = move-exception
            r22 = r5
        L_0x03bd:
            r5 = r12
            r3 = 0
            boolean r1 = r0 instanceof defpackage.babk
            java.lang.String r4 = "OTHER"
            if (r1 == 0) goto L_0x03e2
            r4 = r0
            babk r4 = (defpackage.babk) r4
            babj r4 = r4.a
            babg r4 = r4.r
            int r4 = r4.r
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 23
            r6.<init>(r7)
            java.lang.String r7 = "GRPC_STATUS:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L_0x0411
        L_0x03e2:
            boolean r6 = r0 instanceof defpackage.eif
            if (r6 == 0) goto L_0x040a
            r6 = r0
            eif r6 = (defpackage.eif) r6
            boolean r7 = r6 instanceof com.google.android.gms.auth.UserRecoverableAuthException
            if (r7 == 0) goto L_0x03f0
            java.lang.String r4 = "URA"
            goto L_0x03f7
        L_0x03f0:
            boolean r6 = r6 instanceof defpackage.eiu
            if (r6 != 0) goto L_0x03f5
            goto L_0x03f7
        L_0x03f5:
            java.lang.String r4 = "URN"
        L_0x03f7:
            java.lang.String r6 = "AUTH:"
            int r7 = r4.length()
            if (r7 != 0) goto L_0x0405
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0411
        L_0x0405:
            java.lang.String r4 = r6.concat(r4)
            goto L_0x0411
        L_0x040a:
            boolean r6 = r0 instanceof java.lang.SecurityException
            if (r6 != 0) goto L_0x040f
            goto L_0x0411
        L_0x040f:
            java.lang.String r4 = "SEC"
        L_0x0411:
            dis r6 = r5.g
            int r7 = r9.b
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r22
            aqna r8 = defpackage.aqna.d
            aucd r8 = r8.o()
            aqmz r12 = defpackage.aqmz.l
            aucd r12 = r12.o()
            aucf r12 = (defpackage.aucf) r12
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x042e
            goto L_0x0433
        L_0x042e:
            r12.c()
            r12.c = r3
        L_0x0433:
            aucj r13 = r12.b
            aqmz r13 = (defpackage.aqmz) r13
            r14 = 5
            r13.b = r14
            int r14 = r13.a
            r15 = 1
            r14 = r14 | r15
            r13.a = r14
            r3 = 2011(0x7db, float:2.818E-42)
            r13.c = r3
            r3 = 2
            r14 = r14 | r3
            r13.a = r14
            r3 = r14 | 8
            r13.a = r3
            r13.e = r7
            r3 = r3 | 16
            r13.a = r3
            r13.f = r15
            aqmh r2 = r6.a((java.lang.String) r2, (long) r10, (java.lang.String) r4)
            boolean r3 = r12.c
            if (r3 != 0) goto L_0x045d
            goto L_0x0463
        L_0x045d:
            r12.c()
            r3 = 0
            r12.c = r3
        L_0x0463:
            aucj r3 = r12.b
            aqmz r3 = (defpackage.aqmz) r3
            r2.getClass()
            r3.g = r2
            int r2 = r3.a
            r2 = r2 | 32
            r3.a = r2
            aqlq r2 = r6.a()
            boolean r3 = r12.c
            if (r3 != 0) goto L_0x047b
            goto L_0x0481
        L_0x047b:
            r12.c()
            r3 = 0
            r12.c = r3
        L_0x0481:
            aucj r3 = r12.b
            aqmz r3 = (defpackage.aqmz) r3
            r2.getClass()
            r3.h = r2
            int r2 = r3.a
            r2 = r2 | 64
            r3.a = r2
            boolean r2 = r8.c
            if (r2 != 0) goto L_0x0495
            goto L_0x049b
        L_0x0495:
            r8.c()
            r2 = 0
            r8.c = r2
        L_0x049b:
            aucj r2 = r8.b
            aqna r2 = (defpackage.aqna) r2
            aucj r3 = r12.i()
            aqmz r3 = (defpackage.aqmz) r3
            r3.getClass()
            r2.b = r3
            int r3 = r2.a
            r7 = 1
            r3 = r3 | r7
            r2.a = r3
            aucj r2 = r8.i()
            aqna r2 = (defpackage.aqna) r2
            r6.a(r2)
            java.lang.String r2 = "GetResource(%s) RPC failed - %s"
            if (r1 == 0) goto L_0x04d2
            iwd r1 = r5.a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r5 = r9.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            r7 = 1
            r3[r7] = r4
            r1.e(r2, r3)
            goto L_0x04e6
        L_0x04d2:
            r3 = 2
            r6 = 0
            r7 = 1
            iwd r1 = r5.a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r5 = r9.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r6] = r5
            r3[r7] = r4
            r1.e(r2, r0, r3)
        L_0x04e6:
            throw r0
        L_0x04e7:
            babk r0 = new babk
            babj r1 = defpackage.babj.j
            r0.<init>(r1)
            goto L_0x04f0
        L_0x04ef:
            throw r0
        L_0x04f0:
            goto L_0x04ef
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvf.call():java.lang.Object");
    }
}
