package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: clu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clu implements cnd {
    final URL a = a(clr.a);
    private final cpp b;
    private final cpp c;

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid url: ") : "Invalid url: ".concat(valueOf), e);
        }
    }

    public clu(Context context, cpp cpp, cpp cpp2) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.b = cpp2;
        this.c = cpp;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0520 A[Catch:{ IOException -> 0x0569 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0530 A[Catch:{ IOException -> 0x0569 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0533 A[Catch:{ IOException -> 0x0569 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x053b A[EDGE_INSN: B:242:0x053b->B:202:0x053b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cmw a(defpackage.cmv r18) {
        /*
            r17 = this;
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "gzip"
            java.lang.String r3 = "Content-Encoding"
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4 = r18
            cmq r4 = (defpackage.cmq) r4
            java.lang.Iterable r5 = r4.a
            int r6 = r5.size()
            r7 = 0
            r8 = 0
        L_0x0017:
            if (r8 >= r6) goto L_0x0041
            java.lang.Object r9 = r5.get(r8)
            cmi r9 = (defpackage.cmi) r9
            java.lang.String r10 = r9.a()
            boolean r11 = r0.containsKey(r10)
            if (r11 != 0) goto L_0x0035
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r9)
            r0.put(r10, r11)
            goto L_0x003e
        L_0x0035:
            java.lang.Object r10 = r0.get(r10)
            java.util.List r10 = (java.util.List) r10
            r10.add(r9)
        L_0x003e:
            int r8 = r8 + 1
            goto L_0x0017
        L_0x0041:
            clx r5 = defpackage.clx.b
            aucd r5 = r5.o()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x004f:
            boolean r0 = r6.hasNext()
            java.lang.String r11 = "CctTransportBackend"
            if (r0 == 0) goto L_0x03ba
            java.lang.Object r0 = r6.next()
            r12 = r0
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r7)
            cmi r0 = (defpackage.cmi) r0
            cma r13 = defpackage.cma.h
            aucd r13 = r13.o()
            boolean r14 = r13.c
            if (r14 == 0) goto L_0x0079
            r13.c()
            r13.c = r7
        L_0x0079:
            aucj r14 = r13.b
            cma r14 = (defpackage.cma) r14
            r14.g = r7
            long r14 = java.lang.System.currentTimeMillis()
            boolean r8 = r13.c
            if (r8 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r13.c()
            r13.c = r7
        L_0x008d:
            aucj r8 = r13.b
            cma r8 = (defpackage.cma) r8
            r8.c = r14
            long r8 = android.os.SystemClock.elapsedRealtime()
            boolean r14 = r13.c
            if (r14 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r13.c()
            r13.c = r7
        L_0x00a1:
            aucj r14 = r13.b
            cma r14 = (defpackage.cma) r14
            r14.d = r8
            cly r8 = defpackage.cly.c
            aucd r8 = r8.o()
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            r8.c()
            r8.c = r7
        L_0x00b7:
            aucj r9 = r8.b
            cly r9 = (defpackage.cly) r9
            r14 = 4
            r9.a = r14
            clw r9 = defpackage.clw.i
            aucd r9 = r9.o()
            java.lang.String r14 = "sdk-version"
            int r14 = r0.a(r14)
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r9.c()
            r9.c = r7
        L_0x00d4:
            aucj r15 = r9.b
            clw r15 = (defpackage.clw) r15
            r15.a = r14
            java.lang.String r14 = "model"
            java.lang.String r14 = r0.b(r14)
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x00e5
            goto L_0x00ea
        L_0x00e5:
            r9.c()
            r9.c = r7
        L_0x00ea:
            aucj r15 = r9.b
            clw r15 = (defpackage.clw) r15
            r14.getClass()
            r15.b = r14
            java.lang.String r14 = "hardware"
            java.lang.String r14 = r0.b(r14)
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x00fe
            goto L_0x0103
        L_0x00fe:
            r9.c()
            r9.c = r7
        L_0x0103:
            aucj r15 = r9.b
            clw r15 = (defpackage.clw) r15
            r14.getClass()
            r15.d = r14
            java.lang.String r14 = "device"
            java.lang.String r14 = r0.b(r14)
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x0117
            goto L_0x011c
        L_0x0117:
            r9.c()
            r9.c = r7
        L_0x011c:
            aucj r15 = r9.b
            clw r15 = (defpackage.clw) r15
            r14.getClass()
            r15.e = r14
            java.lang.String r14 = "product"
            java.lang.String r14 = r0.b(r14)
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x0130
            goto L_0x0135
        L_0x0130:
            r9.c()
            r9.c = r7
        L_0x0135:
            aucj r15 = r9.b
            clw r15 = (defpackage.clw) r15
            r14.getClass()
            r15.c = r14
            java.lang.String r14 = "os-uild"
            java.lang.String r14 = r0.b(r14)
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x0149
            goto L_0x014e
        L_0x0149:
            r9.c()
            r9.c = r7
        L_0x014e:
            aucj r15 = r9.b
            clw r15 = (defpackage.clw) r15
            r14.getClass()
            r15.f = r14
            java.lang.String r14 = "manufacturer"
            java.lang.String r14 = r0.b(r14)
            boolean r15 = r9.c
            if (r15 != 0) goto L_0x0162
            goto L_0x0167
        L_0x0162:
            r9.c()
            r9.c = r7
        L_0x0167:
            aucj r15 = r9.b
            clw r15 = (defpackage.clw) r15
            r14.getClass()
            r15.g = r14
            java.lang.String r14 = "fingerprint"
            java.lang.String r0 = r0.b(r14)
            boolean r14 = r9.c
            if (r14 != 0) goto L_0x017b
            goto L_0x0180
        L_0x017b:
            r9.c()
            r9.c = r7
        L_0x0180:
            aucj r14 = r9.b
            clw r14 = (defpackage.clw) r14
            r0.getClass()
            r14.h = r0
            aucj r0 = r9.i()
            clw r0 = (defpackage.clw) r0
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x0194
            goto L_0x0199
        L_0x0194:
            r8.c()
            r8.c = r7
        L_0x0199:
            aucj r9 = r8.b
            cly r9 = (defpackage.cly) r9
            r0.getClass()
            r9.b = r0
            aucj r0 = r8.i()
            cly r0 = (defpackage.cly) r0
            boolean r8 = r13.c
            if (r8 != 0) goto L_0x01ad
            goto L_0x01b2
        L_0x01ad:
            r13.c()
            r13.c = r7
        L_0x01b2:
            aucj r8 = r13.b
            cma r8 = (defpackage.cma) r8
            r0.getClass()
            r8.e = r0
            r8 = 6
            java.lang.Object r0 = r12.getKey()     // Catch:{ NumberFormatException -> 0x01e2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x01e2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e2 }
            int r0 = r0.intValue()     // Catch:{ NumberFormatException -> 0x01e2 }
            boolean r9 = r13.c     // Catch:{ NumberFormatException -> 0x01e2 }
            if (r9 != 0) goto L_0x01cf
            goto L_0x01d4
        L_0x01cf:
            r13.c()     // Catch:{ NumberFormatException -> 0x01e2 }
            r13.c = r7     // Catch:{ NumberFormatException -> 0x01e2 }
        L_0x01d4:
            aucj r9 = r13.b     // Catch:{ NumberFormatException -> 0x01e2 }
            cma r9 = (defpackage.cma) r9     // Catch:{ NumberFormatException -> 0x01e2 }
            r14 = 2
            r9.a = r14     // Catch:{ NumberFormatException -> 0x01e2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e2 }
            r9.b = r0     // Catch:{ NumberFormatException -> 0x01e2 }
            goto L_0x01fe
        L_0x01e2:
            r0 = move-exception
            java.lang.Object r0 = r12.getKey()
            java.lang.String r0 = (java.lang.String) r0
            boolean r9 = r13.c
            if (r9 != 0) goto L_0x01ee
            goto L_0x01f3
        L_0x01ee:
            r13.c()
            r13.c = r7
        L_0x01f3:
            aucj r9 = r13.b
            cma r9 = (defpackage.cma) r9
            r0.getClass()
            r9.a = r8
            r9.b = r0
        L_0x01fe:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0208:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x038a
            java.lang.Object r9 = r0.next()
            cmi r9 = (defpackage.cmi) r9
            cmg r12 = r9.c()
            clo r14 = r12.a
            clz r15 = defpackage.clz.h
            aucd r15 = r15.o()
            java.lang.String r16 = "proto"
            clo r10 = defpackage.clo.a(r16)
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0247
            byte[] r10 = r12.b
            auay r10 = defpackage.auay.a((byte[]) r10)
            boolean r12 = r15.c
            if (r12 == 0) goto L_0x023b
            r15.c()
            r15.c = r7
        L_0x023b:
            aucj r12 = r15.b
            clz r12 = (defpackage.clz) r12
            r10.getClass()
            r12.a = r8
            r12.b = r10
            goto L_0x0278
        L_0x0247:
            java.lang.String r10 = "json"
            clo r10 = defpackage.clo.a(r10)
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0372
            byte[] r10 = r12.b
            auay r10 = defpackage.auay.a((byte[]) r10)
            boolean r12 = r15.c
            if (r12 != 0) goto L_0x025f
            goto L_0x0264
        L_0x025f:
            r15.c()
            r15.c = r7
        L_0x0264:
            aucj r12 = r15.b
            clz r12 = (defpackage.clz) r12
            boolean r14 = r10.f()
            if (r14 == 0) goto L_0x036a
            java.lang.String r10 = r10.l()
            r12.b = r10
            r10 = 29
            r12.a = r10
        L_0x0278:
            long r7 = r9.d()
            boolean r14 = r15.c
            if (r14 != 0) goto L_0x0281
            goto L_0x0287
        L_0x0281:
            r15.c()
            r10 = 0
            r15.c = r10
        L_0x0287:
            aucj r14 = r15.b
            clz r14 = (defpackage.clz) r14
            r14.c = r7
            long r7 = r9.e()
            boolean r14 = r15.c
            if (r14 != 0) goto L_0x0296
            goto L_0x029c
        L_0x0296:
            r15.c()
            r10 = 0
            r15.c = r10
        L_0x029c:
            aucj r14 = r15.b
            clz r14 = (defpackage.clz) r14
            r14.e = r7
            java.util.Map r7 = r9.f()
            java.lang.String r8 = "tz-offset"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x02b9
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            long r7 = r7.longValue()
            goto L_0x02bb
        L_0x02b9:
            r7 = 0
        L_0x02bb:
            boolean r14 = r15.c
            if (r14 != 0) goto L_0x02c0
            goto L_0x02c6
        L_0x02c0:
            r15.c()
            r10 = 0
            r15.c = r10
        L_0x02c6:
            aucj r14 = r15.b
            clz r14 = (defpackage.clz) r14
            r14.f = r7
            cmc r7 = defpackage.cmc.c
            aucd r7 = r7.o()
            java.lang.String r8 = "net-type"
            int r8 = r9.a(r8)
            boolean r14 = r7.c
            if (r14 != 0) goto L_0x02dd
            goto L_0x02e3
        L_0x02dd:
            r7.c()
            r10 = 0
            r7.c = r10
        L_0x02e3:
            aucj r14 = r7.b
            cmc r14 = (defpackage.cmc) r14
            r14.a = r8
            java.lang.String r8 = "mobile-subtype"
            int r8 = r9.a(r8)
            boolean r14 = r7.c
            if (r14 != 0) goto L_0x02f4
            goto L_0x02fa
        L_0x02f4:
            r7.c()
            r10 = 0
            r7.c = r10
        L_0x02fa:
            aucj r14 = r7.b
            cmc r14 = (defpackage.cmc) r14
            r14.b = r8
            boolean r8 = r15.c
            if (r8 != 0) goto L_0x0305
            goto L_0x030b
        L_0x0305:
            r15.c()
            r8 = 0
            r15.c = r8
        L_0x030b:
            aucj r8 = r15.b
            clz r8 = (defpackage.clz) r8
            aucj r7 = r7.i()
            cmc r7 = (defpackage.cmc) r7
            r7.getClass()
            r8.g = r7
            java.lang.Integer r7 = r9.b()
            if (r7 == 0) goto L_0x0339
            java.lang.Integer r7 = r9.b()
            int r7 = r7.intValue()
            boolean r8 = r15.c
            if (r8 != 0) goto L_0x032d
            goto L_0x0333
        L_0x032d:
            r15.c()
            r8 = 0
            r15.c = r8
        L_0x0333:
            aucj r8 = r15.b
            clz r8 = (defpackage.clz) r8
            r8.d = r7
        L_0x0339:
            boolean r7 = r13.c
            if (r7 != 0) goto L_0x033e
            goto L_0x0344
        L_0x033e:
            r13.c()
            r7 = 0
            r13.c = r7
        L_0x0344:
            aucj r7 = r13.b
            cma r7 = (defpackage.cma) r7
            aucj r8 = r15.i()
            clz r8 = (defpackage.clz) r8
            r8.getClass()
            aucx r9 = r7.f
            boolean r9 = r9.a()
            if (r9 != 0) goto L_0x0361
            aucx r9 = r7.f
            aucx r9 = defpackage.aucj.a((defpackage.aucx) r9)
            r7.f = r9
        L_0x0361:
            aucx r7 = r7.f
            r7.add(r8)
            r7 = 0
            r8 = 6
            goto L_0x0208
        L_0x036a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Byte string is not UTF-8."
            r0.<init>(r1)
            throw r0
        L_0x0372:
            java.lang.String r7 = defpackage.cne.a(r11)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r8 = 0
            r9[r8] = r14
            java.lang.String r8 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r8 = java.lang.String.format(r8, r9)
            android.util.Log.w(r7, r8)
            r7 = 0
            r8 = 6
            goto L_0x0208
        L_0x038a:
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x038f
            goto L_0x0395
        L_0x038f:
            r5.c()
            r7 = 0
            r5.c = r7
        L_0x0395:
            aucj r0 = r5.b
            clx r0 = (defpackage.clx) r0
            aucj r7 = r13.i()
            cma r7 = (defpackage.cma) r7
            r7.getClass()
            aucx r8 = r0.a
            boolean r8 = r8.a()
            if (r8 != 0) goto L_0x03b2
            aucx r8 = r0.a
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)
            r0.a = r8
        L_0x03b2:
            aucx r0 = r0.a
            r0.add(r7)
            r7 = 0
            goto L_0x004f
        L_0x03ba:
            aucj r0 = r5.i()
            clx r0 = (defpackage.clx) r0
            r5 = r17
            java.net.URL r6 = r5.a
            byte[] r4 = r4.b
            r7 = 0
            if (r4 == 0) goto L_0x03e5
            clr r4 = defpackage.clr.a(r4)     // Catch:{ IllegalArgumentException -> 0x03df }
            java.lang.String r8 = r4.d     // Catch:{ IllegalArgumentException -> 0x03df }
            if (r8 == 0) goto L_0x03d2
            goto L_0x03d3
        L_0x03d2:
            r8 = r7
        L_0x03d3:
            java.lang.String r4 = r4.c     // Catch:{ IllegalArgumentException -> 0x03df }
            if (r4 == 0) goto L_0x03dd
            java.net.URL r4 = a((java.lang.String) r4)     // Catch:{ IllegalArgumentException -> 0x03df }
            r6 = r4
            goto L_0x03de
        L_0x03dd:
        L_0x03de:
            goto L_0x03e6
        L_0x03df:
            r0 = move-exception
            cmw r0 = defpackage.cmw.d()
            return r0
        L_0x03e5:
            r8 = r7
        L_0x03e6:
            cls r4 = new cls     // Catch:{ IOException -> 0x056b }
            r4.<init>(r6, r0, r8)     // Catch:{ IOException -> 0x056b }
            r0 = 5
        L_0x03ec:
            java.net.URL r6 = r4.a     // Catch:{ IOException -> 0x056b }
            defpackage.cne.a((java.lang.String) r11, (java.lang.Object) r6)     // Catch:{ IOException -> 0x056b }
            java.net.URL r6 = r4.a     // Catch:{ IOException -> 0x056b }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x056b }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x056b }
            r8 = 30000(0x7530, float:4.2039E-41)
            r6.setConnectTimeout(r8)     // Catch:{ IOException -> 0x056b }
            r8 = 40000(0x9c40, float:5.6052E-41)
            r6.setReadTimeout(r8)     // Catch:{ IOException -> 0x056b }
            r8 = 1
            r6.setDoOutput(r8)     // Catch:{ IOException -> 0x056b }
            r8 = 0
            r6.setInstanceFollowRedirects(r8)     // Catch:{ IOException -> 0x056b }
            java.lang.String r8 = "POST"
            r6.setRequestMethod(r8)     // Catch:{ IOException -> 0x056b }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x056b }
            java.lang.String r8 = "3.0.0"
            r10 = 0
            r9[r10] = r8     // Catch:{ IOException -> 0x056b }
            java.lang.String r8 = "User-Agent"
            java.lang.String r12 = "datatransport/%s android/"
            java.lang.String r9 = java.lang.String.format(r12, r9)     // Catch:{ IOException -> 0x056b }
            r6.setRequestProperty(r8, r9)     // Catch:{ IOException -> 0x056b }
            r6.setRequestProperty(r3, r2)     // Catch:{ IOException -> 0x056b }
            java.lang.String r8 = "application/x-protobuf"
            r6.setRequestProperty(r1, r8)     // Catch:{ IOException -> 0x056b }
            java.lang.String r8 = "Accept-Encoding"
            r6.setRequestProperty(r8, r2)     // Catch:{ IOException -> 0x056b }
            java.lang.String r8 = r4.c     // Catch:{ IOException -> 0x056b }
            if (r8 == 0) goto L_0x043b
            java.lang.String r9 = "X-Goog-Api-Key"
            r6.setRequestProperty(r9, r8)     // Catch:{ IOException -> 0x056b }
        L_0x043b:
            java.io.OutputStream r8 = r6.getOutputStream()     // Catch:{ IOException -> 0x056b }
            java.nio.channels.WritableByteChannel r8 = java.nio.channels.Channels.newChannel(r8)     // Catch:{ IOException -> 0x056b }
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0563 }
            r9.<init>()     // Catch:{ all -> 0x0563 }
            java.util.zip.GZIPOutputStream r12 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0563 }
            r12.<init>(r9)     // Catch:{ all -> 0x0563 }
            clx r13 = r4.b     // Catch:{ all -> 0x055b }
            r13.a(r12)     // Catch:{ all -> 0x055b }
            r12.close()     // Catch:{ all -> 0x0563 }
            byte[] r9 = r9.toByteArray()     // Catch:{ all -> 0x0563 }
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)     // Catch:{ all -> 0x0563 }
            r8.write(r9)     // Catch:{ all -> 0x0563 }
            int r9 = r6.getResponseCode()     // Catch:{ all -> 0x0563 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0563 }
            r13 = 24
            r12.<init>(r13)     // Catch:{ all -> 0x0563 }
            java.lang.String r13 = "Status Code: "
            r12.append(r13)     // Catch:{ all -> 0x0563 }
            r12.append(r9)     // Catch:{ all -> 0x0563 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0563 }
            defpackage.cne.a((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0563 }
            java.lang.String r12 = "Content-Type: "
            java.lang.String r13 = r6.getHeaderField(r1)     // Catch:{ all -> 0x0563 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0563 }
            int r14 = r13.length()     // Catch:{ all -> 0x0563 }
            if (r14 != 0) goto L_0x0490
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x0563 }
            r13.<init>(r12)     // Catch:{ all -> 0x0563 }
            goto L_0x0494
        L_0x0490:
            java.lang.String r13 = r12.concat(r13)     // Catch:{ all -> 0x0563 }
        L_0x0494:
            defpackage.cne.a((java.lang.String) r11, (java.lang.String) r13)     // Catch:{ all -> 0x0563 }
            java.lang.String r12 = "Content-Encoding: "
            java.lang.String r13 = r6.getHeaderField(r3)     // Catch:{ all -> 0x0563 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0563 }
            int r14 = r13.length()     // Catch:{ all -> 0x0563 }
            if (r14 != 0) goto L_0x04ad
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x0563 }
            r13.<init>(r12)     // Catch:{ all -> 0x0563 }
            goto L_0x04b1
        L_0x04ad:
            java.lang.String r13 = r12.concat(r13)     // Catch:{ all -> 0x0563 }
        L_0x04b1:
            defpackage.cne.a((java.lang.String) r11, (java.lang.String) r13)     // Catch:{ all -> 0x0563 }
            r12 = 302(0x12e, float:4.23E-43)
            r13 = 200(0xc8, float:2.8E-43)
            if (r9 != r12) goto L_0x04bb
            goto L_0x0506
        L_0x04bb:
            r12 = 301(0x12d, float:4.22E-43)
            if (r9 == r12) goto L_0x0506
            r12 = 307(0x133, float:4.3E-43)
            if (r9 == r12) goto L_0x0506
            if (r9 != r13) goto L_0x04f7
            java.lang.String r9 = r6.getHeaderField(r3)     // Catch:{ all -> 0x0563 }
            if (r9 == 0) goto L_0x04db
            boolean r9 = r9.equals(r2)     // Catch:{ all -> 0x0563 }
            if (r9 == 0) goto L_0x04db
            java.util.zip.GZIPInputStream r9 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0563 }
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ all -> 0x0563 }
            r9.<init>(r6)     // Catch:{ all -> 0x0563 }
            goto L_0x04df
        L_0x04db:
            java.io.InputStream r9 = r6.getInputStream()     // Catch:{ all -> 0x0563 }
        L_0x04df:
            cmb r6 = defpackage.cmb.b     // Catch:{ all -> 0x04f2 }
            aucj r6 = defpackage.aucj.a((defpackage.aucj) r6, (java.io.InputStream) r9)     // Catch:{ all -> 0x04f2 }
            cmb r6 = (defpackage.cmb) r6     // Catch:{ all -> 0x04f2 }
            long r14 = r6.a     // Catch:{ all -> 0x04f2 }
            clt r6 = new clt     // Catch:{ all -> 0x04f2 }
            r6.<init>(r13, r7, r14)     // Catch:{ all -> 0x04f2 }
            r9.close()     // Catch:{ all -> 0x0563 }
            goto L_0x04fe
        L_0x04f2:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0563 }
            throw r0     // Catch:{ all -> 0x0563 }
        L_0x04f7:
            clt r6 = new clt     // Catch:{ all -> 0x0563 }
            r14 = 0
            r6.<init>(r9, r7, r14)     // Catch:{ all -> 0x0563 }
        L_0x04fe:
            r8.close()     // Catch:{ IOException -> 0x056b }
            r12 = r6
            r6 = r11
            r10 = 0
            goto L_0x051c
        L_0x0506:
            java.lang.String r12 = "Location"
            java.lang.String r6 = r6.getHeaderField(r12)     // Catch:{ all -> 0x0563 }
            clt r12 = new clt     // Catch:{ all -> 0x0563 }
            java.net.URL r14 = new java.net.URL     // Catch:{ all -> 0x0563 }
            r14.<init>(r6)     // Catch:{ all -> 0x0563 }
            r6 = r11
            r10 = 0
            r12.<init>(r9, r14, r10)     // Catch:{ all -> 0x0561 }
            r8.close()     // Catch:{ IOException -> 0x0569 }
        L_0x051c:
            java.net.URL r8 = r12.b     // Catch:{ IOException -> 0x0569 }
            if (r8 == 0) goto L_0x0530
            defpackage.cne.a((java.lang.String) r6, (java.lang.Object) r8)     // Catch:{ IOException -> 0x0569 }
            java.net.URL r8 = r12.b     // Catch:{ IOException -> 0x0569 }
            cls r9 = new cls     // Catch:{ IOException -> 0x0569 }
            clx r14 = r4.b     // Catch:{ IOException -> 0x0569 }
            java.lang.String r4 = r4.c     // Catch:{ IOException -> 0x0569 }
            r9.<init>(r8, r14, r4)     // Catch:{ IOException -> 0x0569 }
            r4 = r9
            goto L_0x0531
        L_0x0530:
            r4 = r7
        L_0x0531:
            if (r4 == 0) goto L_0x053b
            int r0 = r0 + -1
            if (r0 > 0) goto L_0x0538
            goto L_0x053b
        L_0x0538:
            r11 = r6
            goto L_0x03ec
        L_0x053b:
            int r0 = r12.a     // Catch:{ IOException -> 0x0569 }
            if (r0 != r13) goto L_0x0548
            long r0 = r12.c     // Catch:{ IOException -> 0x0569 }
            cmr r2 = new cmr     // Catch:{ IOException -> 0x0569 }
            r3 = 1
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x0569 }
            return r2
        L_0x0548:
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 < r1) goto L_0x054d
            goto L_0x0556
        L_0x054d:
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x0556
            cmw r0 = defpackage.cmw.d()     // Catch:{ IOException -> 0x0569 }
            return r0
        L_0x0556:
            cmw r0 = defpackage.cmw.c()     // Catch:{ IOException -> 0x0569 }
            return r0
        L_0x055b:
            r0 = move-exception
            r6 = r11
            r12.close()     // Catch:{ all -> 0x0561 }
            throw r0     // Catch:{ all -> 0x0561 }
        L_0x0561:
            r0 = move-exception
            goto L_0x0565
        L_0x0563:
            r0 = move-exception
            r6 = r11
        L_0x0565:
            r8.close()     // Catch:{ IOException -> 0x0569 }
            throw r0     // Catch:{ IOException -> 0x0569 }
        L_0x0569:
            r0 = move-exception
            goto L_0x056d
        L_0x056b:
            r0 = move-exception
            r6 = r11
        L_0x056d:
            java.lang.String r1 = defpackage.cne.a(r6)
            java.lang.String r2 = "Could not make request to the backend"
            android.util.Log.e(r1, r2, r0)
            cmw r0 = defpackage.cmw.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clu.a(cmv):cmw");
    }
}
