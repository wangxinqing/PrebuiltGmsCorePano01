package defpackage;

import android.os.Process;

/* renamed from: jkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkt {
    private static String a = null;
    private static int b = 0;

    public static String a() {
        if (a == null) {
            if (b == 0) {
                b = Process.myPid();
            }
            a = a(b);
        }
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(int r4) {
        /*
            r0 = 0
            if (r4 <= 0) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            r2 = 25
            r1.<init>(r2)     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            java.lang.String r2 = "/proc/"
            r1.append(r2)     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            r1.append(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            java.lang.String r4 = "/cmdline"
            r1.append(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            java.lang.String r4 = r1.toString()     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x003a }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x003a }
            r3.<init>(r4)     // Catch:{ all -> 0x003a }
            r2.<init>(r3)     // Catch:{ all -> 0x003a }
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            java.lang.String r4 = r2.readLine()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            java.lang.String r0 = r4.trim()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            goto L_0x0046
        L_0x0035:
            r4 = move-exception
            r0 = r2
            goto L_0x0040
        L_0x0038:
            r4 = move-exception
            goto L_0x0046
        L_0x003a:
            r4 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            throw r4     // Catch:{ IOException -> 0x0044, all -> 0x003f }
        L_0x003f:
            r4 = move-exception
        L_0x0040:
            defpackage.jjt.a((java.io.Closeable) r0)
            throw r4
        L_0x0044:
            r4 = move-exception
            r2 = r0
        L_0x0046:
            defpackage.jjt.a((java.io.Closeable) r2)
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkt.a(int):java.lang.String");
    }
}
