package com.google.android.gms.westworld;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InitOperation extends hec {
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r7 == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r6, int r7) {
        /*
            r5 = this;
            boolean r6 = defpackage.aecm.a()
            if (r6 != 0) goto L_0x0084
            r6 = r7 & 14
            if (r6 == 0) goto L_0x0083
            ihs r6 = defpackage.ihs.b()
            boolean r7 = defpackage.azvd.b()
            r0 = 0
            if (r7 == 0) goto L_0x0023
            ihs r7 = defpackage.ihs.b()
            adry r1 = new adry
            r1.<init>()
            iby r7 = defpackage.adrz.a(r7, r1)
            goto L_0x002e
        L_0x0023:
            ihs r7 = defpackage.ihs.b()
            aupy r7 = defpackage.aecq.a((android.content.Context) r7)
            r4 = r0
            r0 = r7
            r7 = r4
        L_0x002e:
            defpackage.aecq.g(r6)
            hph r1 = defpackage.aecq.f(r6)
            java.lang.String r2 = "InitOperationEnter"
            hox r2 = r1.c(r2)
            r2.a()
            boolean r7 = defpackage.aecq.a((defpackage.aupy) r0, (defpackage.iby) r7)
            r0 = 0
            if (r7 == 0) goto L_0x005a
            java.lang.String r7 = "InitOperationEnabled"
            hox r7 = r1.c(r7)
            r7.a()
            boolean r7 = defpackage.aecg.a((android.content.Context) r6)
            long r2 = defpackage.azws.f()
            defpackage.aecq.a((long) r2, (android.content.Context) r6)
            goto L_0x005b
        L_0x005a:
            r7 = 0
        L_0x005b:
            boolean r2 = defpackage.jkr.h()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            if (r7 != 0) goto L_0x0077
        L_0x0064:
            azwc r7 = defpackage.azwc.a     // Catch:{ all -> 0x007e }
            azwd r7 = r7.a()     // Catch:{ all -> 0x007e }
            long r2 = r7.b()     // Catch:{ all -> 0x007e }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x007e }
            bbx r2 = defpackage.bbx.UNKNOWN_PERIOD     // Catch:{ all -> 0x007e }
            com.google.android.gms.westworld.DataAlarmOperation.a(r6, r7, r1, r2, r0)     // Catch:{ all -> 0x007e }
        L_0x0077:
            com.google.android.gms.westworld.MetadataAlarmOperation.a(r6, r1)     // Catch:{ all -> 0x007e }
            r1.d()
            return
        L_0x007e:
            r6 = move-exception
            r1.d()
            throw r6
        L_0x0083:
            return
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.westworld.InitOperation.a(android.content.Intent, int):void");
    }
}
