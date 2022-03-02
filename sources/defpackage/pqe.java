package defpackage;

import android.content.Context;

/* renamed from: pqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqe implements pqf {
    private static final String b = System.getProperty("http.agent");
    public final Context a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012b, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013f, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0140, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:32:0x00bf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r7, java.lang.String r8, android.util.Pair... r9) {
        /*
            r6 = this;
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "Failed to get auth token for account:%s, error:%s"
            agvx r2 = defpackage.ozx.y
            java.lang.Object r2 = r2.c()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r4 = 0
            if (r3 == 0) goto L_0x001a
            java.lang.String r7 = "Account name is empty or null"
            defpackage.oso.d(r7)
            r7 = r4
            goto L_0x0044
        L_0x001a:
            boolean r3 = defpackage.hxz.a()
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = "<redacted>"
            goto L_0x0024
        L_0x0023:
            r3 = r7
        L_0x0024:
            java.lang.String r5 = "Attempting to get auth token for scope/account:%s/%s"
            defpackage.oso.d(r5, r2, r3)
            android.content.Context r5 = r6.a     // Catch:{ eif -> 0x003b, IOException -> 0x0031 }
            java.lang.String r7 = defpackage.eig.a((android.content.Context) r5, (java.lang.String) r7, (java.lang.String) r2)     // Catch:{ eif -> 0x003b, IOException -> 0x0031 }
            goto L_0x0044
        L_0x0031:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            defpackage.oso.e(r1, r3, r7)
            r7 = r4
            goto L_0x0044
        L_0x003b:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            defpackage.oso.e(r1, r3, r7)
            r7 = r4
        L_0x0044:
            agvx r1 = defpackage.ozx.z
            java.lang.Object r1 = r1.c()
            java.lang.String r1 = (java.lang.String) r1
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            r1.appendEncodedPath(r8)
            r8 = 0
            r8 = r9[r8]
            java.lang.Object r9 = r8.first
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.second
            java.lang.String r8 = (java.lang.String) r8
            r1.appendQueryParameter(r9, r8)
            android.net.Uri r8 = r1.build()
            java.lang.String r8 = r8.toString()
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x007c
            java.lang.String r9 = "https"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r8 = r4
        L_0x007d:
            if (r7 == 0) goto L_0x0158
            if (r8 == 0) goto L_0x0158
            java.net.URL r9 = new java.net.URL     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            r9.<init>(r8)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            r8 = 12800(0x3200, float:1.7937E-41)
            java.net.URLConnection r8 = defpackage.jlk.a(r9, r8)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            if (r9 == 0) goto L_0x0095
            goto L_0x00ac
        L_0x0095:
            java.lang.String r9 = "Authorization"
            java.lang.String r1 = "Bearer "
            int r2 = r7.length()     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            if (r2 != 0) goto L_0x00a5
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            goto L_0x00a9
        L_0x00a5:
            java.lang.String r7 = r1.concat(r7)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
        L_0x00a9:
            r8.addRequestProperty(r9, r7)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
        L_0x00ac:
            java.lang.String r7 = "User-Agent"
            java.lang.String r9 = b     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            r8.setRequestProperty(r7, r9)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            java.lang.String r7 = "Accept"
            r8.setRequestProperty(r7, r0)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            java.lang.String r7 = "Content-Type"
            r8.setRequestProperty(r7, r0)     // Catch:{ IOException -> 0x0146, all -> 0x0144 }
            java.lang.String r7 = "X-Developer-Key"
            agvx r9 = defpackage.ozx.A     // Catch:{ IOException -> 0x0142, all -> 0x013f }
            java.lang.Object r9 = r9.c()     // Catch:{ IOException -> 0x0142, all -> 0x013f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x0142, all -> 0x013f }
            r8.setRequestProperty(r7, r9)     // Catch:{ IOException -> 0x0142, all -> 0x013f }
            int r7 = r8.getResponseCode()     // Catch:{ all -> 0x0130 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r7 == r9) goto L_0x00ea
            java.lang.String r9 = "Failed to get response, status code %d"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0130 }
            defpackage.oso.e((java.lang.String) r9, (java.lang.Object) r7)     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x00e9
            java.io.InputStream r7 = r8.getErrorStream()     // Catch:{ IOException -> 0x00e7, all -> 0x013f }
            if (r7 == 0) goto L_0x00e9
            r7.close()     // Catch:{ IOException -> 0x00e7, all -> 0x013f }
            goto L_0x012c
        L_0x00e7:
            r7 = move-exception
            goto L_0x012c
        L_0x00e9:
            goto L_0x012c
        L_0x00ea:
            java.io.InputStream r7 = r8.getInputStream()     // Catch:{ all -> 0x0130 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0130 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0130 }
            java.lang.String r1 = "UTF-8"
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0130 }
            r9.<init>(r0)     // Catch:{ all -> 0x0130 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r0.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r1 = r9.readLine()     // Catch:{ all -> 0x0130 }
        L_0x0103:
            if (r1 == 0) goto L_0x0115
            r0.append(r1)     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r9.readLine()     // Catch:{ all -> 0x010d }
            goto L_0x0103
        L_0x010d:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0130 }
            r7.close()     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0115:
            r9.close()     // Catch:{ all -> 0x0130 }
            r7.close()     // Catch:{ all -> 0x0130 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x012c
            java.io.InputStream r7 = r8.getErrorStream()     // Catch:{ IOException -> 0x012b, all -> 0x013f }
            if (r7 == 0) goto L_0x012c
            r7.close()     // Catch:{ IOException -> 0x012b, all -> 0x013f }
            goto L_0x012c
        L_0x012b:
            r7 = move-exception
        L_0x012c:
            defpackage.jlk.a(r8)
            return r4
        L_0x0130:
            r7 = move-exception
            if (r8 == 0) goto L_0x013e
            java.io.InputStream r9 = r8.getErrorStream()     // Catch:{ IOException -> 0x013d, all -> 0x013f }
            if (r9 == 0) goto L_0x013e
            r9.close()     // Catch:{ IOException -> 0x013d, all -> 0x013f }
            goto L_0x013e
        L_0x013d:
            r9 = move-exception
        L_0x013e:
            throw r7     // Catch:{ IOException -> 0x0142, all -> 0x013f }
        L_0x013f:
            r7 = move-exception
            r4 = r8
            goto L_0x0154
        L_0x0142:
            r7 = move-exception
            goto L_0x0148
        L_0x0144:
            r7 = move-exception
            goto L_0x0154
        L_0x0146:
            r7 = move-exception
            r8 = r4
        L_0x0148:
            java.lang.String r9 = "Failed to send request: %s"
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0152 }
            defpackage.oso.b((java.lang.String) r9, (java.lang.Object) r7)     // Catch:{ all -> 0x0152 }
            goto L_0x012c
        L_0x0152:
            r7 = move-exception
            r4 = r8
        L_0x0154:
            defpackage.jlk.a(r4)
            throw r7
        L_0x0158:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqe.a(java.lang.String, java.lang.String, android.util.Pair[]):java.lang.String");
    }

    public pqe(Context context) {
        this.a = context;
    }
}
