package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OneoffRebuildIndexChimeraService extends owr {
    static final qxl a;

    static {
        qxk qxk = new qxk();
        qxk.a = 0;
        qxk.b = (int) TimeUnit.MINUTES.toSeconds(30);
        qxk.c = (int) TimeUnit.DAYS.toSeconds(1);
        a = qxk.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (((java.lang.Boolean) defpackage.ozx.aN.c()).booleanValue() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (defpackage.owa.b(r7, r0) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r7, java.lang.String r8, defpackage.aomb r9) {
        /*
            defpackage.iva.a((java.lang.Object) r8)
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x001a
            agvx r0 = defpackage.ozx.aN
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002a
            goto L_0x0031
        L_0x001a:
            android.content.Intent r0 = defpackage.owa.a((java.lang.String) r8)
            boolean r1 = defpackage.owa.a(r7, r0)
            if (r1 != 0) goto L_0x0031
            boolean r0 = defpackage.owa.b(r7, r0)
            if (r0 != 0) goto L_0x0031
        L_0x002a:
            java.lang.String r7 = "Rebuild index intent missing for package %s."
            defpackage.oso.a((java.lang.String) r7, (java.lang.Object) r8)
            return
        L_0x0031:
            int r0 = r8.length()
            int r0 = r0 + -119
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.String r0 = r8.substring(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "OneoffIndexRebuild-"
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0053
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0057
        L_0x0053:
            java.lang.String r0 = r2.concat(r0)
        L_0x0057:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "packageName"
            r2.putString(r3, r8)
            int r9 = r9.a()
            java.lang.String r3 = "sourceValue"
            r2.putInt(r3, r9)
            qwq r9 = defpackage.qwq.a((android.content.Context) r7)
            boolean r7 = defpackage.ozx.a((android.content.Context) r7)
            if (r7 != 0) goto L_0x008d
            agvx r7 = defpackage.ozx.bR
            java.lang.Object r7 = r7.c()
            java.lang.Long r7 = (java.lang.Long) r7
            long r3 = r7.longValue()
            agvx r7 = defpackage.ozx.bS
            java.lang.Object r7 = r7.c()
            java.lang.Long r7 = (java.lang.Long) r7
            long r5 = r7.longValue()
            goto L_0x0091
        L_0x008d:
            r3 = 30
            r5 = 60
        L_0x0091:
            qxf r7 = new qxf
            r7.<init>()
            r7.a(r3, r5)
            qxl r3 = a
            r7.r = r3
            r7.s = r2
            r7.k = r0
            r0 = 1
            r7.n = r0
            agvx r2 = defpackage.ozx.d
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r7.a((boolean) r2)
            agvx r2 = defpackage.ozx.bU
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7.a((int) r2)
            agvx r2 = defpackage.ozx.bT
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = defpackage.axcc.b()
            if (r3 != 0) goto L_0x00e3
            agvx r3 = defpackage.ozx.bT
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r1 = 1
        L_0x00e4:
            r7.a(r2, r1)
            java.lang.String r1 = "com.google.android.gms.icing.indexapi.OneoffRebuildIndexService"
            r7.i = r1
            r7.b((int) r0)
            qxg r7 = r7.b()
            r9.a((defpackage.qxx) r7)
            java.lang.String r7 = "Scheduled oneoff index rebuild for %s."
            defpackage.oso.a((java.lang.String) r7, (java.lang.Object) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService.a(android.content.Context, java.lang.String, aomb):void");
    }

    public static void a(Context context, prp prp, Intent intent) {
        if (!((Boolean) ozx.aH.c()).booleanValue()) {
            oso.a("UPDATE_INDEX OneOff Scheduling Disabled.");
            return;
        }
        iva.a((Object) context);
        iva.a((Object) intent);
        if (intent.getData() == null) {
            oso.a("Empty data in intent %s from %s.", (Object) intent.getAction(), (Object) intent.getPackage());
            return;
        }
        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
        if (prp.p(schemeSpecificPart) != 0) {
            oso.a("Already sent rebuild index request to %s.", (Object) schemeSpecificPart);
        } else {
            a(context, schemeSpecificPart, aomb.ONE_OFF_REASON_INSTALL);
        }
    }

    public final int a(qxz qxz, owa owa) {
        if (((Boolean) ozx.aI.c()).booleanValue()) {
            iva.a((Object) qxz.b);
            String string = qxz.b.getString("packageName");
            int i = qxz.b.getInt("sourceValue", 0);
            if (string == null || jlh.d(string)) {
                oso.b("%s: package name is null or empty.", (Object) qxz.a);
                return 2;
            }
            if (owa.a(string, System.currentTimeMillis(), (aomb) amrh.a(aomb.a(i), aomb.UNKNOWN), true)) {
                return 0;
            }
            oso.a("Failed to send index request to package %s; will reschedule.", (Object) string);
            return 1;
        }
        oso.a("UPDATE_INDEX OneOff Task Disabled.");
        return 0;
    }
}
