package com.google.android.gms.smartdevice.d2d;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetDeviceApiService extends nio {
    static abpn a = abpn.a;
    static acab b = acab.a;
    private static final iwd l = acqa.a("D2D", "TargetDeviceApiService");
    Handler k;
    private abva m;
    private acgy n;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nit r10, com.google.android.gms.common.internal.GetServiceRequest r11) {
        /*
            r9 = this;
            java.lang.String r6 = r11.d
            acpo r0 = new acpo
            r0.<init>(r9)
            acpo r1 = new acpo
            r1.<init>(r9)
            boolean r2 = defpackage.azlf.c()
            if (r2 == 0) goto L_0x003a
            defpackage.jix.h(r9)
            boolean r2 = defpackage.jkr.g()
            if (r2 == 0) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            boolean r2 = r1.b(r6)
            if (r2 == 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            boolean r1 = r1.a(r6)
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            goto L_0x0042
        L_0x002a:
            java.lang.SecurityException r10 = new java.lang.SecurityException
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.String r0 = " not authorized"
            java.lang.String r11 = r11.concat(r0)
            r10.<init>(r11)
            throw r10
        L_0x003a:
            isq r1 = new isq
            r1.<init>(r6)
            r1.b()
        L_0x0042:
            com.google.android.gms.common.Feature[] r11 = r11.i
            if (r11 == 0) goto L_0x006b
            int r1 = r11.length
            if (r1 == 0) goto L_0x006b
            r1 = 0
            r11 = r11[r1]
            com.google.android.gms.common.Feature r1 = defpackage.abmo.a
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x006a
            acgy r11 = r9.n
            if (r11 != 0) goto L_0x0065
            acgy r11 = new acgy
            com.google.android.gms.common.apiservice.LifecycleSynchronizer r1 = r9.e
            boolean r0 = r0.b(r6)
            r11.<init>(r1, r9, r6, r0)
            r9.n = r11
        L_0x0065:
            acgy r11 = r9.n
            r10.a(r11)
        L_0x006a:
            return
        L_0x006b:
            abva r11 = r9.m
            if (r11 != 0) goto L_0x0088
            abva r11 = new abva
            com.google.android.gms.common.apiservice.LifecycleSynchronizer r1 = r9.e
            abpn r2 = a
            acab r3 = b
            android.os.Handler r5 = r9.k
            boolean r7 = r0.b(r6)
            boolean r8 = r0.a(r6)
            r0 = r11
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.m = r11
        L_0x0088:
            abva r11 = r9.m
            r10.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.d2d.TargetDeviceApiService.a(nit, com.google.android.gms.common.internal.GetServiceRequest):void");
    }

    public final void onCreate() {
        l.a("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.k = new qvr(handlerThread.getLooper());
    }

    public final void onDestroy() {
        l.a("onDestroy()", new Object[0]);
        abva abva = this.m;
        if (abva != null) {
            abva.b();
        }
        acpl.a(this.k);
    }

    public TargetDeviceApiService() {
        super(76, "com.google.android.gms.smartdevice.d2d.TargetDeviceService.START", (Set) anfv.a, 3, 10);
    }
}
