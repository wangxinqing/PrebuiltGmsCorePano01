package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbs extends zax {
    private final ClientContext a;
    private final ytk b;

    public zbs(ClientContext clientContext, ytk ytk) {
        this.a = clientContext;
        this.b = ytk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02bd A[ExcHandler: VolleyError (e com.android.volley.VolleyError), PHI: r1 
      PHI: (r1v5 zbs) = (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v12 zbs), (r1v12 zbs), (r1v0 zbs), (r1v0 zbs) binds: [B:1:0x0006, B:2:?, B:4:0x000c, B:16:0x006c, B:17:?, B:23:0x0077, B:108:0x0283, B:109:?, B:19:0x0070, B:11:0x0052] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02ca A[ExcHandler: eif (e eif), PHI: r1 
      PHI: (r1v3 zbs) = (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v0 zbs), (r1v12 zbs), (r1v12 zbs), (r1v0 zbs), (r1v0 zbs) binds: [B:1:0x0006, B:2:?, B:4:0x000c, B:16:0x006c, B:17:?, B:23:0x0077, B:108:0x0283, B:109:?, B:19:0x0070, B:11:0x0052] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r22, defpackage.yrr r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "display_name"
            com.google.android.gms.common.internal.ClientContext r9 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r0 = "third_party"
            r8 = r23
            yru r8 = r8.f     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            iwi r8 = r8.b     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r10 = defpackage.yxg.a(r22)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r12 = "authapps"
            r11.<init>(r12)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r12 = "category"
            java.lang.String r0 = defpackage.iyv.a(r0)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r12, (java.lang.String) r0)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            if (r10 != 0) goto L_0x0027
            goto L_0x0030
        L_0x0027:
            java.lang.String r0 = "hl"
            java.lang.String r10 = defpackage.iyv.a(r10)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r0, (java.lang.String) r10)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
        L_0x0030:
            java.lang.String r11 = r11.toString()     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            izb r8 = r8.a     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r10 = 0
            r12 = 0
            java.lang.Class<com.google.android.gms.common.lso.AuthApps> r13 = com.google.android.gms.common.lso.AuthApps.class
            jag r0 = r8.a((com.google.android.gms.common.internal.ClientContext) r9, (int) r10, (java.lang.String) r11, (java.lang.Object) r12, (java.lang.Class) r13)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            com.google.android.gms.common.lso.AuthApps r0 = (com.google.android.gms.common.lso.AuthApps) r0     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            android.util.SparseArray r8 = new android.util.SparseArray     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r8.<init>()     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.util.Set r9 = r0.a     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r10 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            boolean r9 = r9.contains(r11)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            if (r9 == 0) goto L_0x006c
            java.util.List r9 = r0.b     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
        L_0x0058:
            boolean r11 = r9.hasNext()     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            if (r11 == 0) goto L_0x006c
            java.lang.Object r11 = r9.next()     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            com.google.android.gms.common.lso.AuthApps$Api_scopes r11 = (com.google.android.gms.common.lso.AuthApps.Api_scopes) r11     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            int r12 = r11.d     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r11 = r11.b     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            r8.put(r12, r11)     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            goto L_0x0058
        L_0x006c:
            java.util.List r9 = r0.c     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            if (r9 == 0) goto L_0x0076
            int r0 = r9.size()     // Catch:{ UserRecoverableAuthException -> 0x02df, eif -> 0x02ca, VolleyError -> 0x02bd }
            r11 = r0
            goto L_0x0077
        L_0x0076:
            r11 = 0
        L_0x0077:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r12.<init>(r11)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            ikz r0 = defpackage.ysu.B     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.Object r0 = r0.c()     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r13 = ";"
            java.lang.String[] r13 = r0.split(r13)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            int r0 = r13.length     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r14.<init>(r0)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r15 = 0
        L_0x0091:
            int r0 = r13.length     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            if (r15 < r0) goto L_0x029d
            ikz r0 = defpackage.ysu.C     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.Object r0 = r0.c()     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            int r13 = r0.intValue()     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            android.content.pm.PackageManager r15 = r22.getPackageManager()     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r5 = defpackage.jhg.b((java.lang.String) r0)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r6.<init>()     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r0 = 2131953598(0x7f1307be, float:1.9543672E38)
            java.lang.String r10 = r2.getString(r0)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r7 = 0
        L_0x00b7:
            if (r7 >= r11) goto L_0x0259
            java.lang.Object r0 = r9.get(r7)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r4 = r0
            com.google.android.gms.common.lso.AuthApps$Apps r4 = (com.google.android.gms.common.lso.AuthApps.Apps) r4     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = r4.d     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = defpackage.iqv.a(r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r16 = r9
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.<init>()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r2 = r4.c     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r3, r2)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r2 = "icon_url"
            r9.put(r2, r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = "revoke_handle"
            java.lang.String r2 = r4.f     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r0, r2)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.util.Set r0 = r4.a     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r2 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            boolean r0 = r0.contains(r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r0 != 0) goto L_0x00ec
            goto L_0x00f3
        L_0x00ec:
            java.lang.String r0 = "revoke_message"
            java.lang.String r1 = r4.g     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r0, r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
        L_0x00f3:
            r1 = 0
            r6.setLength(r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.util.List r0 = r4.h     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r1 = 0
            r2 = 0
            r17 = 0
        L_0x0102:
            boolean r18 = r0.hasNext()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r18 == 0) goto L_0x0153
            java.lang.Object r18 = r0.next()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.Integer r18 = (java.lang.Integer) r18     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r19 = r0
            int r0 = r18.intValue()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r18 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            boolean r1 = r14.contains(r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r20 = 1
            if (r1 != 0) goto L_0x0125
            r1 = r18
            goto L_0x0126
        L_0x0125:
            r1 = 1
        L_0x0126:
            if (r13 == r0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r2 = 1
        L_0x012a:
            r18 = r1
            r1 = 57000(0xdea8, float:7.9874E-41)
            if (r0 >= r1) goto L_0x0132
            goto L_0x0139
        L_0x0132:
            r1 = 57099(0xdf0b, float:8.0013E-41)
            if (r0 > r1) goto L_0x0139
            r17 = 1
        L_0x0139:
            java.lang.Object r0 = r8.get(r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r0 == 0) goto L_0x014e
            int r1 = r6.length()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r1 > 0) goto L_0x0148
            goto L_0x014b
        L_0x0148:
            r6.append(r10)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
        L_0x014b:
            r6.append(r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
        L_0x014e:
            r1 = r18
            r0 = r19
            goto L_0x0102
        L_0x0153:
            r18 = r1
            java.lang.String r0 = r4.e     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r0 == 0) goto L_0x017e
            defpackage.iva.c(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = "e"
            long r19 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = java.lang.Long.toHexString(r19)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x017b }
            int r19 = r0.length()     // Catch:{ Exception -> 0x017b }
            if (r19 != 0) goto L_0x0176
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x017b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x017b }
            goto L_0x017f
        L_0x0176:
            java.lang.String r0 = r1.concat(r0)     // Catch:{ Exception -> 0x017b }
            goto L_0x017f
        L_0x017b:
            r0 = move-exception
            r0 = 0
            goto L_0x017f
        L_0x017e:
            r0 = 0
        L_0x017f:
            if (r0 != 0) goto L_0x018c
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = r0.toString()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r18 = 0
            goto L_0x018d
        L_0x018c:
        L_0x018d:
            java.lang.String r1 = "application_id"
            r9.put(r1, r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = "is_aspen"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r0, r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = "has_conn_read"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r0, r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = "is_fitness"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r0, r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            int r0 = r6.length()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r0 <= 0) goto L_0x01bc
            java.lang.String r0 = "scopes"
            java.lang.String r1 = r6.toString()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r0, r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
        L_0x01bc:
            java.util.List r1 = r4.b     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r1 == 0) goto L_0x01c9
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            int r0 = r0.size()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r2 = r0
            goto L_0x01ca
        L_0x01c9:
            r2 = 0
        L_0x01ca:
            r17 = r6
            r4 = 0
            r6 = 0
        L_0x01ce:
            if (r6 >= r2) goto L_0x0232
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            com.google.android.gms.common.lso.AuthApps$Apps$Clients r0 = (com.google.android.gms.common.lso.AuthApps.Apps.Clients) r0     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r18 = r1
            java.util.Set r1 = r0.a     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r20 = r2
            r19 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            boolean r1 = r1.contains(r2)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r1 != 0) goto L_0x01ec
        L_0x01eb:
            goto L_0x022b
        L_0x01ec:
            java.lang.String r1 = r0.c     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            if (r1 == 0) goto L_0x01eb
            java.lang.String r1 = r0.b     // Catch:{ NameNotFoundException -> 0x022a }
            r2 = 0
            android.content.pm.ApplicationInfo r1 = r15.getApplicationInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x022a }
            java.lang.String r2 = r0.b     // Catch:{ NameNotFoundException -> 0x022a }
            r23 = r1
            r1 = 64
            android.content.pm.PackageInfo r1 = r15.getPackageInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x022a }
            android.content.pm.Signature[] r2 = r1.signatures     // Catch:{ NameNotFoundException -> 0x022a }
            if (r2 == 0) goto L_0x022b
            android.content.pm.Signature[] r2 = r1.signatures     // Catch:{ NameNotFoundException -> 0x022a }
            int r2 = r2.length     // Catch:{ NameNotFoundException -> 0x022a }
            if (r2 <= 0) goto L_0x022b
            android.content.pm.Signature[] r1 = r1.signatures     // Catch:{ NameNotFoundException -> 0x022a }
            r2 = 0
            r1 = r1[r2]     // Catch:{ NameNotFoundException -> 0x022a }
            byte[] r1 = r1.toByteArray()     // Catch:{ NameNotFoundException -> 0x022a }
            byte[] r1 = r5.digest(r1)     // Catch:{ NameNotFoundException -> 0x022a }
            java.lang.String r1 = defpackage.jjp.d(r1)     // Catch:{ NameNotFoundException -> 0x022a }
            java.lang.String r0 = r0.c     // Catch:{ NameNotFoundException -> 0x022a }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ NameNotFoundException -> 0x022a }
            if (r0 == 0) goto L_0x022b
            if (r4 != 0) goto L_0x0228
            r4 = r23
            goto L_0x022b
        L_0x0228:
            r4 = 0
            goto L_0x0234
        L_0x022a:
            r0 = move-exception
        L_0x022b:
            int r6 = r6 + 1
            r1 = r18
            r2 = r20
            goto L_0x01ce
        L_0x0232:
            r19 = 2
        L_0x0234:
            if (r4 == 0) goto L_0x024a
            java.lang.CharSequence r0 = r15.getApplicationLabel(r4)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = r0.toString()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r3, r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String r0 = "application_info"
            byte[] r1 = defpackage.ywq.a(r4)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r9.put(r0, r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
        L_0x024a:
            r12.add(r9)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            int r7 = r7 + 1
            r1 = r21
            r2 = r22
            r9 = r16
            r6 = r17
            goto L_0x00b7
        L_0x0259:
            yrt r0 = new yrt     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r0.<init>()     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.util.Collections.sort(r12, r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            java.lang.String[] r0 = defpackage.ywq.a     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            ilm r0 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r0)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r1 = 0
        L_0x0268:
            if (r1 >= r11) goto L_0x0276
            java.lang.Object r2 = r12.get(r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            android.content.ContentValues r2 = (android.content.ContentValues) r2     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r0.a((android.content.ContentValues) r2)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            int r1 = r1 + 1
            goto L_0x0268
        L_0x0276:
            r1 = 0
            com.google.android.gms.common.data.DataHolder r0 = r0.a((int) r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r1 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ UserRecoverableAuthException -> 0x0299, eif -> 0x0295, VolleyError -> 0x0291 }
            r1 = r21
            ytk r2 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.Object r3 = r0.first     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            com.google.android.gms.common.data.DataHolder r3 = (com.google.android.gms.common.data.DataHolder) r3     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.Object r0 = r0.second     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            r2.a((com.google.android.gms.common.data.DataHolder) r3, (java.lang.String) r0)     // Catch:{ UserRecoverableAuthException -> 0x02b9, eif -> 0x02ca, VolleyError -> 0x02bd }
            return
        L_0x0291:
            r0 = move-exception
            r1 = r21
            goto L_0x02be
        L_0x0295:
            r0 = move-exception
            r1 = r21
            goto L_0x02cb
        L_0x0299:
            r0 = move-exception
            r1 = r21
            goto L_0x02ba
        L_0x029d:
            r16 = r9
            r19 = 2
            r0 = r13[r15]     // Catch:{ Exception -> 0x02af }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x02af }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02af }
            r14.add(r0)     // Catch:{ Exception -> 0x02af }
            goto L_0x02b0
        L_0x02af:
            r0 = move-exception
        L_0x02b0:
            int r15 = r15 + 1
            r2 = r22
            r9 = r16
            r10 = 2
            goto L_0x0091
        L_0x02b9:
            r0 = move-exception
        L_0x02ba:
            r2 = r22
            goto L_0x02e0
        L_0x02bd:
            r0 = move-exception
        L_0x02be:
            ytk r0 = r1.b
            r2 = 7
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.b(r2)
            r3 = 0
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r3)
            return
        L_0x02ca:
            r0 = move-exception
        L_0x02cb:
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            r2 = r22
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            ytk r2 = r1.b
            r3 = 4
            com.google.android.gms.common.data.DataHolder r0 = com.google.android.gms.common.data.DataHolder.a((int) r3, (android.os.Bundle) r0)
            r3 = 0
            r2.a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String) r3)
            return
        L_0x02df:
            r0 = move-exception
        L_0x02e0:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r0 = r0.a()
            r4 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r4)
            java.lang.String r2 = "pendingIntent"
            r3.putParcelable(r2, r0)
            ytk r0 = r1.b
            r2 = 4
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.a((int) r2, (android.os.Bundle) r3)
            r3 = 0
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbs.a(android.content.Context, yrr):void");
    }
}
