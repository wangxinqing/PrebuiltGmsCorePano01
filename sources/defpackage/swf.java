package defpackage;

import com.google.android.gms.measurement.internal.EventParcel;
import java.util.concurrent.Callable;

/* renamed from: swf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swf implements Callable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ suf c;

    public swf(suf suf, EventParcel eventParcel, String str) {
        this.c = suf;
        this.a = eventParcel;
        this.b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b7, code lost:
        r3.E().j.a("Resettable device id encryption failed", r0.getMessage());
        r2 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        r1 = r0;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ce, code lost:
        if (r8.e == null) goto L_0x03d0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0072, B:109:0x026a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "_r"
            suf r3 = r1.c
            sze r3 = r3.a
            r3.y()
            suf r3 = r1.c
            sze r3 = r3.a
            sxi r4 = r3.f
            defpackage.sze.a((defpackage.syx) r4)
            sxi r3 = r3.f
            com.google.android.gms.measurement.internal.EventParcel r4 = r1.a
            java.lang.String r15 = r1.b
            r3.h()
            svv r5 = r3.x
            r5.t()
            defpackage.iva.a((java.lang.Object) r4)
            defpackage.iva.c(r15)
            spg r5 = r3.v()
            suc r6 = defpackage.sud.X
            boolean r5 = r5.b(r15, r6)
            r16 = 0
            r14 = 0
            if (r5 == 0) goto L_0x086a
            java.lang.String r5 = r4.a
            java.lang.String r6 = "_iap"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x005b
            java.lang.String r5 = r4.a
            java.lang.String r6 = "_iapx"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x004c
            goto L_0x005b
        L_0x004c:
            sut r2 = r3.E()
            sur r2 = r2.j
            java.lang.String r3 = r4.a
            java.lang.String r4 = "Generating a payload for this event is not available. package_name, event_name"
            r2.a(r4, r15, r3)
            goto L_0x087c
        L_0x005b:
            tac r5 = defpackage.tac.b
            aucd r12 = r5.o()
            spj r5 = r3.n()
            r5.b()
            spj r5 = r3.n()     // Catch:{ all -> 0x085f }
            sou r13 = r5.b(r15)     // Catch:{ all -> 0x085f }
            if (r13 != 0) goto L_0x008f
            sut r2 = r3.E()     // Catch:{ all -> 0x008a }
            sur r2 = r2.j     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "Log and bundle not available. package_name"
            r2.a(r4, r15)     // Catch:{ all -> 0x008a }
            byte[] r2 = new byte[r14]     // Catch:{ all -> 0x008a }
        L_0x007f:
            spj r3 = r3.n()
            r3.d()
            r16 = r2
            goto L_0x087c
        L_0x008a:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x0862
        L_0x008f:
            boolean r5 = r13.o()     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x0840
            tad r5 = defpackage.tad.P     // Catch:{ all -> 0x085f }
            aucd r10 = r5.o()     // Catch:{ all -> 0x085f }
            boolean r5 = r10.c     // Catch:{ all -> 0x085f }
            if (r5 != 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x00a5:
            aucj r5 = r10.b     // Catch:{ all -> 0x085f }
            tad r5 = (defpackage.tad) r5     // Catch:{ all -> 0x085f }
            defpackage.tad.a(r5)     // Catch:{ all -> 0x085f }
            java.lang.String r5 = "android"
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x00b8:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r7 = r7 | 64
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.k = r5     // Catch:{ all -> 0x085f }
            java.lang.String r5 = r13.a()     // Catch:{ all -> 0x085f }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x00d2
            goto L_0x00ef
        L_0x00d2:
            java.lang.String r5 = r13.a()     // Catch:{ all -> 0x085f }
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x00e0:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.q = r5     // Catch:{ all -> 0x085f }
        L_0x00ef:
            java.lang.String r5 = r13.k()     // Catch:{ all -> 0x085f }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x00fa
            goto L_0x0117
        L_0x00fa:
            java.lang.String r5 = r13.k()     // Catch:{ all -> 0x085f }
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x0108:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.p = r5     // Catch:{ all -> 0x085f }
        L_0x0117:
            java.lang.String r5 = r13.i()     // Catch:{ all -> 0x085f }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x085f }
            if (r5 != 0) goto L_0x013e
            java.lang.String r5 = r13.i()     // Catch:{ all -> 0x008a }
            boolean r6 = r10.c     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x012a
            goto L_0x012f
        L_0x012a:
            r10.c()     // Catch:{ all -> 0x008a }
            r10.c = r14     // Catch:{ all -> 0x008a }
        L_0x012f:
            aucj r6 = r10.b     // Catch:{ all -> 0x008a }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x008a }
            r5.getClass()     // Catch:{ all -> 0x008a }
            int r7 = r6.a     // Catch:{ all -> 0x008a }
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            r6.a = r7     // Catch:{ all -> 0x008a }
            r6.r = r5     // Catch:{ all -> 0x008a }
        L_0x013e:
            long r5 = r13.j()     // Catch:{ all -> 0x085f }
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0165
            long r5 = r13.j()     // Catch:{ all -> 0x008a }
            int r6 = (int) r5     // Catch:{ all -> 0x008a }
            boolean r5 = r10.c     // Catch:{ all -> 0x008a }
            if (r5 != 0) goto L_0x0153
            goto L_0x0158
        L_0x0153:
            r10.c()     // Catch:{ all -> 0x008a }
            r10.c = r14     // Catch:{ all -> 0x008a }
        L_0x0158:
            aucj r5 = r10.b     // Catch:{ all -> 0x008a }
            tad r5 = (defpackage.tad) r5     // Catch:{ all -> 0x008a }
            int r7 = r5.a     // Catch:{ all -> 0x008a }
            r8 = 33554432(0x2000000, float:9.403955E-38)
            r7 = r7 | r8
            r5.a = r7     // Catch:{ all -> 0x008a }
            r5.E = r6     // Catch:{ all -> 0x008a }
        L_0x0165:
            long r5 = r13.l()     // Catch:{ all -> 0x085f }
            boolean r7 = r10.c     // Catch:{ all -> 0x085f }
            if (r7 != 0) goto L_0x016e
            goto L_0x0173
        L_0x016e:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x0173:
            aucj r7 = r10.b     // Catch:{ all -> 0x085f }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x085f }
            int r8 = r7.a     // Catch:{ all -> 0x085f }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r7.a = r8     // Catch:{ all -> 0x085f }
            r7.s = r5     // Catch:{ all -> 0x085f }
            long r5 = r13.n()     // Catch:{ all -> 0x085f }
            boolean r7 = r10.c     // Catch:{ all -> 0x085f }
            if (r7 != 0) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x018d:
            aucj r7 = r10.b     // Catch:{ all -> 0x085f }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x085f }
            int r8 = r7.b     // Catch:{ all -> 0x085f }
            r8 = r8 | 16
            r7.b = r8     // Catch:{ all -> 0x085f }
            r7.N = r5     // Catch:{ all -> 0x085f }
            defpackage.ayjy.c()     // Catch:{ all -> 0x085f }
            java.lang.String r5 = r13.c()     // Catch:{ all -> 0x085f }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x01ce
            java.lang.String r5 = r13.d()     // Catch:{ all -> 0x008a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x008a }
            if (r5 != 0) goto L_0x01ec
            java.lang.String r5 = r13.d()     // Catch:{ all -> 0x008a }
            boolean r6 = r10.c     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x01b9
            goto L_0x01be
        L_0x01b9:
            r10.c()     // Catch:{ all -> 0x008a }
            r10.c = r14     // Catch:{ all -> 0x008a }
        L_0x01be:
            aucj r6 = r10.b     // Catch:{ all -> 0x008a }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x008a }
            r5.getClass()     // Catch:{ all -> 0x008a }
            int r7 = r6.b     // Catch:{ all -> 0x008a }
            r7 = r7 | 4
            r6.b = r7     // Catch:{ all -> 0x008a }
            r6.K = r5     // Catch:{ all -> 0x008a }
            goto L_0x01ec
        L_0x01ce:
            java.lang.String r5 = r13.c()     // Catch:{ all -> 0x085f }
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x01d7
            goto L_0x01dc
        L_0x01d7:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x01dc:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r8 = 4194304(0x400000, float:5.877472E-39)
            r7 = r7 | r8
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.A = r5     // Catch:{ all -> 0x085f }
        L_0x01ec:
            long r5 = r13.m()     // Catch:{ all -> 0x085f }
            boolean r7 = r10.c     // Catch:{ all -> 0x085f }
            if (r7 != 0) goto L_0x01f5
            goto L_0x01fa
        L_0x01f5:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x01fa:
            aucj r7 = r10.b     // Catch:{ all -> 0x085f }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x085f }
            int r8 = r7.a     // Catch:{ all -> 0x085f }
            r9 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r9
            r7.a = r8     // Catch:{ all -> 0x085f }
            r7.x = r5     // Catch:{ all -> 0x085f }
            svv r5 = r3.x     // Catch:{ all -> 0x085f }
            boolean r5 = r5.q()     // Catch:{ all -> 0x085f }
            if (r5 != 0) goto L_0x0210
            goto L_0x024e
        L_0x0210:
            spg r5 = r3.v()     // Catch:{ all -> 0x085f }
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            java.lang.String r6 = r6.q     // Catch:{ all -> 0x085f }
            boolean r5 = r5.d(r6)     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x024e
            sze r5 = r3.j     // Catch:{ all -> 0x008a }
            aucj r6 = r10.b     // Catch:{ all -> 0x008a }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r6.q     // Catch:{ all -> 0x008a }
            r7 = 50
            java.lang.String r5 = r5.a((java.lang.String) r6, (long) r7)     // Catch:{ all -> 0x008a }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x024e
            boolean r6 = r10.c     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x0239
            goto L_0x023e
        L_0x0239:
            r10.c()     // Catch:{ all -> 0x008a }
            r10.c = r14     // Catch:{ all -> 0x008a }
        L_0x023e:
            aucj r6 = r10.b     // Catch:{ all -> 0x008a }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x008a }
            r5.getClass()     // Catch:{ all -> 0x008a }
            int r7 = r6.a     // Catch:{ all -> 0x008a }
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r8
            r6.a = r7     // Catch:{ all -> 0x008a }
            r6.I = r5     // Catch:{ all -> 0x008a }
        L_0x024e:
            svf r5 = r3.w()     // Catch:{ all -> 0x085f }
            java.lang.String r6 = r13.a()     // Catch:{ all -> 0x085f }
            android.util.Pair r5 = r5.a((java.lang.String) r6)     // Catch:{ all -> 0x085f }
            boolean r6 = r13.v()     // Catch:{ all -> 0x085f }
            if (r6 == 0) goto L_0x02cb
            java.lang.Object r6 = r5.first     // Catch:{ all -> 0x008a }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x008a }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x02cb
            java.lang.Object r6 = r5.first     // Catch:{ SecurityException -> 0x02b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SecurityException -> 0x02b6 }
            long r7 = r4.d     // Catch:{ SecurityException -> 0x02b6 }
            java.lang.String r7 = java.lang.Long.toString(r7)     // Catch:{ SecurityException -> 0x02b6 }
            java.lang.String r6 = r3.a(r6, r7)     // Catch:{ SecurityException -> 0x02b6 }
            boolean r7 = r10.c     // Catch:{ SecurityException -> 0x02b6 }
            if (r7 != 0) goto L_0x027d
            goto L_0x0282
        L_0x027d:
            r10.c()     // Catch:{ SecurityException -> 0x02b6 }
            r10.c = r14     // Catch:{ SecurityException -> 0x02b6 }
        L_0x0282:
            aucj r7 = r10.b     // Catch:{ SecurityException -> 0x02b6 }
            tad r7 = (defpackage.tad) r7     // Catch:{ SecurityException -> 0x02b6 }
            r6.getClass()     // Catch:{ SecurityException -> 0x02b6 }
            int r8 = r7.a     // Catch:{ SecurityException -> 0x02b6 }
            r9 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r9
            r7.a = r8     // Catch:{ SecurityException -> 0x02b6 }
            r7.u = r6     // Catch:{ SecurityException -> 0x02b6 }
            java.lang.Object r6 = r5.second     // Catch:{ all -> 0x008a }
            if (r6 == 0) goto L_0x02cb
            java.lang.Object r5 = r5.second     // Catch:{ all -> 0x008a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x008a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x008a }
            boolean r6 = r10.c     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x02a3
            goto L_0x02a8
        L_0x02a3:
            r10.c()     // Catch:{ all -> 0x008a }
            r10.c = r14     // Catch:{ all -> 0x008a }
        L_0x02a8:
            aucj r6 = r10.b     // Catch:{ all -> 0x008a }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x008a }
            int r7 = r6.a     // Catch:{ all -> 0x008a }
            r8 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 | r8
            r6.a = r7     // Catch:{ all -> 0x008a }
            r6.v = r5     // Catch:{ all -> 0x008a }
            goto L_0x02cb
        L_0x02b6:
            r0 = move-exception
            r2 = r0
            sut r4 = r3.E()     // Catch:{ all -> 0x008a }
            sur r4 = r4.j     // Catch:{ all -> 0x008a }
            java.lang.String r5 = "Resettable device id encryption failed"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x008a }
            r4.a(r5, r2)     // Catch:{ all -> 0x008a }
            byte[] r2 = new byte[r14]     // Catch:{ all -> 0x008a }
            goto L_0x007f
        L_0x02cb:
            spn r5 = r3.B()     // Catch:{ all -> 0x085f }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x085f }
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x02d8
            goto L_0x02dd
        L_0x02d8:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x02dd:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.m = r5     // Catch:{ all -> 0x085f }
            spn r5 = r3.B()     // Catch:{ all -> 0x085f }
            java.lang.String r5 = r5.c()     // Catch:{ all -> 0x085f }
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x02f9
            goto L_0x02fe
        L_0x02f9:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x02fe:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r7 = r7 | 128(0x80, float:1.794E-43)
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.l = r5     // Catch:{ all -> 0x085f }
            spn r5 = r3.B()     // Catch:{ all -> 0x085f }
            long r5 = r5.d()     // Catch:{ all -> 0x085f }
            int r6 = (int) r5     // Catch:{ all -> 0x085f }
            boolean r5 = r10.c     // Catch:{ all -> 0x085f }
            if (r5 != 0) goto L_0x031b
            goto L_0x0320
        L_0x031b:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x0320:
            aucj r5 = r10.b     // Catch:{ all -> 0x085f }
            tad r5 = (defpackage.tad) r5     // Catch:{ all -> 0x085f }
            int r7 = r5.a     // Catch:{ all -> 0x085f }
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r5.a = r7     // Catch:{ all -> 0x085f }
            r5.o = r6     // Catch:{ all -> 0x085f }
            spn r5 = r3.B()     // Catch:{ all -> 0x085f }
            java.lang.String r5 = r5.e()     // Catch:{ all -> 0x085f }
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x0339
            goto L_0x033e
        L_0x0339:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x033e:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r7 = r7 | 512(0x200, float:7.175E-43)
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.n = r5     // Catch:{ all -> 0x085f }
            java.lang.String r5 = r13.b()     // Catch:{ SecurityException -> 0x082a }
            long r6 = r4.d     // Catch:{ SecurityException -> 0x082a }
            java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ SecurityException -> 0x082a }
            java.lang.String r5 = r3.a(r5, r6)     // Catch:{ SecurityException -> 0x082a }
            boolean r6 = r10.c     // Catch:{ SecurityException -> 0x082a }
            if (r6 != 0) goto L_0x0360
            goto L_0x0365
        L_0x0360:
            r10.c()     // Catch:{ SecurityException -> 0x082a }
            r10.c = r14     // Catch:{ SecurityException -> 0x082a }
        L_0x0365:
            aucj r6 = r10.b     // Catch:{ SecurityException -> 0x082a }
            tad r6 = (defpackage.tad) r6     // Catch:{ SecurityException -> 0x082a }
            r5.getClass()     // Catch:{ SecurityException -> 0x082a }
            int r7 = r6.a     // Catch:{ SecurityException -> 0x082a }
            r8 = 262144(0x40000, float:3.67342E-40)
            r7 = r7 | r8
            r6.a = r7     // Catch:{ SecurityException -> 0x082a }
            r6.w = r5     // Catch:{ SecurityException -> 0x082a }
            java.lang.String r5 = r13.f()     // Catch:{ all -> 0x085f }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x0380
            goto L_0x039e
        L_0x0380:
            java.lang.String r5 = r13.f()     // Catch:{ all -> 0x085f }
            boolean r6 = r10.c     // Catch:{ all -> 0x085f }
            if (r6 != 0) goto L_0x0389
            goto L_0x038e
        L_0x0389:
            r10.c()     // Catch:{ all -> 0x085f }
            r10.c = r14     // Catch:{ all -> 0x085f }
        L_0x038e:
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            r5.getClass()     // Catch:{ all -> 0x085f }
            int r7 = r6.a     // Catch:{ all -> 0x085f }
            r8 = 16777216(0x1000000, float:2.3509887E-38)
            r7 = r7 | r8
            r6.a = r7     // Catch:{ all -> 0x085f }
            r6.D = r5     // Catch:{ all -> 0x085f }
        L_0x039e:
            java.lang.String r5 = r13.a()     // Catch:{ all -> 0x085f }
            spj r6 = r3.n()     // Catch:{ all -> 0x085f }
            java.util.List r6 = r6.a((java.lang.String) r5)     // Catch:{ all -> 0x085f }
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x085f }
        L_0x03ae:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x085f }
            if (r8 == 0) goto L_0x03c5
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x008a }
            szi r8 = (defpackage.szi) r8     // Catch:{ all -> 0x008a }
            java.lang.String r9 = "_lte"
            java.lang.String r11 = r8.c     // Catch:{ all -> 0x008a }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x008a }
            if (r9 == 0) goto L_0x03ae
            goto L_0x03c7
        L_0x03c5:
            r8 = r16
        L_0x03c7:
            r24 = 0
            if (r8 != 0) goto L_0x03cc
            goto L_0x03d0
        L_0x03cc:
            java.lang.Object r7 = r8.e     // Catch:{ all -> 0x085f }
            if (r7 != 0) goto L_0x03f3
        L_0x03d0:
            szi r7 = new szi     // Catch:{ all -> 0x008a }
            java.lang.String r19 = "auto"
            java.lang.String r20 = "_lte"
            jiq r8 = r3.A()     // Catch:{ all -> 0x008a }
            long r21 = r8.a()     // Catch:{ all -> 0x008a }
            java.lang.Long r23 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x008a }
            r17 = r7
            r18 = r5
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x008a }
            r6.add(r7)     // Catch:{ all -> 0x008a }
            spj r8 = r3.n()     // Catch:{ all -> 0x008a }
            r8.a((defpackage.szi) r7)     // Catch:{ all -> 0x008a }
        L_0x03f3:
            spg r7 = r3.v()     // Catch:{ all -> 0x085f }
            suc r8 = defpackage.sud.U     // Catch:{ all -> 0x085f }
            boolean r5 = r7.b(r5, r8)     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x0475
            szg r5 = r3.o()     // Catch:{ all -> 0x008a }
            sut r9 = r5.E()     // Catch:{ all -> 0x008a }
            sur r9 = r9.k     // Catch:{ all -> 0x008a }
            java.lang.String r11 = "Checking account type status for ad personalization signals"
            r9.a(r11)     // Catch:{ all -> 0x008a }
            spn r9 = r5.B()     // Catch:{ all -> 0x008a }
            boolean r9 = r9.f()     // Catch:{ all -> 0x008a }
            if (r9 == 0) goto L_0x0475
            java.lang.String r9 = r13.a()     // Catch:{ all -> 0x008a }
            boolean r11 = r13.v()     // Catch:{ all -> 0x008a }
            if (r11 == 0) goto L_0x0475
            svn r11 = r5.m()     // Catch:{ all -> 0x008a }
            boolean r11 = r11.d(r9)     // Catch:{ all -> 0x008a }
            if (r11 == 0) goto L_0x0475
            sut r11 = r5.E()     // Catch:{ all -> 0x008a }
            sur r11 = r11.j     // Catch:{ all -> 0x008a }
            java.lang.String r14 = "Turning off ad personalization due to account type"
            r11.a(r14)     // Catch:{ all -> 0x008a }
            java.util.Iterator r11 = r6.iterator()     // Catch:{ all -> 0x008a }
        L_0x043b:
            boolean r14 = r11.hasNext()     // Catch:{ all -> 0x008a }
            if (r14 != 0) goto L_0x0442
            goto L_0x0457
        L_0x0442:
            java.lang.String r14 = "_npa"
            java.lang.Object r17 = r11.next()     // Catch:{ all -> 0x008a }
            r7 = r17
            szi r7 = (defpackage.szi) r7     // Catch:{ all -> 0x008a }
            java.lang.String r7 = r7.c     // Catch:{ all -> 0x008a }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x043b
            r11.remove()     // Catch:{ all -> 0x008a }
        L_0x0457:
            szi r7 = new szi     // Catch:{ all -> 0x008a }
            java.lang.String r19 = "auto"
            java.lang.String r20 = "_npa"
            jiq r5 = r5.A()     // Catch:{ all -> 0x008a }
            long r21 = r5.a()     // Catch:{ all -> 0x008a }
            r17 = 1
            java.lang.Long r23 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x008a }
            r17 = r7
            r18 = r9
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x008a }
            r6.add(r7)     // Catch:{ all -> 0x008a }
        L_0x0475:
            int r5 = r6.size()     // Catch:{ all -> 0x085f }
            tah[] r5 = new defpackage.tah[r5]     // Catch:{ all -> 0x085f }
            r7 = 0
        L_0x047c:
            int r8 = r6.size()     // Catch:{ all -> 0x085f }
            if (r7 >= r8) goto L_0x04e7
            tah r8 = defpackage.tah.g     // Catch:{ all -> 0x008a }
            aucd r8 = r8.o()     // Catch:{ all -> 0x008a }
            java.lang.Object r9 = r6.get(r7)     // Catch:{ all -> 0x008a }
            szi r9 = (defpackage.szi) r9     // Catch:{ all -> 0x008a }
            java.lang.String r9 = r9.c     // Catch:{ all -> 0x008a }
            boolean r11 = r8.c     // Catch:{ all -> 0x008a }
            if (r11 != 0) goto L_0x0495
            goto L_0x049b
        L_0x0495:
            r8.c()     // Catch:{ all -> 0x008a }
            r11 = 0
            r8.c = r11     // Catch:{ all -> 0x008a }
        L_0x049b:
            aucj r11 = r8.b     // Catch:{ all -> 0x008a }
            tah r11 = (defpackage.tah) r11     // Catch:{ all -> 0x008a }
            r9.getClass()     // Catch:{ all -> 0x008a }
            int r14 = r11.a     // Catch:{ all -> 0x008a }
            r14 = r14 | 2
            r11.a = r14     // Catch:{ all -> 0x008a }
            r11.c = r9     // Catch:{ all -> 0x008a }
            java.lang.Object r9 = r6.get(r7)     // Catch:{ all -> 0x008a }
            szi r9 = (defpackage.szi) r9     // Catch:{ all -> 0x008a }
            r14 = r12
            long r11 = r9.d     // Catch:{ all -> 0x008a }
            boolean r9 = r8.c     // Catch:{ all -> 0x008a }
            if (r9 != 0) goto L_0x04b8
            goto L_0x04be
        L_0x04b8:
            r8.c()     // Catch:{ all -> 0x008a }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x008a }
        L_0x04be:
            aucj r9 = r8.b     // Catch:{ all -> 0x008a }
            tah r9 = (defpackage.tah) r9     // Catch:{ all -> 0x008a }
            int r1 = r9.a     // Catch:{ all -> 0x008a }
            r1 = r1 | 1
            r9.a = r1     // Catch:{ all -> 0x008a }
            r9.b = r11     // Catch:{ all -> 0x008a }
            szg r1 = r3.o()     // Catch:{ all -> 0x008a }
            java.lang.Object r9 = r6.get(r7)     // Catch:{ all -> 0x008a }
            szi r9 = (defpackage.szi) r9     // Catch:{ all -> 0x008a }
            java.lang.Object r9 = r9.e     // Catch:{ all -> 0x008a }
            r1.a((defpackage.aucd) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x008a }
            aucj r1 = r8.i()     // Catch:{ all -> 0x008a }
            tah r1 = (defpackage.tah) r1     // Catch:{ all -> 0x008a }
            r5[r7] = r1     // Catch:{ all -> 0x008a }
            int r7 = r7 + 1
            r1 = r27
            r12 = r14
            goto L_0x047c
        L_0x04e7:
            r14 = r12
            java.util.List r1 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x085f }
            boolean r5 = r10.c     // Catch:{ all -> 0x085f }
            if (r5 != 0) goto L_0x04f2
            r12 = 0
            goto L_0x04f8
        L_0x04f2:
            r10.c()     // Catch:{ all -> 0x085f }
            r12 = 0
            r10.c = r12     // Catch:{ all -> 0x085f }
        L_0x04f8:
            aucj r5 = r10.b     // Catch:{ all -> 0x085f }
            tad r5 = (defpackage.tad) r5     // Catch:{ all -> 0x085f }
            r5.b()     // Catch:{ all -> 0x085f }
            aucx r5 = r5.e     // Catch:{ all -> 0x085f }
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r5)     // Catch:{ all -> 0x085f }
            com.google.android.gms.measurement.internal.EventParams r1 = r4.b     // Catch:{ all -> 0x085f }
            android.os.Bundle r1 = r1.a()     // Catch:{ all -> 0x085f }
            java.lang.String r5 = "_c"
            r6 = 1
            r1.putLong(r5, r6)     // Catch:{ all -> 0x085f }
            sut r5 = r3.E()     // Catch:{ all -> 0x085f }
            sur r5 = r5.j     // Catch:{ all -> 0x085f }
            java.lang.String r6 = "Marking in-app purchase as real-time"
            r5.a(r6)     // Catch:{ all -> 0x085f }
            r5 = 1
            r1.putLong(r2, r5)     // Catch:{ all -> 0x085f }
            java.lang.String r5 = "_o"
            java.lang.String r6 = r4.c     // Catch:{ all -> 0x085f }
            r1.putString(r5, r6)     // Catch:{ all -> 0x085f }
            szj r5 = r3.x()     // Catch:{ all -> 0x085f }
            aucj r6 = r10.b     // Catch:{ all -> 0x085f }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085f }
            java.lang.String r6 = r6.q     // Catch:{ all -> 0x085f }
            boolean r5 = r5.g(r6)     // Catch:{ all -> 0x085f }
            if (r5 == 0) goto L_0x054e
            szj r5 = r3.x()     // Catch:{ all -> 0x008a }
            r6 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "_dbg"
            r5.a((android.os.Bundle) r1, (java.lang.String) r7, (java.lang.Object) r6)     // Catch:{ all -> 0x008a }
            szj r5 = r3.x()     // Catch:{ all -> 0x008a }
            r5.a((android.os.Bundle) r1, (java.lang.String) r2, (java.lang.Object) r6)     // Catch:{ all -> 0x008a }
        L_0x054e:
            spj r2 = r3.n()     // Catch:{ all -> 0x085f }
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x085f }
            spp r2 = r2.a((java.lang.String) r15, (java.lang.String) r5)     // Catch:{ all -> 0x085f }
            if (r2 == 0) goto L_0x056a
            long r5 = r2.f     // Catch:{ all -> 0x008a }
            long r7 = r4.d     // Catch:{ all -> 0x008a }
            spp r2 = r2.a(r7)     // Catch:{ all -> 0x008a }
            r26 = r10
            r17 = r13
            r18 = 0
            r12 = r5
            goto L_0x0587
        L_0x056a:
            spp r2 = new spp     // Catch:{ all -> 0x085f }
            java.lang.String r7 = r4.a     // Catch:{ all -> 0x085f }
            r8 = 0
            r17 = 0
            long r5 = r4.d     // Catch:{ all -> 0x085f }
            r19 = r5
            r5 = r2
            r6 = r15
            r26 = r10
            r10 = r17
            r17 = r13
            r18 = 0
            r12 = r19
            r5.<init>(r6, r7, r8, r10, r12)     // Catch:{ all -> 0x085f }
            r12 = r24
        L_0x0587:
            spj r5 = r3.n()     // Catch:{ all -> 0x085f }
            r5.a((defpackage.spp) r2)     // Catch:{ all -> 0x085f }
            spo r10 = new spo     // Catch:{ all -> 0x085f }
            svv r6 = r3.x     // Catch:{ all -> 0x085f }
            java.lang.String r7 = r4.c     // Catch:{ all -> 0x085f }
            java.lang.String r9 = r4.a     // Catch:{ all -> 0x085f }
            r20 = r2
            r19 = r3
            long r2 = r4.d     // Catch:{ all -> 0x0826 }
            r5 = r10
            r8 = r15
            r21 = r15
            r15 = r10
            r10 = r2
            r2 = r14
            r3 = 0
            r14 = r1
            r5.<init>((defpackage.svv) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (long) r12, (android.os.Bundle) r14)     // Catch:{ all -> 0x0826 }
            szz r1 = defpackage.szz.g     // Catch:{ all -> 0x0826 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0826 }
            long r5 = r15.d     // Catch:{ all -> 0x0826 }
            boolean r7 = r1.c     // Catch:{ all -> 0x0826 }
            if (r7 != 0) goto L_0x05b5
            goto L_0x05ba
        L_0x05b5:
            r1.c()     // Catch:{ all -> 0x0826 }
            r1.c = r3     // Catch:{ all -> 0x0826 }
        L_0x05ba:
            aucj r7 = r1.b     // Catch:{ all -> 0x0826 }
            szz r7 = (defpackage.szz) r7     // Catch:{ all -> 0x0826 }
            int r8 = r7.a     // Catch:{ all -> 0x0826 }
            r8 = r8 | 2
            r7.a = r8     // Catch:{ all -> 0x0826 }
            r7.d = r5     // Catch:{ all -> 0x0826 }
            java.lang.String r5 = r15.b     // Catch:{ all -> 0x0826 }
            r5.getClass()     // Catch:{ all -> 0x0826 }
            r6 = r8 | 1
            r7.a = r6     // Catch:{ all -> 0x0826 }
            r7.c = r5     // Catch:{ all -> 0x0826 }
            long r8 = r15.e     // Catch:{ all -> 0x0826 }
            r5 = r6 | 4
            r7.a = r5     // Catch:{ all -> 0x0826 }
            r7.e = r8     // Catch:{ all -> 0x0826 }
            com.google.android.gms.measurement.internal.EventParams r5 = r15.f     // Catch:{ all -> 0x0826 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0826 }
        L_0x05df:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0826 }
            if (r6 == 0) goto L_0x0621
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x061b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x061b }
            tab r7 = defpackage.tab.g     // Catch:{ all -> 0x061b }
            aucd r7 = r7.o()     // Catch:{ all -> 0x061b }
            boolean r8 = r7.c     // Catch:{ all -> 0x061b }
            if (r8 != 0) goto L_0x05f6
            goto L_0x05fb
        L_0x05f6:
            r7.c()     // Catch:{ all -> 0x061b }
            r7.c = r3     // Catch:{ all -> 0x061b }
        L_0x05fb:
            aucj r8 = r7.b     // Catch:{ all -> 0x061b }
            tab r8 = (defpackage.tab) r8     // Catch:{ all -> 0x061b }
            r6.getClass()     // Catch:{ all -> 0x061b }
            int r9 = r8.a     // Catch:{ all -> 0x061b }
            r9 = r9 | 1
            r8.a = r9     // Catch:{ all -> 0x061b }
            r8.b = r6     // Catch:{ all -> 0x061b }
            com.google.android.gms.measurement.internal.EventParams r8 = r15.f     // Catch:{ all -> 0x061b }
            java.lang.Object r6 = r8.a(r6)     // Catch:{ all -> 0x061b }
            szg r8 = r19.o()     // Catch:{ all -> 0x061b }
            r8.b((defpackage.aucd) r7, (java.lang.Object) r6)     // Catch:{ all -> 0x061b }
            r1.p((defpackage.aucd) r7)     // Catch:{ all -> 0x061b }
            goto L_0x05df
        L_0x061b:
            r0 = move-exception
            r1 = r0
            r4 = r19
            goto L_0x0862
        L_0x0621:
            r5 = r26
            r5.r((defpackage.aucd) r1)     // Catch:{ all -> 0x0826 }
            tae r6 = defpackage.tae.b     // Catch:{ all -> 0x0826 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0826 }
            taa r7 = defpackage.taa.d     // Catch:{ all -> 0x0826 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0826 }
            r8 = r20
            long r8 = r8.c     // Catch:{ all -> 0x0826 }
            boolean r10 = r7.c     // Catch:{ all -> 0x0826 }
            if (r10 != 0) goto L_0x063b
            goto L_0x0640
        L_0x063b:
            r7.c()     // Catch:{ all -> 0x0826 }
            r7.c = r3     // Catch:{ all -> 0x0826 }
        L_0x0640:
            aucj r10 = r7.b     // Catch:{ all -> 0x0826 }
            taa r10 = (defpackage.taa) r10     // Catch:{ all -> 0x0826 }
            int r11 = r10.a     // Catch:{ all -> 0x0826 }
            r11 = r11 | 2
            r10.a = r11     // Catch:{ all -> 0x0826 }
            r10.c = r8     // Catch:{ all -> 0x0826 }
            java.lang.String r4 = r4.a     // Catch:{ all -> 0x0826 }
            r4.getClass()     // Catch:{ all -> 0x0826 }
            r8 = r11 | 1
            r10.a = r8     // Catch:{ all -> 0x0826 }
            r10.b = r4     // Catch:{ all -> 0x0826 }
            boolean r4 = r6.c     // Catch:{ all -> 0x0826 }
            if (r4 != 0) goto L_0x065c
            goto L_0x0661
        L_0x065c:
            r6.c()     // Catch:{ all -> 0x0826 }
            r6.c = r3     // Catch:{ all -> 0x0826 }
        L_0x0661:
            aucj r4 = r6.b     // Catch:{ all -> 0x0826 }
            tae r4 = (defpackage.tae) r4     // Catch:{ all -> 0x0826 }
            aucj r7 = r7.i()     // Catch:{ all -> 0x0826 }
            taa r7 = (defpackage.taa) r7     // Catch:{ all -> 0x0826 }
            r7.getClass()     // Catch:{ all -> 0x0826 }
            aucx r8 = r4.a     // Catch:{ all -> 0x0826 }
            boolean r8 = r8.a()     // Catch:{ all -> 0x0826 }
            if (r8 == 0) goto L_0x0677
            goto L_0x067f
        L_0x0677:
            aucx r8 = r4.a     // Catch:{ all -> 0x0826 }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ all -> 0x0826 }
            r4.a = r8     // Catch:{ all -> 0x0826 }
        L_0x067f:
            aucx r4 = r4.a     // Catch:{ all -> 0x0826 }
            r4.add(r7)     // Catch:{ all -> 0x0826 }
            boolean r4 = r5.c     // Catch:{ all -> 0x0826 }
            if (r4 != 0) goto L_0x0689
            goto L_0x068e
        L_0x0689:
            r5.c()     // Catch:{ all -> 0x0826 }
            r5.c = r3     // Catch:{ all -> 0x0826 }
        L_0x068e:
            aucj r4 = r5.b     // Catch:{ all -> 0x0826 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0826 }
            aucj r6 = r6.i()     // Catch:{ all -> 0x0826 }
            tae r6 = (defpackage.tae) r6     // Catch:{ all -> 0x0826 }
            r6.getClass()     // Catch:{ all -> 0x0826 }
            r4.L = r6     // Catch:{ all -> 0x0826 }
            int r6 = r4.b     // Catch:{ all -> 0x0826 }
            r6 = r6 | 8
            r4.b = r6     // Catch:{ all -> 0x0826 }
            r4 = r19
            sze r6 = r4.j     // Catch:{ all -> 0x085d }
            spb r6 = r6.k()     // Catch:{ all -> 0x085d }
            java.lang.String r7 = r17.a()     // Catch:{ all -> 0x085d }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x085d }
            aucj r9 = r5.b     // Catch:{ all -> 0x085d }
            tad r9 = (defpackage.tad) r9     // Catch:{ all -> 0x085d }
            aucx r9 = r9.e     // Catch:{ all -> 0x085d }
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)     // Catch:{ all -> 0x085d }
            aucj r10 = r1.b     // Catch:{ all -> 0x085d }
            szz r10 = (defpackage.szz) r10     // Catch:{ all -> 0x085d }
            long r10 = r10.d     // Catch:{ all -> 0x085d }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x085d }
            aucj r11 = r1.b     // Catch:{ all -> 0x085d }
            szz r11 = (defpackage.szz) r11     // Catch:{ all -> 0x085d }
            long r11 = r11.d     // Catch:{ all -> 0x085d }
            java.util.List r6 = r6.a(r7, r8, r9, r10)     // Catch:{ all -> 0x085d }
            r5.V(r6)     // Catch:{ all -> 0x085d }
            aucj r6 = r1.b     // Catch:{ all -> 0x085d }
            szz r6 = (defpackage.szz) r6     // Catch:{ all -> 0x085d }
            int r7 = r6.a     // Catch:{ all -> 0x085d }
            r7 = r7 & 2
            if (r7 == 0) goto L_0x0702
            long r6 = r6.d     // Catch:{ all -> 0x085d }
            boolean r8 = r5.c     // Catch:{ all -> 0x085d }
            if (r8 != 0) goto L_0x06e5
            goto L_0x06ea
        L_0x06e5:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
        L_0x06ea:
            aucj r8 = r5.b     // Catch:{ all -> 0x085d }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x085d }
            int r9 = r8.a     // Catch:{ all -> 0x085d }
            r9 = r9 | 4
            r8.a = r9     // Catch:{ all -> 0x085d }
            r8.g = r6     // Catch:{ all -> 0x085d }
            aucj r1 = r1.b     // Catch:{ all -> 0x085d }
            szz r1 = (defpackage.szz) r1     // Catch:{ all -> 0x085d }
            long r6 = r1.d     // Catch:{ all -> 0x085d }
            r1 = r9 | 8
            r8.a = r1     // Catch:{ all -> 0x085d }
            r8.h = r6     // Catch:{ all -> 0x085d }
        L_0x0702:
            long r6 = r17.h()     // Catch:{ all -> 0x085d }
            int r1 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r1 == 0) goto L_0x0721
            boolean r1 = r5.c     // Catch:{ all -> 0x085d }
            if (r1 != 0) goto L_0x070f
        L_0x070e:
            goto L_0x0715
        L_0x070f:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
            goto L_0x070e
        L_0x0715:
            aucj r1 = r5.b     // Catch:{ all -> 0x085d }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x085d }
            int r8 = r1.a     // Catch:{ all -> 0x085d }
            r8 = r8 | 32
            r1.a = r8     // Catch:{ all -> 0x085d }
            r1.j = r6     // Catch:{ all -> 0x085d }
        L_0x0721:
            long r8 = r17.g()     // Catch:{ all -> 0x085d }
            int r1 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r1 == 0) goto L_0x0740
            boolean r1 = r5.c     // Catch:{ all -> 0x085d }
            if (r1 != 0) goto L_0x072e
            goto L_0x0733
        L_0x072e:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
        L_0x0733:
            aucj r1 = r5.b     // Catch:{ all -> 0x085d }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x085d }
            int r6 = r1.a     // Catch:{ all -> 0x085d }
            r6 = r6 | 16
            r1.a = r6     // Catch:{ all -> 0x085d }
            r1.i = r8     // Catch:{ all -> 0x085d }
            goto L_0x075a
        L_0x0740:
            int r1 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r1 == 0) goto L_0x075a
            boolean r1 = r5.c     // Catch:{ all -> 0x085d }
            if (r1 != 0) goto L_0x0749
            goto L_0x074e
        L_0x0749:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
        L_0x074e:
            aucj r1 = r5.b     // Catch:{ all -> 0x085d }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x085d }
            int r8 = r1.a     // Catch:{ all -> 0x085d }
            r8 = r8 | 16
            r1.a = r8     // Catch:{ all -> 0x085d }
            r1.i = r6     // Catch:{ all -> 0x085d }
        L_0x075a:
            r17.s()     // Catch:{ all -> 0x085d }
            long r6 = r17.p()     // Catch:{ all -> 0x085d }
            int r1 = (int) r6     // Catch:{ all -> 0x085d }
            boolean r6 = r5.c     // Catch:{ all -> 0x085d }
            if (r6 != 0) goto L_0x0767
            goto L_0x076c
        L_0x0767:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
        L_0x076c:
            aucj r6 = r5.b     // Catch:{ all -> 0x085d }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x085d }
            int r7 = r6.a     // Catch:{ all -> 0x085d }
            r8 = 1048576(0x100000, float:1.469368E-39)
            r7 = r7 | r8
            r6.a = r7     // Catch:{ all -> 0x085d }
            r6.y = r1     // Catch:{ all -> 0x085d }
            spg r1 = r4.v()     // Catch:{ all -> 0x085d }
            long r6 = r1.b()     // Catch:{ all -> 0x085d }
            boolean r1 = r5.c     // Catch:{ all -> 0x085d }
            if (r1 != 0) goto L_0x0786
            goto L_0x078b
        L_0x0786:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
        L_0x078b:
            aucj r1 = r5.b     // Catch:{ all -> 0x085d }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x085d }
            int r8 = r1.a     // Catch:{ all -> 0x085d }
            r9 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r9
            r1.a = r8     // Catch:{ all -> 0x085d }
            r1.t = r6     // Catch:{ all -> 0x085d }
            jiq r1 = r4.A()     // Catch:{ all -> 0x085d }
            long r6 = r1.a()     // Catch:{ all -> 0x085d }
            boolean r1 = r5.c     // Catch:{ all -> 0x085d }
            if (r1 != 0) goto L_0x07a6
            goto L_0x07ab
        L_0x07a6:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
        L_0x07ab:
            aucj r1 = r5.b     // Catch:{ all -> 0x085d }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x085d }
            int r8 = r1.a     // Catch:{ all -> 0x085d }
            r8 = r8 | 2
            r1.a = r8     // Catch:{ all -> 0x085d }
            r1.f = r6     // Catch:{ all -> 0x085d }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x085d }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x085d }
            boolean r6 = r5.c     // Catch:{ all -> 0x085d }
            if (r6 != 0) goto L_0x07c2
            goto L_0x07c7
        L_0x07c2:
            r5.c()     // Catch:{ all -> 0x085d }
            r5.c = r3     // Catch:{ all -> 0x085d }
        L_0x07c7:
            aucj r3 = r5.b     // Catch:{ all -> 0x085d }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x085d }
            int r6 = r3.a     // Catch:{ all -> 0x085d }
            r7 = 8388608(0x800000, float:1.17549435E-38)
            r6 = r6 | r7
            r3.a = r6     // Catch:{ all -> 0x085d }
            r3.B = r1     // Catch:{ all -> 0x085d }
            r2.q((defpackage.aucd) r5)     // Catch:{ all -> 0x085d }
            aucj r1 = r5.b     // Catch:{ all -> 0x085d }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x085d }
            long r6 = r1.g     // Catch:{ all -> 0x085d }
            r1 = r17
            r1.a((long) r6)     // Catch:{ all -> 0x085d }
            aucj r3 = r5.b     // Catch:{ all -> 0x085d }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x085d }
            long r5 = r3.h     // Catch:{ all -> 0x085d }
            r1.b((long) r5)     // Catch:{ all -> 0x085d }
            spj r3 = r4.n()     // Catch:{ all -> 0x085d }
            r3.a((defpackage.sou) r1)     // Catch:{ all -> 0x085d }
            spj r1 = r4.n()     // Catch:{ all -> 0x085d }
            r1.c()     // Catch:{ all -> 0x085d }
            spj r1 = r4.n()
            r1.d()
            szg r1 = r4.o()     // Catch:{ IOException -> 0x0814 }
            aucj r2 = r2.i()     // Catch:{ IOException -> 0x0814 }
            tac r2 = (defpackage.tac) r2     // Catch:{ IOException -> 0x0814 }
            byte[] r2 = r2.k()     // Catch:{ IOException -> 0x0814 }
            byte[] r16 = r1.b(r2)     // Catch:{ IOException -> 0x0814 }
            goto L_0x087c
        L_0x0814:
            r0 = move-exception
            r1 = r0
            sut r2 = r4.E()
            sur r2 = r2.c
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r21)
            java.lang.String r4 = "Data loss. Failed to bundle and serialize. appId"
            r2.a(r4, r3, r1)
            goto L_0x087c
        L_0x0826:
            r0 = move-exception
            r4 = r19
            goto L_0x0861
        L_0x082a:
            r0 = move-exception
            r4 = r3
            r3 = 0
            r1 = r0
            sut r2 = r4.E()     // Catch:{ all -> 0x085d }
            sur r2 = r2.j     // Catch:{ all -> 0x085d }
            java.lang.String r5 = "app instance id encryption failed"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x085d }
            r2.a(r5, r1)     // Catch:{ all -> 0x085d }
            byte[] r1 = new byte[r3]     // Catch:{ all -> 0x085d }
            goto L_0x0853
        L_0x0840:
            r4 = r3
            r21 = r15
            r3 = 0
            sut r1 = r4.E()     // Catch:{ all -> 0x085d }
            sur r1 = r1.j     // Catch:{ all -> 0x085d }
            java.lang.String r2 = "Log and bundle disabled. package_name"
            r5 = r21
            r1.a(r2, r5)     // Catch:{ all -> 0x085d }
            byte[] r1 = new byte[r3]     // Catch:{ all -> 0x085d }
        L_0x0853:
            spj r2 = r4.n()
            r2.d()
            r16 = r1
            goto L_0x087c
        L_0x085d:
            r0 = move-exception
            goto L_0x0861
        L_0x085f:
            r0 = move-exception
            r4 = r3
        L_0x0861:
            r1 = r0
        L_0x0862:
            spj r2 = r4.n()
            r2.d()
            throw r1
        L_0x086a:
            r4 = r3
            r5 = r15
            r3 = 0
            sut r1 = r4.E()
            sur r1 = r1.j
            java.lang.String r2 = "Generating ScionPayload disabled. packageName"
            r1.a(r2, r5)
            byte[] r1 = new byte[r3]
            r16 = r1
        L_0x087c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swf.call():java.lang.Object");
    }
}
