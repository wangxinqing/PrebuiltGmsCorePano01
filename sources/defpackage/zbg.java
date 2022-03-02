package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbg extends zax {
    private final ClientContext a;
    private final yth b;
    private final String c;

    public zbg(ClientContext clientContext, String str, yth yth) {
        this.a = clientContext;
        this.c = str;
        this.b = yth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r7.b.a(4, defpackage.yug.a(r8, r7.a), (com.google.android.gms.common.server.response.SafeParcelResponse) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r8, 0, r9.a(), 0));
        r7.b.a(4, r3, (com.google.android.gms.common.server.response.SafeParcelResponse) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: eif (e eif), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[ExcHandler: UserRecoverableAuthException (r9v1 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r8, defpackage.yrr r9) {
        /*
            r7 = this;
            r0 = 4
            r1 = 0
            r2 = 0
            com.google.android.gms.common.internal.ClientContext r3 = r7.a     // Catch:{ UserRecoverableAuthException -> 0x0036, eif -> 0x0029, VolleyError -> 0x0021 }
            java.lang.String r4 = r7.c     // Catch:{ UserRecoverableAuthException -> 0x0036, eif -> 0x0029, VolleyError -> 0x0021 }
            ysb r9 = r9.d     // Catch:{ VolleyError -> 0x001f, UserRecoverableAuthException -> 0x0036, eif -> 0x0029 }
            zdd r9 = r9.a     // Catch:{ VolleyError -> 0x001f, UserRecoverableAuthException -> 0x0036, eif -> 0x0029 }
            java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r5 = com.google.android.gms.common.server.response.SafeParcelResponse.class
            java.lang.Class<com.google.android.gms.plus.internal.model.people.PersonEntity> r6 = com.google.android.gms.plus.internal.model.people.PersonEntity.class
            com.google.android.gms.common.server.response.FieldMappingDictionary r6 = com.google.android.gms.common.server.response.SafeParcelResponse.a((java.lang.Class) r6)     // Catch:{ VolleyError -> 0x001f, UserRecoverableAuthException -> 0x0036, eif -> 0x0029 }
            jag r9 = r9.a(r3, r4, r5, r6)     // Catch:{ VolleyError -> 0x001f, UserRecoverableAuthException -> 0x0036, eif -> 0x0029 }
            com.google.android.gms.common.server.response.SafeParcelResponse r9 = (com.google.android.gms.common.server.response.SafeParcelResponse) r9     // Catch:{ VolleyError -> 0x001f, UserRecoverableAuthException -> 0x0036, eif -> 0x0029 }
            yth r3 = r7.b     // Catch:{ UserRecoverableAuthException -> 0x0036, eif -> 0x0029, VolleyError -> 0x0021 }
            r3.a((int) r1, (android.os.Bundle) r2, (com.google.android.gms.common.server.response.SafeParcelResponse) r9)     // Catch:{ UserRecoverableAuthException -> 0x0036, eif -> 0x0029, VolleyError -> 0x0021 }
            return
        L_0x001f:
            r9 = move-exception
            throw r9     // Catch:{ UserRecoverableAuthException -> 0x0036, eif -> 0x0029, VolleyError -> 0x0021 }
        L_0x0021:
            r8 = move-exception
            yth r8 = r7.b
            r9 = 7
            r8.a((int) r9, (android.os.Bundle) r2, (com.google.android.gms.common.server.response.SafeParcelResponse) r2)
            return
        L_0x0029:
            r9 = move-exception
            com.google.android.gms.common.internal.ClientContext r9 = r7.a
            android.os.Bundle r8 = defpackage.yug.a(r8, r9)
            yth r9 = r7.b
            r9.a((int) r0, (android.os.Bundle) r8, (com.google.android.gms.common.server.response.SafeParcelResponse) r2)
            return
        L_0x0036:
            r9 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r9 = r9.a()
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r8, r1, r9, r1)
            java.lang.String r9 = "pendingIntent"
            r3.putParcelable(r9, r8)
            yth r8 = r7.b
            r8.a((int) r0, (android.os.Bundle) r3, (com.google.android.gms.common.server.response.SafeParcelResponse) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbg.a(android.content.Context, yrr):void");
    }
}
