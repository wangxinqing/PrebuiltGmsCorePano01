package com.google.android.gms.maps.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HttpProxyChimeraService extends Service {
    private static final String a = HttpProxyChimeraService.class.getSimpleName();
    private static final String[] b = {"https://clients4.google.com/glm/mmap", "https://www.google.com/maps", "https://csi.gstatic.com/csi"};
    private final rws c;

    public HttpProxyChimeraService() {
        this(rwr.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.io.Serializable} */
    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r16v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r16v3 */
    /* JADX WARNING: type inference failed for: r16v4, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r16v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r16v7 */
    /* JADX WARNING: type inference failed for: r16v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02dd, code lost:
        if (r14 != null) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02df, code lost:
        r14.disconnect();
        defpackage.atfx.a(a, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e8, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        if (r14 == null) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0233, code lost:
        if (r14 != null) goto L_0x02df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b2 A[SYNTHETIC, Splitter:B:104:0x02b2] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02f1 A[SYNTHETIC, Splitter:B:116:0x02f1] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x031e A[SYNTHETIC, Splitter:B:123:0x031e] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc A[SYNTHETIC, Splitter:B:29:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0103 A[Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0117 A[SYNTHETIC, Splitter:B:38:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0144 A[SYNTHETIC, Splitter:B:45:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a0 A[Catch:{ all -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1 A[Catch:{ all -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01db A[SYNTHETIC, Splitter:B:75:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0208 A[SYNTHETIC, Splitter:B:82:0x0208] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0243 A[Catch:{ all -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0285 A[SYNTHETIC, Splitter:B:97:0x0285] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:68:0x0197=Splitter:B:68:0x0197, B:91:0x023a=Splitter:B:91:0x023a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(android.os.Bundle r20) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r0 = "POST"
            java.lang.String r2 = "Internal Server Error"
            java.lang.String r3 = "Bad request"
            java.lang.String r4 = "Exception while closing output stream: "
            java.lang.String r5 = "Exception while closing input stream: "
            java.lang.String r6 = ": "
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            org.apache.http.ProtocolVersion r8 = new org.apache.http.ProtocolVersion
            java.lang.String r9 = "HTTP"
            r10 = 1
            r8.<init>(r9, r10, r10)
            java.lang.String r9 = "RESPONSE_PROTOCOL_VERSION"
            r7.putSerializable(r9, r8)
            java.util.Locale r8 = new java.util.Locale
            java.lang.String r9 = "en"
            r8.<init>(r9)
            java.lang.String r9 = "RESPONSE_LOCALE"
            r7.putSerializable(r9, r8)
            java.lang.String r8 = "REQUEST_URL"
            java.lang.String r8 = r1.getString(r8)
            java.lang.String r11 = "RESPONSE_STATUS_REASON"
            java.lang.String r12 = "RESPONSE_STATUS_CODE"
            if (r8 == 0) goto L_0x03db
            java.lang.String[] r13 = b
            int r14 = r13.length
            r9 = 0
        L_0x003c:
            if (r9 >= r14) goto L_0x03db
            r15 = r13[r9]
            boolean r15 = r8.startsWith(r15)
            if (r15 != 0) goto L_0x0049
            int r9 = r9 + 1
            goto L_0x003c
        L_0x0049:
            java.net.URL r14 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0398, IOException -> 0x0355 }
            r14.<init>(r8)     // Catch:{ MalformedURLException -> 0x0398, IOException -> 0x0355 }
            java.net.URLConnection r14 = r14.openConnection()     // Catch:{ MalformedURLException -> 0x0398, IOException -> 0x0355 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ MalformedURLException -> 0x0398, IOException -> 0x0355 }
            r16 = 0
            java.lang.String r13 = "REQUEST_HEADERS"
            java.io.Serializable r13 = r1.getSerializable(r13)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.util.HashMap r13 = (java.util.HashMap) r13     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            if (r13 == 0) goto L_0x0088
            java.util.Set r13 = r13.entrySet()     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
        L_0x0068:
            boolean r17 = r13.hasNext()     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            if (r17 == 0) goto L_0x0088
            java.lang.Object r17 = r13.next()     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.lang.Object r18 = r17.getKey()     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            r9 = r18
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.lang.Object r17 = r17.getValue()     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            r15 = r17
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            r14.addRequestProperty(r9, r15)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            goto L_0x0068
        L_0x0088:
            java.lang.String r9 = "REQUEST_METHOD"
            java.lang.String r9 = r1.getString(r9)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            if (r9 == 0) goto L_0x00b3
            boolean r9 = r9.equals(r0)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            if (r9 == 0) goto L_0x00b3
            r14.setRequestMethod(r0)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.lang.String r0 = "REQUEST_DATA"
            java.io.Serializable r0 = r1.getSerializable(r0)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            byte[] r0 = (byte[]) r0     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            if (r0 == 0) goto L_0x00b3
            r14.setDoOutput(r10)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.io.DataOutputStream r9 = new java.io.DataOutputStream     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            java.io.OutputStream r10 = r14.getOutputStream()     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            r9.<init>(r10)     // Catch:{ ClassCastException -> 0x0237, IOException -> 0x0194, all -> 0x018e }
            r9.write(r0)     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            goto L_0x00b5
        L_0x00b3:
            r9 = r16
        L_0x00b5:
            int r0 = r14.getResponseCode()     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            r7.putInt(r12, r0)     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            java.lang.String r0 = r14.getResponseMessage()     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            r7.putString(r11, r0)     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            java.lang.String r0 = "RESPONSE_CONTENT_TYPE"
            java.lang.String r10 = r14.getContentType()     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            r7.putString(r0, r10)     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            java.lang.String r0 = "RESPONSE_CONTENT_ENCODING"
            java.lang.String r10 = r14.getContentEncoding()     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            r7.putString(r0, r10)     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            java.io.InputStream r10 = r14.getInputStream()     // Catch:{ ClassCastException -> 0x0187, IOException -> 0x0181, all -> 0x017d }
            if (r10 == 0) goto L_0x0103
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            r13 = 32
            int r15 = r10.available()     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            int r13 = java.lang.Math.max(r13, r15)     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            r0.<init>(r13)     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            r13 = 8192(0x2000, float:1.14794E-41)
            byte[] r13 = new byte[r13]     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
        L_0x00ef:
            int r15 = r10.read(r13)     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            r1 = -1
            if (r15 != r1) goto L_0x00fb
            byte[] r0 = r0.toByteArray()     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            goto L_0x0107
        L_0x00fb:
            r1 = 0
            r0.write(r13, r1, r15)     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            r1 = r20
            goto L_0x00ef
        L_0x0103:
            r0 = 0
            byte[] r0 = new byte[r0]     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
        L_0x0107:
            java.lang.String r1 = "RESPONSE_DATA"
            r7.putSerializable(r1, r0)     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            java.lang.String r0 = "RESPONSE_DATA_LENGTH"
            int r1 = r14.getContentLength()     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            r7.putInt(r0, r1)     // Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }
            if (r10 == 0) goto L_0x0142
            r10.close()     // Catch:{ IOException -> 0x011b }
            goto L_0x0142
        L_0x011b:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = a
            r2 = 3
            boolean r0 = defpackage.atfx.a(r0, r2)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 38
            r2.<init>(r1)
            r2.append(r5)
            r2.append(r0)
            r2.toString()
        L_0x0142:
            if (r9 == 0) goto L_0x016f
            r9.close()     // Catch:{ IOException -> 0x0148 }
            goto L_0x016f
        L_0x0148:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = a
            r2 = 3
            boolean r0 = defpackage.atfx.a(r0, r2)
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 39
            r2.<init>(r1)
            r2.append(r4)
            r2.append(r0)
            r2.toString()
        L_0x016f:
            if (r14 == 0) goto L_0x02e8
            goto L_0x02df
        L_0x0173:
            r0 = move-exception
            r1 = r0
            r16 = r10
            goto L_0x02ef
        L_0x0179:
            r0 = move-exception
            goto L_0x0184
        L_0x017b:
            r0 = move-exception
            goto L_0x018a
        L_0x017d:
            r0 = move-exception
            r1 = r0
            goto L_0x02ef
        L_0x0181:
            r0 = move-exception
            r10 = r16
        L_0x0184:
            r16 = r9
            goto L_0x0197
        L_0x0187:
            r0 = move-exception
            r10 = r16
        L_0x018a:
            r16 = r9
            goto L_0x023a
        L_0x018e:
            r0 = move-exception
            r1 = r0
            r9 = r16
            goto L_0x02ef
        L_0x0194:
            r0 = move-exception
            r10 = r16
        L_0x0197:
            java.lang.String r1 = a     // Catch:{ all -> 0x02e9 }
            r3 = 6
            boolean r1 = defpackage.atfx.a(r1, r3)     // Catch:{ all -> 0x02e9 }
            if (r1 != 0) goto L_0x01a1
            goto L_0x01d0
        L_0x01a1:
            java.lang.String r1 = a     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02e9 }
            int r3 = r8.length()     // Catch:{ all -> 0x02e9 }
            int r3 = r3 + 20
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02e9 }
            int r9 = r9.length()     // Catch:{ all -> 0x02e9 }
            int r3 = r3 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e9 }
            r9.<init>(r3)     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "handleHttpRequest "
            r9.append(r3)     // Catch:{ all -> 0x02e9 }
            r9.append(r8)     // Catch:{ all -> 0x02e9 }
            r9.append(r6)     // Catch:{ all -> 0x02e9 }
            r9.append(r0)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x02e9 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x02e9 }
        L_0x01d0:
            r1 = 500(0x1f4, float:7.0E-43)
            r7.putInt(r12, r1)     // Catch:{ all -> 0x02e9 }
            r7.putString(r11, r2)     // Catch:{ all -> 0x02e9 }
            if (r10 == 0) goto L_0x0206
            r10.close()     // Catch:{ IOException -> 0x01df }
            goto L_0x0206
        L_0x01df:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = a
            r2 = 3
            boolean r0 = defpackage.atfx.a(r0, r2)
            if (r0 == 0) goto L_0x0206
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 38
            r2.<init>(r1)
            r2.append(r5)
            r2.append(r0)
            r2.toString()
        L_0x0206:
            if (r16 == 0) goto L_0x0233
            r16.close()     // Catch:{ IOException -> 0x020c }
            goto L_0x0233
        L_0x020c:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = a
            r2 = 3
            boolean r0 = defpackage.atfx.a(r0, r2)
            if (r0 == 0) goto L_0x0233
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 39
            r2.<init>(r1)
            r2.append(r4)
            r2.append(r0)
            r2.toString()
        L_0x0233:
            if (r14 == 0) goto L_0x02e8
            goto L_0x02df
        L_0x0237:
            r0 = move-exception
            r10 = r16
        L_0x023a:
            java.lang.String r1 = a     // Catch:{ all -> 0x02e9 }
            r2 = 6
            boolean r1 = defpackage.atfx.a(r1, r2)     // Catch:{ all -> 0x02e9 }
            if (r1 == 0) goto L_0x027a
            java.lang.String r1 = a     // Catch:{ all -> 0x02e9 }
            java.lang.String r2 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02e9 }
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x02e9 }
            int r8 = r8.length()     // Catch:{ all -> 0x02e9 }
            int r8 = r8 + 31
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02e9 }
            int r9 = r9.length()     // Catch:{ all -> 0x02e9 }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e9 }
            r9.<init>(r8)     // Catch:{ all -> 0x02e9 }
            java.lang.String r8 = "Malformed bundle field value "
            r9.append(r8)     // Catch:{ all -> 0x02e9 }
            r9.append(r2)     // Catch:{ all -> 0x02e9 }
            r9.append(r6)     // Catch:{ all -> 0x02e9 }
            r9.append(r0)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x02e9 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x02e9 }
        L_0x027a:
            r1 = 400(0x190, float:5.6E-43)
            r7.putInt(r12, r1)     // Catch:{ all -> 0x02e9 }
            r7.putString(r11, r3)     // Catch:{ all -> 0x02e9 }
            if (r10 == 0) goto L_0x02b0
            r10.close()     // Catch:{ IOException -> 0x0289 }
            goto L_0x02b0
        L_0x0289:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = a
            r2 = 3
            boolean r0 = defpackage.atfx.a(r0, r2)
            if (r0 == 0) goto L_0x02b0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 38
            r2.<init>(r1)
            r2.append(r5)
            r2.append(r0)
            r2.toString()
        L_0x02b0:
            if (r16 == 0) goto L_0x02dd
            r16.close()     // Catch:{ IOException -> 0x02b6 }
            goto L_0x02dd
        L_0x02b6:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = a
            r2 = 3
            boolean r0 = defpackage.atfx.a(r0, r2)
            if (r0 == 0) goto L_0x02dd
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 39
            r2.<init>(r1)
            r2.append(r4)
            r2.append(r0)
            r2.toString()
        L_0x02dd:
            if (r14 == 0) goto L_0x02e8
        L_0x02df:
            r14.disconnect()
            java.lang.String r0 = a
            r1 = 3
            defpackage.atfx.a(r0, r1)
        L_0x02e8:
            return r7
        L_0x02e9:
            r0 = move-exception
            r1 = r0
            r9 = r16
            r16 = r10
        L_0x02ef:
            if (r16 == 0) goto L_0x031c
            r16.close()     // Catch:{ IOException -> 0x02f5 }
            goto L_0x031c
        L_0x02f5:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = a
            r3 = 3
            boolean r0 = defpackage.atfx.a(r0, r3)
            if (r0 == 0) goto L_0x031c
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 38
            r3.<init>(r2)
            r3.append(r5)
            r3.append(r0)
            r3.toString()
        L_0x031c:
            if (r9 == 0) goto L_0x0349
            r9.close()     // Catch:{ IOException -> 0x0322 }
            goto L_0x0349
        L_0x0322:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = a
            r3 = 3
            boolean r0 = defpackage.atfx.a(r0, r3)
            if (r0 == 0) goto L_0x0349
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 39
            r3.<init>(r2)
            r3.append(r4)
            r3.append(r0)
            r3.toString()
        L_0x0349:
            if (r14 == 0) goto L_0x0354
            r14.disconnect()
            java.lang.String r0 = a
            r2 = 3
            defpackage.atfx.a(r0, r2)
        L_0x0354:
            throw r1
        L_0x0355:
            r0 = move-exception
            java.lang.String r1 = a
            r3 = 6
            boolean r1 = defpackage.atfx.a(r1, r3)
            if (r1 == 0) goto L_0x038e
            java.lang.String r1 = a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r8.length()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 21
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "URL openConnection "
            r5.append(r3)
            r5.append(r8)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r1, r0)
        L_0x038e:
            r1 = 500(0x1f4, float:7.0E-43)
            r7.putInt(r12, r1)
            r7.putString(r11, r2)
            return r7
        L_0x0398:
            r0 = move-exception
            java.lang.String r1 = a
            r2 = 6
            boolean r1 = defpackage.atfx.a(r1, r2)
            if (r1 == 0) goto L_0x03d1
            java.lang.String r1 = a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r8.length()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 16
            int r2 = r2 + r4
            r5.<init>(r2)
            java.lang.String r2 = "Malformed URL "
            r5.append(r2)
            r5.append(r8)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r1, r0)
        L_0x03d1:
            r1 = 400(0x190, float:5.6E-43)
            r7.putInt(r12, r1)
            r7.putString(r11, r3)
            return r7
        L_0x03db:
            java.lang.String r0 = a
            r1 = 6
            boolean r0 = defpackage.atfx.a(r0, r1)
            if (r0 == 0) goto L_0x03ff
            java.lang.String r0 = a
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r2 = "URL not whitelisted: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x03f8
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x03fc
        L_0x03f8:
            java.lang.String r1 = r2.concat(r1)
        L_0x03fc:
            android.util.Log.e(r0, r1)
        L_0x03ff:
            r0 = 403(0x193, float:5.65E-43)
            r7.putInt(r12, r0)
            java.lang.String r0 = "Forbidden"
            r7.putString(r11, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.service.HttpProxyChimeraService.a(android.os.Bundle):android.os.Bundle");
    }

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public HttpProxyChimeraService(rwr rwr) {
        this.c = new rws(this);
    }
}
