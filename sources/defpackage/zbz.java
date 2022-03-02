package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbz extends zax {
    private final ClientContext a;
    private final String b;
    private final int c;
    private final String d;
    private final ytk e;

    public zbz(ClientContext clientContext, String str, int i, String str2, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = ytk;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r20, defpackage.yrr r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "display_name"
            r5 = 0
            r6 = 0
            java.lang.String r0 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            if (r0 != 0) goto L_0x0018
            ytk r0 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r3 = 8
            com.google.android.gms.common.data.DataHolder r3 = com.google.android.gms.common.data.DataHolder.b(r3)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r0.a((com.google.android.gms.common.data.DataHolder) r3, (java.lang.String) r5)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            return
        L_0x0018:
            com.google.android.gms.common.internal.ClientContext r8 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            int r7 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r9 = r1.d     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r10 = r21
            ysd r10 = r10.c     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            zdh r10 = r10.c     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r11 = "me"
            java.lang.String r12 = defpackage.yxg.a(r20)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r13.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.util.Formatter r14 = new java.util.Formatter     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r14.<init>(r13)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r11 = defpackage.iyv.a(r11)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r15[r6] = r11     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r0 = defpackage.iyv.a(r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r16 = 1
            r15[r16] = r0     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r0 = "people/%1$s/applications/%2$s"
            r14.format(r0, r15)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            if (r12 == 0) goto L_0x0059
            java.lang.String r0 = "language"
            java.lang.String r11 = defpackage.iyv.a(r12)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            defpackage.iyv.a((java.lang.StringBuilder) r13, (java.lang.String) r0, (java.lang.String) r11)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
        L_0x0059:
            java.lang.String r0 = "maxResults"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            defpackage.iyv.a((java.lang.StringBuilder) r13, (java.lang.String) r0, (java.lang.String) r7)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            if (r9 != 0) goto L_0x0065
            goto L_0x006e
        L_0x0065:
            java.lang.String r0 = "pageToken"
            java.lang.String r7 = defpackage.iyv.a(r9)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            defpackage.iyv.a((java.lang.StringBuilder) r13, (java.lang.String) r0, (java.lang.String) r7)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
        L_0x006e:
            java.lang.String r0 = r13.toString()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            izb r7 = r10.a     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r9 = 0
            r11 = 0
            java.lang.Class<com.google.android.gms.plus.service.v1whitelisted.models.Applications> r12 = com.google.android.gms.plus.service.v1whitelisted.models.Applications.class
            r10 = r0
            jag r0 = r7.a((com.google.android.gms.common.internal.ClientContext) r8, (int) r9, (java.lang.String) r10, (java.lang.Object) r11, (java.lang.Class) r12)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r7 = r0
            com.google.android.gms.plus.service.v1whitelisted.models.Applications r7 = (com.google.android.gms.plus.service.v1whitelisted.models.Applications) r7     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.util.List r8 = r7.c     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            int r9 = r8.size()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r10.<init>(r9)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            android.content.pm.PackageManager r11 = r20.getPackageManager()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r12 = defpackage.jhg.b((java.lang.String) r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r13 = 0
        L_0x0096:
            if (r13 >= r9) goto L_0x015a
            java.lang.Object r0 = r8.get(r13)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            com.google.android.gms.plus.service.v1whitelisted.models.Application r0 = (com.google.android.gms.plus.service.v1whitelisted.models.Application) r0     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r14.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r15 = r0.d     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r14.put(r3, r15)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r15 = "application_id"
            java.lang.String r4 = r0.f     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r14.put(r15, r4)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r4 = "icon_url"
            if (r0 == 0) goto L_0x00be
            com.google.android.gms.plus.service.v1whitelisted.models.Application$Icon r15 = r0.e     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            if (r15 == 0) goto L_0x00be
            java.lang.String r15 = r15.c     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r15 = defpackage.iqv.a(r15)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            goto L_0x00bf
        L_0x00be:
            r15 = r5
        L_0x00bf:
            r14.put(r4, r15)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r4 = "is_aspen"
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r16)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r14.put(r4, r15)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.util.List r4 = r0.c     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            if (r4 == 0) goto L_0x00d8
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            int r0 = r0.size()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r15 = r0
            goto L_0x00d9
        L_0x00d8:
            r15 = 0
        L_0x00d9:
            r17 = r5
            r5 = 0
        L_0x00dc:
            if (r5 >= r15) goto L_0x0139
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            com.google.android.gms.plus.service.v1whitelisted.models.PlusAppClient r0 = (com.google.android.gms.plus.service.v1whitelisted.models.PlusAppClient) r0     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r6 = "android"
            r21 = r4
            java.lang.String r4 = r0.e     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            boolean r4 = r6.equals(r4)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            if (r4 != 0) goto L_0x00f4
        L_0x00f3:
            goto L_0x0133
        L_0x00f4:
            java.lang.String r4 = r0.c     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            if (r4 == 0) goto L_0x00f3
            java.lang.String r4 = r0.d     // Catch:{ NameNotFoundException -> 0x0132 }
            r6 = 0
            android.content.pm.ApplicationInfo r4 = r11.getApplicationInfo(r4, r6)     // Catch:{ NameNotFoundException -> 0x0132 }
            java.lang.String r6 = r0.d     // Catch:{ NameNotFoundException -> 0x0132 }
            r18 = r4
            r4 = 64
            android.content.pm.PackageInfo r4 = r11.getPackageInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x0132 }
            android.content.pm.Signature[] r6 = r4.signatures     // Catch:{ NameNotFoundException -> 0x0132 }
            if (r6 == 0) goto L_0x0133
            android.content.pm.Signature[] r6 = r4.signatures     // Catch:{ NameNotFoundException -> 0x0132 }
            int r6 = r6.length     // Catch:{ NameNotFoundException -> 0x0132 }
            if (r6 <= 0) goto L_0x0133
            android.content.pm.Signature[] r4 = r4.signatures     // Catch:{ NameNotFoundException -> 0x0132 }
            r6 = 0
            r4 = r4[r6]     // Catch:{ NameNotFoundException -> 0x0132 }
            byte[] r4 = r4.toByteArray()     // Catch:{ NameNotFoundException -> 0x0132 }
            byte[] r4 = r12.digest(r4)     // Catch:{ NameNotFoundException -> 0x0132 }
            java.lang.String r4 = defpackage.jjp.d(r4)     // Catch:{ NameNotFoundException -> 0x0132 }
            java.lang.String r0 = r0.c     // Catch:{ NameNotFoundException -> 0x0132 }
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ NameNotFoundException -> 0x0132 }
            if (r0 == 0) goto L_0x0133
            if (r17 != 0) goto L_0x0130
            r17 = r18
            goto L_0x0133
        L_0x0130:
            r0 = 0
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
        L_0x0133:
            int r5 = r5 + 1
            r4 = r21
            r6 = 0
            goto L_0x00dc
        L_0x0139:
            r0 = r17
        L_0x013b:
            if (r0 == 0) goto L_0x0151
            java.lang.CharSequence r4 = r11.getApplicationLabel(r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r4 = r4.toString()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r14.put(r3, r4)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r4 = "application_info"
            byte[] r0 = defpackage.ywq.a(r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r14.put(r4, r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
        L_0x0151:
            r10.add(r14)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            int r13 = r13 + 1
            r5 = 0
            r6 = 0
            goto L_0x0096
        L_0x015a:
            ysc r0 = new ysc     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r0.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.util.Collections.sort(r10, r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String[] r0 = defpackage.ywq.a     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            ilm r0 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r6 = 0
        L_0x0169:
            if (r6 < r9) goto L_0x0184
            r3 = 0
            com.google.android.gms.common.data.DataHolder r0 = r0.a((int) r3)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r3 = r7.d     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            android.util.Pair r0 = android.util.Pair.create(r0, r3)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            ytk r3 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.Object r4 = r0.first     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            com.google.android.gms.common.data.DataHolder r4 = (com.google.android.gms.common.data.DataHolder) r4     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.Object r0 = r0.second     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r3.a((com.google.android.gms.common.data.DataHolder) r4, (java.lang.String) r0)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            return
        L_0x0184:
            java.lang.Object r3 = r10.get(r6)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            android.content.ContentValues r3 = (android.content.ContentValues) r3     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            r0.a((android.content.ContentValues) r3)     // Catch:{ UserRecoverableAuthException -> 0x01b0, eif -> 0x019d, VolleyError -> 0x0190 }
            int r6 = r6 + 1
            goto L_0x0169
        L_0x0190:
            r0 = move-exception
            ytk r0 = r1.e
            r2 = 7
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.b(r2)
            r3 = 0
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r3)
            return
        L_0x019d:
            r0 = move-exception
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            ytk r2 = r1.e
            r3 = 4
            com.google.android.gms.common.data.DataHolder r0 = com.google.android.gms.common.data.DataHolder.a((int) r3, (android.os.Bundle) r0)
            r3 = 0
            r2.a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String) r3)
            return
        L_0x01b0:
            r0 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r0 = r0.a()
            r4 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r4)
            java.lang.String r2 = "pendingIntent"
            r3.putParcelable(r2, r0)
            ytk r0 = r1.e
            r2 = 4
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.a((int) r2, (android.os.Bundle) r3)
            r3 = 0
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbz.a(android.content.Context, yrr):void");
    }
}
