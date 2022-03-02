package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbp extends zax {
    private final ClientContext a;
    private final ytk b;
    private final int c;
    private final int d;
    private final String e;

    public zbp(ClientContext clientContext, int i, int i2, String str, ytk ytk) {
        this.a = clientContext;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.b = ytk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e8, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        r1.b.a(7, (android.os.Bundle) null, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f4, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        r1.b.a(4, defpackage.yug.a(r2, r1.a), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0103, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.a(), 0));
        r1.b.a(4, r3, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea A[ExcHandler: VolleyError (e com.android.volley.VolleyError), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f3 A[ExcHandler: eif (e eif), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102 A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x000c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r22, defpackage.yrr r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "pageToken"
            java.lang.String r4 = "orderBy"
            java.lang.String r5 = "maxResults"
            java.lang.String r6 = "me"
            com.google.android.gms.common.internal.ClientContext r15 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            int r0 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            int r14 = r1.d     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.String r13 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r10 = r23
            ysd r12 = r10.c     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r11 = 1
            if (r0 == r11) goto L_0x0020
            java.lang.String r0 = "alphabetical"
            r16 = r0
            goto L_0x0024
        L_0x0020:
            java.lang.String r0 = "best"
            r16 = r0
        L_0x0024:
            zdm r0 = r12.f     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            r7.<init>()     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.util.Formatter r8 = new java.util.Formatter     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            r8.<init>(r7)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.lang.String r18 = defpackage.iyv.a(r6)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            r17 = 0
            r9[r17] = r18     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.lang.String r11 = "people/%1$s/peopleForSharing"
            r8.format(r11, r9)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            defpackage.iyv.a((java.lang.StringBuilder) r7, (java.lang.String) r5, (java.lang.String) r8)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            java.lang.String r8 = defpackage.iyv.a(r16)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            defpackage.iyv.a((java.lang.StringBuilder) r7, (java.lang.String) r4, (java.lang.String) r8)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            if (r13 != 0) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            java.lang.String r8 = defpackage.iyv.a(r13)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            defpackage.iyv.a((java.lang.StringBuilder) r7, (java.lang.String) r3, (java.lang.String) r8)     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
        L_0x005c:
            java.lang.String r7 = r7.toString()     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            izb r10 = r0.a     // Catch:{ VolleyError -> 0x007c, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            r0 = 1
            r8 = 0
            java.lang.Class<com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed> r9 = com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed.class
            r18 = 1
            r11 = r15
            r19 = r12
            r12 = r0
            r20 = r13
            r13 = r7
            r7 = r14
            r14 = r8
            r8 = r15
            r15 = r9
            jag r0 = r10.a((com.google.android.gms.common.internal.ClientContext) r11, (int) r12, (java.lang.String) r13, (java.lang.Object) r14, (java.lang.Class) r15)     // Catch:{ VolleyError -> 0x007a, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed r0 = (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) r0     // Catch:{ VolleyError -> 0x007a, UserRecoverableAuthException -> 0x0102, eif -> 0x00f3 }
            goto L_0x00df
        L_0x007a:
            r0 = move-exception
            goto L_0x0085
        L_0x007c:
            r0 = move-exception
            r19 = r12
            r20 = r13
            r7 = r14
            r8 = r15
            r18 = 1
        L_0x0085:
            java.lang.String r9 = "PlusWhitelistedAgent"
            java.lang.String r10 = "listForSharingBlocking VolleyError"
            android.util.Log.e(r9, r10, r0)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r9 = r19
            zdm r0 = r9.f     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.String r9 = "circled"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r10.<init>()     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.util.Formatter r11 = new java.util.Formatter     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r11.<init>(r10)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.String r6 = defpackage.iyv.a(r6)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r13 = 0
            r12[r13] = r6     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.String r6 = defpackage.iyv.a(r9)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r12[r18] = r6     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.String r6 = "people/%1$s/people/%2$s"
            r11.format(r6, r12)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            defpackage.iyv.a((java.lang.StringBuilder) r10, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            java.lang.String r5 = defpackage.iyv.a(r16)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            defpackage.iyv.a((java.lang.StringBuilder) r10, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            if (r20 != 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            java.lang.String r4 = defpackage.iyv.a(r20)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            defpackage.iyv.a((java.lang.StringBuilder) r10, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
        L_0x00ce:
            java.lang.String r13 = r10.toString()     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            izb r10 = r0.a     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r12 = 0
            r14 = 0
            java.lang.Class<com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed> r15 = com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed.class
            r11 = r8
            jag r0 = r10.a((com.google.android.gms.common.internal.ClientContext) r11, (int) r12, (java.lang.String) r13, (java.lang.Object) r14, (java.lang.Class) r15)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed r0 = (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) r0     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
        L_0x00df:
            ytk r3 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00f3, VolleyError -> 0x00ea }
            r4 = 0
            r5 = 0
            r3.a((int) r5, (android.os.Bundle) r4, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) r0)     // Catch:{ UserRecoverableAuthException -> 0x0102, eif -> 0x00e7, VolleyError -> 0x00ea }
            return
        L_0x00e7:
            r0 = move-exception
            r3 = r4
            goto L_0x00f5
        L_0x00ea:
            r0 = move-exception
            ytk r0 = r1.b
            r2 = 7
            r3 = 0
            r0.a((int) r2, (android.os.Bundle) r3, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) r3)
            return
        L_0x00f3:
            r0 = move-exception
            r3 = 0
        L_0x00f5:
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            ytk r2 = r1.b
            r4 = 4
            r2.a((int) r4, (android.os.Bundle) r0, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) r3)
            return
        L_0x0102:
            r0 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r0 = r0.a()
            r4 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r4)
            java.lang.String r2 = "pendingIntent"
            r3.putParcelable(r2, r0)
            ytk r0 = r1.b
            r2 = 4
            r4 = 0
            r0.a((int) r2, (android.os.Bundle) r3, (com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbp.a(android.content.Context, yrr):void");
    }
}
