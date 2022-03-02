package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbr extends zax {
    public boolean a = false;
    private final ClientContext b;
    private final yth c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;

    public zbr(ClientContext clientContext, int i, int i2, int i3, String str, yth yth) {
        this.b = clientContext;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.c = yth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        r1.c.a(com.google.android.gms.common.data.DataHolder.a(4, defpackage.yug.a(r2, r1.b)), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0134, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        r4 = new android.os.Bundle();
        r4.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.a(), 0));
        r1.c.a(com.google.android.gms.common.data.DataHolder.a(4, r4), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0123 A[ExcHandler: eif (e eif), Splitter:B:3:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135 A[ExcHandler: UserRecoverableAuthException (r0v2 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:3:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r17, defpackage.yrr r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            boolean r0 = r1.a
            r3 = 0
            if (r0 != 0) goto L_0x0153
            r5 = 0
            com.google.android.gms.common.internal.ClientContext r7 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            int r0 = r1.d     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            int r6 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            int r8 = r1.f     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            if (r8 < 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r8 = 100
        L_0x0017:
            java.lang.String r9 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            r10 = r18
            ysb r10 = r10.d     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r11 = "visible"
            r12 = 2
            r13 = 1
            if (r0 == r13) goto L_0x0029
            if (r0 == r12) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.lang.String r11 = "connected"
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            java.lang.String r0 = "alphabetical"
            if (r6 == 0) goto L_0x0034
            if (r6 == r13) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            java.lang.String r0 = "best"
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            zdd r6 = r10.a     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r10 = "me"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r10 = defpackage.iyv.a(r10)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r12[r5] = r10     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r10 = defpackage.iyv.a(r11)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r12[r13] = r10     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r10 = "people/%1$s/people/%2$s"
            java.lang.String r10 = java.lang.String.format(r10, r12)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r11 = "maxResults"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r8 = defpackage.iyv.a((java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r8)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r10 = "orderBy"
            java.lang.String r0 = defpackage.iyv.a(r0)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r0 = defpackage.iyv.a((java.lang.String) r8, (java.lang.String) r10, (java.lang.String) r0)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            if (r9 != 0) goto L_0x0069
            r9 = r0
            goto L_0x0074
        L_0x0069:
            java.lang.String r8 = "pageToken"
            java.lang.String r9 = defpackage.iyv.a(r9)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r0 = defpackage.iyv.a((java.lang.String) r0, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r9 = r0
        L_0x0074:
            izb r6 = r6.a     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r8 = 0
            r10 = 0
            java.lang.Class<com.google.android.gms.plus.service.v1.PeopleFeed> r11 = com.google.android.gms.plus.service.v1.PeopleFeed.class
            jag r0 = r6.a((com.google.android.gms.common.internal.ClientContext) r7, (int) r8, (java.lang.String) r9, (java.lang.Object) r10, (java.lang.Class) r11)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            com.google.android.gms.plus.service.v1.PeopleFeed r0 = (com.google.android.gms.plus.service.v1.PeopleFeed) r0     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.util.List r6 = r0.d     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            int r7 = r6.size()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String[] r8 = defpackage.yuc.a     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            ilm r8 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r8)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r9 = 0
        L_0x008d:
            if (r9 >= r7) goto L_0x00fc
            java.lang.Object r10 = r6.get(r9)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            yxl r10 = (defpackage.yxl) r10     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            yxk r11 = r10.d()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            if (r11 == 0) goto L_0x00a4
            yxk r11 = r10.d()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r11 = r11.b()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            goto L_0x00a5
        L_0x00a4:
            r11 = r3
        L_0x00a5:
            java.lang.String r12 = r10.b()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r14 = r10.c()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            int r15 = r10.e()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            if (r15 == 0) goto L_0x00d1
            if (r15 != r13) goto L_0x00b8
            java.lang.String r15 = "page"
            goto L_0x00d3
        L_0x00b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r7 = 37
            r6.<init>(r7)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r7 = "Unknown objectType state: "
            r6.append(r7)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r6.append(r15)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r6 = r6.toString()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r0.<init>(r6)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            throw r0     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
        L_0x00d1:
            java.lang.String r15 = "person"
        L_0x00d3:
            java.lang.String r10 = r10.f()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r13.<init>()     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r4 = "displayName"
            r13.put(r4, r12)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r4 = "personId"
            r13.put(r4, r14)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r4 = "image"
            r13.put(r4, r11)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r4 = "objectType"
            r13.put(r4, r15)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r4 = "url"
            r13.put(r4, r10)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r8.a((android.content.ContentValues) r13)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            int r9 = r9 + 1
            r13 = 1
            goto L_0x008d
        L_0x00fc:
            android.util.Pair r4 = new android.util.Pair     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            com.google.android.gms.common.data.DataHolder r6 = r8.a((int) r5)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            java.lang.String r0 = r0.e     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            r4.<init>(r6, r0)     // Catch:{ VolleyError -> 0x0115, UserRecoverableAuthException -> 0x0135, eif -> 0x0123 }
            yth r0 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            java.lang.Object r6 = r4.first     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            com.google.android.gms.common.data.DataHolder r6 = (com.google.android.gms.common.data.DataHolder) r6     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            java.lang.Object r4 = r4.second     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            r0.a((com.google.android.gms.common.data.DataHolder) r6, (java.lang.String) r4)     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
            return
        L_0x0115:
            r0 = move-exception
            throw r0     // Catch:{ UserRecoverableAuthException -> 0x0135, eif -> 0x0123, VolleyError -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            yth r0 = r1.c
            r2 = 7
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.b(r2)
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r3)
            return
        L_0x0123:
            r0 = move-exception
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            yth r2 = r1.c
            r4 = 4
            com.google.android.gms.common.data.DataHolder r0 = com.google.android.gms.common.data.DataHolder.a((int) r4, (android.os.Bundle) r0)
            r2.a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String) r3)
            return
        L_0x0135:
            r0 = move-exception
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            android.content.Intent r0 = r0.a()
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r5, r0, r5)
            java.lang.String r2 = "pendingIntent"
            r4.putParcelable(r2, r0)
            yth r0 = r1.c
            r2 = 4
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.a((int) r2, (android.os.Bundle) r4)
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r3)
            return
        L_0x0153:
            yth r0 = r1.c
            r2 = 13
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.a((int) r2, (android.os.Bundle) r3)
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbr.a(android.content.Context, yrr):void");
    }
}
