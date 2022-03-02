package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: opc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opc implements HttpClient {
    private static final HttpVersion c = new HttpVersion(1, 1);
    public ope a;
    public HttpParams b;
    private String d;

    public opc(Context context, String str, boolean z) {
        this(context, str, z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r2.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.InputStream a(org.apache.http.HttpEntity r2) {
        /*
            java.io.InputStream r0 = r2.getContent()
            if (r0 == 0) goto L_0x0021
            org.apache.http.Header r2 = r2.getContentEncoding()
            if (r2 == 0) goto L_0x0020
            java.lang.String r2 = r2.getValue()
            if (r2 == 0) goto L_0x0020
            java.lang.String r1 = "gzip"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x0020
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream
            r2.<init>(r0)
            return r2
        L_0x0020:
            return r0
        L_0x0021:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opc.a(org.apache.http.HttpEntity):java.io.InputStream");
    }

    public final SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory = ((opl) this.a).e;
        return sSLSocketFactory == null ? HttpsURLConnection.getDefaultSSLSocketFactory() : sSLSocketFactory;
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        throw new UnsupportedOperationException();
    }

    public final ClientConnectionManager getConnectionManager() {
        throw new UnsupportedOperationException();
    }

    public final HttpParams getParams() {
        return this.b;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [org.apache.http.params.HttpParams, opi] */
    public opc(Context context, String str, boolean z, opd opd) {
        this(str, true);
        this.b = new opi(this);
        this.a = new opl(context, z, opd);
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        return execute(httpUriRequest, responseHandler, (HttpContext) null);
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [org.apache.http.params.HttpParams, opi] */
    public opc(Context context, String str, boolean z, boolean z2) {
        this(str, z);
        this.b = new opi(this);
        this.a = new opl(context, z2);
    }

    static /* synthetic */ HttpURLConnection a(opc opc, URL url) {
        HttpURLConnection a2 = ((opl) opc.a).a(url, (Network) null);
        a2.setInstanceFollowRedirects(false);
        return a2;
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    public opc(String str, boolean z) {
        String str2 = Build.DEVICE;
        String str3 = Build.ID;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sb.append(")");
        String sb2 = sb.toString();
        this.d = z ? String.valueOf(sb2).concat("; gzip") : sb2;
    }

    public static void a(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return a(httpUriRequest, (opb) new oph(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.apache.http.HttpResponse a(org.apache.http.client.methods.HttpUriRequest r13, defpackage.opb r14) {
        /*
            r12 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x0019
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "This thread forbids HTTP requests"
            r13.<init>(r14)
            throw r13
        L_0x0019:
            boolean r0 = r13 instanceof org.apache.http.HttpEntityEnclosingRequest
            r1 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            r5 = r13
            org.apache.http.HttpEntityEnclosingRequest r5 = (org.apache.http.HttpEntityEnclosingRequest) r5
            org.apache.http.HttpEntity r5 = r5.getEntity()
            if (r5 == 0) goto L_0x0037
            boolean r6 = r5.isChunked()
            if (r6 != 0) goto L_0x0035
            long r5 = r5.getContentLength()
            goto L_0x003a
        L_0x0035:
            r5 = r1
            goto L_0x003a
        L_0x0037:
            r5 = r3
            goto L_0x003a
        L_0x0039:
            r5 = r1
        L_0x003a:
            java.lang.String r7 = "content-length"
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0041
            goto L_0x0049
        L_0x0041:
            java.lang.String r5 = java.lang.Long.toString(r5)
            r13.addHeader(r7, r5)
        L_0x0049:
            java.net.URI r5 = r13.getURI()
            java.net.URL r5 = r5.toURL()
            java.net.HttpURLConnection r14 = r14.a(r5)
            java.lang.String r5 = r13.getMethod()
            r14.setRequestMethod(r5)
            org.apache.http.Header[] r5 = r13.getAllHeaders()
            int r6 = r5.length
            r8 = 0
        L_0x0062:
            if (r8 >= r6) goto L_0x0074
            r9 = r5[r8]
            java.lang.String r10 = r9.getName()
            java.lang.String r9 = r9.getValue()
            r14.addRequestProperty(r10, r9)
            int r8 = r8 + 1
            goto L_0x0062
        L_0x0074:
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = r14.getRequestProperty(r5)
            if (r6 != 0) goto L_0x0082
            java.lang.String r6 = r12.d
            r14.setRequestProperty(r5, r6)
        L_0x0082:
            java.lang.String r5 = "content-encoding"
            java.lang.String r6 = "content-type"
            if (r0 == 0) goto L_0x00f6
            org.apache.http.HttpEntityEnclosingRequest r13 = (org.apache.http.HttpEntityEnclosingRequest) r13
            org.apache.http.HttpEntity r0 = r13.getEntity()
            if (r0 != 0) goto L_0x0091
            goto L_0x00f6
        L_0x0091:
            org.apache.http.HttpEntity r13 = r13.getEntity()
            r0 = 1
            r14.setDoOutput(r0)
            boolean r0 = r13.isChunked()
            r8 = 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00a5
            r14.setChunkedStreamingMode(r8)
            goto L_0x00b8
        L_0x00a5:
            long r9 = r13.getContentLength()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
            long r9 = r13.getContentLength()
            java.lang.String r0 = java.lang.Long.toString(r9)
            r14.setRequestProperty(r7, r0)
        L_0x00b8:
            boolean r0 = r13.isStreaming()
            if (r0 == 0) goto L_0x00d4
            long r9 = r13.getContentLength()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d0
            int r0 = android.os.Build.VERSION.SDK_INT
            long r3 = r13.getContentLength()
            r14.setFixedLengthStreamingMode(r3)
            goto L_0x00d4
        L_0x00d0:
            r14.setChunkedStreamingMode(r8)
        L_0x00d4:
            org.apache.http.Header r0 = r13.getContentType()
            org.apache.http.Header r3 = r13.getContentEncoding()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r0.getValue()
            r14.setRequestProperty(r6, r0)
        L_0x00e5:
            if (r3 == 0) goto L_0x00ee
            java.lang.String r0 = r3.getValue()
            r14.setRequestProperty(r5, r0)
        L_0x00ee:
            java.io.OutputStream r0 = r14.getOutputStream()
            r13.writeTo(r0)
            goto L_0x00f9
        L_0x00f6:
            r14.connect()
        L_0x00f9:
            int r13 = r14.getResponseCode()
            if (r13 < 0) goto L_0x018d
            ope r0 = r12.a
            java.net.URL r3 = r14.getURL()
            java.lang.String r3 = r3.toString()
            opk r0 = r0.a
            r0.a(r3, r13)
            org.apache.http.message.BasicHttpResponse r0 = new org.apache.http.message.BasicHttpResponse
            org.apache.http.HttpVersion r3 = c
            java.lang.String r4 = r14.getResponseMessage()
            r0.<init>(r3, r13, r4)
            java.util.Map r3 = r14.getHeaderFields()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r7 = r4
        L_0x0127:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x016b
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x016a
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0145:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x016a
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = r9.equalsIgnoreCase(r6)
            if (r11 != 0) goto L_0x0160
            boolean r11 = r9.equalsIgnoreCase(r5)
            if (r11 == 0) goto L_0x015f
            r4 = r10
            goto L_0x0161
        L_0x015f:
            goto L_0x0161
        L_0x0160:
            r7 = r10
        L_0x0161:
            org.apache.http.message.BasicHeader r11 = new org.apache.http.message.BasicHeader
            r11.<init>(r9, r10)
            r0.addHeader(r11)
            goto L_0x0145
        L_0x016a:
            goto L_0x0127
        L_0x016b:
            r3 = 400(0x190, float:5.6E-43)
            if (r13 >= r3) goto L_0x0174
            java.io.InputStream r13 = r14.getInputStream()
            goto L_0x0178
        L_0x0174:
            java.io.InputStream r13 = r14.getErrorStream()
        L_0x0178:
            if (r13 == 0) goto L_0x018c
            org.apache.http.entity.InputStreamEntity r14 = new org.apache.http.entity.InputStreamEntity
            r14.<init>(r13, r1)
            if (r7 == 0) goto L_0x0184
            r14.setContentType(r7)
        L_0x0184:
            if (r4 == 0) goto L_0x0189
            r14.setContentEncoding(r4)
        L_0x0189:
            r0.setEntity(r14)
        L_0x018c:
            return r0
        L_0x018d:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Cannot retrieve a valid HTTP status code from server response"
            r13.<init>(r14)
            goto L_0x0196
        L_0x0195:
            throw r13
        L_0x0196:
            goto L_0x0195
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opc.a(org.apache.http.client.methods.HttpUriRequest, opb):org.apache.http.HttpResponse");
    }

    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
    }
}
