package com.google.android.gms.audit.upload;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuditGcmTaskChimeraService extends qwf {
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        r4.a();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00aa A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c1 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c2 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144 A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:65:0x0123] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r19) {
        /*
            r18 = this;
            r1 = r18
            egk r2 = new egk
            r2.<init>(r1)
            egt r3 = new egt
            r3.<init>(r1)
            ehq r4 = new ehq
            r4.<init>(r1)
            awin r0 = defpackage.awin.a
            awio r0 = r0.a()
            long r5 = r0.d()
            r7 = 1
            r2.a((defpackage.egt) r3)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r8 = 0
            r0 = 0
            r11 = 0
            r12 = 0
        L_0x0024:
            int r14 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x012f
            ehm r14 = r3.a()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r14 == 0) goto L_0x012f
            java.lang.String r15 = r14.d     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aqoc r10 = r14.b     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r10 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            aqoc r10 = defpackage.aqoc.h     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x0037:
            aqoj r10 = r10.d     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            aqoj r10 = defpackage.aqoj.c     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x003e:
            int r13 = r10.a     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r13 != r7) goto L_0x0047
            java.lang.Object r10 = r10.b     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aqof r10 = (defpackage.aqof) r10     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            goto L_0x0049
        L_0x0047:
            aqof r10 = defpackage.aqof.l     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x0049:
            java.lang.String r10 = r10.f     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            boolean r13 = r15.equals(r0)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r13 == 0) goto L_0x005c
            boolean r13 = r10.equals(r11)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r13 != 0) goto L_0x0058
            goto L_0x005c
        L_0x0058:
            if (r12 == 0) goto L_0x005c
            r15 = r0
            goto L_0x008f
        L_0x005c:
            android.content.Context r0 = r4.a     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            java.lang.String r11 = r0.getPackageName()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            java.util.List r0 = defpackage.jgu.d(r0, r11)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x006a:
            boolean r0 = r11.hasNext()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r11.next()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            android.accounts.Account r0 = (android.accounts.Account) r0     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            android.content.Context r12 = r4.a     // Catch:{ eif -> 0x0087, IOException -> 0x0085, all -> 0x0144 }
            java.lang.String r13 = r0.name     // Catch:{ eif -> 0x0087, IOException -> 0x0085, all -> 0x0144 }
            java.lang.String r12 = defpackage.eim.f(r12, r13)     // Catch:{ eif -> 0x0087, IOException -> 0x0085, all -> 0x0144 }
            boolean r12 = r15.equals(r12)     // Catch:{ eif -> 0x0087, IOException -> 0x0085, all -> 0x0144 }
            if (r12 == 0) goto L_0x006a
            goto L_0x008a
        L_0x0085:
            r0 = move-exception
            goto L_0x006a
        L_0x0087:
            r0 = move-exception
            goto L_0x006a
        L_0x0089:
            r0 = 0
        L_0x008a:
            com.google.android.gms.common.internal.ClientContext r12 = r4.a((android.accounts.Account) r0, (java.lang.String) r10)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r11 = r10
        L_0x008f:
            aqoc r0 = r14.b     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 != 0) goto L_0x0095
            aqoc r0 = defpackage.aqoc.h     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x0095:
            r10 = 5
            java.lang.Object r13 = r0.c(r10)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aucd r13 = (defpackage.aucd) r13     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r13.a((defpackage.aucj) r0)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aqoc r0 = r14.b     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            aqoc r0 = defpackage.aqoc.h     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x00a6:
            aqok r0 = r0.e     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            aqok r0 = defpackage.aqok.d     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x00ad:
            java.lang.Object r10 = r0.c(r10)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aucd r10 = (defpackage.aucd) r10     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r10.a((defpackage.aucj) r0)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r16 = r8
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            boolean r0 = r10.c     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 != 0) goto L_0x00c2
            goto L_0x00c8
        L_0x00c2:
            r10.c()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r9 = 0
            r10.c = r9     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x00c8:
            aucj r0 = r10.b     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aqok r0 = (defpackage.aqok) r0     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            int r9 = r0.a     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r9 = r9 | 2
            r0.a = r9     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r0.c = r7     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            boolean r0 = r13.c     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 != 0) goto L_0x00d9
            goto L_0x00df
        L_0x00d9:
            r13.c()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r7 = 0
            r13.c = r7     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x00df:
            aucj r0 = r13.b     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aqoc r0 = (defpackage.aqoc) r0     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aucj r7 = r10.i()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aqok r7 = (defpackage.aqok) r7     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r7.getClass()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r0.e = r7     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            int r7 = r0.a     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r7 = r7 | 16
            r0.a = r7     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            aucj r0 = r13.i()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r7 = r0
            aqoc r7 = (defpackage.aqoc) r7     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r4.a((com.google.android.gms.common.internal.ClientContext) r12, (defpackage.aqoc) r7)     // Catch:{ eif -> 0x010c, babl -> 0x010a, babk -> 0x0108 }
            boolean r0 = r12.f()     // Catch:{ eif -> 0x010c, babl -> 0x010a, babk -> 0x0108 }
            r8 = 1
            r9 = 0
            r2.a((boolean) r9, (boolean) r0, (boolean) r8, (defpackage.aqoc) r7)     // Catch:{ eif -> 0x010c, babl -> 0x010a, babk -> 0x0108 }
            goto L_0x0123
        L_0x0108:
            r0 = move-exception
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            goto L_0x010d
        L_0x010c:
            r0 = move-exception
        L_0x010d:
            boolean r8 = r12.f()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r9 = 0
            r2.a((boolean) r9, (boolean) r8, (boolean) r9, (defpackage.aqoc) r7)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            boolean r0 = defpackage.ehq.a(r0)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 == 0) goto L_0x0123
            r4.a()
            r3.close()
            r2 = 1
            return r2
        L_0x0123:
            r3.a(r14)     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r7 = 1
            long r7 = r16 + r7
            r8 = r7
            r0 = r15
            r7 = 1
            goto L_0x0024
        L_0x012f:
            int r0 = r3.b()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            if (r0 <= 0) goto L_0x013c
            ehr r0 = defpackage.ehr.a()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
            r0.b()     // Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }
        L_0x013c:
            r4.a()
            r3.close()
            r2 = 0
            return r2
        L_0x0144:
            r0 = move-exception
            r4.a()
            r3.close()
            throw r0
        L_0x014c:
            r0 = move-exception
            r4.a()
            r3.close()
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.audit.upload.AuditGcmTaskChimeraService.a(qxz):int");
    }
}
