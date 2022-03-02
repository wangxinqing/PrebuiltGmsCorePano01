package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: dwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwx extends jba {
    private final ClientContext a;
    private final dwj d;
    private final dwd e;
    private final String f;
    private final dwm g;

    public dwx(ClientContext clientContext, dwj dwj, dwd dwd, String str, dwm dwm) {
        super(77, "AppInviteCompleteInvitation");
        this.a = clientContext;
        this.d = dwj;
        this.e = dwd;
        this.f = str;
        this.g = dwm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r11) {
        /*
            r10 = this;
            r11 = 4
            dwj r0 = r10.d     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            com.google.android.gms.common.internal.ClientContext r1 = r10.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            java.lang.String r2 = r10.f     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            dwi r0 = r0.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            java.lang.String r3 = r1.e     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avff r4 = defpackage.avff.e     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            aucd r4 = r4.o()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avfe r3 = r0.a(r3)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r5 = 0
            java.lang.String r6 = "AppInviteAgent"
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Error creating ClientIdInfo"
            android.util.Log.e(r6, r0)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            goto L_0x00d5
        L_0x0021:
            boolean r7 = r4.c     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r8 = 0
            if (r7 != 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            r4.c()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r4.c = r8     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
        L_0x002c:
            aucj r7 = r4.b     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avff r7 = (defpackage.avff) r7     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r3.getClass()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r7.b = r3     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            int r3 = r7.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r3 = r3 | 1
            r7.a = r3     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avge r3 = defpackage.avge.d     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            aucd r3 = r3.o()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            java.lang.String r2 = defpackage.jlh.a(r2)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            boolean r7 = r3.c     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            if (r7 != 0) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            r3.c()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r3.c = r8     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
        L_0x004f:
            aucj r7 = r3.b     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avge r7 = (defpackage.avge) r7     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2.getClass()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            int r9 = r7.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r9 = r9 | 1
            r7.a = r9     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r7.b = r2     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            aucj r2 = r3.i()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avge r2 = (defpackage.avge) r2     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            boolean r3 = r4.c     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            if (r3 != 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            r4.c()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r4.c = r8     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
        L_0x006e:
            aucj r3 = r4.b     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avff r3 = (defpackage.avff) r3     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2.getClass()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r3.c = r2     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            int r2 = r3.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2 = r2 | 2
            r3.a = r2     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avgt r2 = r0.a()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            boolean r3 = r4.c     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            if (r3 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            r4.c()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r4.c = r8     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
        L_0x008b:
            aucj r3 = r4.b     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avff r3 = (defpackage.avff) r3     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2.getClass()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r3.d = r2     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            int r2 = r3.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2 = r2 | r11
            r3.a = r2     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            dwh r2 = new dwh     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            dwg r0 = r0.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            auci r3 = defpackage.avff.f     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            aucj r4 = r4.i()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avff r4 = (defpackage.avff) r4     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2.<init>(r0, r1, r3, r4)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2.b()     // Catch:{ eif -> 0x0118, VolleyError -> 0x00f4 }
            auci r0 = defpackage.avfg.d     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            audx r0 = r2.a(r0)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avfg r0 = (defpackage.avfg) r0     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            boolean r1 = r2.c()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            if (r1 == 0) goto L_0x00d4
            int r0 = r2.e()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r2 = 57
            r1.<init>(r2)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            java.lang.String r2 = "Complete invitation failed due to error code: "
            r1.append(r2)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r1.append(r0)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            java.lang.String r0 = r1.toString()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            android.util.Log.e(r6, r0)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            goto L_0x00d5
        L_0x00d4:
            r5 = r0
        L_0x00d5:
            if (r5 == 0) goto L_0x00ef
            int r0 = r5.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00ef
            dwd r0 = r10.e     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            dlc r0 = r0.a()     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avga r1 = r5.b     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            if (r1 != 0) goto L_0x00e9
            avga r1 = defpackage.avga.c     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
        L_0x00e9:
            defpackage.dwd.a((defpackage.dlc) r0, (defpackage.avga) r1)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            com.google.android.gms.common.api.Status r11 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            goto L_0x0142
        L_0x00ef:
            com.google.android.gms.common.api.Status r11 = com.google.android.gms.common.api.Status.c     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            goto L_0x0142
        L_0x00f2:
            r0 = move-exception
            goto L_0x011f
        L_0x00f4:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f2 }
            int r3 = r3.length()     // Catch:{ all -> 0x00f2 }
            int r3 = r3 + 32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = "Error communicating with server "
            r4.append(r3)     // Catch:{ all -> 0x00f2 }
            r4.append(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.e(r6, r1)     // Catch:{ all -> 0x00f2 }
            throw r0     // Catch:{ all -> 0x00f2 }
        L_0x0118:
            r0 = move-exception
            java.lang.String r1 = "Authentication Failed "
            android.util.Log.e(r6, r1, r0)     // Catch:{ all -> 0x00f2 }
            throw r0     // Catch:{ all -> 0x00f2 }
        L_0x011f:
            auci r1 = defpackage.avfg.d     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            audx r1 = r2.a(r1)     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            avfg r1 = (defpackage.avfg) r1     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
            throw r0     // Catch:{ eif -> 0x013b, AuthFailureError -> 0x0139, NetworkError -> 0x0131, VolleyError -> 0x0128 }
        L_0x0128:
            r11 = move-exception
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status
            r0 = 8
            r11.<init>(r0)
            goto L_0x0142
        L_0x0131:
            r11 = move-exception
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status
            r0 = 7
            r11.<init>(r0)
            goto L_0x0142
        L_0x0139:
            r0 = move-exception
            goto L_0x013c
        L_0x013b:
            r0 = move-exception
        L_0x013c:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r11)
            r11 = r0
        L_0x0142:
            dwm r0 = r10.g
            if (r0 == 0) goto L_0x0149
            r0.a(r11)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwx.a(android.content.Context):void");
    }
}
