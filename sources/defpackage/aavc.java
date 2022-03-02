package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: aavc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aavc {
    public final Context a;
    private final aauu b;

    static {
        aavc.class.getSimpleName();
    }

    public aavc(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = new aauu(context, executorService);
    }

    public final aavg a() {
        aucd o = aavg.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aavg aavg = (aavg) o.b;
        "GmsCore".getClass();
        aavg.a |= 1;
        aavg.b = "GmsCore";
        String num = Integer.toString(201216073);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aavg aavg2 = (aavg) o.b;
        num.getClass();
        aavg2.a |= 2;
        aavg2.c = num;
        return (aavg) o.i();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0119, code lost:
        if (r7 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011b, code lost:
        defpackage.jlk.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        defpackage.izj.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0121, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        if (r7 != null) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012d A[SYNTHETIC, Splitter:B:60:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140 A[SYNTHETIC, Splitter:B:70:0x0140] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(int r6, byte[] r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 6148(0x1804, float:8.615E-42)
            if (r6 == r0) goto L_0x000b
            r2 = 6149(0x1805, float:8.617E-42)
            defpackage.izj.b(r2)
            goto L_0x000f
        L_0x000b:
            defpackage.izj.b(r1)
        L_0x000f:
            r2 = 11
            r3 = 0
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.lang.String r2 = "&key="
            if (r6 == r0) goto L_0x0045
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r0 = r0 + 94
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r0 = r0 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.lang.String r0 = "https://safebrowsing.googleapis.com/v4/fullHashes:find?$ct=application%2Fx-protobuf&$req="
            r4.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.append(r7)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.append(r2)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.append(r8)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            goto L_0x006f
        L_0x0045:
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r0 = r0 + 102
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            int r0 = r0 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.lang.String r0 = "https://safebrowsing.googleapis.com/v4/threatListUpdates:fetch?$ct=application%2Fx-protobuf&$req="
            r4.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.append(r7)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.append(r2)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r4.append(r8)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
        L_0x006f:
            java.net.URL r8 = new java.net.URL     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            boolean r7 = defpackage.azfv.f()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            if (r7 != 0) goto L_0x0081
            java.net.URLConnection r7 = defpackage.jlk.a(r8, r1)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            goto L_0x009a
        L_0x0081:
            defpackage.izj.b(r1)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            com.google.android.gms.net.PlayServicesCronetProvider r7 = new com.google.android.gms.net.PlayServicesCronetProvider     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            android.content.Context r0 = r5.a     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            org.chromium.net.CronetEngine$Builder r7 = r7.createBuilder()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            org.chromium.net.CronetEngine r7 = r7.build()     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.net.URLConnection r7 = r7.openConnection(r8)     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x013b, all -> 0x0128 }
        L_0x009a:
            java.lang.String r8 = "Connection"
            java.lang.String r0 = "Keep-Alive"
            r7.setRequestProperty(r8, r0)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            java.lang.String r8 = "Content-Type"
            java.lang.String r0 = "application/x-protobuf"
            r7.setRequestProperty(r8, r0)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            r8 = 2
            if (r6 == r8) goto L_0x00ac
            goto L_0x00b4
        L_0x00ac:
            r6 = 3000(0xbb8, float:4.204E-42)
            r7.setConnectTimeout(r6)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            r7.setReadTimeout(r6)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
        L_0x00b4:
            aauu r6 = r5.b     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            java.lang.String r6 = r6.a()     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            if (r8 == 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            java.lang.String r8 = "Cookie"
            r7.setRequestProperty(r8, r6)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
        L_0x00c6:
            java.lang.String r6 = "X-HTTP-Method-Override"
            java.lang.String r8 = "POST"
            r7.setRequestProperty(r6, r8)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r6 != r8) goto L_0x0119
            java.io.InputStream r6 = r7.getInputStream()     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            r8.<init>()     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
        L_0x00e2:
            int r1 = r6.read(r0)     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            if (r1 >= 0) goto L_0x010d
            byte[] r8 = r8.toByteArray()     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            java.util.Map r0 = r7.getHeaderFields()     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            java.lang.String r1 = "Set-Cookie"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            aauu r1 = r5.b     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            r1.a(r0)     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            if (r6 == 0) goto L_0x0104
            r6.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0104
        L_0x0103:
            r6 = move-exception
        L_0x0104:
            if (r7 == 0) goto L_0x0109
            defpackage.jlk.a(r7)
        L_0x0109:
            defpackage.izj.a()
            return r8
        L_0x010d:
            if (r1 <= 0) goto L_0x00e2
            r2 = 0
            r8.write(r0, r2, r1)     // Catch:{ IOException -> 0x0117, all -> 0x0114 }
            goto L_0x00e2
        L_0x0114:
            r8 = move-exception
            r3 = r6
            goto L_0x012b
        L_0x0117:
            r8 = move-exception
            goto L_0x013e
        L_0x0119:
            if (r7 == 0) goto L_0x011e
        L_0x011b:
            defpackage.jlk.a(r7)
        L_0x011e:
            defpackage.izj.a()
            return r3
        L_0x0122:
            r6 = move-exception
            r8 = r6
            goto L_0x012b
        L_0x0125:
            r6 = move-exception
            r6 = r3
            goto L_0x013e
        L_0x0128:
            r6 = move-exception
            r8 = r6
            r7 = r3
        L_0x012b:
            if (r3 == 0) goto L_0x0132
            r3.close()     // Catch:{ IOException -> 0x0131 }
            goto L_0x0132
        L_0x0131:
            r6 = move-exception
        L_0x0132:
            if (r7 == 0) goto L_0x0137
            defpackage.jlk.a(r7)
        L_0x0137:
            defpackage.izj.a()
            throw r8
        L_0x013b:
            r6 = move-exception
            r6 = r3
            r7 = r6
        L_0x013e:
            if (r6 == 0) goto L_0x0145
            r6.close()     // Catch:{ IOException -> 0x0144 }
            goto L_0x0145
        L_0x0144:
            r6 = move-exception
        L_0x0145:
            if (r7 == 0) goto L_0x0148
            goto L_0x011b
        L_0x0148:
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavc.a(int, byte[], java.lang.String):byte[]");
    }
}
