package defpackage;

import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: hwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwm implements hwe {
    private static final Pattern a = Pattern.compile("[^,;\\s\"]+");
    private final Context b;
    private final htg c;
    private final String d;
    private final hwj e;

    public hwm(Context context, String str, htg htg) {
        hwj hwj;
        if (!awtr.a.a().j()) {
            hwj = new hwl();
        } else {
            hwj = new hwk(context);
        }
        jiu jiu = jiu.a;
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) str);
        this.d = str;
        iva.a((Object) htg);
        this.c = htg;
        iva.a((Object) hwj);
        this.e = hwj;
        iva.a((Object) jiu);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0191 A[SYNTHETIC, Splitter:B:48:0x0191] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020e A[SYNTHETIC, Splitter:B:74:0x020e] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0224 A[SYNTHETIC, Splitter:B:87:0x0224] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0232 A[SYNTHETIC, Splitter:B:95:0x0232] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hwd a(defpackage.avtn r9, defpackage.hwc r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.String r0 = "Error closing response stream. "
            defpackage.iva.a((java.lang.Object) r10)
            java.net.URL r1 = new java.net.URL
            java.lang.String r2 = r8.d
            r1.<init>(r2)
            boolean r2 = defpackage.awtr.e()
            if (r2 != 0) goto L_0x003d
            java.lang.String r1 = r1.getProtocol()
            java.lang.String r2 = "https"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r8.d
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Abort attempt to upload logs in plaintext: requestUrl="
            int r12 = r10.length()
            if (r12 != 0) goto L_0x0035
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11)
            goto L_0x0039
        L_0x0035:
            java.lang.String r10 = r11.concat(r10)
        L_0x0039:
            r9.<init>(r10)
            throw r9
        L_0x003d:
            hwj r1 = r8.e
            java.lang.String r2 = r8.d
            java.net.HttpURLConnection r1 = r1.a(r2)
            r2 = 1
            r1.setDoOutput(r2)
            r2 = 0
            r1.setInstanceFollowRedirects(r2)
            r1.setChunkedStreamingMode(r2)
            long r3 = defpackage.awtr.c()
            int r4 = (int) r3
            r3 = 30000(0x7530, float:4.2039E-41)
            int r4 = java.lang.Math.max(r4, r3)
            r1.setConnectTimeout(r4)
            long r4 = defpackage.awtr.j()
            int r5 = (int) r4
            int r3 = java.lang.Math.max(r5, r3)
            r1.setReadTimeout(r3)
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r1.setRequestProperty(r3, r4)
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-gzip"
            r1.setRequestProperty(r3, r4)
            if (r11 == 0) goto L_0x0085
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x0085
            java.lang.String r3 = "Authorization"
            r1.setRequestProperty(r3, r11)
        L_0x0085:
            if (r12 != 0) goto L_0x0088
            goto L_0x0093
        L_0x0088:
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x0093
            java.lang.String r11 = "X-SERVER-TOKEN"
            r1.setRequestProperty(r11, r12)
        L_0x0093:
            boolean r11 = r9.j
            if (r11 != 0) goto L_0x00e0
            android.content.Context r11 = r8.b
            com.google.android.gms.pseudonymous.PseudonymousIdToken r11 = defpackage.zok.b(r11)
            java.lang.String r11 = r11.a
            boolean r12 = defpackage.awtr.l()
            if (r12 == 0) goto L_0x00ad
            java.lang.String r12 = defpackage.amrk.b(r11)
            r7 = r12
            r12 = r11
            r11 = r7
            goto L_0x00e3
        L_0x00ad:
            if (r11 != 0) goto L_0x00b5
            java.lang.String r12 = "\"\""
            r7 = r12
            r12 = r11
            r11 = r7
            goto L_0x00e3
        L_0x00b5:
            java.util.regex.Pattern r12 = a
            java.util.regex.Matcher r12 = r12.matcher(r11)
            boolean r12 = r12.matches()
            if (r12 != 0) goto L_0x00df
            int r12 = r11.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r12 = r12 + 2
            r3.<init>(r12)
            java.lang.String r12 = "\""
            r3.append(r12)
            r3.append(r11)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r7 = r12
            r12 = r11
            r11 = r7
            goto L_0x00e3
        L_0x00df:
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r11 = "ANONYMOUS"
        L_0x00e2:
            r12 = r11
        L_0x00e3:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r3 = "NID="
            int r4 = r11.length()
            if (r4 != 0) goto L_0x00f5
            java.lang.String r11 = new java.lang.String
            r11.<init>(r3)
            goto L_0x00f9
        L_0x00f5:
            java.lang.String r11 = r3.concat(r11)
        L_0x00f9:
            java.lang.String r3 = "Cookie"
            r1.setRequestProperty(r3, r11)
            htg r11 = r8.c
            java.util.Map r3 = r1.getRequestProperties()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x010c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x014d
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            int r2 = r2 + r5
            java.lang.Object r5 = r4.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x012d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x013f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            int r2 = r2 + r6
            goto L_0x012d
        L_0x013f:
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r4 = r4 + 2
            int r2 = r2 + r4
            goto L_0x010c
        L_0x014d:
            long r2 = (long) r2
            r11.b((defpackage.avtn) r9, (long) r2)
            htg r11 = r8.c     // Catch:{ all -> 0x0249 }
            r11.a((defpackage.avtn) r9)     // Catch:{ all -> 0x0249 }
            htg r11 = r8.c     // Catch:{ all -> 0x0249 }
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch:{ all -> 0x0249 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0249 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0249 }
            r10.a(r3, r5)     // Catch:{ all -> 0x0249 }
            r10.e()     // Catch:{ all -> 0x0249 }
            anmz r3 = new anmz     // Catch:{ all -> 0x0249 }
            r3.<init>(r2)     // Catch:{ all -> 0x0249 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0249 }
            r2.<init>(r3)     // Catch:{ all -> 0x0249 }
            byte[] r10 = r10.d()     // Catch:{ all -> 0x0249 }
            r2.write(r10)     // Catch:{ all -> 0x0249 }
            r2.close()     // Catch:{ all -> 0x0249 }
            long r2 = r3.a     // Catch:{ all -> 0x0249 }
            r11.a((defpackage.avtn) r9, (long) r2)     // Catch:{ all -> 0x0249 }
            int r9 = r1.getResponseCode()     // Catch:{ all -> 0x0249 }
            java.lang.String r10 = "Set-Cookie"
            java.lang.String r10 = r1.getHeaderField(r10)     // Catch:{ all -> 0x0249 }
            java.lang.String r11 = "HttpUrlConnTransport"
            if (r10 == 0) goto L_0x01f5
            boolean r2 = r10.isEmpty()     // Catch:{ all -> 0x0249 }
            if (r2 != 0) goto L_0x01f5
            java.util.List r10 = java.net.HttpCookie.parse(r10)     // Catch:{ all -> 0x0249 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0249 }
        L_0x019f:
            boolean r2 = r10.hasNext()     // Catch:{ all -> 0x0249 }
            if (r2 == 0) goto L_0x01f5
            java.lang.Object r2 = r10.next()     // Catch:{ all -> 0x0249 }
            java.net.HttpCookie r2 = (java.net.HttpCookie) r2     // Catch:{ all -> 0x0249 }
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0249 }
            java.lang.String r4 = "NID"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0249 }
            if (r3 == 0) goto L_0x019f
            java.lang.String r3 = r2.getValue()     // Catch:{ all -> 0x0249 }
            if (r3 == 0) goto L_0x019f
            boolean r3 = defpackage.awtr.f()     // Catch:{ all -> 0x0249 }
            if (r3 == 0) goto L_0x01e6
            znz r3 = defpackage.zoa.c()     // Catch:{ all -> 0x0249 }
            r3.b = r12     // Catch:{ all -> 0x0249 }
            java.lang.String r2 = r2.getValue()     // Catch:{ all -> 0x0249 }
            r3.a = r2     // Catch:{ all -> 0x0249 }
            zoa r2 = r3.a()     // Catch:{ all -> 0x0249 }
            android.content.Context r3 = r8.b     // Catch:{ all -> 0x0249 }
            boolean r2 = defpackage.zol.a((defpackage.zoa) r2, (android.content.Context) r3)     // Catch:{ all -> 0x0249 }
            if (r2 != 0) goto L_0x019f
            java.lang.String r2 = "Error in PseudonymousId compareAndSet() operation"
            android.util.Log.e(r11, r2)     // Catch:{ all -> 0x0249 }
            htg r2 = r8.c     // Catch:{ all -> 0x0249 }
            r2.a()     // Catch:{ all -> 0x0249 }
            goto L_0x019f
        L_0x01e6:
            com.google.android.gms.pseudonymous.PseudonymousIdToken r3 = new com.google.android.gms.pseudonymous.PseudonymousIdToken     // Catch:{ all -> 0x0249 }
            java.lang.String r2 = r2.getValue()     // Catch:{ all -> 0x0249 }
            r3.<init>(r2)     // Catch:{ all -> 0x0249 }
            android.content.Context r2 = r8.b     // Catch:{ all -> 0x0249 }
            defpackage.zol.a((com.google.android.gms.pseudonymous.PseudonymousIdToken) r3, (android.content.Context) r2)     // Catch:{ all -> 0x0249 }
            goto L_0x019f
        L_0x01f5:
            htg r10 = r8.c     // Catch:{ all -> 0x0249 }
            r10.a((int) r9)     // Catch:{ all -> 0x0249 }
            r10 = 200(0xc8, float:2.8E-43)
            r12 = 0
            if (r9 < r10) goto L_0x023b
            r10 = 300(0x12c, float:4.2E-43)
            if (r9 >= r10) goto L_0x023b
            java.io.InputStream r10 = r1.getInputStream()     // Catch:{ IOException -> 0x021b, all -> 0x0219 }
            byte[] r12 = defpackage.anmr.a((java.io.InputStream) r10)     // Catch:{ IOException -> 0x0217, all -> 0x0214 }
            if (r10 != 0) goto L_0x020e
            goto L_0x023c
        L_0x020e:
            r10.close()     // Catch:{ IOException -> 0x0212 }
            goto L_0x023b
        L_0x0212:
            r10 = move-exception
            goto L_0x0229
        L_0x0214:
            r9 = move-exception
            r12 = r10
            goto L_0x0230
        L_0x0217:
            r2 = move-exception
            goto L_0x021d
        L_0x0219:
            r9 = move-exception
            goto L_0x0230
        L_0x021b:
            r2 = move-exception
            r10 = r12
        L_0x021d:
            java.lang.String r3 = "Error reading the content of the response body."
            android.util.Log.e(r11, r3, r2)     // Catch:{ all -> 0x022e }
            if (r10 == 0) goto L_0x022d
            r10.close()     // Catch:{ IOException -> 0x0228 }
            goto L_0x023b
        L_0x0228:
            r10 = move-exception
        L_0x0229:
            android.util.Log.e(r11, r0, r10)     // Catch:{ all -> 0x0249 }
            goto L_0x023c
        L_0x022d:
            goto L_0x023c
        L_0x022e:
            r9 = move-exception
            r12 = r10
        L_0x0230:
            if (r12 == 0) goto L_0x023a
            r12.close()     // Catch:{ IOException -> 0x0236 }
            goto L_0x023a
        L_0x0236:
            r10 = move-exception
            android.util.Log.e(r11, r0, r10)     // Catch:{ all -> 0x0249 }
        L_0x023a:
            throw r9     // Catch:{ all -> 0x0249 }
        L_0x023b:
        L_0x023c:
            hwd r10 = new hwd     // Catch:{ all -> 0x0249 }
            java.lang.String r11 = r1.getResponseMessage()     // Catch:{ all -> 0x0249 }
            r10.<init>(r12, r9, r11)     // Catch:{ all -> 0x0249 }
            defpackage.jlk.a(r1)
            return r10
        L_0x0249:
            r9 = move-exception
            defpackage.jlk.a(r1)
            goto L_0x024f
        L_0x024e:
            throw r9
        L_0x024f:
            goto L_0x024e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwm.a(avtn, hwc, java.lang.String, java.lang.String):hwd");
    }
}
