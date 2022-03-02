package defpackage;

import java.io.IOException;

/* renamed from: aasd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aasd {
    final String a;
    final long b;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[SYNTHETIC, Splitter:B:15:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aasd(java.io.File r4) {
        /*
            r3 = this;
            r3.<init>()
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0033 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0033 }
            r1.<init>(r4)     // Catch:{ all -> 0x0033 }
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = "SIGNATURE:"
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = a(r4, r1)     // Catch:{ all -> 0x0031 }
            r3.a = r4     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "VERSION:"
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = a(r4, r1)     // Catch:{ all -> 0x0031 }
            r1 = 10
            long r1 = java.lang.Long.parseLong(r4, r1)     // Catch:{ all -> 0x0031 }
            r3.b = r1     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ IOException -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            return
        L_0x0031:
            r4 = move-exception
            goto L_0x0035
        L_0x0033:
            r4 = move-exception
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasd.<init>(java.io.File):void");
    }

    private static final String a(String str, String str2) {
        if (str2 != null && str2.startsWith(str)) {
            return str2.substring(str.length());
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (str2 == null) {
            str2 = "unavailable";
        }
        objArr[1] = str2;
        throw new IOException(String.format("Line from metadata malformed for %s, line: %s", objArr));
    }
}
