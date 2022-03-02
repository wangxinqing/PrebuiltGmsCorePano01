package defpackage;

import android.net.Uri;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbo extends zax {
    private final ClientContext a;
    private final yth b;
    private final int c;
    private final String d;
    private final Uri e;
    private final String f;
    private final String g;
    private final String h;

    public zbo(ClientContext clientContext, int i, String str, Uri uri, String str2, String str3, String str4, yth yth) {
        this.a = clientContext;
        this.c = i;
        this.d = str;
        this.e = uri;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.b = yth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        r13.b.a(com.google.android.gms.common.data.DataHolder.a(4, defpackage.yug.a(r14, r13.a)), (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r14, 0, r15.a(), 0));
        r13.b.a(com.google.android.gms.common.data.DataHolder.a(4, r3), (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8 A[ExcHandler: eif (e eif), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9 A[ExcHandler: UserRecoverableAuthException (r15v1 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r14, defpackage.yrr r15) {
        /*
            r13 = this;
            r0 = 4
            r1 = 0
            r2 = 0
            com.google.android.gms.common.internal.ClientContext r4 = r13.a     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            int r3 = r13.c     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String r5 = r13.d     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            android.net.Uri r6 = r13.e     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String r7 = r13.f     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String r8 = r13.g     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String r9 = r13.h     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            yrs r15 = r15.e     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            if (r6 == 0) goto L_0x001a
            java.lang.String r6 = r6.toString()     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            goto L_0x001b
        L_0x001a:
            r6 = r2
        L_0x001b:
            zdb r15 = r15.a     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.Class<com.google.android.gms.plus.service.v1.MomentsFeed> r10 = com.google.android.gms.plus.service.v1.MomentsFeed.class
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r8 = defpackage.iyv.a(r8)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            r11[r1] = r8     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r8 = defpackage.iyv.a(r9)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            r12 = 1
            r11[r12] = r8     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r8 = "people/%1$s/moments/%2$s"
            java.lang.String r8 = java.lang.String.format(r8, r11)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r9 = "maxResults"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r3 = defpackage.iyv.a((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r3)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            if (r5 == 0) goto L_0x004f
            java.lang.String r8 = "pageToken"
            java.lang.String r5 = defpackage.iyv.a(r5)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r3 = defpackage.iyv.a((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r5)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
        L_0x004f:
            if (r6 == 0) goto L_0x005c
            java.lang.String r5 = "targetUrl"
            java.lang.String r6 = defpackage.iyv.a(r6)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r3 = defpackage.iyv.a((java.lang.String) r3, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            if (r7 != 0) goto L_0x0061
            r6 = r3
            goto L_0x006c
        L_0x0061:
            java.lang.String r5 = "type"
            java.lang.String r6 = defpackage.iyv.a(r7)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.lang.String r3 = defpackage.iyv.a((java.lang.String) r3, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            r6 = r3
        L_0x006c:
            izb r3 = r15.a     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            r5 = 0
            r7 = 0
            r9 = 0
            r8 = r10
            jag r15 = r3.a((com.google.android.gms.common.internal.ClientContext) r4, (int) r5, (java.lang.String) r6, (java.lang.Object) r7, (java.lang.Class) r8, (com.google.android.gms.common.server.response.FieldMappingDictionary) r9)     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            com.google.android.gms.plus.service.v1.MomentsFeed r15 = (com.google.android.gms.plus.service.v1.MomentsFeed) r15     // Catch:{ VolleyError -> 0x00ba, UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8 }
            java.util.List r3 = r15.d     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            int r4 = r3.size()     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String[] r5 = defpackage.yub.a     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            ilm r5 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r5)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            r6 = 0
        L_0x0085:
            if (r6 >= r4) goto L_0x00ab
            java.lang.Object r7 = r3.get(r6)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            com.google.android.gms.plus.internal.model.moments.MomentEntity r7 = (com.google.android.gms.plus.internal.model.moments.MomentEntity) r7     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            r8.<init>(r12)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String r9 = "momentImpl"
            android.os.Parcel r10 = android.os.Parcel.obtain()     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            r7.writeToParcel(r10, r1)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            byte[] r7 = r10.marshall()     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            r10.recycle()     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            r8.put(r9, r7)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            r5.a((android.content.ContentValues) r8)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            int r6 = r6 + 1
            goto L_0x0085
        L_0x00ab:
            com.google.android.gms.common.data.DataHolder r3 = r5.a((int) r1)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            yth r4 = r13.b     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String r5 = r15.f     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            java.lang.String r15 = r15.i     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            r4.a((com.google.android.gms.common.data.DataHolder) r3, (java.lang.String) r5, (java.lang.String) r15)     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
            return
        L_0x00ba:
            r15 = move-exception
            throw r15     // Catch:{ UserRecoverableAuthException -> 0x00d9, eif -> 0x00c8, VolleyError -> 0x00bc }
        L_0x00bc:
            r14 = move-exception
            yth r14 = r13.b
            r15 = 7
            com.google.android.gms.common.data.DataHolder r15 = com.google.android.gms.common.data.DataHolder.b(r15)
            r14.a((com.google.android.gms.common.data.DataHolder) r15, (java.lang.String) r2, (java.lang.String) r2)
            return
        L_0x00c8:
            r15 = move-exception
            com.google.android.gms.common.internal.ClientContext r15 = r13.a
            android.os.Bundle r14 = defpackage.yug.a(r14, r15)
            yth r15 = r13.b
            com.google.android.gms.common.data.DataHolder r14 = com.google.android.gms.common.data.DataHolder.a((int) r0, (android.os.Bundle) r14)
            r15.a((com.google.android.gms.common.data.DataHolder) r14, (java.lang.String) r2, (java.lang.String) r2)
            return
        L_0x00d9:
            r15 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r15 = r15.a()
            android.app.PendingIntent r14 = android.app.PendingIntent.getActivity(r14, r1, r15, r1)
            java.lang.String r15 = "pendingIntent"
            r3.putParcelable(r15, r14)
            yth r14 = r13.b
            com.google.android.gms.common.data.DataHolder r15 = com.google.android.gms.common.data.DataHolder.a((int) r0, (android.os.Bundle) r3)
            r14.a((com.google.android.gms.common.data.DataHolder) r15, (java.lang.String) r2, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbo.a(android.content.Context, yrr):void");
    }
}
