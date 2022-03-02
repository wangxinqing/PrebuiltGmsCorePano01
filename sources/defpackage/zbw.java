package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbw extends zay {
    final String c;

    public zbw(ClientContext clientContext, String str, yth yth) {
        super(clientContext, yth);
        this.c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0117, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair b(android.content.Context r19, defpackage.yrr r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            com.google.android.gms.common.internal.ClientContext r3 = r1.a
            java.lang.String r10 = r1.c
            java.lang.String r4 = r3.b()
            if (r4 != 0) goto L_0x0039
            java.lang.String r4 = r3.e
            java.lang.String r14 = defpackage.jgu.a((android.content.Context) r0, (java.lang.String) r4)
            com.google.android.gms.common.internal.ClientContext r4 = new com.google.android.gms.common.internal.ClientContext
            int r12 = r3.b
            java.lang.String r13 = r3.a()
            java.lang.String r15 = r3.e
            java.lang.String r5 = r3.f
            r11 = r4
            r16 = r5
            r11.<init>((int) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16)
            java.util.List r5 = r4.g
            r5.clear()
            java.util.List r5 = r4.g
            java.util.List r6 = r3.g
            r5.addAll(r6)
            r4.a((com.google.android.gms.common.internal.ClientContext) r3)
            r9 = r4
            goto L_0x003a
        L_0x0039:
            r9 = r3
        L_0x003a:
            yse r3 = r2.b
            java.lang.String r17 = r2.a(r0, r9)
            android.content.pm.PackageManager r2 = r19.getPackageManager()
            java.lang.String r4 = r9.e
            java.lang.String r2 = defpackage.zak.a(r2, r4)
            yrv r8 = defpackage.yrv.a()
            java.lang.String r4 = r9.b()
            r5 = 0
            if (r4 == 0) goto L_0x0065
            zav r4 = r3.c
            defpackage.yrr.a(r19)
            java.lang.String[] r6 = defpackage.irx.r
            com.google.android.gms.common.ConnectionResult r4 = r4.a(r0, r9, r6)
            boolean r4 = r4.b()
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            java.lang.String r6 = r9.b()
            yrx r6 = r8.a(r6, r10)
            if (r6 != 0) goto L_0x00d2
            zcs r3 = r3.a     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r6 = defpackage.yse.a(r10)     // Catch:{ VolleyError -> 0x0119 }
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ VolleyError -> 0x0119 }
            r11 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r13 = "native:android_app"
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r6 = defpackage.iyv.a(r6)     // Catch:{ VolleyError -> 0x0119 }
            r11[r5] = r6     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r5 = "plusones/%1$s"
            java.lang.String r5 = java.lang.String.format(r5, r11)     // Catch:{ VolleyError -> 0x0119 }
            if (r2 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            java.lang.String r6 = "container"
            java.lang.String r2 = defpackage.iyv.a(r2)     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r5 = defpackage.iyv.a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0119 }
        L_0x009d:
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r6 = "max_people"
            java.lang.String r2 = defpackage.iyv.a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r6 = "nolog"
            java.lang.String r2 = defpackage.iyv.a((java.lang.String) r2, (java.lang.String) r6, (java.lang.String) r5)     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r5 = defpackage.iyv.a(r13)     // Catch:{ VolleyError -> 0x0119 }
            java.lang.String r6 = "source"
            java.lang.String r14 = defpackage.iyv.a((java.lang.String) r2, (java.lang.String) r6, (java.lang.String) r5)     // Catch:{ VolleyError -> 0x0119 }
            izb r11 = r3.a     // Catch:{ VolleyError -> 0x0119 }
            r13 = 0
            r15 = 0
            java.lang.Class<com.google.android.gms.plus.service.pos.PlusonesEntity> r16 = com.google.android.gms.plus.service.pos.PlusonesEntity.class
            r12 = r9
            jag r2 = r11.a((com.google.android.gms.common.internal.ClientContext) r12, (int) r13, (java.lang.String) r14, (java.lang.Object) r15, (java.lang.Class) r16)     // Catch:{ VolleyError -> 0x0119 }
            com.google.android.gms.plus.service.pos.PlusonesEntity r2 = (com.google.android.gms.plus.service.pos.PlusonesEntity) r2     // Catch:{ VolleyError -> 0x0119 }
            yrx r3 = new yrx     // Catch:{ VolleyError -> 0x0119 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ VolleyError -> 0x0119 }
            r3.<init>(r2, r5)     // Catch:{ VolleyError -> 0x0119 }
            goto L_0x00dd
        L_0x00d2:
            yrx r3 = new yrx     // Catch:{ VolleyError -> 0x0119 }
            zcr r2 = r6.a     // Catch:{ VolleyError -> 0x0119 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ VolleyError -> 0x0119 }
            r3.<init>(r2, r5)     // Catch:{ VolleyError -> 0x0119 }
        L_0x00dd:
            java.lang.String r2 = r9.b()     // Catch:{ VolleyError -> 0x0119 }
            oi r5 = r8.a     // Catch:{ VolleyError -> 0x0119 }
            monitor-enter(r5)     // Catch:{ VolleyError -> 0x0119 }
            oi r6 = r8.a     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = defpackage.yrv.a(r2)     // Catch:{ all -> 0x0110 }
            android.util.Pair r2 = android.util.Pair.create(r2, r10)     // Catch:{ all -> 0x0110 }
            r6.a((java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0110 }
            monitor-exit(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = r9.a()     // Catch:{ VolleyError -> 0x0119 }
            zcr r6 = r3.a     // Catch:{ VolleyError -> 0x0119 }
            r7 = 0
            r11 = 0
            r2 = r19
            r3 = r5
            r5 = r10
            r12 = r8
            r8 = r11
            r11 = r9
            r9 = r17
            ysx r0 = defpackage.yrw.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ VolleyError -> 0x0115 }
            android.os.Bundle r0 = r0.a     // Catch:{ VolleyError -> 0x0115 }
            com.google.android.gms.common.ConnectionResult r2 = com.google.android.gms.common.ConnectionResult.a     // Catch:{ VolleyError -> 0x0115 }
            android.util.Pair r0 = android.util.Pair.create(r2, r0)     // Catch:{ VolleyError -> 0x0115 }
            return r0
        L_0x0110:
            r0 = move-exception
            r12 = r8
            r11 = r9
        L_0x0113:
            monitor-exit(r5)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ VolleyError -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            goto L_0x011c
        L_0x0117:
            r0 = move-exception
            goto L_0x0113
        L_0x0119:
            r0 = move-exception
            r12 = r8
            r11 = r9
        L_0x011c:
            java.lang.String r2 = r11.b()
            r12.b(r2, r10)
            goto L_0x0125
        L_0x0124:
            throw r0
        L_0x0125:
            goto L_0x0124
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbw.b(android.content.Context, yrr):android.util.Pair");
    }
}
