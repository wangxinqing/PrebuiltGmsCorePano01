package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

/* renamed from: zbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbf extends zax {
    private final ClientContext a;
    private final yth b;
    private final List c;

    public zbf(ClientContext clientContext, List list, yth yth) {
        this.a = clientContext;
        this.c = list;
        this.b = yth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        r1.b.a(com.google.android.gms.common.data.DataHolder.b(7), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        r1.b.a(com.google.android.gms.common.data.DataHolder.a(4, defpackage.yug.a(r2, r1.a)), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.a(), 0));
        r1.b.a(com.google.android.gms.common.data.DataHolder.a(4, r3), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085 A[ExcHandler: eif (e eif), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r20, defpackage.yrr r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = 7
            r5 = 0
            r6 = 0
            com.google.android.gms.common.internal.ClientContext r0 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x0097, eif -> 0x0085, VolleyError -> 0x007a, InterruptedException -> 0x006f }
            java.util.List r14 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x0097, eif -> 0x0085, VolleyError -> 0x007a, InterruptedException -> 0x006f }
            r7 = r21
            ysb r15 = r7.d     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            ilm r13 = defpackage.ilk.d()     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            ysa r12 = new ysa     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            r12.<init>(r13)     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            java.lang.Class<com.google.android.gms.plus.internal.model.people.PersonEntity> r7 = com.google.android.gms.plus.internal.model.people.PersonEntity.class
            com.google.android.gms.common.server.response.FieldMappingDictionary r16 = com.google.android.gms.common.server.response.SafeParcelResponse.a((java.lang.Class) r7)     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            izb r7 = r15.b     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            r7.d()     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            r11 = 0
        L_0x0024:
            int r7 = r14.size()     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            if (r11 >= r7) goto L_0x004d
            zdd r7 = r15.a     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            java.lang.Object r8 = r14.get(r11)     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            java.lang.String r9 = defpackage.zdd.b(r8)     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            izb r7 = r7.a     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r10 = com.google.android.gms.common.server.response.SafeParcelResponse.class
            r8 = r0
            r17 = r11
            r11 = r16
            r18 = r12
            r4 = r13
            r13 = r18
            r7.a((com.google.android.gms.common.internal.ClientContext) r8, (java.lang.String) r9, (java.lang.Class) r10, (com.google.android.gms.common.server.response.FieldMappingDictionary) r11, (com.android.volley.Response.Listener) r12, (com.android.volley.Response.ErrorListener) r13)     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            int r11 = r17 + 1
            r13 = r4
            r12 = r18
            goto L_0x0024
        L_0x004d:
            r18 = r12
            r4 = r13
            izb r0 = r15.b     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            r0.e()     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            r18.c()     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            r0.<init>()     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            java.lang.String r7 = "com.google.android.gms.plus.IsSafeParcelable"
            r8 = 1
            r0.putBoolean(r7, r8)     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            com.google.android.gms.common.data.DataHolder r0 = r4.a(r5, r0)     // Catch:{ VolleyError -> 0x006d, UserRecoverableAuthException -> 0x0097, eif -> 0x0085, InterruptedException -> 0x006f }
            yth r4 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x0097, eif -> 0x0085, VolleyError -> 0x007a, InterruptedException -> 0x006f }
            r4.a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String) r6)     // Catch:{ UserRecoverableAuthException -> 0x0097, eif -> 0x0085, VolleyError -> 0x007a, InterruptedException -> 0x006f }
            return
        L_0x006d:
            r0 = move-exception
            throw r0     // Catch:{ UserRecoverableAuthException -> 0x0097, eif -> 0x0085, VolleyError -> 0x007a, InterruptedException -> 0x006f }
        L_0x006f:
            r0 = move-exception
            yth r0 = r1.b
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.b(r3)
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r6)
            return
        L_0x007a:
            r0 = move-exception
            yth r0 = r1.b
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.b(r3)
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r6)
            return
        L_0x0085:
            r0 = move-exception
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            yth r2 = r1.b
            r3 = 4
            com.google.android.gms.common.data.DataHolder r0 = com.google.android.gms.common.data.DataHolder.a((int) r3, (android.os.Bundle) r0)
            r2.a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String) r6)
            return
        L_0x0097:
            r0 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r0 = r0.a()
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r5, r0, r5)
            java.lang.String r2 = "pendingIntent"
            r3.putParcelable(r2, r0)
            yth r0 = r1.b
            r2 = 4
            com.google.android.gms.common.data.DataHolder r2 = com.google.android.gms.common.data.DataHolder.a((int) r2, (android.os.Bundle) r3)
            r0.a((com.google.android.gms.common.data.DataHolder) r2, (java.lang.String) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbf.a(android.content.Context, yrr):void");
    }
}
