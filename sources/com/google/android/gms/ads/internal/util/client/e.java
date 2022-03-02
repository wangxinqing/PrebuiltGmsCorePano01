package com.google.android.gms.ads.internal.util.client;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class e {
    private final String a;

    public e() {
        this((String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r3 >= 300) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error while pinging URL: "
            java.lang.String r1 = ". "
            java.lang.String r2 = "Pinging URL: "
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            int r4 = r3.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            if (r4 != 0) goto L_0x0016
            java.lang.String r3 = new java.lang.String     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            r3.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            goto L_0x001a
        L_0x0016:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
        L_0x001a:
            com.google.android.gms.ads.internal.util.client.c.a((java.lang.String) r3)     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            java.net.URL r2 = new java.net.URL     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            r2.<init>(r7)     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            com.google.android.gms.ads.internal.client.c.d()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r6.a     // Catch:{ all -> 0x0087 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r4)     // Catch:{ all -> 0x0087 }
            r5 = 1
            r2.setInstanceFollowRedirects(r5)     // Catch:{ all -> 0x0087 }
            r2.setReadTimeout(r4)     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0041
            java.lang.String r4 = "User-Agent"
            r2.setRequestProperty(r4, r3)     // Catch:{ all -> 0x0087 }
        L_0x0041:
            r3 = 0
            r2.setUseCaches(r3)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.ads.internal.util.client.b r3 = new com.google.android.gms.ads.internal.util.client.b     // Catch:{ all -> 0x0087 }
            r3.<init>()     // Catch:{ all -> 0x0087 }
            com.google.android.gms.ads.internal.util.client.b.a()     // Catch:{ all -> 0x0087 }
            int r3 = r2.getResponseCode()     // Catch:{ all -> 0x0087 }
            com.google.android.gms.ads.internal.util.client.b.a()     // Catch:{ all -> 0x0087 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 >= r4) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L_0x0083
        L_0x005d:
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0087 }
            int r4 = r4.length()     // Catch:{ all -> 0x0087 }
            int r4 = r4 + 65
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r5.<init>(r4)     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "Received non-success response code "
            r5.append(r4)     // Catch:{ all -> 0x0087 }
            r5.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = " from pinging URL: "
            r5.append(r3)     // Catch:{ all -> 0x0087 }
            r5.append(r7)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0087 }
            com.google.android.gms.ads.internal.util.client.c.c(r3)     // Catch:{ all -> 0x0087 }
        L_0x0083:
            r2.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            return
        L_0x0087:
            r3 = move-exception
            r2.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
            throw r3     // Catch:{ IndexOutOfBoundsException -> 0x00ee, IOException -> 0x00bd, RuntimeException -> 0x008c }
        L_0x008c:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 27
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r7)
            r5.append(r1)
            r5.append(r2)
            java.lang.String r7 = r5.toString()
            com.google.android.gms.ads.internal.util.client.c.c(r7)
            return
        L_0x00bd:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 27
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r7)
            r5.append(r1)
            r5.append(r2)
            java.lang.String r7 = r5.toString()
            com.google.android.gms.ads.internal.util.client.c.c(r7)
            return
        L_0x00ee:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 32
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Error while parsing ping URL: "
            r4.append(r2)
            r4.append(r7)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r7 = r4.toString()
            com.google.android.gms.ads.internal.util.client.c.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.e.a(java.lang.String):void");
    }

    public e(String str) {
        this.a = str;
    }
}
