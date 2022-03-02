package defpackage;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

/* renamed from: yiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yiv implements yiz {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);
    private final HttpClient b;
    private final yiw c;

    public yiv(HttpClient httpClient, yiw yiw) {
        this.b = httpClient;
        this.c = yiw;
    }

    private final int a(HttpResponse httpResponse) {
        Header lastHeader = httpResponse.getLastHeader("Retry-After");
        if (lastHeader == null || lastHeader.getValue() == null) {
            return 0;
        }
        try {
            return Integer.parseInt(lastHeader.getValue());
        } catch (NumberFormatException e) {
            anih anih = (anih) a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("yiv", "a", 143, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Retry-After with invalid value: %s", (Object) lastHeader.getValue());
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yiy a(defpackage.apfo r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            yiw r0 = r8.c
            java.lang.String r0 = r0.a
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "yiv"
            r4 = 0
            if (r0 == 0) goto L_0x002b
            jjg r9 = a
            anie r9 = r9.b()
            anih r9 = (defpackage.anih) r9
            r10 = 42
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r10, (java.lang.String) r1)
            anih r9 = (defpackage.anih) r9
            java.lang.String r10 = "Abort attempt to contact server without URL"
            r9.a((java.lang.String) r10)
            yiy r9 = defpackage.yiy.a(r4)
            return r9
        L_0x002b:
            yiw r0 = r8.c
            java.lang.String r0 = r0.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r9.e
            int r5 = defpackage.apfn.a(r5)
            if (r5 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r5 = 1
        L_0x003d:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 14
            r7.<init>(r6)
            r7.append(r0)
            java.lang.String r0 = "?r="
            r7.append(r0)
            int r5 = r5 + -1
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            boolean r5 = defpackage.azaf.h()
            if (r5 == 0) goto L_0x0087
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r9.g
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 14
            r7.<init>(r6)
            r7.append(r0)
            java.lang.String r0 = "&c="
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
        L_0x0087:
            org.apache.http.client.methods.HttpPost r5 = new org.apache.http.client.methods.HttpPost
            r5.<init>(r0)
            if (r11 == 0) goto L_0x0099
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "X-SERVER-TOKEN"
            r5.addHeader(r0, r11)
        L_0x0099:
            if (r10 != 0) goto L_0x009c
            goto L_0x00b9
        L_0x009c:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00b9
            java.lang.String r11 = "Bearer "
            int r0 = r10.length()
            if (r0 != 0) goto L_0x00b0
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11)
            goto L_0x00b4
        L_0x00b0:
            java.lang.String r10 = r11.concat(r10)
        L_0x00b4:
            java.lang.String r11 = "Authorization"
            r5.addHeader(r11, r10)
        L_0x00b9:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            java.util.zip.GZIPOutputStream r11 = new java.util.zip.GZIPOutputStream
            r11.<init>(r10)
            r9.a(r11)
            r11.close()
            byte[] r9 = r10.toByteArray()
            org.apache.http.entity.ByteArrayEntity r10 = new org.apache.http.entity.ByteArrayEntity
            r10.<init>(r9)
            java.lang.String r9 = "gzip"
            r10.setContentEncoding(r9)
            java.lang.String r11 = "application/x-protobuf"
            r10.setContentType(r11)
            r5.setEntity(r10)
            boolean r10 = defpackage.ayzv.c()
            if (r10 != 0) goto L_0x0114
            java.net.URI r10 = r5.getURI()
            java.lang.String r10 = r10.getScheme()
            java.lang.String r11 = "https"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00f6
            goto L_0x0114
        L_0x00f6:
            jjg r9 = a
            anie r9 = r9.b()
            anih r9 = (defpackage.anih) r9
            r10 = 48
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r10, (java.lang.String) r1)
            anih r9 = (defpackage.anih) r9
            java.net.URI r10 = r5.getURI()
            java.lang.String r11 = "Abort attempt to contact server without HTTPS: %s"
            r9.a((java.lang.String) r11, (java.lang.Object) r10)
            yiy r9 = defpackage.yiy.a(r4)
            return r9
        L_0x0114:
            r5.getURI()
            org.apache.http.client.HttpClient r10 = r8.b
            org.apache.http.HttpResponse r10 = r10.execute(r5)
            org.apache.http.StatusLine r11 = r10.getStatusLine()
            int r11 = r11.getStatusCode()
            r0 = 200(0xc8, float:2.8E-43)
            if (r11 < r0) goto L_0x01c0
            r0 = 300(0x12c, float:4.2E-43)
            if (r11 >= r0) goto L_0x01c0
            r0 = 0
            org.apache.http.HttpEntity r5 = r10.getEntity()     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            org.apache.http.Header r6 = r5.getContentEncoding()     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            if (r6 == 0) goto L_0x0141
            org.apache.http.Header r6 = r5.getContentEncoding()     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            java.lang.String r6 = r6.getValue()     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            goto L_0x0143
        L_0x0141:
            java.lang.String r6 = ""
        L_0x0143:
            boolean r9 = r9.equals(r6)     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            if (r9 == 0) goto L_0x0155
            java.util.zip.GZIPInputStream r9 = new java.util.zip.GZIPInputStream     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            java.io.InputStream r5 = r5.getContent()     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            r9.<init>(r5)     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            r0 = r9
            goto L_0x015a
        L_0x0155:
            java.io.InputStream r9 = r5.getContent()     // Catch:{ IllegalStateException -> 0x01b2, all -> 0x01b0 }
            r0 = r9
        L_0x015a:
            byte[] r9 = defpackage.anmr.a((java.io.InputStream) r0)     // Catch:{ IllegalStateException -> 0x01ae, all -> 0x01ac }
            aubs r5 = defpackage.aubs.c()     // Catch:{ IllegalStateException -> 0x01ae, all -> 0x01ac }
            apfp r6 = defpackage.apfp.f     // Catch:{ IllegalStateException -> 0x01ae, all -> 0x01ac }
            aucj r9 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r9, (defpackage.aubs) r5)     // Catch:{ IllegalStateException -> 0x01ae, all -> 0x01ac }
            apfp r9 = (defpackage.apfp) r9     // Catch:{ IllegalStateException -> 0x01ae, all -> 0x01ac }
            if (r0 != 0) goto L_0x016d
            goto L_0x0170
        L_0x016d:
            r0.close()
        L_0x0170:
            java.lang.String r0 = "Retry-After"
            org.apache.http.Header r10 = r10.getLastHeader(r0)
            if (r10 == 0) goto L_0x01a6
            java.lang.String r0 = r10.getValue()
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = r10.getValue()     // Catch:{ NumberFormatException -> 0x0188 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0188 }
            goto L_0x01a7
        L_0x0188:
            r0 = move-exception
            jjg r5 = a
            anie r5 = r5.c()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r0)
            r0 = 143(0x8f, float:2.0E-43)
            anie r0 = r5.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r10 = r10.getValue()
            java.lang.String r1 = "Retry-After with invalid value: %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r10)
            goto L_0x01a7
        L_0x01a6:
        L_0x01a7:
            yiy r9 = defpackage.yiy.a(r9, r4, r11)
            return r9
        L_0x01ac:
            r9 = move-exception
            goto L_0x01ba
        L_0x01ae:
            r9 = move-exception
            goto L_0x01b3
        L_0x01b0:
            r9 = move-exception
            goto L_0x01ba
        L_0x01b2:
            r9 = move-exception
        L_0x01b3:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x01b9 }
            r10.<init>(r9)     // Catch:{ all -> 0x01b9 }
            throw r10     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            r9 = move-exception
        L_0x01ba:
            if (r0 == 0) goto L_0x01bf
            r0.close()
        L_0x01bf:
            throw r9
        L_0x01c0:
            r9 = 401(0x191, float:5.62E-43)
            if (r11 == r9) goto L_0x01de
            jjg r9 = a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r10 = 64
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r10, (java.lang.String) r1)
            anih r9 = (defpackage.anih) r9
            java.lang.String r10 = "Server returned %d"
            r9.a((java.lang.String) r10, (int) r11)
            yiy r9 = defpackage.yiy.a(r11)
            return r9
        L_0x01de:
            jjg r9 = a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r10 = 61
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r10, (java.lang.String) r1)
            anih r9 = (defpackage.anih) r9
            java.lang.String r10 = "Server returned 401, invalidating auth token"
            r9.a((java.lang.String) r10)
            yiy r9 = defpackage.yiy.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yiv.a(apfo, java.lang.String, java.lang.String):yiy");
    }
}
