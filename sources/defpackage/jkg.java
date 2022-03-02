package defpackage;

import java.security.MessageDigest;

/* renamed from: jkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkg {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[SYNTHETIC, Splitter:B:16:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0032 A[SYNTHETIC, Splitter:B:22:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r6, java.lang.String r7) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002f, all -> 0x0026 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x002f, all -> 0x0026 }
            r2 = 1024(0x400, double:5.06E-321)
            long r4 = r6.length()     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            long r2 = java.lang.Math.min(r2, r4)     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            int r6 = (int) r2     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            r1.read(r6)     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            java.lang.String r6 = a((byte[]) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            r1.close()     // Catch:{ IOException -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r7 = move-exception
        L_0x001f:
            return r6
        L_0x0020:
            r6 = move-exception
            r0 = r1
            goto L_0x0027
        L_0x0023:
            r6 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x0026:
            r6 = move-exception
        L_0x0027:
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r7 = move-exception
        L_0x002e:
            throw r6
        L_0x002f:
            r6 = move-exception
        L_0x0030:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r6 = move-exception
        L_0x0037:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkg.a(java.io.File, java.lang.String):java.lang.String");
    }

    public static String a(byte[] bArr, String str) {
        MessageDigest b = jhg.b(str);
        return b != null ? jjp.d(b.digest(bArr)).toLowerCase() : "";
    }
}
