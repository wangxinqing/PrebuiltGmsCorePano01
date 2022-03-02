package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: iit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iit {
    public static final fzh a = new iis();
    private static final iwd b = new iwd("GLSUser", "ChannelBindingManager");
    private final Context c;

    public iit(Context context) {
        this.c = context;
    }

    public final boolean a() {
        boolean z;
        boolean z2;
        if (awjm.a.a().a() <= ((long) hxy.a)) {
            z = true;
        } else {
            z = false;
        }
        if (awjm.a.a().b() <= ((long) Build.VERSION.SDK_INT)) {
            z2 = true;
        } else {
            z2 = false;
        }
        b.a("Checking whether channelId is enabled. isEnabledGmsCore? %s, isEnabledSdk? %s, isAtLeastIceCreamSandwich? %s", Boolean.valueOf(z), Boolean.valueOf(z2), true);
        return z && z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102 A[Catch:{ Exception -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c A[Catch:{ Exception -> 0x0130 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.opc r9, android.content.Context r10) {
        /*
            r8 = this;
            java.lang.String r0 = "channel_binding_manager_privateKey"
            java.lang.String r1 = "channel_binding_manager_publicKey"
            boolean r2 = r8.a()
            r3 = 0
            if (r2 == 0) goto L_0x0171
            boolean r2 = r8.a()
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0036
            boolean r2 = defpackage.awjm.b()
            r6 = 60000(0xea60, float:8.4078E-41)
            java.lang.String r7 = "bound_sslcache"
            if (r2 == 0) goto L_0x0024
            aamu r2 = new aamu
            r2.<init>(r10, r6, r5, r7)
            goto L_0x0037
        L_0x0024:
            java.io.File r10 = r10.getDir(r7, r3)
            android.net.SSLSessionCache r2 = new android.net.SSLSessionCache     // Catch:{ IOException -> 0x0033 }
            r2.<init>(r10)     // Catch:{ IOException -> 0x0033 }
            javax.net.ssl.SSLSocketFactory r2 = android.net.SSLCertificateSocketFactory.getDefault(r6, r2)     // Catch:{ IOException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r10 = move-exception
            r2 = r4
            goto L_0x0037
        L_0x0036:
            r2 = r4
        L_0x0037:
            if (r2 == 0) goto L_0x0170
            ope r9 = r9.a
            opl r9 = (defpackage.opl) r9
            r9.e = r2
            iwd r9 = b
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r6 = "Attempting to set channel binding key on GMSCore's SSLSocketFactory."
            r9.a(r6, r10)
            boolean r9 = r8.a()
            if (r9 == 0) goto L_0x016e
            boolean r9 = r2 instanceof android.net.SSLCertificateSocketFactory
            if (r9 != 0) goto L_0x0067
            boolean r9 = r2 instanceof defpackage.aamu
            if (r9 == 0) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            iwd r9 = b
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Class r2 = r2.getClass()
            r10[r3] = r2
            java.lang.String r2 = "Can't channel bind unsupported sslSocketFactory: %s"
            r9.d(r2, r10)
            goto L_0x006c
        L_0x0067:
            iiu r4 = new iiu
            r4.<init>(r2)
        L_0x006c:
            if (r4 == 0) goto L_0x016d
            java.util.concurrent.locks.Lock r9 = defpackage.iir.a     // Catch:{ Exception -> 0x0162 }
            r9.lock()     // Catch:{ Exception -> 0x0162 }
            iir r9 = defpackage.iir.c     // Catch:{ all -> 0x015b }
            if (r9 != 0) goto L_0x007e
            iir r9 = new iir     // Catch:{ all -> 0x015b }
            r9.<init>()     // Catch:{ all -> 0x015b }
            defpackage.iir.c = r9     // Catch:{ all -> 0x015b }
        L_0x007e:
            java.util.concurrent.locks.Lock r9 = defpackage.iir.a     // Catch:{ Exception -> 0x0162 }
            r9.unlock()     // Catch:{ Exception -> 0x0162 }
            iir r9 = defpackage.iir.c     // Catch:{ Exception -> 0x0162 }
            android.content.Context r10 = r8.c     // Catch:{ Exception -> 0x0162 }
            java.util.concurrent.locks.Lock r2 = defpackage.iir.a     // Catch:{ Exception -> 0x0162 }
            r2.lock()     // Catch:{ Exception -> 0x0162 }
            fzf r2 = defpackage.iir.d     // Catch:{ all -> 0x0154 }
            if (r2 != 0) goto L_0x00a2
            java.io.File r10 = r10.getFilesDir()     // Catch:{ all -> 0x0154 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0154 }
            java.lang.String r6 = "auth.channel.store.properties"
            r2.<init>(r10, r6)     // Catch:{ all -> 0x0154 }
            fzf r10 = new fzf     // Catch:{ all -> 0x0154 }
            r10.<init>(r2)     // Catch:{ all -> 0x0154 }
            defpackage.iir.d = r10     // Catch:{ all -> 0x0154 }
        L_0x00a2:
            fzf r10 = defpackage.iir.d     // Catch:{ all -> 0x0154 }
            java.lang.String r10 = r10.a(r0)     // Catch:{ all -> 0x0154 }
            fzf r0 = defpackage.iir.d     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = r0.a(r1)     // Catch:{ all -> 0x0154 }
            if (r10 != 0) goto L_0x00b1
            goto L_0x00e4
        L_0x00b1:
            if (r0 == 0) goto L_0x00e4
            iwd r9 = defpackage.iir.b     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "Using existing Channel ID key."
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0154 }
            r9.a(r1, r2)     // Catch:{ all -> 0x0154 }
            java.lang.String r9 = "EC"
            java.security.KeyFactory r9 = java.security.KeyFactory.getInstance(r9)     // Catch:{ all -> 0x0154 }
            byte[] r10 = defpackage.jhy.a((java.lang.String) r10)     // Catch:{ all -> 0x0154 }
            java.security.spec.PKCS8EncodedKeySpec r1 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ all -> 0x0154 }
            r1.<init>(r10)     // Catch:{ all -> 0x0154 }
            java.security.PrivateKey r10 = r9.generatePrivate(r1)     // Catch:{ all -> 0x0154 }
            byte[] r0 = defpackage.jhy.a((java.lang.String) r0)     // Catch:{ all -> 0x0154 }
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch:{ all -> 0x0154 }
            r1.<init>(r0)     // Catch:{ all -> 0x0154 }
            java.security.PublicKey r9 = r9.generatePublic(r1)     // Catch:{ all -> 0x0154 }
            java.security.KeyPair r0 = new java.security.KeyPair     // Catch:{ all -> 0x0154 }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x0154 }
            java.util.concurrent.locks.Lock r9 = defpackage.iir.a     // Catch:{ Exception -> 0x0162 }
            goto L_0x00f5
        L_0x00e4:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0154 }
            iwd r10 = defpackage.iir.b     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = "Checking for old wrapped keys"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0154 }
            r10.a(r0, r1)     // Catch:{ all -> 0x0154 }
            java.security.KeyPair r0 = r9.a()     // Catch:{ all -> 0x0154 }
            java.util.concurrent.locks.Lock r9 = defpackage.iir.a     // Catch:{ Exception -> 0x0162 }
        L_0x00f5:
            r9.unlock()     // Catch:{ Exception -> 0x0162 }
            java.security.PrivateKey r9 = r0.getPrivate()     // Catch:{ Exception -> 0x0162 }
            javax.net.ssl.SSLSocketFactory r10 = r4.b     // Catch:{ Exception -> 0x0130 }
            boolean r0 = r10 instanceof android.net.SSLCertificateSocketFactory     // Catch:{ Exception -> 0x0130 }
            if (r0 != 0) goto L_0x010c
            boolean r0 = r10 instanceof defpackage.aamu     // Catch:{ Exception -> 0x0130 }
            if (r0 != 0) goto L_0x0107
            goto L_0x0125
        L_0x0107:
            aamu r10 = (defpackage.aamu) r10     // Catch:{ Exception -> 0x0130 }
            r10.d = r9     // Catch:{ Exception -> 0x0130 }
            goto L_0x0125
        L_0x010c:
            java.lang.Class r10 = r10.getClass()     // Catch:{ Exception -> 0x0130 }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0130 }
            java.lang.Class<java.security.PrivateKey> r1 = java.security.PrivateKey.class
            r0[r3] = r1     // Catch:{ Exception -> 0x0130 }
            java.lang.String r1 = "setChannelIdPrivateKey"
            java.lang.reflect.Method r10 = r10.getMethod(r1, r0)     // Catch:{ Exception -> 0x0130 }
            javax.net.ssl.SSLSocketFactory r0 = r4.b     // Catch:{ Exception -> 0x0130 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0130 }
            r1[r3] = r9     // Catch:{ Exception -> 0x0130 }
            r10.invoke(r0, r1)     // Catch:{ Exception -> 0x0130 }
        L_0x0125:
            iwd r9 = defpackage.iiu.a     // Catch:{ Exception -> 0x0130 }
            java.lang.String r10 = "Successfully bound channel!"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0130 }
            r9.c(r10, r0)     // Catch:{ Exception -> 0x0130 }
            r3 = 1
            goto L_0x016f
        L_0x0130:
            r9 = move-exception
            iwd r10 = defpackage.iiu.a     // Catch:{ Exception -> 0x0162 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = "Exception: unable to bind channel "
            int r1 = r9.length()     // Catch:{ Exception -> 0x0162 }
            if (r1 != 0) goto L_0x0149
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x0162 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0162 }
            goto L_0x014d
        L_0x0149:
            java.lang.String r9 = r0.concat(r9)     // Catch:{ Exception -> 0x0162 }
        L_0x014d:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0162 }
            r10.d(r9, r0)     // Catch:{ Exception -> 0x0162 }
            r3 = 1
            goto L_0x016f
        L_0x0154:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.iir.a     // Catch:{ Exception -> 0x0162 }
            r10.unlock()     // Catch:{ Exception -> 0x0162 }
            throw r9     // Catch:{ Exception -> 0x0162 }
        L_0x015b:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.iir.a     // Catch:{ Exception -> 0x0162 }
            r10.unlock()     // Catch:{ Exception -> 0x0162 }
            throw r9     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            r9 = move-exception
            iwd r10 = b
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Will proceed without channel binding: %s"
            r10.e(r1, r9, r0)
            goto L_0x016f
        L_0x016d:
            goto L_0x016f
        L_0x016e:
        L_0x016f:
            return r3
        L_0x0170:
            return r3
        L_0x0171:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iit.a(opc, android.content.Context):boolean");
    }
}
