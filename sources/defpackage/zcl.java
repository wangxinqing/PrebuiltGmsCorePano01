package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcl extends zax {
    private final ClientContext a;
    private final String b;
    private final yth c;

    public zcl(ClientContext clientContext, String str, yth yth) {
        this.a = clientContext;
        this.b = str;
        this.c = yth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        r7 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        if (r7 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        r7.a(new com.google.android.gms.common.api.Status(4, (java.lang.String) null, (android.app.PendingIntent) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073 A[ExcHandler: eif (e eif), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r7, defpackage.yrr r8) {
        /*
            r6 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = 4
            r2 = 0
            com.google.android.gms.common.internal.ClientContext r3 = r6.a     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            java.lang.String r4 = r6.b     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            ikz r5 = defpackage.ysu.ab     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            java.lang.Object r5 = r5.c()     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            boolean r5 = r5.booleanValue()     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            if (r5 != 0) goto L_0x0031
            yrs r8 = r8.e     // Catch:{ VolleyError -> 0x0020, eif -> 0x0073 }
            java.lang.String r5 = defpackage.yrs.a()     // Catch:{ VolleyError -> 0x0020, eif -> 0x0073 }
            r8.a((com.google.android.gms.common.internal.ClientContext) r3, (java.lang.String) r5, (java.lang.String) r4)     // Catch:{ VolleyError -> 0x0020, eif -> 0x0073 }
            goto L_0x0034
        L_0x0020:
            r8 = move-exception
            boolean r5 = r8 instanceof com.android.volley.NetworkError     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            if (r5 != 0) goto L_0x002d
            com.android.volley.NetworkResponse r5 = r8.networkResponse     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            if (r5 == 0) goto L_0x0030
            int r5 = r5.statusCode     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            if (r5 < r0) goto L_0x0030
        L_0x002d:
            defpackage.yrs.a((android.content.Context) r7, (com.google.android.gms.common.internal.ClientContext) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
        L_0x0030:
            throw r8     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
        L_0x0031:
            defpackage.yrs.a((android.content.Context) r7, (com.google.android.gms.common.internal.ClientContext) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
        L_0x0034:
            yth r7 = r6.c     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            if (r7 == 0) goto L_0x0081
            com.google.android.gms.common.api.Status r8 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            r7.a(r8)     // Catch:{ eif -> 0x0073, VolleyError -> 0x003e }
            return
        L_0x003e:
            r7 = move-exception
            yth r8 = r6.c
            if (r8 == 0) goto L_0x0081
            boolean r3 = r7 instanceof com.android.volley.AuthFailureError
            if (r3 == 0) goto L_0x0050
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r7.<init>(r1, r2, r2)
            r8.a(r7)
            return
        L_0x0050:
            boolean r1 = r7 instanceof com.android.volley.NetworkError
            if (r1 == 0) goto L_0x0055
            goto L_0x005e
        L_0x0055:
            com.android.volley.NetworkResponse r7 = r7.networkResponse
            if (r7 != 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            int r7 = r7.statusCode
            if (r7 < r0) goto L_0x0068
        L_0x005e:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r0 = -1
            r7.<init>(r0, r2, r2)
            r8.a(r7)
            return
        L_0x0068:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r0 = 8
            r7.<init>(r0, r2, r2)
            r8.a(r7)
            return
        L_0x0073:
            r7 = move-exception
            yth r7 = r6.c
            if (r7 == 0) goto L_0x0081
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r8.<init>(r1, r2, r2)
            r7.a(r8)
            return
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcl.a(android.content.Context, yrr):void");
    }
}
