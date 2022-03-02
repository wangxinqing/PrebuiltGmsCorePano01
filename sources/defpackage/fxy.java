package defpackage;

import android.content.Context;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: fxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxy {
    public static final iwd a = new iwd("GLSUser", "AppCertManager");
    static final Charset b = Charset.forName("UTF-8");
    private static WeakReference i = new WeakReference((Object) null);
    public final fyk c;
    public final fxz d;
    public final Object e = new Object();
    private final SecureRandom f = new SecureRandom();
    private boolean g = false;
    private long h = 0;

    public fxy(fyk fyk, fxz fxz) {
        iva.a((Object) fyk);
        this.c = fyk;
        iva.a((Object) fxz);
        this.d = fxz;
    }

    public static synchronized fxy a(Context context) {
        fxy fxy;
        synchronized (fxy.class) {
            fxy = (fxy) i.get();
            if (fxy == null) {
                fxy = new fxy(new fyk(context), fxz.a(context));
                i = new WeakReference(fxy);
            }
        }
        return fxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ec A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f2 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01fd A[SYNTHETIC, Splitter:B:98:0x01fd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r10 = this;
            java.lang.String r0 = "201216073"
            boolean r1 = defpackage.ent.H()
            r2 = 0
            if (r1 != 0) goto L_0x0013
            iwd r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "DeviceKey is turned off"
            r0.a(r3, r1)
            return r2
        L_0x0013:
            java.lang.Object r1 = r10.e
            monitor-enter(r1)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x021d }
            long r5 = defpackage.ent.y()     // Catch:{ all -> 0x021d }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r7 = r10.h     // Catch:{ all -> 0x021d }
            long r7 = r3 - r7
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x0219
            r10.h = r3     // Catch:{ all -> 0x021d }
            java.security.SecureRandom r3 = r10.f     // Catch:{ all -> 0x021d }
            long r3 = r3.nextLong()     // Catch:{ all -> 0x021d }
            fyk r5 = r10.c     // Catch:{ all -> 0x021d }
            android.content.Context r5 = r5.a     // Catch:{ all -> 0x021d }
            long r5 = defpackage.jhg.a((android.content.Context) r5)     // Catch:{ all -> 0x021d }
            java.util.HashMap r7 = defpackage.anet.a()     // Catch:{ all -> 0x021d }
            java.lang.String r8 = "dg_androidId"
            java.lang.String r9 = java.lang.Long.toHexString(r5)     // Catch:{ all -> 0x021d }
            r7.put(r8, r9)     // Catch:{ all -> 0x021d }
            java.lang.String r8 = "dg_session"
            java.lang.String r9 = java.lang.Long.toHexString(r3)     // Catch:{ all -> 0x021d }
            r7.put(r8, r9)     // Catch:{ all -> 0x021d }
            java.lang.String r8 = "dg_gmsCoreVersion"
            r7.put(r8, r0)     // Catch:{ all -> 0x021d }
            java.lang.String r0 = "dg_sdkVersion"
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x021d }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x021d }
            r7.put(r0, r8)     // Catch:{ all -> 0x021d }
            fyk r0 = r10.c     // Catch:{ all -> 0x021d }
            android.content.Context r0 = r0.a     // Catch:{ all -> 0x021d }
            java.lang.String r8 = "devicekey"
            java.lang.String r0 = defpackage.elr.a((android.content.Context) r0, (java.lang.String) r8, (java.util.Map) r7)     // Catch:{ all -> 0x021d }
            avpf r7 = defpackage.avpf.g     // Catch:{ IOException -> 0x020b }
            aucd r7 = r7.o()     // Catch:{ IOException -> 0x020b }
            boolean r8 = r7.c     // Catch:{ IOException -> 0x020b }
            if (r8 != 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r7.c()     // Catch:{ IOException -> 0x020b }
            r7.c = r2     // Catch:{ IOException -> 0x020b }
        L_0x007a:
            aucj r8 = r7.b     // Catch:{ IOException -> 0x020b }
            avpf r8 = (defpackage.avpf) r8     // Catch:{ IOException -> 0x020b }
            int r9 = r8.a     // Catch:{ IOException -> 0x020b }
            r9 = r9 | 2
            r8.a = r9     // Catch:{ IOException -> 0x020b }
            r8.c = r5     // Catch:{ IOException -> 0x020b }
            r5 = r9 | 4
            r8.a = r5     // Catch:{ IOException -> 0x020b }
            r8.d = r3     // Catch:{ IOException -> 0x020b }
            r3 = 1
            if (r0 == 0) goto L_0x0098
            r0.getClass()     // Catch:{ IOException -> 0x020b }
            r4 = r5 | 1
            r8.a = r4     // Catch:{ IOException -> 0x020b }
            r8.b = r0     // Catch:{ IOException -> 0x020b }
        L_0x0098:
            r0 = 0
            fyk r4 = r10.c     // Catch:{ IOException -> 0x00ae }
            android.content.Context r4 = r4.a     // Catch:{ IOException -> 0x00ae }
            qdc r4 = defpackage.qdc.a((android.content.Context) r4)     // Catch:{ IOException -> 0x00ae }
            java.lang.String r5 = defpackage.ent.K()     // Catch:{ IOException -> 0x00ae }
            java.lang.String r6 = defpackage.ent.L()     // Catch:{ IOException -> 0x00ae }
            java.lang.String r4 = r4.a(r5, r6)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b9
        L_0x00ae:
            r4 = move-exception
            iwd r5 = a     // Catch:{ IOException -> 0x020b }
            java.lang.String r6 = "Failed to get security token."
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x020b }
            r5.d(r6, r4, r8)     // Catch:{ IOException -> 0x020b }
            r4 = r0
        L_0x00b9:
            if (r4 != 0) goto L_0x00bc
            goto L_0x00d5
        L_0x00bc:
            boolean r5 = r7.c     // Catch:{ IOException -> 0x020b }
            if (r5 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r7.c()     // Catch:{ IOException -> 0x020b }
            r7.c = r2     // Catch:{ IOException -> 0x020b }
        L_0x00c6:
            aucj r5 = r7.b     // Catch:{ IOException -> 0x020b }
            avpf r5 = (defpackage.avpf) r5     // Catch:{ IOException -> 0x020b }
            r4.getClass()     // Catch:{ IOException -> 0x020b }
            int r6 = r5.a     // Catch:{ IOException -> 0x020b }
            r6 = r6 | 32
            r5.a = r6     // Catch:{ IOException -> 0x020b }
            r5.f = r4     // Catch:{ IOException -> 0x020b }
        L_0x00d5:
            avpl r4 = defpackage.avpl.d     // Catch:{ IOException -> 0x020b }
            aucd r4 = r4.o()     // Catch:{ IOException -> 0x020b }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x020b }
            boolean r6 = r4.c     // Catch:{ IOException -> 0x020b }
            if (r6 != 0) goto L_0x00e2
            goto L_0x00e7
        L_0x00e2:
            r4.c()     // Catch:{ IOException -> 0x020b }
            r4.c = r2     // Catch:{ IOException -> 0x020b }
        L_0x00e7:
            aucj r6 = r4.b     // Catch:{ IOException -> 0x020b }
            avpl r6 = (defpackage.avpl) r6     // Catch:{ IOException -> 0x020b }
            int r8 = r6.a     // Catch:{ IOException -> 0x020b }
            r8 = r8 | r3
            r6.a = r8     // Catch:{ IOException -> 0x020b }
            r6.b = r5     // Catch:{ IOException -> 0x020b }
            r5 = r8 | 2
            r6.a = r5     // Catch:{ IOException -> 0x020b }
            r5 = 201216073(0xbfe5049, float:9.795804E-32)
            r6.c = r5     // Catch:{ IOException -> 0x020b }
            boolean r5 = r7.c     // Catch:{ IOException -> 0x020b }
            if (r5 != 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            r7.c()     // Catch:{ IOException -> 0x020b }
            r7.c = r2     // Catch:{ IOException -> 0x020b }
        L_0x0105:
            aucj r5 = r7.b     // Catch:{ IOException -> 0x020b }
            avpf r5 = (defpackage.avpf) r5     // Catch:{ IOException -> 0x020b }
            aucj r4 = r4.i()     // Catch:{ IOException -> 0x020b }
            avpl r4 = (defpackage.avpl) r4     // Catch:{ IOException -> 0x020b }
            r4.getClass()     // Catch:{ IOException -> 0x020b }
            r5.e = r4     // Catch:{ IOException -> 0x020b }
            int r4 = r5.a     // Catch:{ IOException -> 0x020b }
            r4 = r4 | 8
            r5.a = r4     // Catch:{ IOException -> 0x020b }
            aucj r4 = r7.i()     // Catch:{ IOException -> 0x020b }
            avpf r4 = (defpackage.avpf) r4     // Catch:{ IOException -> 0x020b }
            org.apache.http.entity.ByteArrayEntity r5 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ IOException -> 0x020b }
            byte[] r4 = r4.k()     // Catch:{ IOException -> 0x020b }
            r5.<init>(r4)     // Catch:{ IOException -> 0x020b }
            java.lang.String r4 = "application/octet-stream"
            r5.setContentType(r4)     // Catch:{ IOException -> 0x020b }
            fyk r4 = r10.c     // Catch:{ IOException -> 0x020b }
            com.google.android.gms.auth.firstparty.shared.AppDescription r4 = r4.a()     // Catch:{ IOException -> 0x020b }
            java.lang.String r4 = r4.e     // Catch:{ IOException -> 0x020b }
            java.lang.String r6 = defpackage.ent.aD()     // Catch:{ IOException -> 0x020b }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x020b }
            java.lang.String r7 = "/devicekey"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ IOException -> 0x020b }
            fyk r7 = r10.c     // Catch:{ IOException -> 0x020b }
            android.content.Context r7 = r7.a     // Catch:{ IOException -> 0x020b }
            org.apache.http.HttpResponse r4 = defpackage.emt.a(r6, r4, r5, r7)     // Catch:{ IOException -> 0x020b }
            org.apache.http.HttpEntity r0 = r4.getEntity()     // Catch:{ IllegalArgumentException -> 0x01d9, all -> 0x01d7 }
            org.apache.http.StatusLine r5 = r4.getStatusLine()     // Catch:{ IllegalArgumentException -> 0x01d5, all -> 0x01d3 }
            if (r5 == 0) goto L_0x01cb
            org.apache.http.StatusLine r4 = r4.getStatusLine()     // Catch:{ IllegalArgumentException -> 0x01d5, all -> 0x01d3 }
            int r4 = r4.getStatusCode()     // Catch:{ IllegalArgumentException -> 0x01d5, all -> 0x01d3 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x01cb
            byte[] r4 = org.apache.http.util.EntityUtils.toByteArray(r0)     // Catch:{ IllegalArgumentException -> 0x01d5, all -> 0x01d3 }
            if (r0 == 0) goto L_0x0175
            java.io.InputStream r5 = r0.getContent()     // Catch:{ IOException -> 0x020b }
            if (r5 == 0) goto L_0x0175
            java.io.InputStream r0 = r0.getContent()     // Catch:{ IOException -> 0x020b }
            r0.close()     // Catch:{ IOException -> 0x020b }
        L_0x0175:
            aubs r0 = defpackage.aubs.c()     // Catch:{ IOException -> 0x020b }
            avpe r5 = defpackage.avpe.f     // Catch:{ IOException -> 0x020b }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r4, (defpackage.aubs) r0)     // Catch:{ IOException -> 0x020b }
            avpe r0 = (defpackage.avpe) r0     // Catch:{ IOException -> 0x020b }
            fxz r4 = r10.d     // Catch:{ IOException -> 0x01c0 }
            iwd r5 = defpackage.fxz.a     // Catch:{ IOException -> 0x01c0 }
            java.lang.String r6 = "Storing device key..."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x01c0 }
            r5.a(r6, r7)     // Catch:{ IOException -> 0x01c0 }
            java.util.concurrent.locks.ReadWriteLock r5 = r4.b     // Catch:{ IOException -> 0x01c0 }
            java.util.concurrent.locks.Lock r5 = r5.writeLock()     // Catch:{ IOException -> 0x01c0 }
            r5.lock()     // Catch:{ IOException -> 0x01c0 }
            android.content.Context r6 = r4.c     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.String r7 = "device_key"
            java.io.FileOutputStream r6 = r6.openFileOutput(r7, r2)     // Catch:{ FileNotFoundException -> 0x01b3 }
            r4.d = r0     // Catch:{ all -> 0x01ac }
            r0.a(r6)     // Catch:{ all -> 0x01ac }
            r6.close()     // Catch:{ all -> 0x01b1 }
            r5.unlock()     // Catch:{ IOException -> 0x01c0 }
            r10.g = r3     // Catch:{ IOException -> 0x01c0 }
            monitor-exit(r1)     // Catch:{ all -> 0x021d }
            return r3
        L_0x01ac:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x01b1 }
            throw r0     // Catch:{ all -> 0x01b1 }
        L_0x01b1:
            r0 = move-exception
            goto L_0x01bc
        L_0x01b3:
            r0 = move-exception
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = "File could not be created to store device key."
            r3.<init>(r4, r0)     // Catch:{ all -> 0x01b1 }
            throw r3     // Catch:{ all -> 0x01b1 }
        L_0x01bc:
            r5.unlock()     // Catch:{ IOException -> 0x01c0 }
            throw r0     // Catch:{ IOException -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            iwd r3 = a     // Catch:{ IOException -> 0x020b }
            java.lang.String r4 = "Error storing key: "
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x020b }
            r3.d(r4, r0, r5)     // Catch:{ IOException -> 0x020b }
            goto L_0x0215
        L_0x01cb:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IllegalArgumentException -> 0x01d5, all -> 0x01d3 }
            java.lang.String r4 = "Invalid device key response."
            r3.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x01d5, all -> 0x01d3 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x01d5, all -> 0x01d3 }
        L_0x01d3:
            r3 = move-exception
            goto L_0x01fb
        L_0x01d5:
            r3 = move-exception
            goto L_0x01da
        L_0x01d7:
            r3 = move-exception
            goto L_0x01fb
        L_0x01d9:
            r3 = move-exception
        L_0x01da:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x01fa }
            java.lang.String r5 = "IllegalArgumentException while parsing entity: "
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01fa }
            int r6 = r3.length()     // Catch:{ all -> 0x01fa }
            if (r6 != 0) goto L_0x01f2
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x01fa }
            r3.<init>(r5)     // Catch:{ all -> 0x01fa }
            goto L_0x01f6
        L_0x01f2:
            java.lang.String r3 = r5.concat(r3)     // Catch:{ all -> 0x01fa }
        L_0x01f6:
            r4.<init>(r3)     // Catch:{ all -> 0x01fa }
            throw r4     // Catch:{ all -> 0x01fa }
        L_0x01fa:
            r3 = move-exception
        L_0x01fb:
            if (r0 == 0) goto L_0x020a
            java.io.InputStream r4 = r0.getContent()     // Catch:{ IOException -> 0x020b }
            if (r4 == 0) goto L_0x020a
            java.io.InputStream r0 = r0.getContent()     // Catch:{ IOException -> 0x020b }
            r0.close()     // Catch:{ IOException -> 0x020b }
        L_0x020a:
            throw r3     // Catch:{ IOException -> 0x020b }
        L_0x020b:
            r0 = move-exception
            iwd r3 = a     // Catch:{ all -> 0x021d }
            java.lang.String r4 = "IOException while requesting key: "
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x021d }
            r3.d(r4, r0, r5)     // Catch:{ all -> 0x021d }
        L_0x0215:
            r10.g = r2     // Catch:{ all -> 0x021d }
            monitor-exit(r1)     // Catch:{ all -> 0x021d }
            return r2
        L_0x0219:
            boolean r0 = r10.g     // Catch:{ all -> 0x021d }
            monitor-exit(r1)     // Catch:{ all -> 0x021d }
            return r0
        L_0x021d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x021d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxy.a():boolean");
    }

    public final byte[] a(avpe avpe, String str) {
        Mac c2 = jhg.c("HMACSHA256");
        if (c2 != null) {
            try {
                c2.init(new SecretKeySpec(avpe.d.k(), "HMACSHA256"));
                return c2.doFinal(str.getBytes(b));
            } catch (InvalidKeyException e2) {
                a.e("Invalid key.", new Object[0]);
                throw new IOException("Invalid key.", e2);
            }
        } else {
            a.e("Failed to get Mac.", new Object[0]);
            throw new IOException("Failed to get Mac.");
        }
    }
}
