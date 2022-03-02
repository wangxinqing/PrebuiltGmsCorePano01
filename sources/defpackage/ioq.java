package defpackage;

import org.apache.http.client.HttpClient;

/* renamed from: ioq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ioq implements yiz {
    private final HttpClient a;
    private final yiw b;

    public ioq(HttpClient httpClient, yiw yiw) {
        this.a = httpClient;
        this.b = yiw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yiy a(defpackage.apfo r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            yiw r0 = r4.b
            java.lang.String r0 = r0.a
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0010
            yiy r5 = defpackage.yiy.a(r1)
            return r5
        L_0x0010:
            yiw r0 = r4.b
            java.lang.String r0 = r0.a
            org.apache.http.client.methods.HttpPost r2 = new org.apache.http.client.methods.HttpPost
            r2.<init>(r0)
            if (r7 == 0) goto L_0x0026
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "X-SERVER-TOKEN"
            r2.addHeader(r0, r7)
        L_0x0026:
            if (r6 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0046
            java.lang.String r7 = "Bearer "
            int r0 = r6.length()
            if (r0 != 0) goto L_0x003d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0041
        L_0x003d:
            java.lang.String r6 = r7.concat(r6)
        L_0x0041:
            java.lang.String r7 = "Authorization"
            r2.addHeader(r7, r6)
        L_0x0046:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream
            r7.<init>(r6)
            r5.a(r7)
            r7.close()
            byte[] r5 = r6.toByteArray()
            org.apache.http.entity.ByteArrayEntity r6 = new org.apache.http.entity.ByteArrayEntity
            r6.<init>(r5)
            java.lang.String r5 = "gzip"
            r6.setContentEncoding(r5)
            java.lang.String r7 = "application/x-protobuf"
            r6.setContentType(r7)
            r2.setEntity(r6)
            boolean r6 = defpackage.ayzv.c()
            if (r6 != 0) goto L_0x0089
            java.net.URI r6 = r2.getURI()
            java.lang.String r6 = r6.getScheme()
            java.lang.String r7 = "https"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0083
            goto L_0x0089
        L_0x0083:
            yiy r5 = defpackage.yiy.a(r1)
            return r5
        L_0x0089:
            org.apache.http.client.HttpClient r6 = r4.a
            org.apache.http.HttpResponse r6 = r6.execute(r2)
            org.apache.http.StatusLine r7 = r6.getStatusLine()
            int r7 = r7.getStatusCode()
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 < r0) goto L_0x0114
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 >= r0) goto L_0x0114
            r0 = 0
            org.apache.http.HttpEntity r2 = r6.getEntity()     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            org.apache.http.Header r3 = r2.getContentEncoding()     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            if (r3 == 0) goto L_0x00b3
            org.apache.http.Header r3 = r2.getContentEncoding()     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            java.lang.String r3 = r3.getValue()     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r3 = ""
        L_0x00b5:
            boolean r5 = r5.equals(r3)     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            if (r5 == 0) goto L_0x00c7
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            java.io.InputStream r2 = r2.getContent()     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            r5.<init>(r2)     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            r0 = r5
            goto L_0x00cc
        L_0x00c7:
            java.io.InputStream r5 = r2.getContent()     // Catch:{ IllegalStateException -> 0x0106, all -> 0x0104 }
            r0 = r5
        L_0x00cc:
            byte[] r5 = defpackage.anmr.a((java.io.InputStream) r0)     // Catch:{ IllegalStateException -> 0x0102 }
            aubs r2 = defpackage.aubs.c()     // Catch:{ IllegalStateException -> 0x0102 }
            apfp r3 = defpackage.apfp.f     // Catch:{ IllegalStateException -> 0x0102 }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r5, (defpackage.aubs) r2)     // Catch:{ IllegalStateException -> 0x0102 }
            apfp r5 = (defpackage.apfp) r5     // Catch:{ IllegalStateException -> 0x0102 }
            if (r0 != 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r0.close()
        L_0x00e2:
            java.lang.String r0 = "Retry-After"
            org.apache.http.Header r6 = r6.getLastHeader(r0)
            if (r6 == 0) goto L_0x00fc
            java.lang.String r0 = r6.getValue()
            if (r0 == 0) goto L_0x00fc
            java.lang.String r6 = r6.getValue()     // Catch:{ NumberFormatException -> 0x00fa }
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00fa }
            goto L_0x00fd
        L_0x00fa:
            r6 = move-exception
            goto L_0x00fd
        L_0x00fc:
        L_0x00fd:
            yiy r5 = defpackage.yiy.a(r5, r1, r7)
            return r5
        L_0x0102:
            r5 = move-exception
            goto L_0x0107
        L_0x0104:
            r5 = move-exception
            goto L_0x010e
        L_0x0106:
            r5 = move-exception
        L_0x0107:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x010d }
            r6.<init>(r5)     // Catch:{ all -> 0x010d }
            throw r6     // Catch:{ all -> 0x010d }
        L_0x010d:
            r5 = move-exception
        L_0x010e:
            if (r0 == 0) goto L_0x0113
            r0.close()
        L_0x0113:
            throw r5
        L_0x0114:
            r5 = 401(0x191, float:5.62E-43)
            if (r7 == r5) goto L_0x011d
            yiy r5 = defpackage.yiy.a(r7)
            return r5
        L_0x011d:
            yiy r5 = defpackage.yiy.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioq.a(apfo, java.lang.String, java.lang.String):yiy");
    }
}
