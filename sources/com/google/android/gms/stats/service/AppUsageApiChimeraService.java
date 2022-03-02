package com.google.android.gms.stats.service;

import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppUsageApiChimeraService extends nio {
    public AppUsageApiChimeraService() {
        super(193, "com.google.android.gms.appusage.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (defpackage.ihs.b().getPackageManager().checkPermission("android.permission.PACKAGE_USAGE_STATS", r5) != 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nit r4, com.google.android.gms.common.internal.GetServiceRequest r5) {
        /*
            r3 = this;
            java.lang.String r5 = r5.d
            aznq r0 = defpackage.aznq.a
            aznx r0 = r0.a()
            java.lang.String r0 = r0.a()
            android.text.TextUtils$SimpleStringSplitter r1 = new android.text.TextUtils$SimpleStringSplitter
            r2 = 44
            r1.<init>(r2)
            r1.setString(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x001a
            ihs r0 = defpackage.ihs.b()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.permission.PACKAGE_USAGE_STATS"
            int r5 = r0.checkPermission(r1, r5)
            if (r5 == 0) goto L_0x0042
        L_0x003c:
            r5 = 16
            r0 = 0
            r4.a((int) r5, (android.os.Bundle) r0)
        L_0x0042:
            actc r5 = new actc
            nix r0 = new nix
            com.google.android.gms.common.apiservice.LifecycleSynchronizer r1 = r3.e
            aoru r2 = r3.f
            r0.<init>(r3, r1, r2)
            r5.<init>(r0)
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.service.AppUsageApiChimeraService.a(nit, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
