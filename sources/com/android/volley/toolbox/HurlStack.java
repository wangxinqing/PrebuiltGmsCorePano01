package com.android.volley.toolbox;

import com.android.volley.Header;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HurlStack extends BaseHttpStack {
    private final UrlRewriter a;
    private final SSLSocketFactory b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface UrlRewriter {
        String rewriteUrl(String str);
    }

    public HurlStack() {
        this((UrlRewriter) null);
    }

    static List a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String header : (List) entry.getValue()) {
                    arrayList.add(new Header((String) entry.getKey(), header));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection createConnection(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request r7, java.util.Map r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getUrl()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r8)
            java.util.Map r8 = r7.getHeaders()
            r1.putAll(r8)
            com.android.volley.toolbox.HurlStack$UrlRewriter r8 = r6.a
            if (r8 == 0) goto L_0x003b
            java.lang.String r8 = r8.rewriteUrl(r0)
            if (r8 == 0) goto L_0x001f
            r0 = r8
            goto L_0x003c
        L_0x001f:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "URL blocked by rewriter: "
            int r1 = r8.length()
            if (r1 != 0) goto L_0x0033
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            goto L_0x0037
        L_0x0033:
            java.lang.String r8 = r0.concat(r8)
        L_0x0037:
            r7.<init>(r8)
            throw r7
        L_0x003b:
        L_0x003c:
            java.net.URL r8 = new java.net.URL
            r8.<init>(r0)
            java.net.HttpURLConnection r0 = r6.createConnection(r8)
            int r2 = r7.getTimeoutMs()
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            r2 = 0
            r0.setUseCaches(r2)
            r3 = 1
            r0.setDoInput(r3)
            java.lang.String r8 = r8.getProtocol()
            java.lang.String r4 = "https"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x0064
            goto L_0x006e
        L_0x0064:
            javax.net.ssl.SSLSocketFactory r8 = r6.b
            if (r8 == 0) goto L_0x006e
            r4 = r0
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            r4.setSSLSocketFactory(r8)
        L_0x006e:
            java.util.Set r8 = r1.keySet()     // Catch:{ all -> 0x0135 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0135 }
        L_0x0076:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x0135 }
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0135 }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0135 }
            r0.setRequestProperty(r4, r5)     // Catch:{ all -> 0x0135 }
            goto L_0x0076
        L_0x008c:
            int r8 = r7.getMethod()     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = "POST"
            switch(r8) {
                case -1: goto L_0x00d1;
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a8;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0099;
                default: goto L_0x0095;
            }
        L_0x0095:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0135 }
            goto L_0x012f
        L_0x0099:
            java.lang.String r8 = "PATCH"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x0135 }
            a(r0, r7)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00a2:
            java.lang.String r8 = "TRACE"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00a8:
            java.lang.String r8 = "OPTIONS"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00ae:
            java.lang.String r8 = "HEAD"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00b4:
            java.lang.String r8 = "DELETE"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00ba:
            java.lang.String r8 = "PUT"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x0135 }
            a(r0, r7)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00c3:
            r0.setRequestMethod(r1)     // Catch:{ all -> 0x0135 }
            a(r0, r7)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00cb:
            java.lang.String r8 = "GET"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x0135 }
            goto L_0x00dd
        L_0x00d1:
            byte[] r8 = r7.getPostBody()     // Catch:{ all -> 0x0135 }
            if (r8 == 0) goto L_0x00dd
            r0.setRequestMethod(r1)     // Catch:{ all -> 0x0135 }
            a(r0, r7, r8)     // Catch:{ all -> 0x0135 }
        L_0x00dd:
            int r8 = r0.getResponseCode()     // Catch:{ all -> 0x0135 }
            r1 = -1
            if (r8 == r1) goto L_0x0127
            int r7 = r7.getMethod()     // Catch:{ all -> 0x0135 }
            r1 = 4
            if (r7 != r1) goto L_0x00ec
            goto L_0x0116
        L_0x00ec:
            r7 = 100
            if (r8 < r7) goto L_0x00f4
            r7 = 200(0xc8, float:2.8E-43)
            if (r8 < r7) goto L_0x0116
        L_0x00f4:
            r7 = 204(0xcc, float:2.86E-43)
            if (r8 == r7) goto L_0x0116
            r7 = 304(0x130, float:4.26E-43)
            if (r8 == r7) goto L_0x0116
            com.android.volley.toolbox.HttpResponse r7 = new com.android.volley.toolbox.HttpResponse     // Catch:{ all -> 0x0113 }
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ all -> 0x0113 }
            java.util.List r1 = a(r1)     // Catch:{ all -> 0x0113 }
            int r2 = r0.getContentLength()     // Catch:{ all -> 0x0113 }
            bfg r4 = new bfg     // Catch:{ all -> 0x0113 }
            r4.<init>(r0)     // Catch:{ all -> 0x0113 }
            r7.<init>(r8, r1, r2, r4)     // Catch:{ all -> 0x0113 }
            return r7
        L_0x0113:
            r7 = move-exception
            r2 = 1
            goto L_0x0136
        L_0x0116:
            com.android.volley.toolbox.HttpResponse r7 = new com.android.volley.toolbox.HttpResponse     // Catch:{ all -> 0x0135 }
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ all -> 0x0135 }
            java.util.List r1 = a(r1)     // Catch:{ all -> 0x0135 }
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0135 }
            r0.disconnect()
            return r7
        L_0x0127:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)     // Catch:{ all -> 0x0135 }
            throw r7     // Catch:{ all -> 0x0135 }
        L_0x012f:
            java.lang.String r8 = "Unknown method type."
            r7.<init>(r8)     // Catch:{ all -> 0x0135 }
            throw r7     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r7 = move-exception
        L_0x0136:
            if (r2 != 0) goto L_0x013b
            r0.disconnect()
        L_0x013b:
            goto L_0x013d
        L_0x013c:
            throw r7
        L_0x013d:
            goto L_0x013c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.HurlStack.executeRequest(com.android.volley.Request, java.util.Map):com.android.volley.toolbox.HttpResponse");
    }

    public HurlStack(UrlRewriter urlRewriter) {
        this(urlRewriter, (SSLSocketFactory) null);
    }

    public HurlStack(UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        this.a = urlRewriter;
        this.b = sSLSocketFactory;
    }

    private static void a(HttpURLConnection httpURLConnection, Request request) {
        byte[] body = request.getBody();
        if (body != null) {
            a(httpURLConnection, request, body);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Request request, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
