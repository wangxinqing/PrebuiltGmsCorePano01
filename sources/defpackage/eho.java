package defpackage;

import android.os.SystemClock;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: eho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eho extends nis {
    private final aqof a;
    private final LogAuditRecordsRequest b;
    private final ifu c;
    private egk d;
    private long e;

    public eho(aqof aqof, LogAuditRecordsRequest logAuditRecordsRequest, ifu ifu) {
        super(154, "LogAuditRecordsOperation");
        this.a = aqof;
        this.b = logAuditRecordsRequest;
        this.c = ifu;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0319 A[Catch:{ babl -> 0x030d, babk -> 0x030b, eif -> 0x02fb, all -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0322 A[Catch:{ babl -> 0x030d, babk -> 0x030b, eif -> 0x02fb, all -> 0x032c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.String r2 = "Database error"
            long r3 = android.os.SystemClock.elapsedRealtime()
            r1.e = r3
            egk r3 = new egk
            r3.<init>(r0)
            r1.d = r3
            boolean r3 = defpackage.awie.c()
            java.lang.String r4 = "Empty request."
            r5 = 10
            if (r3 != 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            com.google.android.gms.audit.LogAuditRecordsRequest r3 = r1.b
            if (r3 == 0) goto L_0x0367
            byte[][] r3 = r3.d
            if (r3 == 0) goto L_0x0367
        L_0x0026:
            awia r3 = defpackage.awia.a
            awib r3 = r3.a()
            egz r3 = r3.a()
            aucx r3 = r3.a
            int r6 = r3.size()
            r7 = 0
            r8 = 0
        L_0x0038:
            r9 = 24500(0x5fb4, float:3.4332E-41)
            r10 = 2
            if (r8 >= r6) goto L_0x0080
            java.lang.Object r11 = r3.get(r8)
            eha r11 = (defpackage.eha) r11
            java.lang.String r12 = r11.b
            aqof r13 = r1.a
            java.lang.String r13 = r13.f
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007d
            aqof r12 = r1.a
            int r12 = r12.e
            int r13 = r11.a
            r10 = r10 & r13
            if (r10 == 0) goto L_0x0075
            long r12 = (long) r12
            ehb r10 = r11.c
            if (r10 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            ehb r10 = defpackage.ehb.c
        L_0x0060:
            long r14 = r10.a
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x0067
        L_0x0066:
            goto L_0x007d
        L_0x0067:
            ehb r10 = r11.c
            if (r10 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            ehb r10 = defpackage.ehb.c
        L_0x006e:
            long r10 = r10.b
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0075
            goto L_0x0066
        L_0x0075:
            nja r0 = new nja
            java.lang.String r2 = "Request rejected."
            r0.<init>(r9, r2)
            throw r0
        L_0x007d:
            int r8 = r8 + 1
            goto L_0x0038
        L_0x0080:
            com.google.android.gms.audit.LogAuditRecordsRequest r3 = r1.b
            byte[][] r3 = r3.d
            int r6 = r3.length
            r8 = 0
        L_0x0086:
            if (r8 < r6) goto L_0x0331
            com.google.android.gms.audit.LogAuditRecordsRequest r3 = r1.b
            byte[][] r4 = r3.d
            int r5 = r4.length
            aqoc[] r6 = new defpackage.aqoc[r5]
            r8 = 0
        L_0x0090:
            r11 = 8
            r12 = 1
            if (r8 >= r5) goto L_0x019b
            aqoc r13 = defpackage.aqoc.h
            aucd r13 = r13.o()
            int r14 = r3.b
            boolean r15 = r13.c
            if (r15 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            r13.c()
            r13.c = r7
        L_0x00a7:
            aucj r15 = r13.b
            aqoc r15 = (defpackage.aqoc) r15
            int r9 = r15.a
            r9 = r9 | 4
            r15.a = r9
            r15.c = r14
            aqoj r9 = defpackage.aqoj.c
            aucd r9 = r9.o()
            aqof r14 = r1.a
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x00c0
            goto L_0x00c5
        L_0x00c0:
            r9.c()
            r9.c = r7
        L_0x00c5:
            aucj r15 = r9.b
            aqoj r15 = (defpackage.aqoj) r15
            r14.getClass()
            r15.b = r14
            r15.a = r12
            boolean r14 = r13.c
            if (r14 != 0) goto L_0x00d5
            goto L_0x00da
        L_0x00d5:
            r13.c()
            r13.c = r7
        L_0x00da:
            aucj r14 = r13.b
            aqoc r14 = (defpackage.aqoc) r14
            aucj r9 = r9.i()
            aqoj r9 = (defpackage.aqoj) r9
            r9.getClass()
            r14.d = r9
            int r9 = r14.a
            r9 = r9 | r11
            r14.a = r9
            aqok r9 = defpackage.aqok.d
            aucd r9 = r9.o()
            long r14 = java.lang.System.currentTimeMillis()
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            r9.c()
            r9.c = r7
        L_0x0102:
            aucj r11 = r9.b
            aqok r11 = (defpackage.aqok) r11
            int r10 = r11.a
            r10 = r10 | r12
            r11.a = r10
            r11.b = r14
            boolean r10 = r13.c
            if (r10 != 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            r13.c()
            r13.c = r7
        L_0x0117:
            aucj r10 = r13.b
            aqoc r10 = (defpackage.aqoc) r10
            aucj r9 = r9.i()
            aqok r9 = (defpackage.aqok) r9
            r9.getClass()
            r10.e = r9
            int r9 = r10.a
            r9 = r9 | 16
            r10.a = r9
            r9 = r4[r8]
            auay r9 = defpackage.auay.a((byte[]) r9)
            boolean r10 = r13.c
            if (r10 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r13.c()
            r13.c = r7
        L_0x013c:
            aucj r10 = r13.b
            aqoc r10 = (defpackage.aqoc) r10
            r9.getClass()
            int r11 = r10.a
            r11 = r11 | r12
            r10.a = r11
            r10.b = r9
            byte[] r9 = r3.e
            if (r9 == 0) goto L_0x016b
            auay r9 = defpackage.auay.a((byte[]) r9)
            boolean r10 = r13.c
            if (r10 != 0) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            r13.c()
            r13.c = r7
        L_0x015c:
            aucj r10 = r13.b
            aqoc r10 = (defpackage.aqoc) r10
            r9.getClass()
            int r11 = r10.a
            r11 = r11 | 64
            r10.a = r11
            r10.g = r9
        L_0x016b:
            byte[] r9 = r3.f
            if (r9 == 0) goto L_0x018c
            auay r9 = defpackage.auay.a((byte[]) r9)
            boolean r10 = r13.c
            if (r10 != 0) goto L_0x0178
            goto L_0x017d
        L_0x0178:
            r13.c()
            r13.c = r7
        L_0x017d:
            aucj r10 = r13.b
            aqoc r10 = (defpackage.aqoc) r10
            r9.getClass()
            int r11 = r10.a
            r11 = r11 | 32
            r10.a = r11
            r10.f = r9
        L_0x018c:
            aucj r9 = r13.i()
            aqoc r9 = (defpackage.aqoc) r9
            r6[r8] = r9
            int r8 = r8 + 1
            r9 = 24500(0x5fb4, float:3.4332E-41)
            r10 = 2
            goto L_0x0090
        L_0x019b:
            com.google.android.gms.audit.LogAuditRecordsRequest r3 = r1.b
            int r3 = r3.a
            r4 = 0
            if (r3 == r12) goto L_0x022f
            r8 = 2
            if (r3 == r8) goto L_0x01a6
            return
        L_0x01a6:
            egt r3 = new egt
            r3.<init>(r0)
            int r8 = r3.b()     // Catch:{ LevelDbException -> 0x021d }
            int r8 = r8 + r5
            long r8 = (long) r8     // Catch:{ LevelDbException -> 0x021d }
            long r12 = defpackage.awie.b()     // Catch:{ LevelDbException -> 0x021d }
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0213
            java.lang.String r8 = ""
            com.google.android.gms.audit.LogAuditRecordsRequest r9 = r1.b     // Catch:{ LevelDbException -> 0x021d }
            java.lang.String r9 = r9.c     // Catch:{ LevelDbException -> 0x021d }
            boolean r9 = defpackage.amrk.a((java.lang.String) r9)     // Catch:{ LevelDbException -> 0x021d }
            if (r9 != 0) goto L_0x01d2
            com.google.android.gms.audit.LogAuditRecordsRequest r9 = r1.b     // Catch:{ eif -> 0x01d0, IOException -> 0x01ce }
            java.lang.String r9 = r9.c     // Catch:{ all -> 0x021b }
            java.lang.String r8 = defpackage.eim.f(r0, r9)     // Catch:{ eif -> 0x01d0, IOException -> 0x01ce }
            goto L_0x01d3
        L_0x01ce:
            r0 = move-exception
            goto L_0x01d3
        L_0x01d0:
            r0 = move-exception
            goto L_0x01d3
        L_0x01d2:
        L_0x01d3:
        L_0x01d4:
            if (r7 >= r5) goto L_0x01e7
            r0 = r6[r7]     // Catch:{ LevelDbException -> 0x021d }
            boolean r0 = r3.a(r0, r8)     // Catch:{ LevelDbException -> 0x021d }
            if (r0 == 0) goto L_0x01e1
            int r7 = r7 + 1
            goto L_0x01d4
        L_0x01e1:
            nja r0 = new nja     // Catch:{ LevelDbException -> 0x021d }
            r0.<init>(r11, r2)     // Catch:{ LevelDbException -> 0x021d }
            throw r0     // Catch:{ LevelDbException -> 0x021d }
        L_0x01e7:
            egk r0 = r1.d     // Catch:{ LevelDbException -> 0x021d }
            r0.a((defpackage.egt) r3)     // Catch:{ LevelDbException -> 0x021d }
            r3.close()
            ehr r0 = defpackage.ehr.a()
            r0.b()
            egk r2 = r1.d
            com.google.android.gms.audit.LogAuditRecordsRequest r3 = r1.b
            aqof r4 = r1.a
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r1.e
            long r5 = r5 - r7
            r7 = -1
            r2.a((com.google.android.gms.audit.LogAuditRecordsRequest) r3, (defpackage.aqof) r4, (long) r5, (int) r7)
            ifu r0 = r1.c
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = -1
            r2.<init>(r3)
            r0.a(r2)
            return
        L_0x0213:
            nja r0 = new nja     // Catch:{ LevelDbException -> 0x021d }
            java.lang.String r5 = "Cache is full."
            r0.<init>(r11, r5)     // Catch:{ LevelDbException -> 0x021d }
            throw r0     // Catch:{ LevelDbException -> 0x021d }
        L_0x021b:
            r0 = move-exception
            goto L_0x0224
        L_0x021d:
            r0 = move-exception
            nja r5 = new nja     // Catch:{  }
            r5.<init>(r11, r2, r4, r0)     // Catch:{  }
            throw r5     // Catch:{  }
        L_0x0224:
            r3.close()
            ehr r2 = defpackage.ehr.a()
            r2.b()
            throw r0
        L_0x022f:
            ehq r2 = new ehq
            r2.<init>(r0)
            com.google.android.gms.audit.LogAuditRecordsRequest r0 = r1.b
            java.lang.String r0 = r0.c
            aqof r3 = r1.a
            java.lang.String r3 = r3.f
            android.content.Context r8 = r2.a
            java.lang.String r9 = r8.getPackageName()
            java.util.List r8 = defpackage.jgu.d(r8, r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x024a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x025f
            java.lang.Object r9 = r8.next()
            android.accounts.Account r9 = (android.accounts.Account) r9
            java.lang.String r10 = r9.name
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x024a
            goto L_0x0260
        L_0x025f:
            r9 = r4
        L_0x0260:
            com.google.android.gms.common.internal.ClientContext r0 = r2.a((android.accounts.Account) r9, (java.lang.String) r3)
            boolean r3 = r0.f()
            r8 = 0
        L_0x0269:
            if (r8 < r5) goto L_0x028f
            egk r0 = r1.d     // Catch:{ all -> 0x032c }
            com.google.android.gms.audit.LogAuditRecordsRequest r3 = r1.b     // Catch:{ all -> 0x032c }
            aqof r4 = r1.a     // Catch:{ all -> 0x032c }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x032c }
            long r7 = r1.e     // Catch:{ all -> 0x032c }
            long r20 = r5 - r7
            r22 = 0
            r17 = r0
            r18 = r3
            r19 = r4
            r17.a((com.google.android.gms.audit.LogAuditRecordsRequest) r18, (defpackage.aqof) r19, (long) r20, (int) r22)     // Catch:{ all -> 0x032c }
            ifu r0 = r1.c     // Catch:{ all -> 0x032c }
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x032c }
            r0.a(r3)     // Catch:{ all -> 0x032c }
            r2.a()
            return
        L_0x028f:
            r9 = r6[r8]     // Catch:{ all -> 0x032c }
            r10 = 5
            java.lang.Object r11 = r9.c(r10)     // Catch:{ all -> 0x032c }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ all -> 0x032c }
            r11.a((defpackage.aucj) r9)     // Catch:{ all -> 0x032c }
            aqok r9 = r9.e     // Catch:{ all -> 0x032c }
            if (r9 == 0) goto L_0x02a0
            goto L_0x02a2
        L_0x02a0:
            aqok r9 = defpackage.aqok.d     // Catch:{ all -> 0x032c }
        L_0x02a2:
            java.lang.Object r10 = r9.c(r10)     // Catch:{ all -> 0x032c }
            aucd r10 = (defpackage.aucd) r10     // Catch:{ all -> 0x032c }
            r10.a((defpackage.aucj) r9)     // Catch:{ all -> 0x032c }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x032c }
            boolean r9 = r10.c     // Catch:{ all -> 0x032c }
            if (r9 != 0) goto L_0x02b5
            goto L_0x02ba
        L_0x02b5:
            r10.c()     // Catch:{ all -> 0x032c }
            r10.c = r7     // Catch:{ all -> 0x032c }
        L_0x02ba:
            aucj r9 = r10.b     // Catch:{ all -> 0x032c }
            aqok r9 = (defpackage.aqok) r9     // Catch:{ all -> 0x032c }
            int r15 = r9.a     // Catch:{ all -> 0x032c }
            r16 = 2
            r15 = r15 | 2
            r9.a = r15     // Catch:{ all -> 0x032c }
            r9.c = r13     // Catch:{ all -> 0x032c }
            boolean r9 = r11.c     // Catch:{ all -> 0x032c }
            if (r9 != 0) goto L_0x02cd
            goto L_0x02d2
        L_0x02cd:
            r11.c()     // Catch:{ all -> 0x032c }
            r11.c = r7     // Catch:{ all -> 0x032c }
        L_0x02d2:
            aucj r9 = r11.b     // Catch:{ all -> 0x032c }
            aqoc r9 = (defpackage.aqoc) r9     // Catch:{ all -> 0x032c }
            aucj r10 = r10.i()     // Catch:{ all -> 0x032c }
            aqok r10 = (defpackage.aqok) r10     // Catch:{ all -> 0x032c }
            aqoc r13 = defpackage.aqoc.h     // Catch:{ all -> 0x032c }
            r10.getClass()     // Catch:{ all -> 0x032c }
            r9.e = r10     // Catch:{ all -> 0x032c }
            int r10 = r9.a     // Catch:{ all -> 0x032c }
            r10 = r10 | 16
            r9.a = r10     // Catch:{ all -> 0x032c }
            aucj r9 = r11.i()     // Catch:{ all -> 0x032c }
            aqoc r9 = (defpackage.aqoc) r9     // Catch:{ all -> 0x032c }
            r2.a((com.google.android.gms.common.internal.ClientContext) r0, (defpackage.aqoc) r9)     // Catch:{ babl -> 0x030d, babk -> 0x030b, eif -> 0x02fb }
            egk r10 = r1.d     // Catch:{ babl -> 0x030d, babk -> 0x030b, eif -> 0x02fb }
            r10.a((boolean) r12, (boolean) r3, (boolean) r12, (defpackage.aqoc) r9)     // Catch:{ babl -> 0x030d, babk -> 0x030b, eif -> 0x02fb }
            int r8 = r8 + 1
            goto L_0x0269
        L_0x02fb:
            r0 = move-exception
            egk r5 = r1.d     // Catch:{ all -> 0x032c }
            r5.a((boolean) r12, (boolean) r3, (boolean) r7, (defpackage.aqoc) r9)     // Catch:{ all -> 0x032c }
            nja r3 = new nja     // Catch:{ all -> 0x032c }
            r5 = 13
            java.lang.String r6 = "Authentication failed"
            r3.<init>(r5, r6, r4, r0)     // Catch:{ all -> 0x032c }
            throw r3     // Catch:{ all -> 0x032c }
        L_0x030b:
            r0 = move-exception
            goto L_0x030e
        L_0x030d:
            r0 = move-exception
        L_0x030e:
            egk r5 = r1.d     // Catch:{ all -> 0x032c }
            r5.a((boolean) r12, (boolean) r3, (boolean) r7, (defpackage.aqoc) r9)     // Catch:{ all -> 0x032c }
            boolean r3 = defpackage.ehq.a(r0)     // Catch:{ all -> 0x032c }
            if (r3 == 0) goto L_0x0322
            nja r3 = new nja     // Catch:{ all -> 0x032c }
            r5 = 7
            java.lang.String r6 = "RPC failed"
            r3.<init>(r5, r6, r4, r0)     // Catch:{ all -> 0x032c }
            throw r3     // Catch:{ all -> 0x032c }
        L_0x0322:
            nja r3 = new nja     // Catch:{ all -> 0x032c }
            java.lang.String r5 = "Request rejected"
            r9 = 24500(0x5fb4, float:3.4332E-41)
            r3.<init>(r9, r5, r4, r0)     // Catch:{ all -> 0x032c }
            throw r3     // Catch:{ all -> 0x032c }
        L_0x032c:
            r0 = move-exception
            r2.a()
            throw r0
        L_0x0331:
            r16 = 2
            r10 = r3[r8]
            awie r11 = defpackage.awie.a
            awif r11 = r11.a()
            boolean r11 = r11.d()
            if (r11 != 0) goto L_0x0342
            goto L_0x0344
        L_0x0342:
            if (r10 == 0) goto L_0x0361
        L_0x0344:
            int r10 = r10.length
            long r10 = (long) r10
            awie r12 = defpackage.awie.a
            awif r12 = r12.a()
            long r12 = r12.a()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x0359
            int r8 = r8 + 1
            r10 = 2
            goto L_0x0086
        L_0x0359:
            nja r0 = new nja
            java.lang.String r2 = "Size exceeds maximum record size."
            r0.<init>(r5, r2)
            throw r0
        L_0x0361:
            nja r0 = new nja
            r0.<init>(r5, r4)
            throw r0
        L_0x0367:
            nja r0 = new nja
            r0.<init>(r5, r4)
            goto L_0x036e
        L_0x036d:
            throw r0
        L_0x036e:
            goto L_0x036d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eho.a(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        LogAuditRecordsRequest logAuditRecordsRequest;
        if (!awie.c() || !((logAuditRecordsRequest = this.b) == null || logAuditRecordsRequest.d == null)) {
            this.d.a(this.b, this.a, SystemClock.elapsedRealtime() - this.e, status.i);
        }
        this.c.a(status);
    }
}
