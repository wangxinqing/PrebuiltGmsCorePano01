package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: hbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hbs {
    public static final File a = new File("/system/etc/security/otacerts.zip");
    public static final iwd b = gzk.a("DevicePropertiesModule");

    static long a(Context context) {
        return gwk.b(context);
    }

    static long b(Context context) {
        return gwk.h(context);
    }

    static long c(Context context) {
        return gwd.b(context);
    }

    static String d() {
        return "SHA-1";
    }

    static amri e(Context context) {
        return amri.c(gwk.l(context).getString("CheckinService_deviceDataVersionInfo", (String) null));
    }

    static amri f(Context context) {
        int c = jnl.a().c(context);
        return c >= 0 ? amri.b(Integer.valueOf(c)) : ampu.a;
    }

    static hal g(Context context) {
        return gwd.h(context);
    }

    static gzq h(Context context) {
        if (jix.a(context)) {
            return gzq.SW_DEVICE;
        }
        if (jix.b(context)) {
            return gzq.LATCHSKY_DEVICE;
        }
        return gzq.NO_RESTRICTION;
    }

    static amri i(Context context) {
        String j = gwk.j(context);
        String k = gwk.k(context);
        if (j == null || k == null) {
            return ampu.a;
        }
        aucd o = gzt.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzt gzt = (gzt) o.b;
        j.getClass();
        int i = gzt.a | 1;
        gzt.a = i;
        gzt.b = j;
        k.getClass();
        gzt.a = i | 2;
        gzt.c = k;
        return amri.b((gzt) o.i());
    }

    static String a() {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }

    static amri b() {
        TimeZone timeZone = TimeZone.getDefault();
        return timeZone != null ? amri.b(timeZone.getID()) : ampu.a;
    }

    static Integer c() {
        return Integer.valueOf(jnl.a().c());
    }

    static String d(Context context) {
        return aeeg.a(context.getContentResolver(), "digest", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC, Splitter:B:26:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List a(defpackage.awdn r9, java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ all -> 0x0069 }
            java.lang.Object r9 = r9.a()     // Catch:{ all -> 0x0069 }
            java.io.File r9 = (java.io.File) r9     // Catch:{ all -> 0x0069 }
            r2.<init>(r9)     // Catch:{ all -> 0x0069 }
            java.util.Enumeration r9 = r2.entries()     // Catch:{ all -> 0x0066 }
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0066 }
            r4 = 0
        L_0x001a:
            boolean r5 = r9.hasMoreElements()     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r9.nextElement()     // Catch:{ all -> 0x0064 }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ all -> 0x0064 }
            java.io.InputStream r5 = r2.getInputStream(r5)     // Catch:{ all -> 0x0064 }
            java.security.MessageDigest r6 = defpackage.jhh.a((java.lang.String) r10)     // Catch:{ all -> 0x0064 }
            if (r6 == 0) goto L_0x004a
        L_0x0030:
            int r7 = r5.read(r3)     // Catch:{ all -> 0x0064 }
            if (r7 > 0) goto L_0x0045
            byte[] r6 = r6.digest()     // Catch:{ all -> 0x0064 }
            r7 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)     // Catch:{ all -> 0x0064 }
            r0.add(r6)     // Catch:{ all -> 0x0064 }
            int r4 = r4 + 1
            goto L_0x005a
        L_0x0045:
            r6.update(r3, r1, r7)     // Catch:{ all -> 0x0064 }
            goto L_0x0030
        L_0x004a:
            iwd r6 = b     // Catch:{ all -> 0x0064 }
            java.lang.String r7 = "no support for SHA-1?"
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ all -> 0x0064 }
            r6.f(r7, r8)     // Catch:{ all -> 0x0064 }
            java.lang.String r6 = "--NoSuchAlgorithmException--"
            r0.add(r6)     // Catch:{ all -> 0x0064 }
            int r4 = r4 + 1
        L_0x005a:
            r5.close()     // Catch:{ all -> 0x0064 }
            goto L_0x001a
        L_0x005e:
            r2.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0089
        L_0x0062:
            r9 = move-exception
            goto L_0x0073
        L_0x0064:
            r9 = move-exception
            goto L_0x006c
        L_0x0066:
            r9 = move-exception
            r4 = 0
            goto L_0x006c
        L_0x0069:
            r9 = move-exception
            r2 = 0
            r4 = 0
        L_0x006c:
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0071:
            throw r9     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            r9 = move-exception
        L_0x0073:
            iwd r10 = b
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r5 = r9.getMessage()
            r3[r1] = r5
            java.lang.String r1 = "error reading OTA certs: %s"
            r10.d(r1, r9, r3)
            java.lang.String r9 = "--IOException--"
            r0.add(r9)
            int r4 = r4 + r2
        L_0x0089:
            if (r4 != 0) goto L_0x0090
            java.lang.String r9 = "--no-output--"
            r0.add(r9)
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbs.a(awdn, java.lang.String):java.util.List");
    }
}
