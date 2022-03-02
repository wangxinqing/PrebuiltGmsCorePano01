package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.params.HttpParams;

/* renamed from: hwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwb implements hwe {
    private static final alga b = new hvx();
    final HttpClient a;
    private final alga c;
    private final jiq d;
    private final htg e;
    private final String f;

    public hwb(Context context, String str, htg htg) {
        hvy hvy = new hvy(context, htg);
        StringBuilder sb = new StringBuilder("Android/");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            sb.append(packageInfo.packageName);
            sb.append("/");
            sb.append(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.wtf("ApacheHttpTransport", e2.getMessage(), e2);
        }
        opc opc = new opc(context, sb.toString(), true);
        jiu jiu = jiu.a;
        iva.a((Object) str);
        this.f = str;
        iva.a((Object) htg);
        this.e = htg;
        iva.a((Object) hvy);
        this.c = hvy;
        iva.a((Object) opc);
        this.a = opc;
        HttpParams httpParams = opc.b;
        httpParams.setParameter("http.connection.timeout", Integer.valueOf((int) Math.max(awtr.c(), 10000)));
        httpParams.setParameter("http.socket.timeout", Integer.valueOf((int) Math.max(awtr.a.a().a(), 30000)));
        iva.a((Object) jiu);
        this.d = jiu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x024f A[SYNTHETIC, Splitter:B:101:0x024f] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0239 A[SYNTHETIC, Splitter:B:92:0x0239] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0247  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.hwd a(defpackage.avtn r26, defpackage.hwc r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, long r31) {
        /*
            r25 = this;
            r9 = r25
            r2 = r26
            r0 = r28
            r5 = r29
            java.lang.String r1 = "Cookie"
            java.lang.String r3 = "Error closing response stream."
            defpackage.iva.a((java.lang.Object) r27)
            defpackage.iva.a((java.lang.Object) r30)
            hwa r4 = new hwa
            jiq r6 = r9.d
            r7 = r27
            r8 = r30
            r4.<init>(r8, r7, r6)
            boolean r6 = defpackage.awtr.e()
            if (r6 != 0) goto L_0x0050
            java.net.URI r6 = r4.getURI()
            java.lang.String r6 = r6.getScheme()
            java.lang.String r10 = "https"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0034
            goto L_0x0050
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r30)
            java.lang.String r2 = "Abort attempt to upload logs in plaintext: requestUrl="
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0048
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x004c
        L_0x0048:
            java.lang.String r1 = r2.concat(r1)
        L_0x004c:
            r0.<init>(r1)
            throw r0
        L_0x0050:
            java.lang.String r6 = java.lang.String.valueOf(r30)
            java.lang.String r8 = "requestUrl="
            int r10 = r6.length()
            if (r10 != 0) goto L_0x0062
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
            goto L_0x0065
        L_0x0062:
            r8.concat(r6)
        L_0x0065:
            r27.e()
            if (r0 == 0) goto L_0x006f
            java.lang.String r6 = "Authorization"
            r4.addHeader(r6, r0)
        L_0x006f:
            if (r5 == 0) goto L_0x007c
            boolean r6 = r29.isEmpty()
            if (r6 != 0) goto L_0x007c
            java.lang.String r6 = "X-SERVER-TOKEN"
            r4.addHeader(r6, r5)
        L_0x007c:
            boolean r6 = r2.j
            if (r6 != 0) goto L_0x0083
            alga r6 = r9.c
            goto L_0x0085
        L_0x0083:
            alga r6 = b
        L_0x0085:
            htg r8 = r9.e
            r8.a((defpackage.avtn) r2)
            org.apache.http.client.HttpClient r10 = r9.a     // Catch:{ all -> 0x02de }
            boolean r11 = defpackage.alfz.a((org.apache.http.client.methods.HttpUriRequest) r4, (defpackage.alga) r6)     // Catch:{ all -> 0x02de }
            if (r11 == 0) goto L_0x01bc
            java.lang.String r11 = r6.a()     // Catch:{ all -> 0x02de }
            java.lang.String r13 = r6.b()     // Catch:{ all -> 0x02de }
            org.apache.http.Header[] r14 = r4.getHeaders(r1)     // Catch:{ all -> 0x02de }
            int r15 = r14.length     // Catch:{ all -> 0x02de }
            r8 = r4
            r12 = 0
            r16 = 0
        L_0x00a3:
            java.lang.String r0 = "="
            if (r12 >= r15) goto L_0x0188
            r5 = r14[r12]     // Catch:{ all -> 0x02de }
            java.lang.String r7 = r5.getValue()     // Catch:{ all -> 0x02de }
            r18 = r14
            java.util.regex.Pattern r14 = defpackage.alfz.a     // Catch:{ all -> 0x02de }
            java.util.regex.Matcher r7 = r14.matcher(r7)     // Catch:{ all -> 0x02de }
        L_0x00b5:
            boolean r14 = r7.find()     // Catch:{ all -> 0x02de }
            if (r14 != 0) goto L_0x00be
            r19 = r15
            goto L_0x0102
        L_0x00be:
            r14 = 2
            r19 = r15
            java.lang.String r15 = r7.group(r14)     // Catch:{ all -> 0x02de }
            boolean r15 = r15.equals(r11)     // Catch:{ all -> 0x02de }
            if (r15 == 0) goto L_0x0182
            if (r16 != 0) goto L_0x00d5
            boolean r7 = r8 instanceof org.apache.http.impl.client.RequestWrapper     // Catch:{ all -> 0x02de }
            if (r7 != 0) goto L_0x00d5
            org.apache.http.impl.client.RequestWrapper r8 = defpackage.alfz.a((org.apache.http.client.methods.HttpUriRequest) r8)     // Catch:{ all -> 0x02de }
        L_0x00d5:
            r8.removeHeader(r5)     // Catch:{ all -> 0x02de }
            org.apache.http.message.BasicHeader r7 = new org.apache.http.message.BasicHeader     // Catch:{ all -> 0x02de }
            java.lang.String r15 = r5.getName()     // Catch:{ all -> 0x02de }
            java.lang.String r5 = r5.getValue()     // Catch:{ all -> 0x02de }
            java.util.regex.Pattern r14 = defpackage.alfz.a     // Catch:{ all -> 0x02de }
            java.util.regex.Matcher r5 = r14.matcher(r5)     // Catch:{ all -> 0x02de }
            java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch:{ all -> 0x02de }
            r14.<init>()     // Catch:{ all -> 0x02de }
        L_0x00ed:
            boolean r16 = r5.find()     // Catch:{ all -> 0x02de }
            if (r16 != 0) goto L_0x010f
            r5.appendTail(r14)     // Catch:{ all -> 0x02de }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x02de }
            r7.<init>(r15, r0)     // Catch:{ all -> 0x02de }
            r8.addHeader(r7)     // Catch:{ all -> 0x02de }
            r16 = 1
        L_0x0102:
            int r12 = r12 + 1
            r7 = r27
            r0 = r28
            r5 = r29
            r14 = r18
            r15 = r19
            goto L_0x00a3
        L_0x010f:
            r16 = r7
            r20 = r8
            r7 = 2
            java.lang.String r8 = r5.group(r7)     // Catch:{ all -> 0x02de }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x02de }
            if (r8 == 0) goto L_0x016d
            r8 = 1
            java.lang.String r7 = r5.group(r8)     // Catch:{ all -> 0x02de }
            java.lang.String r8 = defpackage.alfz.a((java.lang.String) r13)     // Catch:{ all -> 0x02de }
            java.lang.String r21 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02de }
            int r21 = r21.length()     // Catch:{ all -> 0x02de }
            java.lang.String r22 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x02de }
            int r22 = r22.length()     // Catch:{ all -> 0x02de }
            java.lang.String r23 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x02de }
            int r23 = r23.length()     // Catch:{ all -> 0x02de }
            r24 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02de }
            r17 = 1
            int r21 = r21 + 1
            int r21 = r21 + r22
            r22 = r15
            int r15 = r21 + r23
            r12.<init>(r15)     // Catch:{ all -> 0x02de }
            r12.append(r7)     // Catch:{ all -> 0x02de }
            r12.append(r11)     // Catch:{ all -> 0x02de }
            r12.append(r0)     // Catch:{ all -> 0x02de }
            r12.append(r8)     // Catch:{ all -> 0x02de }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x02de }
            r5.appendReplacement(r14, r7)     // Catch:{ all -> 0x02de }
            r7 = r16
            r8 = r20
            r15 = r22
            r12 = r24
            goto L_0x00ed
        L_0x016d:
            r24 = r12
            r22 = r15
            java.lang.String r7 = r5.group()     // Catch:{ all -> 0x02de }
            r5.appendReplacement(r14, r7)     // Catch:{ all -> 0x02de }
            r7 = r16
            r8 = r20
            r15 = r22
            r12 = r24
            goto L_0x00ed
        L_0x0182:
            r24 = r12
            r15 = r19
            goto L_0x00b5
        L_0x0188:
            if (r16 != 0) goto L_0x01bd
            org.apache.http.message.BasicHeader r5 = new org.apache.http.message.BasicHeader     // Catch:{ all -> 0x02de }
            java.lang.String r7 = defpackage.alfz.a((java.lang.String) r13)     // Catch:{ all -> 0x02de }
            java.lang.String r12 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x02de }
            int r12 = r12.length()     // Catch:{ all -> 0x02de }
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02de }
            int r13 = r13.length()     // Catch:{ all -> 0x02de }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02de }
            r15 = 1
            int r12 = r12 + r15
            int r12 = r12 + r13
            r14.<init>(r12)     // Catch:{ all -> 0x02de }
            r14.append(r11)     // Catch:{ all -> 0x02de }
            r14.append(r0)     // Catch:{ all -> 0x02de }
            r14.append(r7)     // Catch:{ all -> 0x02de }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x02de }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x02de }
            r8.addHeader(r5)     // Catch:{ all -> 0x02de }
            goto L_0x01bd
        L_0x01bc:
            r8 = r4
        L_0x01bd:
            org.apache.http.HttpResponse r0 = r10.execute(r8)     // Catch:{ all -> 0x02de }
            boolean r1 = defpackage.alfz.a((org.apache.http.client.methods.HttpUriRequest) r4, (defpackage.alga) r6)     // Catch:{ all -> 0x02de }
            if (r1 != 0) goto L_0x01c8
            goto L_0x01f3
        L_0x01c8:
            java.lang.String r1 = r6.a()     // Catch:{ all -> 0x02de }
            java.lang.String r5 = "Set-Cookie"
            org.apache.http.Header[] r5 = r0.getHeaders(r5)     // Catch:{ all -> 0x02de }
            int r7 = r5.length     // Catch:{ all -> 0x02de }
            r8 = 0
        L_0x01d4:
            if (r8 < r7) goto L_0x02ca
            java.lang.String r5 = "Set-Cookie2"
            org.apache.http.Header[] r5 = r0.getHeaders(r5)     // Catch:{ all -> 0x02de }
            int r7 = r5.length     // Catch:{ all -> 0x02de }
            r12 = 0
        L_0x01de:
            if (r12 >= r7) goto L_0x01f3
            r8 = r5[r12]     // Catch:{ all -> 0x02de }
            java.lang.String r8 = r8.getValue()     // Catch:{ all -> 0x02de }
            java.lang.String r8 = defpackage.alfz.a((java.lang.String) r8, (java.lang.String) r1)     // Catch:{ all -> 0x02de }
            if (r8 != 0) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r6.a(r8)     // Catch:{ all -> 0x02de }
        L_0x01f0:
            int r12 = r12 + 1
            goto L_0x01de
        L_0x01f3:
            htg r1 = r9.e
            a((defpackage.htg) r1, (defpackage.avtn) r2, (org.apache.http.client.methods.HttpPost) r4, (org.apache.http.HttpResponse) r0)
            org.apache.http.StatusLine r1 = r0.getStatusLine()
            int r4 = r1.getStatusCode()
            r5 = 200(0xc8, float:2.8E-43)
            r6 = 300(0x12c, float:4.2E-43)
            java.lang.String r7 = "ApacheHttpTransport"
            if (r4 < r5) goto L_0x0259
            if (r4 >= r6) goto L_0x0259
            org.apache.http.HttpEntity r0 = r0.getEntity()     // Catch:{ IOException -> 0x0230, all -> 0x022c }
            java.io.InputStream r2 = r0.getContent()     // Catch:{ IOException -> 0x0230, all -> 0x022c }
            byte[] r8 = defpackage.anmr.a((java.io.InputStream) r2)     // Catch:{ IOException -> 0x022a, all -> 0x0226 }
            if (r2 != 0) goto L_0x021a
            goto L_0x02c0
        L_0x021a:
            r2.close()     // Catch:{ IOException -> 0x021f }
            goto L_0x02c0
        L_0x021f:
            r0 = move-exception
            r2 = r0
            android.util.Log.e(r7, r3, r2)
            goto L_0x02c0
        L_0x0226:
            r0 = move-exception
            r1 = r0
            r8 = r2
            goto L_0x024d
        L_0x022a:
            r0 = move-exception
            goto L_0x0232
        L_0x022c:
            r0 = move-exception
            r1 = r0
            r8 = 0
            goto L_0x024d
        L_0x0230:
            r0 = move-exception
            r2 = 0
        L_0x0232:
            java.lang.String r5 = "Error reading the content of the response body. "
            android.util.Log.e(r7, r5, r0)     // Catch:{ all -> 0x024a }
            if (r2 == 0) goto L_0x0247
            r2.close()     // Catch:{ IOException -> 0x023f }
            r8 = 0
            goto L_0x02c0
        L_0x023f:
            r0 = move-exception
            r2 = r0
            android.util.Log.e(r7, r3, r2)
            r8 = 0
            goto L_0x02c0
        L_0x0247:
            r8 = 0
            goto L_0x02c0
        L_0x024a:
            r0 = move-exception
            r1 = r0
            r8 = r2
        L_0x024d:
            if (r8 == 0) goto L_0x0258
            r8.close()     // Catch:{ IOException -> 0x0253 }
            goto L_0x0258
        L_0x0253:
            r0 = move-exception
            r2 = r0
            android.util.Log.e(r7, r3, r2)
        L_0x0258:
            throw r1
        L_0x0259:
            if (r4 < r6) goto L_0x02bf
            r3 = 400(0x190, float:5.6E-43)
            if (r4 >= r3) goto L_0x02bf
            r5 = 0
            int r3 = (r31 > r5 ? 1 : (r31 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0282
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 71
            r0.<init>(r2)
            java.lang.String r2 = "Server returned "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "... redirect, but no more redirects allowed."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
            r8 = 0
            goto L_0x02c0
        L_0x0282:
            java.lang.String r3 = "Location"
            org.apache.http.Header r0 = r0.getFirstHeader(r3)
            if (r0 != 0) goto L_0x02a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 50
            r0.<init>(r2)
            java.lang.String r2 = "Status "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "... redirect: no location header"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
            r8 = 0
            goto L_0x02c0
        L_0x02a8:
            java.lang.String r6 = r0.getValue()
            r0 = -1
            long r7 = r31 + r0
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            hwd r0 = r1.a(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x02bf:
            r8 = 0
        L_0x02c0:
            hwd r0 = new hwd
            java.lang.String r1 = r1.getReasonPhrase()
            r0.<init>(r8, r4, r1)
            return r0
        L_0x02ca:
            r10 = r5[r8]     // Catch:{ all -> 0x02de }
            java.lang.String r10 = r10.getValue()     // Catch:{ all -> 0x02de }
            java.lang.String r10 = defpackage.alfz.a((java.lang.String) r10, (java.lang.String) r1)     // Catch:{ all -> 0x02de }
            if (r10 != 0) goto L_0x02d7
            goto L_0x02da
        L_0x02d7:
            r6.a(r10)     // Catch:{ all -> 0x02de }
        L_0x02da:
            int r8 = r8 + 1
            goto L_0x01d4
        L_0x02de:
            r0 = move-exception
            htg r1 = r9.e
            r3 = 0
            a((defpackage.htg) r1, (defpackage.avtn) r2, (org.apache.http.client.methods.HttpPost) r4, (org.apache.http.HttpResponse) r3)
            goto L_0x02e7
        L_0x02e6:
            throw r0
        L_0x02e7:
            goto L_0x02e6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwb.a(avtn, hwc, java.lang.String, java.lang.String, java.lang.String, long):hwd");
    }

    private static final void a(htg htg, avtn avtn, HttpPost httpPost, HttpResponse httpResponse) {
        htg.a(avtn, httpPost.getEntity().a);
        int i = 0;
        for (Header header : httpPost.getAllHeaders()) {
            i = i + header.getName().length() + header.getValue().length() + 3;
        }
        htg.b(avtn, (long) i);
        if (httpResponse != null) {
            htg.a(httpResponse.getStatusLine().getStatusCode());
        }
    }

    public final hwd a(avtn avtn, hwc hwc, String str, String str2) {
        return a(avtn, hwc, str, str2, this.f, awtr.a.a().n());
    }
}
