package defpackage;

import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: afze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afze implements afzg {
    private static final long a = TimeUnit.SECONDS.toMillis(15);
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    private final SSLSocketFactory c;

    public afze(SSLSocketFactory sSLSocketFactory) {
        this.c = sSLSocketFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b A[SYNTHETIC, Splitter:B:32:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062 A[SYNTHETIC, Splitter:B:36:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006c A[SYNTHETIC, Splitter:B:43:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0073 A[SYNTHETIC, Splitter:B:47:0x0073] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r8, java.net.InetAddress r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.net.Socket r2 = new java.net.Socket     // Catch:{ IOException -> 0x0068, all -> 0x0057 }
            r2.<init>()     // Catch:{ IOException -> 0x0068, all -> 0x0057 }
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            r4 = 443(0x1bb, float:6.21E-43)
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            long r5 = a     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            int r9 = (int) r5     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            r2.connect(r3, r9)     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            long r5 = b     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            int r9 = (int) r5     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            r2.setSoTimeout(r9)     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            javax.net.ssl.SSLSocketFactory r9 = r7.c     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            java.net.Socket r9 = r9.createSocket(r2, r8, r4, r0)     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            javax.net.ssl.SSLSocket r9 = (javax.net.ssl.SSLSocket) r9     // Catch:{ IOException -> 0x0055, all -> 0x0053 }
            javax.net.ssl.SSLSession r1 = r9.getSession()     // Catch:{ IOException -> 0x0050, all -> 0x004d }
            boolean r3 = r1.isValid()     // Catch:{ IOException -> 0x0050, all -> 0x004d }
            if (r3 == 0) goto L_0x0042
            awdm r3 = defpackage.awdm.a     // Catch:{ IOException -> 0x0050, all -> 0x004d }
            boolean r8 = r3.verify(r8, r1)     // Catch:{ IOException -> 0x0050, all -> 0x004d }
            if (r8 == 0) goto L_0x0042
            if (r9 == 0) goto L_0x003b
            r9.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003b
        L_0x003a:
            r8 = move-exception
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r8 = move-exception
        L_0x0040:
            r8 = 1
            return r8
        L_0x0042:
            if (r9 == 0) goto L_0x0049
            r9.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r8 = move-exception
        L_0x0049:
            r2.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0078
        L_0x004d:
            r8 = move-exception
            r1 = r9
            goto L_0x0059
        L_0x0050:
            r8 = move-exception
            r1 = r9
            goto L_0x006a
        L_0x0053:
            r8 = move-exception
            goto L_0x0059
        L_0x0055:
            r8 = move-exception
            goto L_0x006a
        L_0x0057:
            r8 = move-exception
            r2 = r1
        L_0x0059:
            if (r1 == 0) goto L_0x0060
            r1.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0060
        L_0x005f:
            r9 = move-exception
        L_0x0060:
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0067
        L_0x0066:
            r9 = move-exception
        L_0x0067:
            throw r8
        L_0x0068:
            r8 = move-exception
            r2 = r1
        L_0x006a:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            r8 = move-exception
        L_0x0071:
            if (r2 == 0) goto L_0x0078
            r2.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0078
        L_0x0077:
            r8 = move-exception
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afze.a(java.lang.String, java.net.InetAddress):boolean");
    }
}
