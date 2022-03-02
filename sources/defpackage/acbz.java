package defpackage;

import java.security.MessageDigest;

/* renamed from: acbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbz {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r2 = a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r1, defpackage.anxm r2) {
        /*
            anxm r0 = defpackage.anxm.HEX_PIN
            if (r2 != r0) goto L_0x0005
            goto L_0x000a
        L_0x0005:
            anxm r0 = defpackage.anxm.GOOGLE_HEX
            if (r2 == r0) goto L_0x000a
            return r1
        L_0x000a:
            byte[] r2 = a(r1)
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = defpackage.jjp.d(r2)
            r2 = 0
            r0 = 4
            java.lang.String r1 = r1.substring(r2, r0)
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbz.a(java.lang.String, anxm):java.lang.String");
    }

    public static byte[] a(String str) {
        MessageDigest a = jhh.a("SHA1");
        if (a != null) {
            return a.digest(str.getBytes());
        }
        return null;
    }
}
