package defpackage;

import java.net.URL;

/* renamed from: sxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxg implements Runnable {
    final /* synthetic */ sxh a;
    public final svt b;
    private final URL c;

    public sxg(sxh sxh, String str, URL url, svt svt) {
        this.a = sxh;
        iva.c(str);
        iva.a((Object) url);
        iva.a((Object) svt);
        this.c = url;
        this.b = svt;
    }

    private final void a(int i, Exception exc, byte[] bArr) {
        this.a.F().a((Runnable) new sxf(this, i, exc, bArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            sxh r0 = r8.a
            r0.C()
            r0 = 0
            r1 = 0
            sxh r2 = r8.a     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            java.net.URL r3 = r8.c     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            if (r4 == 0) goto L_0x007b
            javax.net.ssl.SSLSocketFactory r4 = r2.a     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            r2.v()     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            r2.v()     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0077, all -> 0x0073 }
            r3.getHeaderFields()     // Catch:{ IOException -> 0x0071, all -> 0x006f }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x0067 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0065 }
        L_0x0047:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x0065 }
            if (r7 > 0) goto L_0x0060
            byte[] r0 = r4.toByteArray()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0071, all -> 0x006f }
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            r3.disconnect()
        L_0x005b:
            r8.a(r2, r1, r0)
            return
        L_0x0060:
            r4.write(r6, r0, r7)     // Catch:{ all -> 0x0065 }
            goto L_0x0047
        L_0x0065:
            r0 = move-exception
            goto L_0x0069
        L_0x0067:
            r0 = move-exception
            r5 = r1
        L_0x0069:
            if (r5 == 0) goto L_0x006e
            r5.close()     // Catch:{ IOException -> 0x0071, all -> 0x006f }
        L_0x006e:
            throw r0     // Catch:{ IOException -> 0x0071, all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            goto L_0x0087
        L_0x0071:
            r0 = move-exception
            goto L_0x0095
        L_0x0073:
            r2 = move-exception
            r0 = r2
            r2 = 0
            goto L_0x0087
        L_0x0077:
            r2 = move-exception
            r0 = r2
            r2 = 0
            goto L_0x0095
        L_0x007b:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
            throw r2     // Catch:{ IOException -> 0x0091, all -> 0x0083 }
        L_0x0083:
            r2 = move-exception
            r3 = r1
            r0 = r2
            r2 = 0
        L_0x0087:
            if (r3 == 0) goto L_0x008c
            r3.disconnect()
        L_0x008c:
            r8.a(r2, r1, r1)
            throw r0
        L_0x0091:
            r2 = move-exception
            r3 = r1
            r0 = r2
            r2 = 0
        L_0x0095:
            if (r3 == 0) goto L_0x009a
            r3.disconnect()
        L_0x009a:
            r8.a(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxg.run():void");
    }
}
