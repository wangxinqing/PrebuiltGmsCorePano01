package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.location.reporting.state.update.AccountConfig;

/* renamed from: ajls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajls {
    private static final Object b = new Object();
    public final Context a;
    private final ajmm c;
    private final ajld d;
    private final ajmj e;
    private final ajlq f;

    private ajls(Context context, ajmm ajmm, ajld ajld, ajmj ajmj, ajlq ajlq) {
        this.a = context;
        this.c = ajmm;
        this.d = ajld;
        this.e = ajmj;
        this.f = ajlq;
    }

    public static ajls a(Context context) {
        ajnw.a(context);
        ajmm a2 = ajmm.a(context);
        return new ajls(context, a2, ajld.a(context), new ajmj(context), ajlq.a(context, a2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: ajld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: ajld} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x079f, code lost:
        defpackage.ajjb.a(r7.c.a().d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07ad, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0320 A[Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0325 A[Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0338 A[Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x033d A[Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e, all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0598 A[Catch:{ eif -> 0x05a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x059d A[Catch:{ eif -> 0x05a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.accounts.Account r28, java.lang.Boolean r29, java.lang.Boolean r30, boolean r31, java.lang.String r32) {
        /*
            r27 = this;
            r1 = r27
            ajmm r2 = r1.c
            r3 = r28
            com.google.android.location.reporting.state.update.AccountConfig r2 = r2.a((android.accounts.Account) r3)
            boolean r4 = r2.f()
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            if (r4 == 0) goto L_0x0016
            goto L_0x003b
        L_0x0016:
            if (r31 != 0) goto L_0x003b
            java.util.List r2 = r2.d()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 27
            r4.<init>(r3)
            java.lang.String r3 = "Ineligible, skipping sync: "
            r4.append(r3)
            r4.append(r2)
            r4.toString()
            return r5
        L_0x003b:
            java.lang.String r3 = defpackage.rmp.a((android.accounts.Account) r28)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "GCore ULR sync started for account "
            int r7 = r3.length()
            if (r7 != 0) goto L_0x0051
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x0054
        L_0x0051:
            r4.concat(r3)
        L_0x0054:
            java.lang.Object r3 = b
            monitor-enter(r3)
            boolean r4 = r2.b     // Catch:{ all -> 0x07ae }
            r8 = 5
            r9 = 2
            r10 = 3
            r11 = 0
            r12 = 1
            if (r4 != 0) goto L_0x016b
            android.accounts.Account r4 = r2.a     // Catch:{ all -> 0x07ae }
            ajmj r5 = r1.e     // Catch:{ all -> 0x07ae }
            r5.a(r4, r9)     // Catch:{ all -> 0x07ae }
            ajkg r5 = defpackage.ajkh.a()     // Catch:{ all -> 0x07ae }
            r5.a = r11     // Catch:{ all -> 0x07ae }
            r5.b = r6     // Catch:{ all -> 0x07ae }
            r5.d = r11     // Catch:{ all -> 0x07ae }
            java.lang.String r9 = "com.google.android.gms+new-device-tag"
            r5.e = r9     // Catch:{ all -> 0x07ae }
            java.lang.String r9 = "com.google.android.gms+new-device-tag"
            r5.c = r9     // Catch:{ all -> 0x07ae }
            ajkh r5 = r5.a()     // Catch:{ all -> 0x07ae }
            ajld r9 = r1.d     // Catch:{ IOException -> 0x0134, eif -> 0x0108 }
            java.lang.String r13 = "syncNotDefinedYet"
            ajkh r5 = r9.a(r4, r5, r13, r11)     // Catch:{ IOException -> 0x0134, eif -> 0x0108 }
            java.lang.String r7 = "UlrSyncNewAccount"
            defpackage.ajjb.a((java.lang.String) r7, (defpackage.ajkh) r5)     // Catch:{ all -> 0x07ae }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x07ae }
            java.lang.Boolean r8 = r5.b     // Catch:{ all -> 0x07ae }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x07ae }
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x07ae }
            java.lang.Boolean r9 = r5.d     // Catch:{ all -> 0x07ae }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x07ae }
            java.lang.String r9 = "com.google.android.gms+new-account+sync"
            ajmz r2 = a((com.google.android.location.reporting.state.update.AccountConfig) r2, (java.lang.String) r9)     // Catch:{ all -> 0x07ae }
            r2.a((defpackage.ajkh) r5)     // Catch:{ all -> 0x07ae }
            r2.g = r6     // Catch:{ all -> 0x07ae }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x07ae }
            r2.h = r9     // Catch:{ all -> 0x07ae }
            if (r7 != 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            r2.g = r6     // Catch:{ all -> 0x07ae }
            r2.a((boolean) r12)     // Catch:{ all -> 0x07ae }
        L_0x00b3:
            ajna r2 = r2.a()     // Catch:{ all -> 0x07ae }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07ae }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07ae }
            int r6 = r6.length()     // Catch:{ all -> 0x07ae }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ae }
            int r6 = r6 + 20
            r7.<init>(r6)     // Catch:{ all -> 0x07ae }
            java.lang.String r6 = "syncNotDefinedYet() "
            r7.append(r6)     // Catch:{ all -> 0x07ae }
            r7.append(r5)     // Catch:{ all -> 0x07ae }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x07ae }
            ajmm r6 = r1.c     // Catch:{ all -> 0x07ae }
            java.lang.String r7 = "sync_new_account"
            r6.a(r5, r2, r7)     // Catch:{ all -> 0x07ae }
            if (r8 == 0) goto L_0x00f0
            ajlq r2 = r1.f     // Catch:{ all -> 0x07ae }
            boolean r5 = r2.b(r4)     // Catch:{ all -> 0x07ae }
            if (r5 == 0) goto L_0x0100
            ajmm r5 = r2.b     // Catch:{ all -> 0x07ae }
            r5.c(r4, r12)     // Catch:{ all -> 0x07ae }
            r2.e(r4)     // Catch:{ all -> 0x07ae }
            goto L_0x0100
        L_0x00f0:
            ajlq r2 = r1.f     // Catch:{ all -> 0x07ae }
            r2.a(r4)     // Catch:{ all -> 0x07ae }
            boolean r2 = defpackage.azte.b()     // Catch:{ all -> 0x07ae }
            if (r2 == 0) goto L_0x0100
            java.lang.String r2 = "UlrAutoEnableEvents"
            defpackage.ajjb.a((java.lang.String) r2, (int) r10)     // Catch:{ all -> 0x07ae }
        L_0x0100:
            ajmj r2 = r1.e     // Catch:{ all -> 0x07ae }
            r2.a(r4, r12)     // Catch:{ all -> 0x07ae }
            r7 = r1
            goto L_0x079e
        L_0x0108:
            r0 = move-exception
            r2 = r0
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07ae }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07ae }
            int r6 = r6.length()     // Catch:{ all -> 0x07ae }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ae }
            int r6 = r6 + 36
            r7.<init>(r6)     // Catch:{ all -> 0x07ae }
            java.lang.String r6 = "GCoreUlr"
            java.lang.String r9 = "syncNotDefinedYet() auth exception: "
            r7.append(r9)     // Catch:{ all -> 0x07ae }
            r7.append(r5)     // Catch:{ all -> 0x07ae }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x07ae }
            defpackage.ajix.c(r6, r5)     // Catch:{ all -> 0x07ae }
            ajmj r5 = r1.e     // Catch:{ all -> 0x07ae }
            r5.a(r4, r8)     // Catch:{ all -> 0x07ae }
            throw r2     // Catch:{ all -> 0x07ae }
        L_0x0134:
            r0 = move-exception
            r2 = r0
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07ae }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07ae }
            int r6 = r6.length()     // Catch:{ all -> 0x07ae }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ae }
            int r6 = r6 + 45
            r8.<init>(r6)     // Catch:{ all -> 0x07ae }
            java.lang.String r6 = "GCoreUlr"
            java.lang.String r9 = "syncNotDefinedYet() can't get server values: "
            r8.append(r9)     // Catch:{ all -> 0x07ae }
            r8.append(r5)     // Catch:{ all -> 0x07ae }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x07ae }
            defpackage.ajix.c(r6, r5)     // Catch:{ all -> 0x07ae }
            android.content.Context r5 = r1.a     // Catch:{ all -> 0x07ae }
            boolean r5 = defpackage.jkf.a(r5)     // Catch:{ all -> 0x07ae }
            if (r5 != 0) goto L_0x0164
            r7 = 3
            goto L_0x0165
        L_0x0164:
            r7 = 4
        L_0x0165:
            ajmj r5 = r1.e     // Catch:{ all -> 0x07ae }
            r5.a(r4, r7)     // Catch:{ all -> 0x07ae }
            throw r2     // Catch:{ all -> 0x07ae }
        L_0x016b:
            boolean r4 = r2.l     // Catch:{ all -> 0x07ae }
            if (r4 != 0) goto L_0x05b5
            android.accounts.Account r4 = r2.a     // Catch:{ all -> 0x07ae }
            java.lang.String r6 = "com.google.android.gms+not-dirty"
            ajmz r6 = a((com.google.android.location.reporting.state.update.AccountConfig) r2, (java.lang.String) r6)     // Catch:{ all -> 0x07ae }
            ajld r8 = r1.d     // Catch:{ all -> 0x07ae }
            ajmm r13 = r8.a     // Catch:{ all -> 0x07ae }
            int r13 = r13.b((android.accounts.Account) r4)     // Catch:{ all -> 0x07ae }
            java.lang.String r14 = r8.a((android.accounts.Account) r4)     // Catch:{ all -> 0x07ae }
            boolean r15 = defpackage.azsy.d()     // Catch:{ eif -> 0x05ac }
            if (r15 != 0) goto L_0x0352
            ajkr r15 = r8.b     // Catch:{ eif -> 0x034b }
            android.content.Context r7 = r15.i     // Catch:{ eif -> 0x034b }
            ajkx r7 = defpackage.ajkq.a(r7)     // Catch:{ eif -> 0x034b }
            alky r10 = new alky     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            r10.<init>(r7)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            android.content.Context r9 = r15.i     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            com.google.android.gms.common.internal.ClientContext r17 = defpackage.ajkr.a(r9, r4)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            ajkw r9 = defpackage.ajkk.a     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            r7.m = r9     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.String r9 = defpackage.ajkr.f     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.String r13 = defpackage.ajkr.d     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.String r16 = defpackage.ajkr.c     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.String r18 = "noRestriction"
            int r11 = r15.j     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.Boolean r5 = r15.n     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.String r19 = defpackage.ajkr.h     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.String r20 = defpackage.ajkr.g     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            int r12 = r15.l     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            r21 = 2023(0x7e7, float:2.835E-42)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            int r22 = defpackage.ajkr.a     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            int r15 = r15.k     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.String r23 = defpackage.ajkr.b     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            boolean r24 = defpackage.azss.e()     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            if (r24 == 0) goto L_0x01ed
            java.lang.String r24 = "android"
            goto L_0x01ef
        L_0x01db:
            r0 = move-exception
            r1 = r0
            r30 = r8
            goto L_0x0343
        L_0x01e1:
            r0 = move-exception
            r1 = r0
            r30 = r8
            goto L_0x0317
        L_0x01e7:
            r0 = move-exception
            r1 = r0
            r30 = r8
            goto L_0x0332
        L_0x01ed:
            r24 = 0
        L_0x01ef:
            java.lang.String r25 = defpackage.ajkr.e     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            r1.<init>()     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            r29 = r6
            java.util.Formatter r6 = new java.util.Formatter     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            r6.<init>(r1)     // Catch:{ eif -> 0x032e, VolleyError -> 0x0313, all -> 0x030e }
            r26 = r2
            r30 = r8
            r2 = 1
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            r7 = 0
            r8[r7] = r2     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r2 = "settings/%1$s"
            r6.format(r2, r8)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            if (r14 == 0) goto L_0x021b
            java.lang.String r2 = "androidGcmRegistrationId"
            java.lang.String r6 = defpackage.iyv.a(r14)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x021b:
            if (r9 == 0) goto L_0x0226
            java.lang.String r2 = "brand"
            java.lang.String r6 = defpackage.iyv.a(r9)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x0226:
            if (r13 == 0) goto L_0x0231
            java.lang.String r2 = "device"
            java.lang.String r6 = defpackage.iyv.a(r13)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x0231:
            if (r16 != 0) goto L_0x0234
            goto L_0x023d
        L_0x0234:
            java.lang.String r2 = "devicePrettyName"
            java.lang.String r6 = defpackage.iyv.a(r16)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x023d:
            java.lang.String r2 = "deviceRestriction"
            java.lang.String r6 = defpackage.iyv.a(r18)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r2 = "gmsVersion"
            java.lang.String r6 = java.lang.String.valueOf(r11)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            if (r5 == 0) goto L_0x025a
            java.lang.String r2 = "isLowRam"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x025a:
            if (r19 == 0) goto L_0x0265
            java.lang.String r2 = "manufacturer"
            java.lang.String r5 = defpackage.iyv.a(r19)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x0265:
            if (r20 != 0) goto L_0x0268
            goto L_0x0271
        L_0x0268:
            java.lang.String r2 = "model"
            java.lang.String r5 = defpackage.iyv.a(r20)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x0271:
            java.lang.String r2 = "moduleVersion"
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r2 = "nlpVersion"
            java.lang.String r5 = java.lang.String.valueOf(r21)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r2 = "osLevel"
            java.lang.String r5 = java.lang.String.valueOf(r22)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r2 = "packageVersion"
            java.lang.String r5 = java.lang.String.valueOf(r15)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            if (r23 == 0) goto L_0x02a0
            java.lang.String r2 = "platform"
            java.lang.String r5 = defpackage.iyv.a(r23)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x02a0:
            if (r24 == 0) goto L_0x02ab
            java.lang.String r2 = "platformType"
            java.lang.String r5 = defpackage.iyv.a(r24)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x02ab:
            if (r25 != 0) goto L_0x02ae
            goto L_0x02b7
        L_0x02ae:
            java.lang.String r2 = "product"
            java.lang.String r5 = defpackage.iyv.a(r25)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            defpackage.iyv.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x02b7:
            java.lang.String r19 = r1.toString()     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            izb r1 = r10.a     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            r18 = 0
            r20 = 0
            java.lang.Class<com.google.android.ulr.ApiSettings> r21 = com.google.android.ulr.ApiSettings.class
            r16 = r1
            jag r1 = r16.a((com.google.android.gms.common.internal.ClientContext) r17, (int) r18, (java.lang.String) r19, (java.lang.Object) r20, (java.lang.Class) r21)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            com.google.android.ulr.ApiSettings r1 = (com.google.android.ulr.ApiSettings) r1     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            if (r1 == 0) goto L_0x02da
            r2 = 1
            defpackage.ajjd.c((boolean) r2)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            ajkh r1 = defpackage.ajkh.a((android.accounts.Account) r4, (com.google.android.ulr.ApiSettings) r1)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            r2 = r1
            r1 = r30
            goto L_0x03de
        L_0x02da:
            boolean r1 = defpackage.azte.d()     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            if (r1 != 0) goto L_0x02e5
            r1 = 0
            defpackage.ajjd.c((boolean) r1)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            goto L_0x02ea
        L_0x02e5:
            r1 = 0
            defpackage.ajjd.b((java.lang.Throwable) r1)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x02ea:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r2 = "Received null settings from server for account "
            java.lang.String r5 = defpackage.rmp.a((android.accounts.Account) r4)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            int r6 = r5.length()     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            if (r6 != 0) goto L_0x0302
            java.lang.String r5 = new java.lang.String     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            r5.<init>(r2)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            goto L_0x0306
        L_0x0302:
            java.lang.String r5 = r2.concat(r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x0306:
            r1.<init>(r5)     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
            throw r1     // Catch:{ eif -> 0x030c, VolleyError -> 0x030a }
        L_0x030a:
            r0 = move-exception
            goto L_0x0316
        L_0x030c:
            r0 = move-exception
            goto L_0x0331
        L_0x030e:
            r0 = move-exception
            r30 = r8
        L_0x0311:
            r1 = r0
            goto L_0x0343
        L_0x0313:
            r0 = move-exception
            r30 = r8
        L_0x0316:
            r1 = r0
        L_0x0317:
            defpackage.ajkr.a(r1)     // Catch:{ all -> 0x0341 }
            boolean r2 = defpackage.azte.d()     // Catch:{ all -> 0x0341 }
            if (r2 != 0) goto L_0x0325
            r2 = 0
            defpackage.ajjd.c((boolean) r2)     // Catch:{ all -> 0x0341 }
            goto L_0x0328
        L_0x0325:
            defpackage.ajjd.b((java.lang.Throwable) r1)     // Catch:{ all -> 0x0341 }
        L_0x0328:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0341 }
            r2.<init>(r1)     // Catch:{ all -> 0x0341 }
            throw r2     // Catch:{ all -> 0x0341 }
        L_0x032e:
            r0 = move-exception
            r30 = r8
        L_0x0331:
            r1 = r0
        L_0x0332:
            boolean r2 = defpackage.azte.d()     // Catch:{ all -> 0x0341 }
            if (r2 != 0) goto L_0x033d
            r2 = 0
            defpackage.ajjd.c((boolean) r2)     // Catch:{ all -> 0x0341 }
            goto L_0x0340
        L_0x033d:
            defpackage.ajjd.b((java.lang.Throwable) r1)     // Catch:{ all -> 0x0341 }
        L_0x0340:
            throw r1     // Catch:{ all -> 0x0341 }
        L_0x0341:
            r0 = move-exception
            goto L_0x0311
        L_0x0343:
            throw r1     // Catch:{ eif -> 0x0344 }
        L_0x0344:
            r0 = move-exception
            r7 = r27
            r1 = r30
            goto L_0x05af
        L_0x034b:
            r0 = move-exception
            r7 = r27
            r2 = r0
            r1 = r8
            goto L_0x05b0
        L_0x0352:
            r26 = r2
            r29 = r6
            r30 = r8
            r1 = r30
            ajkj r2 = r1.c     // Catch:{ eif -> 0x05a8 }
            r5 = 1
            aucd r6 = r2.a((java.lang.String) r14, (boolean) r5)     // Catch:{ eif -> 0x05a8 }
            aucj r5 = r6.i()     // Catch:{ eif -> 0x05a8 }
            atbz r5 = (defpackage.atbz) r5     // Catch:{ eif -> 0x05a8 }
            atea r6 = defpackage.atea.d     // Catch:{ eif -> 0x05a8 }
            aucd r6 = r6.o()     // Catch:{ eif -> 0x05a8 }
            boolean r7 = r6.c     // Catch:{ eif -> 0x05a8 }
            if (r7 != 0) goto L_0x0372
            goto L_0x0378
        L_0x0372:
            r6.c()     // Catch:{ eif -> 0x05a8 }
            r7 = 0
            r6.c = r7     // Catch:{ eif -> 0x05a8 }
        L_0x0378:
            aucj r7 = r6.b     // Catch:{ eif -> 0x05a8 }
            atea r7 = (defpackage.atea) r7     // Catch:{ eif -> 0x05a8 }
            int r8 = r7.a     // Catch:{ eif -> 0x05a8 }
            r9 = 1
            r8 = r8 | r9
            r7.a = r8     // Catch:{ eif -> 0x05a8 }
            r7.b = r13     // Catch:{ eif -> 0x05a8 }
            r5.getClass()     // Catch:{ eif -> 0x05a8 }
            r7.c = r5     // Catch:{ eif -> 0x05a8 }
            r5 = 2
            r8 = r8 | r5
            r7.a = r8     // Catch:{ eif -> 0x05a8 }
            aucj r5 = r6.i()     // Catch:{ eif -> 0x05a8 }
            r9 = r5
            atea r9 = (defpackage.atea) r9     // Catch:{ eif -> 0x05a8 }
            r5 = 0
            defpackage.ajjd.b((long) r5)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            ajlf r5 = defpackage.ajkj.j     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            android.content.Context r2 = r2.i     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            com.google.android.gms.common.internal.ClientContext r8 = defpackage.ajkj.a((android.content.Context) r2, (android.accounts.Account) r4)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            baaj r2 = defpackage.ajlf.b     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            if (r2 == 0) goto L_0x03a6
            goto L_0x03bc
        L_0x03a6:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            java.lang.String r6 = "userlocation.UserLocationReportingService/GetApiSettings"
            atea r7 = defpackage.atea.d     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            baah r7 = defpackage.baoq.a(r7)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            atdz r10 = defpackage.atdz.c     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            baah r10 = defpackage.baoq.a(r10)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            baaj r2 = defpackage.baaj.a(r2, r6, r7, r10)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            defpackage.ajlf.b = r2     // Catch:{ babk -> 0x058e, eif -> 0x058c }
        L_0x03bc:
            izd r6 = r5.a     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            baaj r7 = defpackage.ajlf.b     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            r10 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            java.lang.Object r2 = r6.a(r7, r8, r9, r10, r12)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            atdz r2 = (defpackage.atdz) r2     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            int r5 = r2.a     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0556
            defpackage.ajjd.c((boolean) r6)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            atdl r2 = r2.b     // Catch:{ babk -> 0x058e, eif -> 0x058c }
            if (r2 == 0) goto L_0x03d8
            goto L_0x03da
        L_0x03d8:
            atdl r2 = defpackage.atdl.j     // Catch:{ babk -> 0x058e, eif -> 0x058c }
        L_0x03da:
            ajkh r2 = defpackage.ajkh.a((android.accounts.Account) r4, (defpackage.atdl) r2)     // Catch:{ babk -> 0x058e, eif -> 0x058c }
        L_0x03de:
            boolean r5 = defpackage.ajld.b(r2)     // Catch:{ eif -> 0x05a8 }
            if (r5 == 0) goto L_0x03ea
            r1.a((android.accounts.Account) r4, (java.lang.String) r14)     // Catch:{ eif -> 0x05a8 }
            r1.a((defpackage.ajkh) r2)     // Catch:{ eif -> 0x05a8 }
        L_0x03ea:
            r5 = 1
            r1.a((android.accounts.Account) r4, (boolean) r5)     // Catch:{ eif -> 0x05a8 }
            java.lang.String r1 = "UlrSyncNotDirty"
            defpackage.ajjb.a((java.lang.String) r1, (defpackage.ajkh) r2)     // Catch:{ all -> 0x05a3 }
            java.lang.Long r1 = r2.a     // Catch:{ all -> 0x05a3 }
            if (r1 == 0) goto L_0x044b
            long r5 = r1.longValue()     // Catch:{ all -> 0x05a3 }
            r1 = r26
            long r7 = r1.i     // Catch:{ all -> 0x05a3 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x044b
            java.lang.String r4 = defpackage.rmp.a((android.accounts.Account) r4)     // Catch:{ all -> 0x05a3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x05a3 }
            long r5 = r1.i     // Catch:{ all -> 0x05a3 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x05a3 }
            int r1 = r1.length()     // Catch:{ all -> 0x05a3 }
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x05a3 }
            int r7 = r7.length()     // Catch:{ all -> 0x05a3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x05a3 }
            int r1 = r1 + 80
            int r1 = r1 + r7
            r8.<init>(r1)     // Catch:{ all -> 0x05a3 }
            java.lang.String r1 = "GCoreUlr"
            java.lang.String r7 = "sync() rejecting stale server values for account "
            r8.append(r7)     // Catch:{ all -> 0x05a3 }
            r8.append(r4)     // Catch:{ all -> 0x05a3 }
            java.lang.String r4 = ": "
            r8.append(r4)     // Catch:{ all -> 0x05a3 }
            r8.append(r2)     // Catch:{ all -> 0x05a3 }
            java.lang.String r2 = "; local: "
            r8.append(r2)     // Catch:{ all -> 0x05a3 }
            r8.append(r5)     // Catch:{ all -> 0x05a3 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x05a3 }
            defpackage.ajix.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x05a3 }
            r7 = r27
            goto L_0x079e
        L_0x044b:
            int r1 = r2.g     // Catch:{ all -> 0x05a3 }
            r5 = 1
            if (r1 != r5) goto L_0x0451
            goto L_0x045f
        L_0x0451:
            r5 = 3
            if (r1 == r5) goto L_0x045a
            r7 = r27
            r1 = r29
            goto L_0x04e3
        L_0x045a:
            int r1 = r2.h     // Catch:{ all -> 0x05a3 }
            r5 = 2
            if (r1 != r5) goto L_0x04df
        L_0x045f:
            r1 = r29
            r5 = 1
            r1.a((boolean) r5)     // Catch:{ all -> 0x05a3 }
            ajna r1 = r1.a()     // Catch:{ all -> 0x05a3 }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x05a3 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x05a3 }
            int r6 = r6.length()     // Catch:{ all -> 0x05a3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x05a3 }
            int r6 = r6 + 76
            r7.<init>(r6)     // Catch:{ all -> 0x05a3 }
            java.lang.String r6 = "sync() server returned empty or device tag unknown "
            r7.append(r6)     // Catch:{ all -> 0x05a3 }
            r7.append(r5)     // Catch:{ all -> 0x05a3 }
            java.lang.String r5 = ", will try uploading ours"
            r7.append(r5)     // Catch:{ all -> 0x05a3 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x05a3 }
            int r6 = r2.g     // Catch:{ all -> 0x05a3 }
            r7 = 1
            if (r6 == r7) goto L_0x0496
            java.lang.String r6 = "sync_unknown_device_tag"
            goto L_0x0498
        L_0x0496:
            java.lang.String r6 = "sync_source_no_data"
        L_0x0498:
            r7 = r27
            ajmm r8 = r7.c     // Catch:{ all -> 0x07b3 }
            r8.a(r5, r1, r6)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r2 = defpackage.rmp.a((android.accounts.Account) r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07b3 }
            int r4 = r4.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07b3 }
            int r5 = r5.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r4 = r4 + 72
            int r4 = r4 + r5
            r6.<init>(r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r5 = "sync() server returned empty or device tag unknown "
            r6.append(r5)     // Catch:{ all -> 0x07b3 }
            r6.append(r1)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = " for "
            r6.append(r1)     // Catch:{ all -> 0x07b3 }
            r6.append(r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = ", will send ours"
            r6.append(r1)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x07b3 }
            defpackage.ajix.a((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ all -> 0x07b3 }
            goto L_0x079e
        L_0x04df:
            r7 = r27
            r1 = r29
        L_0x04e3:
            java.lang.String r5 = defpackage.rmp.a((android.accounts.Account) r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            int r8 = r8.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x07b3 }
            int r9 = r9.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r8 = r8 + 38
            int r8 = r8 + r9
            r10.<init>(r8)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = "Accepting server values for account "
            r10.append(r8)     // Catch:{ all -> 0x07b3 }
            r10.append(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r5 = ": "
            r10.append(r5)     // Catch:{ all -> 0x07b3 }
            r10.append(r6)     // Catch:{ all -> 0x07b3 }
            r10.toString()     // Catch:{ all -> 0x07b3 }
            r1.a((defpackage.ajkh) r2)     // Catch:{ all -> 0x07b3 }
            ajna r1 = r1.a()     // Catch:{ all -> 0x07b3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07b3 }
            int r5 = r5.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r5 = r5 + 19
            r6.<init>(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r5 = "sync() server wins "
            r6.append(r5)     // Catch:{ all -> 0x07b3 }
            r6.append(r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x07b3 }
            ajmm r5 = r7.c     // Catch:{ all -> 0x07b3 }
            java.lang.String r6 = "sync_server_wins"
            r5.a(r2, r1, r6)     // Catch:{ all -> 0x07b3 }
            ajlq r1 = r7.f     // Catch:{ all -> 0x07b3 }
            r1.a(r4)     // Catch:{ all -> 0x07b3 }
            boolean r1 = defpackage.azte.b()     // Catch:{ all -> 0x07b3 }
            if (r1 == 0) goto L_0x079e
            java.lang.String r1 = "UlrAutoEnableEvents"
            r2 = 4
            defpackage.ajjb.a((java.lang.String) r1, (int) r2)     // Catch:{ all -> 0x07b3 }
            goto L_0x079e
        L_0x0556:
            r7 = r27
            boolean r2 = defpackage.azte.d()     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            if (r2 != 0) goto L_0x0563
            r2 = 0
            defpackage.ajjd.c((boolean) r2)     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            goto L_0x0568
        L_0x0563:
            r2 = 0
            defpackage.ajjd.b((java.lang.Throwable) r2)     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
        L_0x0568:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            java.lang.String r5 = "Received null settings from server for account "
            java.lang.String r6 = defpackage.rmp.a((android.accounts.Account) r4)     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            int r8 = r6.length()     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            if (r8 != 0) goto L_0x0580
            java.lang.String r6 = new java.lang.String     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            r6.<init>(r5)     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            goto L_0x0584
        L_0x0580:
            java.lang.String r6 = r5.concat(r6)     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
        L_0x0584:
            r2.<init>(r6)     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
            throw r2     // Catch:{ babk -> 0x058a, eif -> 0x0588 }
        L_0x0588:
            r0 = move-exception
            goto L_0x0591
        L_0x058a:
            r0 = move-exception
            goto L_0x0591
        L_0x058c:
            r0 = move-exception
            goto L_0x058f
        L_0x058e:
            r0 = move-exception
        L_0x058f:
            r7 = r27
        L_0x0591:
            r2 = r0
            boolean r5 = defpackage.azte.d()     // Catch:{ eif -> 0x05a1 }
            if (r5 != 0) goto L_0x059d
            r5 = 0
            defpackage.ajjd.c((boolean) r5)     // Catch:{ eif -> 0x05a1 }
            goto L_0x05a0
        L_0x059d:
            defpackage.ajjd.b((java.lang.Throwable) r2)     // Catch:{ eif -> 0x05a1 }
        L_0x05a0:
            throw r2     // Catch:{ eif -> 0x05a1 }
        L_0x05a1:
            r0 = move-exception
            goto L_0x05af
        L_0x05a3:
            r0 = move-exception
            r7 = r27
            goto L_0x07b0
        L_0x05a8:
            r0 = move-exception
            r7 = r27
            goto L_0x05af
        L_0x05ac:
            r0 = move-exception
            r7 = r1
            r1 = r8
        L_0x05af:
            r2 = r0
        L_0x05b0:
            r5 = 0
            r1.a((android.accounts.Account) r4, (boolean) r5)     // Catch:{ all -> 0x07b3 }
            throw r2     // Catch:{ all -> 0x07b3 }
        L_0x05b5:
            r7 = r1
            r1 = r2
            android.accounts.Account r2 = r1.a     // Catch:{ all -> 0x07b3 }
            ajlq r4 = r7.f     // Catch:{ all -> 0x07b3 }
            r4.a(r2)     // Catch:{ all -> 0x07b3 }
            boolean r4 = defpackage.azte.b()     // Catch:{ all -> 0x07b3 }
            if (r4 != 0) goto L_0x05c5
            goto L_0x05ca
        L_0x05c5:
            java.lang.String r4 = "UlrAutoEnableEvents"
            defpackage.ajjb.a((java.lang.String) r4, (int) r8)     // Catch:{ all -> 0x07b3 }
        L_0x05ca:
            ajkg r4 = defpackage.ajkh.a()     // Catch:{ all -> 0x07b3 }
            long r8 = r1.i     // Catch:{ all -> 0x07b3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x07b3 }
            r4.a = r5     // Catch:{ all -> 0x07b3 }
            boolean r5 = r1.e     // Catch:{ all -> 0x07b3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            r4.b = r5     // Catch:{ all -> 0x07b3 }
            java.lang.String r5 = r1.f     // Catch:{ all -> 0x07b3 }
            r4.c = r5     // Catch:{ all -> 0x07b3 }
            boolean r5 = r1.g     // Catch:{ all -> 0x07b3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            r4.d = r5     // Catch:{ all -> 0x07b3 }
            java.lang.String r5 = r1.h     // Catch:{ all -> 0x07b3 }
            r4.e = r5     // Catch:{ all -> 0x07b3 }
            ajkh r4 = r4.a()     // Catch:{ all -> 0x07b3 }
            ajld r5 = r7.d     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = "syncDirty"
            r9 = r32
            ajkh r5 = r5.a(r2, r4, r8, r9)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = "UlrSyncDirty"
            defpackage.ajjb.a((java.lang.String) r8, (defpackage.ajkh) r5)     // Catch:{ all -> 0x07b3 }
            int r8 = r5.g     // Catch:{ all -> 0x07b3 }
            r9 = 3
            if (r8 == r9) goto L_0x0687
            java.lang.String r8 = defpackage.rmp.a((android.accounts.Account) r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r10 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07b3 }
            int r11 = r11.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x07b3 }
            int r12 = r12.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r13 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x07b3 }
            int r13 = r13.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r11 = r11 + 48
            int r11 = r11 + r12
            int r11 = r11 + r13
            r14.<init>(r11)     // Catch:{ all -> 0x07b3 }
            java.lang.String r11 = "Successfully uploaded changes for account "
            r14.append(r11)     // Catch:{ all -> 0x07b3 }
            r14.append(r8)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = ": "
            r14.append(r8)     // Catch:{ all -> 0x07b3 }
            r14.append(r9)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = " -> "
            r14.append(r8)     // Catch:{ all -> 0x07b3 }
            r14.append(r10)     // Catch:{ all -> 0x07b3 }
            r14.toString()     // Catch:{ all -> 0x07b3 }
            r8 = 0
            ajmz r8 = a((com.google.android.location.reporting.state.update.AccountConfig) r1, (java.lang.String) r8)     // Catch:{ all -> 0x07b3 }
            r8.a((defpackage.ajkh) r5)     // Catch:{ all -> 0x07b3 }
            r9 = 1
            r8.j = r9     // Catch:{ all -> 0x07b3 }
            r9 = 0
            r8.a((boolean) r9)     // Catch:{ all -> 0x07b3 }
            ajna r8 = r8.a()     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x07b3 }
            int r10 = r10.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r10 = r10 + 18
            r11.<init>(r10)     // Catch:{ all -> 0x07b3 }
            java.lang.String r10 = "sync() local wins "
            r11.append(r10)     // Catch:{ all -> 0x07b3 }
            r11.append(r9)     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x07b3 }
            ajmm r10 = r7.c     // Catch:{ all -> 0x07b3 }
            java.lang.String r11 = "sync_local_wins"
            r10.a(r9, r8, r11)     // Catch:{ all -> 0x07b3 }
        L_0x0687:
            java.lang.String r2 = defpackage.rmp.a((android.accounts.Account) r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07b3 }
            int r9 = r9.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07b3 }
            int r10 = r10.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07b3 }
            int r11 = r11.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r9 = r9 + 35
            int r9 = r9 + r10
            int r9 = r9 + r11
            r12.<init>(r9)     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = "Concurrent updates for account "
            r12.append(r9)     // Catch:{ all -> 0x07b3 }
            r12.append(r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r2 = ": "
            r12.append(r2)     // Catch:{ all -> 0x07b3 }
            r12.append(r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r2 = "; "
            r12.append(r2)     // Catch:{ all -> 0x07b3 }
            r12.append(r8)     // Catch:{ all -> 0x07b3 }
            r12.toString()     // Catch:{ all -> 0x07b3 }
            java.lang.String r2 = "com.google.android.gms+ambiguous"
            ajmz r2 = a((com.google.android.location.reporting.state.update.AccountConfig) r1, (java.lang.String) r2)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = "reporting"
            java.lang.Boolean r8 = r5.b     // Catch:{ all -> 0x07b3 }
            boolean r9 = r1.e     // Catch:{ all -> 0x07b3 }
            r10 = r29
            boolean r4 = a(r4, r8, r9, r10)     // Catch:{ all -> 0x07b3 }
            if (r4 == 0) goto L_0x071e
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07b3 }
            int r9 = r9.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07b3 }
            int r10 = r10.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r9 = r9 + 44
            int r9 = r9 + r10
            r11.<init>(r9)     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = "Ambiguating LR due to conflict between "
            r11.append(r9)     // Catch:{ all -> 0x07b3 }
            r11.append(r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = " and "
            r11.append(r4)     // Catch:{ all -> 0x07b3 }
            r11.append(r8)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x07b3 }
            defpackage.ajix.c(r4, r8)     // Catch:{ all -> 0x07b3 }
            r2.g = r6     // Catch:{ all -> 0x07b3 }
        L_0x071e:
            java.lang.String r4 = "history"
            java.lang.Boolean r8 = r5.d     // Catch:{ all -> 0x07b3 }
            boolean r9 = r1.g     // Catch:{ all -> 0x07b3 }
            r10 = r30
            boolean r4 = a(r4, r8, r9, r10)     // Catch:{ all -> 0x07b3 }
            if (r4 == 0) goto L_0x0767
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07b3 }
            int r8 = r8.length()     // Catch:{ all -> 0x07b3 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07b3 }
            int r9 = r9.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r8 = r8 + 44
            int r8 = r8 + r9
            r10.<init>(r8)     // Catch:{ all -> 0x07b3 }
            java.lang.String r8 = "Ambiguating LH due to conflict between "
            r10.append(r8)     // Catch:{ all -> 0x07b3 }
            r10.append(r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = " and "
            r10.append(r4)     // Catch:{ all -> 0x07b3 }
            r10.append(r1)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = "GCoreUlr"
            java.lang.String r4 = r10.toString()     // Catch:{ all -> 0x07b3 }
            defpackage.ajix.c(r1, r4)     // Catch:{ all -> 0x07b3 }
            r2.h = r6     // Catch:{ all -> 0x07b3 }
        L_0x0767:
            java.lang.Long r1 = r5.a     // Catch:{ all -> 0x07b3 }
            r2.k = r1     // Catch:{ all -> 0x07b3 }
            int r1 = r5.f     // Catch:{ all -> 0x07b3 }
            r2.a((int) r1)     // Catch:{ all -> 0x07b3 }
            r1 = 1
            r2.a((boolean) r1)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07b3 }
            int r4 = r4.length()     // Catch:{ all -> 0x07b3 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b3 }
            int r4 = r4 + 18
            r5.<init>(r4)     // Catch:{ all -> 0x07b3 }
            java.lang.String r4 = "sync() concurrent "
            r5.append(r4)     // Catch:{ all -> 0x07b3 }
            r5.append(r1)     // Catch:{ all -> 0x07b3 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x07b3 }
            ajmm r4 = r7.c     // Catch:{ all -> 0x07b3 }
            ajna r2 = r2.a()     // Catch:{ all -> 0x07b3 }
            java.lang.String r5 = "sync_concurrent"
            r4.a(r1, r2, r5)     // Catch:{ all -> 0x07b3 }
        L_0x079e:
            monitor-exit(r3)     // Catch:{ all -> 0x07b3 }
            ajmm r1 = r7.c
            com.google.android.location.reporting.state.update.ReportingConfig r1 = r1.a()
            boolean r1 = r1.d()
            defpackage.ajjb.a((boolean) r1)
            r1 = 1
            return r1
        L_0x07ae:
            r0 = move-exception
            r7 = r1
        L_0x07b0:
            r1 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x07b3 }
            throw r1
        L_0x07b3:
            r0 = move-exception
            goto L_0x07b0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajls.b(android.accounts.Account, java.lang.Boolean, java.lang.Boolean, boolean, java.lang.String):boolean");
    }

    private static final ajmz a(AccountConfig accountConfig, String str) {
        Account account = accountConfig.a;
        long j = accountConfig.c;
        ajmz a2 = ajna.a(account, str);
        a2.f = true;
        a2.a(j);
        return a2;
    }

    public static Intent a(Context context, String str, Account account, Boolean bool, Boolean bool2, Boolean bool3, String str2) {
        Intent a2 = ajme.a(context, "com.google.android.location.reporting.ACTION_INSISTENT_SYNC");
        a2.putExtra("label", str);
        a2.putExtra("account", account);
        a2.putExtra("ulrRelatedSettingChange", bool3);
        if (bool != null) {
            a2.putExtra("reportingEnabled", bool);
        }
        if (bool2 != null) {
            a2.putExtra("historyEnabled", bool2);
        }
        if (str2 != null) {
            a2.putExtra("auditToken", str2);
        }
        return a2;
    }

    static Boolean a(Intent intent, String str) {
        if (intent.hasExtra(str)) {
            return Boolean.valueOf(intent.getBooleanExtra(str, false));
        }
        return null;
    }

    public static void a(Context context, String str, Account account) {
        String a2 = rmp.a(account);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 22 + str.length());
        sb.append("Requesting sync for ");
        sb.append(a2);
        sb.append(": ");
        sb.append(str);
        sb.toString();
        ajnw.a(context, a(context, str, account, (Boolean) null, (Boolean) null, (Boolean) null, (String) null));
    }

    static boolean a(String str, Boolean bool, boolean z, Boolean bool2) {
        if (bool == null || bool.equals(Boolean.valueOf(z))) {
            return false;
        }
        if (bool2 == null) {
            return true;
        }
        if (bool2.booleanValue() == z) {
            String valueOf = String.valueOf(bool2);
            String valueOf2 = String.valueOf(bool);
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("sync() insistent ");
            sb.append(str);
            sb.append(" value ");
            sb.append(valueOf);
            sb.append(" overriding server value: ");
            sb.append(valueOf2);
            ajix.a("GCoreUlr", sb.toString());
            return false;
        }
        String valueOf3 = String.valueOf(bool2);
        StringBuilder sb2 = new StringBuilder(str.length() + 71 + String.valueOf(valueOf3).length());
        sb2.append("sync() ignoring insistent ");
        sb2.append(str);
        sb2.append(" value ");
        sb2.append(valueOf3);
        sb2.append(", inconsistent with local value: ");
        sb2.append(z);
        ajix.a("GCoreUlr", sb2.toString());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(Account account, Boolean bool, Boolean bool2, boolean z, String str) {
        if (b(account, bool, bool2, z, str) && this.c.a(account).l) {
            boolean b2 = b(account, bool, bool2, z, str);
            boolean z2 = this.c.a(account).l;
            if (b2 && z2) {
                ajix.b("GCoreUlr", "Preference values still dirty after two sync attempts");
            }
            ajjb.a("UlrSyncDirtyRetry", z2);
        }
    }
}
