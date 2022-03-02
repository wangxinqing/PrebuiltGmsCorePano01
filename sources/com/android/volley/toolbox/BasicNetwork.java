package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.google.android.chimera.FragmentTransaction;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BasicNetwork implements Network {
    protected static final boolean DEBUG = VolleyLog.DEBUG;
    private final BaseHttpStack a;
    @Deprecated
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(FragmentTransaction.TRANSIT_ENTER_MASK));
    }

    private static void a(String str, Request request, VolleyError volleyError) {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(volleyError);
            request.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
            throw e;
        }
    }

    @Deprecated
    protected static Map convertHeaders(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    /* access modifiers changed from: protected */
    public void logError(String str, String str2, long j) {
        VolleyLog.v("HTTP ERROR(%s) %d ms to fetch %s", str, Long.valueOf(SystemClock.elapsedRealtime() - j), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e4, code lost:
        r17 = r6;
        r9 = r11;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ea, code lost:
        r17 = r6;
        r9 = null;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f0, code lost:
        r0 = r9.getStatusCode();
        com.android.volley.VolleyLog.e("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0208, code lost:
        if (r13 != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020a, code lost:
        r11 = new com.android.volley.NetworkResponse(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r4, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021a, code lost:
        if (r0 != 401) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0223, code lost:
        if (r0 < 400) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022f, code lost:
        throw new com.android.volley.ClientError(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0232, code lost:
        if (r0 < 500) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023c, code lost:
        if (r22.shouldRetryServerErrors() != false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023e, code lost:
        a("server", r2, new com.android.volley.ServerError(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x024f, code lost:
        throw new com.android.volley.ServerError(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0256, code lost:
        a("auth", r2, new com.android.volley.AuthFailureError(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0262, code lost:
        a("network", r2, new com.android.volley.NetworkError());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0273, code lost:
        throw new com.android.volley.NoConnectionError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0274, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0275, code lost:
        r2 = java.lang.String.valueOf(r22.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0285, code lost:
        if (r2.length() == 0) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0287, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x028d, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0294, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0296, code lost:
        a("socket", r2, new com.android.volley.TimeoutError());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0274 A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0295 A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:2:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x026e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb A[Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010c A[Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.NetworkResponse performRequest(com.android.volley.Request r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "Error occurred when closing InputStream"
            long r4 = android.os.SystemClock.elapsedRealtime()
        L_0x000a:
            java.util.List r6 = java.util.Collections.emptyList()
            r7 = 1
            r8 = 2
            r10 = 0
            com.android.volley.Cache$Entry r0 = r22.getCacheEntry()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            if (r0 == 0) goto L_0x0041
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            r11.<init>()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            java.lang.String r12 = r0.etag     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            if (r12 == 0) goto L_0x0025
            java.lang.String r13 = "If-None-Match"
            r11.put(r13, r12)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
        L_0x0025:
            long r12 = r0.lastModified     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            java.lang.String r0 = "If-Modified-Since"
            java.text.SimpleDateFormat r14 = com.android.volley.toolbox.HttpHeaderParser.a()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            java.util.Date r15 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            r15.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            java.lang.String r12 = r14.format(r15)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            r11.put(r0, r12)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            goto L_0x0045
        L_0x0040:
            goto L_0x0045
        L_0x0041:
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
        L_0x0045:
            com.android.volley.toolbox.BaseHttpStack r0 = r1.a     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            com.android.volley.toolbox.HttpResponse r11 = r0.executeRequest(r2, r11)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e9 }
            int r13 = r11.getStatusCode()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.util.List r6 = r11.getHeaders()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r0 = 304(0x130, float:4.26E-43)
            if (r13 == r0) goto L_0x0119
            java.io.InputStream r12 = r11.getContent()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r12 == 0) goto L_0x00ac
            int r0 = r11.getContentLength()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            com.android.volley.toolbox.PoolingByteArrayOutputStream r14 = new com.android.volley.toolbox.PoolingByteArrayOutputStream     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            com.android.volley.toolbox.ByteArrayPool r15 = r1.mPool     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r14.<init>(r15, r0)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            com.android.volley.toolbox.ByteArrayPool r0 = r1.mPool     // Catch:{ all -> 0x0096 }
            r15 = 1024(0x400, float:1.435E-42)
            byte[] r15 = r0.getBuf(r15)     // Catch:{ all -> 0x0096 }
        L_0x0070:
            int r0 = r12.read(r15)     // Catch:{ all -> 0x0093 }
            r9 = -1
            if (r0 != r9) goto L_0x008e
            byte[] r9 = r14.toByteArray()     // Catch:{ all -> 0x0093 }
            r12.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0085
        L_0x007f:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            com.android.volley.VolleyLog.v(r3, r0)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
        L_0x0085:
            com.android.volley.toolbox.ByteArrayPool r0 = r1.mPool     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r0.returnBuf(r15)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r14.close()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            goto L_0x00b0
        L_0x008e:
            r14.write(r15, r10, r0)     // Catch:{ all -> 0x0093 }
            goto L_0x0070
        L_0x0093:
            r0 = move-exception
            r9 = r0
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            r9 = r0
            r15 = 0
        L_0x0099:
            r12.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a3
        L_0x009d:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            com.android.volley.VolleyLog.v(r3, r0)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
        L_0x00a3:
            com.android.volley.toolbox.ByteArrayPool r0 = r1.mPool     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r0.returnBuf(r15)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r14.close()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            throw r9     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
        L_0x00ac:
            byte[] r0 = new byte[r10]     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r9 = r0
        L_0x00b0:
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            long r14 = r14 - r4
            boolean r0 = DEBUG     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            if (r0 == 0) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            r16 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
            goto L_0x00f3
        L_0x00c1:
            java.lang.String r0 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r12[r10] = r2     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r12[r7] = r14     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            if (r9 == 0) goto L_0x00d6
            int r14 = r9.length     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r14 = "null"
        L_0x00d8:
            r12[r8] = r14     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r14 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r12[r14] = r15     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r14 = 4
            com.android.volley.RetryPolicy r15 = r22.getRetryPolicy()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            int r15 = r15.getCurrentRetryCount()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r12[r14] = r15     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            com.android.volley.VolleyLog.d(r0, r12)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
        L_0x00f3:
            r0 = 200(0xc8, float:2.8E-43)
            if (r13 < r0) goto L_0x010c
            r0 = 299(0x12b, float:4.19E-43)
            if (r13 > r0) goto L_0x010c
            com.android.volley.NetworkResponse r0 = new com.android.volley.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r15 = 0
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            long r16 = r16 - r4
            r12 = r0
            r14 = r9
            r18 = r6
            r12.<init>((int) r13, (byte[]) r14, (boolean) r15, (long) r16, (java.util.List) r18)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            return r0
        L_0x010c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            r17 = r6
            r13 = r9
            r9 = r11
            goto L_0x01ee
        L_0x0119:
            com.android.volley.Cache$Entry r0 = r22.getCacheEntry()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r0 == 0) goto L_0x01ce
            java.util.TreeSet r9 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r9.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            boolean r12 = r6.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r12 == 0) goto L_0x012d
            goto L_0x0145
        L_0x012d:
            java.util.Iterator r12 = r6.iterator()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
        L_0x0131:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r13 == 0) goto L_0x0145
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            com.android.volley.Header r13 = (com.android.volley.Header) r13     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.lang.String r13 = r13.getName()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r9.add(r13)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            goto L_0x0131
        L_0x0145:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r12.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.util.List r13 = r0.allResponseHeaders     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r13 != 0) goto L_0x0191
            java.util.Map r13 = r0.responseHeaders     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r13 == 0) goto L_0x0157
            goto L_0x01b7
        L_0x0157:
            java.util.Map r13 = r0.responseHeaders     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
        L_0x0161:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r14 == 0) goto L_0x01b7
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            boolean r15 = r9.contains(r15)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r15 != 0) goto L_0x018f
            com.android.volley.Header r15 = new com.android.volley.Header     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r7 = r16
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r15.<init>(r7, r14)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r7 = 1
            goto L_0x0161
        L_0x018f:
            r7 = 1
            goto L_0x0161
        L_0x0191:
            boolean r7 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r7 != 0) goto L_0x01b7
            java.util.List r7 = r0.allResponseHeaders     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
        L_0x019d:
            boolean r13 = r7.hasNext()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r13 == 0) goto L_0x01b7
            java.lang.Object r13 = r7.next()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            com.android.volley.Header r13 = (com.android.volley.Header) r13     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            java.lang.String r14 = r13.getName()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            boolean r14 = r9.contains(r14)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            if (r14 != 0) goto L_0x019d
            r12.add(r13)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            goto L_0x019d
        L_0x01b7:
            com.android.volley.NetworkResponse r7 = new com.android.volley.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.data     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            long r18 = r13 - r4
            r14 = r7
            r16 = r0
            r20 = r12
            r14.<init>((int) r15, (byte[]) r16, (boolean) r17, (long) r18, (java.util.List) r20)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            return r7
        L_0x01ce:
            com.android.volley.NetworkResponse r0 = new com.android.volley.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            r15 = 304(0x130, float:4.26E-43)
            r16 = 0
            r17 = 1
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            long r18 = r12 - r4
            r14 = r0
            r20 = r6
            r14.<init>((int) r15, (byte[]) r16, (boolean) r17, (long) r18, (java.util.List) r20)     // Catch:{ SocketTimeoutException -> 0x0295, MalformedURLException -> 0x0274, IOException -> 0x01e3 }
            return r0
        L_0x01e3:
            r0 = move-exception
            r17 = r6
            r9 = r11
            r13 = 0
            goto L_0x01ee
        L_0x01e9:
            r0 = move-exception
            r17 = r6
            r9 = 0
            r13 = 0
        L_0x01ee:
            if (r9 == 0) goto L_0x026e
            int r0 = r9.getStatusCode()
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r6[r10] = r7
            java.lang.String r7 = r22.getUrl()
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Unexpected response code %d for %s"
            com.android.volley.VolleyLog.e(r7, r6)
            if (r13 == 0) goto L_0x0262
            com.android.volley.NetworkResponse r6 = new com.android.volley.NetworkResponse
            r14 = 0
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r15 = r7 - r4
            r11 = r6
            r12 = r0
            r11.<init>((int) r12, (byte[]) r13, (boolean) r14, (long) r15, (java.util.List) r17)
            r7 = 401(0x191, float:5.62E-43)
            if (r0 != r7) goto L_0x021d
            goto L_0x0256
        L_0x021d:
            r7 = 403(0x193, float:5.65E-43)
            if (r0 == r7) goto L_0x0256
            r7 = 400(0x190, float:5.6E-43)
            if (r0 < r7) goto L_0x0230
            r7 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r7) goto L_0x022a
            goto L_0x0230
        L_0x022a:
            com.android.volley.ClientError r0 = new com.android.volley.ClientError
            r0.<init>(r6)
            throw r0
        L_0x0230:
            r7 = 500(0x1f4, float:7.0E-43)
            if (r0 < r7) goto L_0x0250
            r7 = 599(0x257, float:8.4E-43)
            if (r0 > r7) goto L_0x0250
            boolean r0 = r22.shouldRetryServerErrors()
            if (r0 == 0) goto L_0x024a
            com.android.volley.ServerError r0 = new com.android.volley.ServerError
            r0.<init>(r6)
            java.lang.String r6 = "server"
            a(r6, r2, r0)
            goto L_0x000a
        L_0x024a:
            com.android.volley.ServerError r0 = new com.android.volley.ServerError
            r0.<init>(r6)
            throw r0
        L_0x0250:
            com.android.volley.ServerError r0 = new com.android.volley.ServerError
            r0.<init>(r6)
            throw r0
        L_0x0256:
            com.android.volley.AuthFailureError r0 = new com.android.volley.AuthFailureError
            r0.<init>((com.android.volley.NetworkResponse) r6)
            java.lang.String r6 = "auth"
            a(r6, r2, r0)
            goto L_0x000a
        L_0x0262:
            com.android.volley.NetworkError r0 = new com.android.volley.NetworkError
            r0.<init>()
            java.lang.String r6 = "network"
            a(r6, r2, r0)
            goto L_0x000a
        L_0x026e:
            com.android.volley.NoConnectionError r2 = new com.android.volley.NoConnectionError
            r2.<init>(r0)
            throw r2
        L_0x0274:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r2 = r22.getUrl()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Bad URL "
            int r5 = r2.length()
            if (r5 != 0) goto L_0x028d
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x0291
        L_0x028d:
            java.lang.String r2 = r4.concat(r2)
        L_0x0291:
            r3.<init>(r2, r0)
            throw r3
        L_0x0295:
            r0 = move-exception
            com.android.volley.TimeoutError r0 = new com.android.volley.TimeoutError
            r0.<init>()
            java.lang.String r6 = "socket"
            a(r6, r2, r0)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.BasicNetwork.performRequest(com.android.volley.Request):com.android.volley.NetworkResponse");
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.a = baseHttpStack;
        this.mHttpStack = baseHttpStack;
        this.mPool = byteArrayPool;
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(FragmentTransaction.TRANSIT_ENTER_MASK));
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack, ByteArrayPool byteArrayPool) {
        this.mHttpStack = httpStack;
        this.a = new bfb(httpStack);
        this.mPool = byteArrayPool;
    }
}
