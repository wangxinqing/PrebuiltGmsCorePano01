package defpackage;

import android.util.Log;
import java.io.File;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: ngz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngz {
    public static final ngz a = new ngz((byte[]) null);
    private final File b;

    public ngz() {
    }

    public static void a(String str, String str2, Object... objArr) {
        ngz ngz = a;
        if (Log.isLoggable(str, 5)) {
            Log.w(str, ngz.a(str2, objArr));
        }
        ngz.a("W", str, ngz.a(str2, objArr), (Throwable) null);
    }

    public static void b(String str, String str2, Object... objArr) {
        ngz ngz = a;
        if (Log.isLoggable(str, 4)) {
            Log.i(str, ngz.a(str2, objArr));
        }
        ngz.a("I", str, ngz.a(str2, objArr), (Throwable) null);
    }

    public static void c(String str, String str2, Object... objArr) {
        ngz ngz = a;
        ngz.a("D", str, ngz.a(str2, objArr), (Throwable) null);
    }

    public ngz(byte[] bArr) {
        File file = new File("/data/local/tmp/fonts-module.log");
        this.b = !file.exists() ? null : file;
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        ngz ngz = a;
        if (Log.isLoggable(str, 5)) {
            Log.w(str, ngz.a(str2, objArr), th);
        }
        ngz.a("W", str, ngz.a(str2, objArr), th);
    }

    public final String a(String str, Object... objArr) {
        try {
            return String.format(Locale.ENGLISH, str, objArr);
        } catch (IllegalFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(Locale.ENGLISH, "Illegal log format [%s] args [", new Object[]{str}));
            for (Object obj : objArr) {
                sb.append(String.format(Locale.ENGLISH, "%s ", new Object[]{obj}));
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.FileWriter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Throwable r10) {
        /*
            r6 = this;
            java.lang.String r0 = " "
            java.io.File r1 = r6.b
            if (r1 == 0) goto L_0x0084
            r2 = 1
            r3 = 0
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            r4.<init>(r1, r2)     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ IOException -> 0x005c, all -> 0x005a }
            r1.<init>(r4)     // Catch:{ IOException -> 0x005c, all -> 0x005a }
            int r3 = r7.length()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            int r3 = r3 + 3
            int r5 = r8.length()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            int r3 = r3 + r5
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            int r5 = r5.length()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            int r3 = r3 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r5.append(r7)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r5.append(r0)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r5.append(r8)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r5.append(r0)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r5.append(r9)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.lang.String r7 = "\n"
            r5.append(r7)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.lang.String r7 = r5.toString()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r1.append(r7)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            if (r10 != 0) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            defpackage.apev.a((java.lang.Throwable) r10, (java.io.PrintWriter) r1)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
        L_0x004c:
            r1.flush()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            defpackage.jjt.a((java.io.Closeable) r1)
            defpackage.jjt.a((java.io.Closeable) r4)
            return
        L_0x0056:
            r7 = move-exception
            goto L_0x007c
        L_0x0058:
            r7 = move-exception
            goto L_0x005e
        L_0x005a:
            r7 = move-exception
            goto L_0x007d
        L_0x005c:
            r7 = move-exception
            r1 = r3
        L_0x005e:
            r3 = r4
            goto L_0x0065
        L_0x0060:
            r7 = move-exception
            r4 = r3
            goto L_0x007d
        L_0x0063:
            r7 = move-exception
            r1 = r3
        L_0x0065:
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x007a }
            r9 = 0
            java.io.File r10 = r6.b     // Catch:{ all -> 0x007a }
            r8[r9] = r10     // Catch:{ all -> 0x007a }
            java.lang.String r9 = "FontsLogger"
            java.lang.String r10 = "Unable to write %s"
            a((java.lang.String) r9, (java.lang.Throwable) r7, (java.lang.String) r10, (java.lang.Object[]) r8)     // Catch:{ all -> 0x007a }
            defpackage.jjt.a((java.io.Closeable) r1)
            defpackage.jjt.a((java.io.Closeable) r3)
            return
        L_0x007a:
            r7 = move-exception
            r4 = r3
        L_0x007c:
            r3 = r1
        L_0x007d:
            defpackage.jjt.a((java.io.Closeable) r3)
            defpackage.jjt.a((java.io.Closeable) r4)
            throw r7
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngz.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }
}
