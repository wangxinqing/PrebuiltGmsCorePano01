package defpackage;

import com.google.android.gms.tron.CollectionChimeraService;

/* renamed from: acwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acwx extends jfo {
    final /* synthetic */ CollectionChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acwx(CollectionChimeraService collectionChimeraService, jfp jfp) {
        super(jfp);
        this.a = collectionChimeraService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
        if (r0 == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r9.obj
            boolean r0 = r0 instanceof defpackage.acwy
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r9.obj
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 29
            r2.<init>(r1)
            java.lang.String r1 = "unexpected message argument: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "CollectionChimeraSvc"
            android.util.Log.e(r1, r0)
        L_0x002c:
            com.google.android.gms.tron.CollectionChimeraService r0 = r8.a
            r0.a()
            com.google.android.gms.tron.CollectionChimeraService r0 = r8.a
            java.lang.Object r9 = r9.obj
            acwy r9 = (defpackage.acwy) r9
            com.google.android.gms.udc.UdcCacheRequest r1 = com.google.android.gms.tron.CollectionChimeraService.b
            r0.f = r9
            com.google.android.gms.tron.CollectionChimeraService r9 = r8.a     // Catch:{ all -> 0x0195 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            int r0 = r0.g     // Catch:{ all -> 0x0195 }
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0061
            if (r0 == r1) goto L_0x00ff
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0195 }
            r1 = 36
            r9.<init>(r1)     // Catch:{ all -> 0x0195 }
            java.lang.String r1 = "unexpected message type: "
            r9.append(r1)     // Catch:{ all -> 0x0195 }
            r9.append(r0)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "CollectionChimeraSvc"
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0195 }
            android.util.Log.e(r0, r9)     // Catch:{ all -> 0x0195 }
            goto L_0x016e
        L_0x0061:
            defpackage.azqq.c()     // Catch:{ all -> 0x0195 }
            android.os.UserHandle r0 = android.os.Process.myUserHandle()     // Catch:{ all -> 0x0195 }
            boolean r0 = r0.isOwner()     // Catch:{ all -> 0x0195 }
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x0084
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            r0.a()     // Catch:{ all -> 0x0195 }
            r9.a((long) r3)     // Catch:{ all -> 0x0195 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            int r0 = r0.b     // Catch:{ all -> 0x0195 }
            r9.stopSelf(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x00ff
        L_0x0084:
            acwv r0 = r9.e     // Catch:{ all -> 0x0195 }
            iby r5 = r0.c     // Catch:{ all -> 0x0195 }
            if (r5 != 0) goto L_0x00df
            boolean r0 = r0.a()     // Catch:{ all -> 0x0195 }
            acwv r5 = r9.e     // Catch:{ all -> 0x0195 }
            boolean r5 = r5.b()     // Catch:{ all -> 0x0195 }
            int r6 = defpackage.acwv.c()     // Catch:{ all -> 0x0195 }
            azqe r7 = defpackage.azqe.a     // Catch:{ all -> 0x0195 }
            azqf r7 = r7.a()     // Catch:{ all -> 0x0195 }
            boolean r7 = r7.b()     // Catch:{ all -> 0x0195 }
            if (r7 == 0) goto L_0x00a7
            if (r0 != 0) goto L_0x00a7
            goto L_0x00af
        L_0x00a7:
            if (r5 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            if (r0 != 0) goto L_0x00d7
        L_0x00ac:
            if (r6 != r1) goto L_0x00af
            goto L_0x00d7
        L_0x00af:
            if (r6 != r2) goto L_0x00b2
            goto L_0x00c4
        L_0x00b2:
            if (r0 == 0) goto L_0x00c4
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            r0.a()     // Catch:{ all -> 0x0195 }
            r9.a((long) r3)     // Catch:{ all -> 0x0195 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            int r0 = r0.b     // Catch:{ all -> 0x0195 }
            r9.stopSelf(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x00ff
        L_0x00c4:
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            r0.a()     // Catch:{ all -> 0x0195 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r9.a((long) r0)     // Catch:{ all -> 0x0195 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            int r0 = r0.b     // Catch:{ all -> 0x0195 }
            r9.stopSelf(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x00ff
        L_0x00d7:
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            acwz r0 = r0.e     // Catch:{ all -> 0x0195 }
            r0.a(r9)     // Catch:{ all -> 0x0195 }
            goto L_0x00ff
        L_0x00df:
            boolean r0 = com.google.android.gms.tron.CollectionChimeraService.a((defpackage.iby) r5)     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x00f8
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            r0.a()     // Catch:{ all -> 0x0195 }
            r0 = 21600000(0x1499700, double:1.0671818E-316)
            r9.a((long) r0)     // Catch:{ all -> 0x0195 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            int r0 = r0.b     // Catch:{ all -> 0x0195 }
            r9.stopSelf(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x00ff
        L_0x00f8:
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            acwz r0 = r0.e     // Catch:{ all -> 0x0195 }
            r0.a(r9)     // Catch:{ all -> 0x0195 }
        L_0x00ff:
            com.google.android.gms.tron.CollectionChimeraService r9 = r8.a     // Catch:{ all -> 0x0195 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            boolean r1 = r0.f     // Catch:{ all -> 0x0195 }
            if (r1 == 0) goto L_0x016e
            acwz r0 = r0.e     // Catch:{ all -> 0x0195 }
            r0.b(r9)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "tron_collection_cause"
            acwy r1 = r9.f     // Catch:{ all -> 0x0195 }
            int r1 = r1.h     // Catch:{ all -> 0x0195 }
            r9.a((java.lang.String) r0, (int) r1)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "tron_collections"
            r9.a((java.lang.String) r0)     // Catch:{ all -> 0x0195 }
            java.lang.Object r0 = r9.a     // Catch:{ all -> 0x0195 }
            monitor-enter(r0)     // Catch:{ all -> 0x0195 }
            android.content.SharedPreferences r1 = r9.d     // Catch:{ all -> 0x016b }
            java.lang.String r2 = "last_collection_time"
            r3 = 0
            long r1 = r1.getLong(r2, r3)     // Catch:{ all -> 0x016b }
            monitor-exit(r0)     // Catch:{ all -> 0x016b }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x013f
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            long r3 = r0.c     // Catch:{ all -> 0x0195 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0135
            goto L_0x013f
        L_0x0135:
            java.lang.String r0 = "tron_collection_period_minutes"
            long r3 = r3 - r1
            r1 = 60000(0xea60, double:2.9644E-319)
            long r3 = r3 / r1
            r9.a((java.lang.String) r0, (long) r3)     // Catch:{ all -> 0x0195 }
        L_0x013f:
            java.lang.Object r0 = r9.a     // Catch:{ all -> 0x0195 }
            monitor-enter(r0)     // Catch:{ all -> 0x0195 }
            android.content.SharedPreferences r1 = r9.d     // Catch:{ all -> 0x0168 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "last_collection_time"
            acwy r3 = r9.f     // Catch:{ all -> 0x0168 }
            long r3 = r3.c     // Catch:{ all -> 0x0168 }
            android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r3)     // Catch:{ all -> 0x0168 }
            r1.commit()     // Catch:{ all -> 0x0168 }
            monitor-exit(r0)     // Catch:{ all -> 0x0168 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            com.google.android.gms.phenotype.ExperimentTokens r0 = r0.d     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0162
            hph r9 = r9.c     // Catch:{ all -> 0x0195 }
            r9.d()     // Catch:{ all -> 0x0195 }
            goto L_0x016e
        L_0x0162:
            hph r9 = r9.c     // Catch:{ all -> 0x0195 }
            r9.d()     // Catch:{ all -> 0x0195 }
            goto L_0x016e
        L_0x0168:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0168 }
            throw r9     // Catch:{ all -> 0x0195 }
        L_0x016b:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016b }
            throw r9     // Catch:{ all -> 0x0195 }
        L_0x016e:
            com.google.android.gms.tron.CollectionChimeraService r9 = r8.a     // Catch:{ all -> 0x0195 }
            acwy r9 = r9.f     // Catch:{ all -> 0x0195 }
            boolean r0 = r9.f     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0180
            acwz r9 = r9.e     // Catch:{ all -> 0x0195 }
            if (r9 == 0) goto L_0x0180
            boolean r9 = r9.a()     // Catch:{ all -> 0x0195 }
            if (r9 != 0) goto L_0x0189
        L_0x0180:
            com.google.android.gms.tron.CollectionChimeraService r9 = r8.a     // Catch:{ all -> 0x0195 }
            acwy r0 = r9.f     // Catch:{ all -> 0x0195 }
            int r0 = r0.b     // Catch:{ all -> 0x0195 }
            r9.stopSelf(r0)     // Catch:{ all -> 0x0195 }
        L_0x0189:
            com.google.android.gms.tron.CollectionChimeraService r9 = r8.a     // Catch:{ RuntimeException -> 0x0193 }
            acwy r9 = r9.f     // Catch:{ RuntimeException -> 0x0193 }
            acrz r9 = r9.a     // Catch:{ RuntimeException -> 0x0193 }
            r9.c()     // Catch:{ RuntimeException -> 0x0193 }
            return
        L_0x0193:
            r9 = move-exception
            return
        L_0x0195:
            r9 = move-exception
            com.google.android.gms.tron.CollectionChimeraService r0 = r8.a     // Catch:{ RuntimeException -> 0x01a0 }
            acwy r0 = r0.f     // Catch:{ RuntimeException -> 0x01a0 }
            acrz r0 = r0.a     // Catch:{ RuntimeException -> 0x01a0 }
            r0.c()     // Catch:{ RuntimeException -> 0x01a0 }
            goto L_0x01a1
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwx.handleMessage(android.os.Message):void");
    }
}
