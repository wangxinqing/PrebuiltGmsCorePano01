package defpackage;

import java.net.URL;
import java.util.Map;

/* renamed from: suw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class suw implements Runnable {
    final /* synthetic */ sux a;
    private final URL b;
    private final byte[] c;
    private final suu d;
    private final String e;
    private final Map f;

    public suw(sux sux, String str, URL url, byte[] bArr, Map map, suu suu) {
        this.a = sux;
        iva.c(str);
        iva.a((Object) url);
        iva.a((Object) suu);
        this.b = url;
        this.c = bArr;
        this.d = suu;
        this.e = str;
        this.f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x012d A[SYNTHETIC, Splitter:B:70:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016c A[SYNTHETIC, Splitter:B:81:0x016c] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            sux r1 = r13.a
            r1.C()
            r1 = 0
            r2 = 0
            sux r3 = r13.a     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            java.lang.String r4 = r13.e     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r3.a(r4)     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            sux r3 = r13.a     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            java.net.URL r4 = r13.b     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            if (r5 == 0) goto L_0x011e
            javax.net.ssl.SSLSocketFactory r5 = r3.a     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r3.v()     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r3.v()     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            java.util.Map r5 = r13.f     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            if (r5 == 0) goto L_0x0064
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
        L_0x0048:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            if (r6 == 0) goto L_0x0064
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            goto L_0x0048
        L_0x0064:
            byte[] r5 = r13.c     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            if (r5 == 0) goto L_0x00ac
            sux r5 = r13.a     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            szg r5 = r5.o()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            byte[] r6 = r13.c     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            byte[] r5 = r5.b(r6)     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            sux r6 = r13.a     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            sut r6 = r6.E()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            sur r6 = r6.k     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            int r7 = r5.length     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            r6.a(r8, r9)     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            r4.connect()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            r3.write(r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a1 }
            r3.close()     // Catch:{ IOException -> 0x00a6, all -> 0x00a1 }
            goto L_0x00ac
        L_0x00a1:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x0117
        L_0x00a6:
            r5 = move-exception
            r12 = r2
            r2 = r3
            r10 = r5
            goto L_0x011c
        L_0x00ac:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0119, all -> 0x0114 }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x010f, all -> 0x010b }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00f7 }
            r3.<init>()     // Catch:{ all -> 0x00f7 }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00f7 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00f5 }
        L_0x00c1:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00f5 }
            if (r7 > 0) goto L_0x00f0
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00f5 }
            if (r5 == 0) goto L_0x00d0
            r5.close()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
        L_0x00d0:
            if (r4 != 0) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r4.disconnect()
        L_0x00d6:
            sux r0 = r13.a
            r0.b()
            sux r0 = r13.a
            svs r0 = r0.F()
            suv r1 = new suv
            java.lang.String r6 = r13.e
            suu r7 = r13.d
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00ec:
            r0.a((java.lang.Runnable) r1)
            return
        L_0x00f0:
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c1
        L_0x00f5:
            r1 = move-exception
            goto L_0x00f9
        L_0x00f7:
            r1 = move-exception
            r5 = r2
        L_0x00f9:
            if (r5 == 0) goto L_0x00fe
            r5.close()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
        L_0x00fe:
            throw r1     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
        L_0x00ff:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x012b
        L_0x0104:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x016a
        L_0x010b:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x012b
        L_0x010f:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x016a
        L_0x0114:
            r3 = move-exception
            r12 = r2
            r5 = r3
        L_0x0117:
            r9 = 0
            goto L_0x012b
        L_0x0119:
            r3 = move-exception
            r12 = r2
            r10 = r3
        L_0x011c:
            r9 = 0
            goto L_0x016a
        L_0x011e:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
            throw r3     // Catch:{ IOException -> 0x0164, all -> 0x0126 }
        L_0x0126:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
            r9 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x0143
            r2.close()     // Catch:{ IOException -> 0x0131 }
            goto L_0x0143
        L_0x0131:
            r1 = move-exception
            sux r2 = r13.a
            sut r2 = r2.E()
            sur r2 = r2.c
            java.lang.String r3 = r13.e
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)
            r2.a(r0, r3, r1)
        L_0x0143:
            if (r4 != 0) goto L_0x0146
            goto L_0x0149
        L_0x0146:
            r4.disconnect()
        L_0x0149:
            sux r0 = r13.a
            r0.b()
            sux r0 = r13.a
            svs r0 = r0.F()
            suv r1 = new suv
            java.lang.String r7 = r13.e
            suu r8 = r13.d
            r10 = 0
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.a((java.lang.Runnable) r1)
            throw r5
        L_0x0164:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
            r10 = r5
            r9 = 0
        L_0x016a:
            if (r2 == 0) goto L_0x0182
            r2.close()     // Catch:{ IOException -> 0x0170 }
            goto L_0x0182
        L_0x0170:
            r1 = move-exception
            sux r2 = r13.a
            sut r2 = r2.E()
            sur r2 = r2.c
            java.lang.String r3 = r13.e
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)
            r2.a(r0, r3, r1)
        L_0x0182:
            if (r4 != 0) goto L_0x0185
            goto L_0x0188
        L_0x0185:
            r4.disconnect()
        L_0x0188:
            sux r0 = r13.a
            r0.b()
            sux r0 = r13.a
            svs r0 = r0.F()
            suv r1 = new suv
            java.lang.String r7 = r13.e
            suu r8 = r13.d
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suw.run():void");
    }
}
