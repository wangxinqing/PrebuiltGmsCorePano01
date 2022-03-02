package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: qky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qky extends jba {
    private static final qfn a = new qfn("GetPreLaunchInfoOperation");
    private final qfy d;
    private final Intent e;
    private final qkm f;
    private final qks g;
    private final qlc h;
    private final qlg i;
    private final SharedPreferences j;
    private final int k;
    private final RoutingOptions l;

    public qky(qfy qfy, Intent intent, qkm qkm, qks qks, qlc qlc, qlg qlg, SharedPreferences sharedPreferences, int i2, RoutingOptions routingOptions) {
        super(121, "GetPreLaunchInfo");
        this.d = qfy;
        this.e = intent;
        this.f = qkm;
        this.g = qks;
        this.h = qlc;
        this.i = qlg;
        this.j = sharedPreferences;
        this.k = i2;
        this.l = routingOptions;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a A[SYNTHETIC, Splitter:B:28:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r29) {
        /*
            r28 = this;
            r1 = r28
            qlo r8 = new qlo
            r8.<init>()
            r0 = 1406(0x57e, float:1.97E-42)
            r8.a(r0)
            android.content.Intent r0 = r1.e
            java.lang.String r2 = "com.google.android.gms.instantapps.INTENT_HMAC"
            boolean r0 = r0.hasExtra(r2)
            r9 = 1407(0x57f, float:1.972E-42)
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L_0x008b
            r0 = 1408(0x580, float:1.973E-42)
            r8.a(r0)     // Catch:{ qkl -> 0x005b }
            qkm r0 = r1.f     // Catch:{ qkl -> 0x005b }
            android.content.Intent r3 = r1.e     // Catch:{ qkl -> 0x005b }
            byte[] r2 = r3.getByteArrayExtra(r2)     // Catch:{ qkl -> 0x005b }
            if (r2 != 0) goto L_0x002a
            goto L_0x0049
        L_0x002a:
            int r4 = r2.length     // Catch:{ qkl -> 0x005b }
            r5 = 32
            if (r4 != r5) goto L_0x0049
            byte[] r0 = r0.c(r3)     // Catch:{ qkl -> 0x005b }
            int r3 = r0.length     // Catch:{ qkl -> 0x005b }
            if (r3 != r5) goto L_0x0049
            r3 = 0
            r4 = 0
        L_0x0038:
            int r5 = r2.length     // Catch:{ qkl -> 0x005b }
            if (r3 >= r5) goto L_0x0045
            byte r5 = r0[r3]     // Catch:{ qkl -> 0x005b }
            byte r6 = r2[r3]     // Catch:{ qkl -> 0x005b }
            r5 = r5 ^ r6
            r4 = r4 | r5
            byte r4 = (byte) r4     // Catch:{ qkl -> 0x005b }
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0045:
            if (r4 != 0) goto L_0x0049
            r2 = 1
            goto L_0x0053
        L_0x0049:
            qfn r0 = a     // Catch:{ qkl -> 0x005b }
            java.lang.String r2 = "Intent signature invalid"
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ qkl -> 0x005b }
            r0.c(r2, r3)     // Catch:{ qkl -> 0x005b }
            r2 = 0
        L_0x0053:
            r0 = 1409(0x581, float:1.974E-42)
            r8.a(r0)     // Catch:{ qkl -> 0x0059 }
            goto L_0x0066
        L_0x0059:
            r0 = move-exception
            goto L_0x005d
        L_0x005b:
            r0 = move-exception
            r2 = 0
        L_0x005d:
            qfn r0 = a
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r4 = "Intent signature compute failure"
            r0.c(r4, r3)
        L_0x0066:
            if (r2 == 0) goto L_0x006a
            r15 = r2
            goto L_0x0091
        L_0x006a:
            android.content.Intent r0 = r1.e     // Catch:{ qkl -> 0x0084 }
            defpackage.qkm.b((android.content.Intent) r0)     // Catch:{ qkl -> 0x0084 }
            r8.a(r9)
            qfy r0 = r1.d
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a
            android.content.Intent r3 = r1.e
            byte[] r4 = r8.a()
            com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo r3 = com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo.a(r3, r11, r4)
            r0.a((com.google.android.gms.common.api.Status) r2, (com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo) r3)
            return
        L_0x0084:
            r0 = move-exception
            qla r2 = new qla
            r2.<init>(r0)
            throw r2
        L_0x008b:
            android.content.Intent r0 = r1.e     // Catch:{ qkl -> 0x01ec }
            defpackage.qkm.b((android.content.Intent) r0)     // Catch:{ qkl -> 0x01ec }
            r15 = 0
        L_0x0091:
            android.content.Intent r0 = r1.e
            android.net.Uri r0 = r0.getData()
            defpackage.iva.a((java.lang.Object) r0)
            int r2 = r1.k
            if (r2 != 0) goto L_0x00a0
            r4 = 1
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            qks r2 = r1.g
            java.lang.String r3 = r0.toString()
            com.google.android.gms.instantapps.internal.RoutingOptions r5 = r1.l
            r7 = 0
            r6 = r8
            qkt r0 = r2.a(r3, r4, r5, r6, r7)
            int r2 = r0.a
            if (r2 == 0) goto L_0x01d6
            r3 = 3
            if (r2 == r10) goto L_0x0172
            r4 = 2
            if (r2 != r4) goto L_0x016a
            qlc r2 = r1.h
            android.accounts.Account r2 = r2.a()
            if (r2 != 0) goto L_0x00d0
            com.google.android.gms.instantapps.internal.RoutingOptions r4 = r1.l
            boolean r4 = r4.c
            if (r4 != 0) goto L_0x00d0
            qfn r4 = a
            java.lang.Object[] r5 = new java.lang.Object[r11]
            java.lang.String r6 = "null account even though opt in check was not disabled"
            r4.d(r6, r5)
        L_0x00d0:
            r8.a(r9)
            qfy r4 = r1.d
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.a
            if (r2 != 0) goto L_0x00de
            java.lang.String r2 = ""
            r14 = r2
            goto L_0x00e1
        L_0x00de:
            java.lang.String r2 = r2.name
            r14 = r2
        L_0x00e1:
            android.content.Intent r2 = r1.e
            java.lang.String r6 = r0.f
            int r7 = r0.g
            int r9 = r0.h
            java.lang.String r13 = r0.i
            byte[] r12 = r0.j
            com.google.android.gms.instantapps.internal.AppInfo r10 = r0.b
            com.google.android.gms.instantapps.internal.Route r11 = r0.c
            int r0 = r0.d
            if (r0 != r3) goto L_0x00f8
            r20 = 1
            goto L_0x00fa
        L_0x00f8:
            r20 = 0
        L_0x00fa:
            byte[] r21 = r8.a()
            android.content.SharedPreferences r0 = r1.j
            java.util.Map r0 = r0.getAll()
            android.os.Bundle r3 = new android.os.Bundle
            int r8 = r0.size()
            r3.<init>(r8)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x0115:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r16 = r0.getKey()     // Catch:{ ClassCastException -> 0x0139 }
            r29 = r8
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ClassCastException -> 0x0137 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ ClassCastException -> 0x0137 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x0137 }
            r3.putString(r8, r0)     // Catch:{ ClassCastException -> 0x0137 }
            r8 = r29
            goto L_0x0115
        L_0x0137:
            r0 = move-exception
            goto L_0x013c
        L_0x0139:
            r0 = move-exception
            r29 = r8
        L_0x013c:
            qfn r8 = a
            r8.a(r0)
            r8 = r29
            goto L_0x0115
        L_0x0144:
            defpackage.iva.a((java.lang.Object) r14)
            defpackage.iva.a((java.lang.Object) r2)
            com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo r0 = new com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo
            r8 = 2
            r16 = 0
            r26 = r12
            r12 = r0
            r25 = r13
            r13 = r8
            r17 = r2
            r18 = r10
            r19 = r11
            r22 = r6
            r23 = r7
            r24 = r9
            r27 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4.a((com.google.android.gms.common.api.Status) r5, (com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo) r0)
            return
        L_0x016a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid InstantAppPreLaunchInfo.Destination value"
            r0.<init>(r2)
            throw r0
        L_0x0172:
            qlg r2 = r1.i
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r4 = "optInNumDeclines"
            r5 = 0
            int r2 = r2.getInt(r4, r5)
            long r6 = (long) r2
            long r10 = defpackage.axuy.e()
            r12 = -1
            long r10 = r10 + r12
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x018b
            r2 = 1
            goto L_0x018c
        L_0x018b:
            r2 = 0
        L_0x018c:
            android.content.Intent r16 = defpackage.qlq.a(r2)
            r8.a(r9)
            qfy r2 = r1.d
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.a
            android.content.Intent r6 = r1.e
            java.lang.String r7 = r0.f
            int r9 = r0.g
            int r10 = r0.h
            java.lang.String r11 = r0.i
            byte[] r14 = r0.j
            int r0 = r0.d
            if (r0 != r3) goto L_0x01aa
            r20 = 1
            goto L_0x01ac
        L_0x01aa:
            r20 = 0
        L_0x01ac:
            byte[] r21 = r8.a()
            defpackage.iva.a((java.lang.Object) r16)
            defpackage.iva.a((java.lang.Object) r6)
            com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo r0 = new com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo
            r13 = 1
            r3 = 0
            r18 = 0
            r19 = 0
            r27 = 0
            r12 = r0
            r5 = r14
            r14 = r3
            r17 = r6
            r22 = r7
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.a((com.google.android.gms.common.api.Status) r4, (com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo) r0)
            return
        L_0x01d6:
            r8.a(r9)
            qfy r0 = r1.d
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a
            android.content.Intent r3 = r1.e
            byte[] r4 = r8.a()
            com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo r3 = com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo.a(r3, r15, r4)
            r0.a((com.google.android.gms.common.api.Status) r2, (com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo) r3)
            return
        L_0x01ec:
            r0 = move-exception
            qla r2 = new qla
            r2.<init>(r0)
            goto L_0x01f4
        L_0x01f3:
            throw r2
        L_0x01f4:
            goto L_0x01f3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qky.a(android.content.Context):void");
    }
}
