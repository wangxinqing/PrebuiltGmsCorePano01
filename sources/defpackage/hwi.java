package defpackage;

import android.content.Context;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;

/* renamed from: hwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwi implements hwe {
    private static final Pattern e = Pattern.compile("[^,;\\s\"]+");
    public final htg a;
    private final Context b;
    private final String c;
    private volatile CronetEngine d;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x022e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hwd a(defpackage.avtn r12, defpackage.hwc r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            org.chromium.net.CronetEngine r0 = r11.d
            if (r0 == 0) goto L_0x0005
            goto L_0x0015
        L_0x0005:
            monitor-enter(r11)
            org.chromium.net.CronetEngine r0 = r11.d     // Catch:{ all -> 0x0241 }
            if (r0 != 0) goto L_0x0014
            ihs r0 = defpackage.ihs.b()     // Catch:{ all -> 0x0241 }
            org.chromium.net.CronetEngine r0 = r0.getCronetEngine()     // Catch:{ all -> 0x0241 }
            r11.d = r0     // Catch:{ all -> 0x0241 }
        L_0x0014:
            monitor-exit(r11)     // Catch:{ all -> 0x0241 }
        L_0x0015:
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r11.c
            r0.<init>(r1)
            boolean r1 = defpackage.awtr.e()
            if (r1 != 0) goto L_0x004d
            java.lang.String r0 = r0.getProtocol()
            java.lang.String r1 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002f
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = r11.c
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = "Abort attempt to upload logs in plaintext: requestUrl="
            int r15 = r13.length()
            if (r15 != 0) goto L_0x0045
            java.lang.String r13 = new java.lang.String
            r13.<init>(r14)
            goto L_0x0049
        L_0x0045:
            java.lang.String r13 = r14.concat(r13)
        L_0x0049:
            r12.<init>(r13)
            throw r12
        L_0x004d:
            htg r0 = r11.a
            r0.a((defpackage.avtn) r12)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = java.lang.System.currentTimeMillis()
            r13.a(r0, r2)
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            auaw r2 = defpackage.auay.m()
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            org.chromium.net.CronetEngine r3 = r11.d
            java.lang.String r4 = r11.c
            hwf r5 = new hwf
            r5.<init>(r2, r1, r0)
            aoqm r7 = defpackage.aoqm.a
            org.chromium.net.UrlRequest$Builder r3 = r3.newUrlRequestBuilder(r4, r5, r7)
            r4 = r3
            org.chromium.net.ExperimentalUrlRequest$Builder r4 = (org.chromium.net.ExperimentalUrlRequest.Builder) r4
            r4.addRequestAnnotation(r6)
            java.lang.String r4 = "POST"
            r3.setHttpMethod(r4)
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            r3.addHeader(r4, r5)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/x-gzip"
            r3.addHeader(r4, r5)
            if (r14 == 0) goto L_0x00a5
            boolean r4 = r14.isEmpty()
            if (r4 != 0) goto L_0x00a5
            java.lang.String r4 = "Authorization"
            r3.addHeader(r4, r14)
        L_0x00a5:
            if (r15 == 0) goto L_0x00b2
            boolean r14 = r15.isEmpty()
            if (r14 != 0) goto L_0x00b2
            java.lang.String r14 = "X-SERVER-TOKEN"
            r3.addHeader(r14, r15)
        L_0x00b2:
            boolean r14 = r12.j
            if (r14 != 0) goto L_0x0101
            android.content.Context r14 = r11.b
            com.google.android.gms.pseudonymous.PseudonymousIdToken r14 = defpackage.zok.b(r14)
            java.lang.String r14 = r14.a
            boolean r15 = defpackage.awtr.l()
            if (r15 == 0) goto L_0x00cc
            java.lang.String r15 = defpackage.amrk.b(r14)
            r10 = r15
            r15 = r14
            r14 = r10
            goto L_0x0104
        L_0x00cc:
            if (r14 != 0) goto L_0x00d4
            java.lang.String r15 = "\"\""
            r10 = r15
            r15 = r14
            r14 = r10
            goto L_0x0104
        L_0x00d4:
            java.util.regex.Pattern r15 = e
            java.util.regex.Matcher r15 = r15.matcher(r14)
            boolean r15 = r15.matches()
            if (r15 != 0) goto L_0x0100
            int r15 = r14.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r15 = r15 + 2
            r4.<init>(r15)
            java.lang.String r15 = "\""
            r4.append(r15)
            r4.append(r14)
            java.lang.String r15 = "\""
            r4.append(r15)
            java.lang.String r15 = r4.toString()
            r10 = r15
            r15 = r14
            r14 = r10
            goto L_0x0104
        L_0x0100:
            goto L_0x0103
        L_0x0101:
            java.lang.String r14 = "ANONYMOUS"
        L_0x0103:
            r15 = r14
        L_0x0104:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r4 = "NID="
            int r5 = r14.length()
            if (r5 != 0) goto L_0x0116
            java.lang.String r14 = new java.lang.String
            r14.<init>(r4)
            goto L_0x011a
        L_0x0116:
            java.lang.String r14 = r4.concat(r14)
        L_0x011a:
            java.lang.String r4 = "Cookie"
            r3.addHeader(r4, r14)
            r3.allowDirectExecutor()
            auaw r14 = defpackage.auay.m()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r14)
            byte[] r13 = r13.d()     // Catch:{ all -> 0x0237 }
            r4.write(r13)     // Catch:{ all -> 0x0237 }
            r4.close()
            auay r8 = r14.a()
            htg r13 = r11.a
            int r14 = r8.a()
            long r4 = (long) r14
            r13.a((defpackage.avtn) r12, (long) r4)
            hwg r13 = new hwg
            r13.<init>(r8)
            aoqm r14 = defpackage.aoqm.a
            r3.setUploadDataProvider(r13, r14)
            org.chromium.net.UrlRequest r13 = r3.build()
            org.chromium.net.CronetEngine r14 = r11.d
            org.chromium.net.ExperimentalCronetEngine r14 = (org.chromium.net.ExperimentalCronetEngine) r14
            hwh r9 = new hwh
            aoqm r5 = defpackage.aoqm.a
            r3 = r9
            r4 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r14.addRequestFinishedListener(r9)
            r13.start()
            long r3 = defpackage.awtr.j()
            int r12 = (int) r3
            r14 = 30000(0x7530, float:4.2039E-41)
            int r12 = java.lang.Math.max(r12, r14)
            long r3 = (long) r12
            boolean r12 = r0.block(r3)
            if (r12 == 0) goto L_0x022e
            java.lang.Object r12 = r1.get()
            boolean r13 = r12 instanceof org.chromium.net.CronetException
            if (r13 != 0) goto L_0x0226
            java.lang.Object r12 = r1.get()
            org.chromium.net.UrlResponseInfo r12 = (org.chromium.net.UrlResponseInfo) r12
            htg r13 = r11.a
            int r14 = r12.getHttpStatusCode()
            r13.a((int) r14)
            java.util.Map r13 = r12.getAllHeaders()
            java.lang.String r14 = "Set-Cookie"
            java.lang.Object r13 = r13.get(r14)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0210
            java.util.Iterator r13 = r13.iterator()
        L_0x01a0:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0210
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.util.List r14 = java.net.HttpCookie.parse(r14)
            java.util.List r14 = defpackage.anda.a((java.util.List) r14)
            java.util.Iterator r14 = r14.iterator()
        L_0x01b8:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r14.next()
            java.net.HttpCookie r0 = (java.net.HttpCookie) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r3 = "NID"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01b8
            java.lang.String r1 = r0.getValue()
            if (r1 == 0) goto L_0x01b8
            boolean r14 = defpackage.awtr.f()
            if (r14 == 0) goto L_0x0201
            znz r14 = defpackage.zoa.c()
            r14.b = r15
            java.lang.String r0 = r0.getValue()
            r14.a = r0
            zoa r14 = r14.a()
            android.content.Context r0 = r11.b
            boolean r14 = defpackage.zol.a((defpackage.zoa) r14, (android.content.Context) r0)
            if (r14 != 0) goto L_0x01a0
            java.lang.String r14 = "CronetTransport"
            java.lang.String r0 = "Error in PseudonymousId compareAndSet() operation"
            android.util.Log.e(r14, r0)
            htg r14 = r11.a
            r14.a()
            goto L_0x01a0
        L_0x0201:
            com.google.android.gms.pseudonymous.PseudonymousIdToken r14 = new com.google.android.gms.pseudonymous.PseudonymousIdToken
            java.lang.String r0 = r0.getValue()
            r14.<init>(r0)
            android.content.Context r0 = r11.b
            defpackage.zol.a((com.google.android.gms.pseudonymous.PseudonymousIdToken) r14, (android.content.Context) r0)
            goto L_0x01a0
        L_0x0210:
            hwd r13 = new hwd
            auay r14 = r2.a()
            byte[] r14 = r14.k()
            int r15 = r12.getHttpStatusCode()
            java.lang.String r12 = r12.getHttpStatusText()
            r13.<init>(r14, r15, r12)
            return r13
        L_0x0226:
            java.io.IOException r13 = new java.io.IOException
            org.chromium.net.CronetException r12 = (org.chromium.net.CronetException) r12
            r13.<init>(r12)
            throw r13
        L_0x022e:
            r13.cancel()
            java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException
            r12.<init>()
            throw r12
        L_0x0237:
            r12 = move-exception
            r4.close()     // Catch:{ all -> 0x023c }
            goto L_0x0240
        L_0x023c:
            r13 = move-exception
            defpackage.apev.a((java.lang.Throwable) r12, (java.lang.Throwable) r13)
        L_0x0240:
            throw r12
        L_0x0241:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0241 }
            goto L_0x0245
        L_0x0244:
            throw r12
        L_0x0245:
            goto L_0x0244
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwi.a(avtn, hwc, java.lang.String, java.lang.String):hwd");
    }

    public hwi(Context context, String str, htg htg) {
        this.b = context;
        this.c = str;
        this.a = htg;
    }
}
