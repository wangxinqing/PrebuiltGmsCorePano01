package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: khw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khw {
    public static final ith a = new ith("ContentMaintenance", "");
    public final Context b;
    public final kkf c;
    public final lrs d;
    public final lfr e;
    public final Object f = new Object();
    public volatile Collection g = new ArrayList();
    long h;
    private final khx i;
    private final ExecutorService j = jfm.b(10);
    private lsf k;

    public khw(Context context, kkf kkf, lrs lrs, khx khx, lfr lfr, jiq jiq) {
        this.b = context;
        iva.a((Object) kkf);
        this.c = kkf;
        iva.a((Object) lrs);
        this.d = lrs;
        iva.a((Object) khx);
        this.i = khx;
        iva.a((Object) lfr);
        this.e = lfr;
        iva.a((Object) jiq);
    }

    private final synchronized lsf b() {
        if (this.k == null) {
            long longValue = ((Long) jzq.F.c()).longValue();
            a.a("ContentMaintenance interval %d", Long.valueOf(longValue));
            this.k = new lsf(new khv(this), longValue, this.j, "ContentMaintenance");
        }
        return this.k;
    }

    public final void a() {
        b().a();
    }

    public final void a(long j2) {
        kky a2;
        iva.b(j2 >= 0);
        long c2 = this.d.c();
        long i2 = this.c.i();
        a.a("ContentMaintenance", "Internal cache bytes used: %d; limit: %d; download size: %d", Long.valueOf(i2), Long.valueOf(c2), Long.valueOf(j2));
        long max = Math.max(0, c2 - j2);
        if (i2 > max) {
            this.c.d();
            try {
                a2 = ((kjr) this.c).a("InternalCachedContentView", kqz.a);
                HashSet hashSet = new HashSet();
                Iterator it = a2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    knh knh = (knh) it.next();
                    if (this.c.i() <= max) {
                        break;
                    } else if (this.d.f() == null) {
                        a.a("ContentMaintenance", "Evicting from internal cache: %s at %s", knh.a, Long.valueOf(knh.e));
                        hashSet.add(knh.a);
                        knh.u();
                    } else {
                        a(knh);
                    }
                }
                this.c.a((Set) hashSet);
                this.c.f();
                a2.close();
                this.c.e();
            } catch (Throwable th) {
                this.c.e();
                throw th;
            }
        }
    }

    public final void a(Collection collection) {
        iva.a((Object) collection);
        this.g = collection;
        a.a("Open hashes %s", collection);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[Catch:{ all -> 0x010c, all -> 0x00f2, IOException | lrn -> 0x0115 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.knh r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.c
            java.lang.String r1 = "ContentMaintenance"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0016
            ith r0 = a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r12.a
            r4[r2] = r5
            java.lang.String r5 = "Evicting from internal storage (will remain in shared storage): %s"
            r0.a((java.lang.String) r1, (java.lang.String) r5, (java.lang.Object[]) r4)
            goto L_0x0023
        L_0x0016:
            ith r0 = a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r12.a
            r4[r2] = r5
            java.lang.String r5 = "Moving from internal to shared storage: %s"
            r0.a((java.lang.String) r1, (java.lang.String) r5, (java.lang.Object[]) r4)
        L_0x0023:
            kkf r0 = r11.c
            r0.d()
            khx r0 = r11.i     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.lang.String r4 = r12.a     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            lrs r5 = r0.e     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.io.File r5 = r5.f()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            if (r5 != 0) goto L_0x0041
            ith r0 = defpackage.khx.a     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r5[r2] = r4     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.lang.String r4 = "Shared storage is not available; not moving content with hash: %s"
            r0.b((java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            goto L_0x0101
        L_0x0041:
            kkb r5 = r0.b     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r5.h()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            kkf r5 = r0.c     // Catch:{ all -> 0x010c }
            knh r5 = r5.d((java.lang.String) r4)     // Catch:{ all -> 0x010c }
            r6 = 0
            if (r5 != 0) goto L_0x005d
            ith r5 = defpackage.khx.a     // Catch:{ all -> 0x010c }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x010c }
            r7[r2] = r4     // Catch:{ all -> 0x010c }
            java.lang.String r8 = "Cannot move to shared storage. No content with hash: %s"
            r5.b((java.lang.String) r8, (java.lang.Object[]) r7)     // Catch:{ all -> 0x010c }
            kkb r5 = r0.b     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            goto L_0x0072
        L_0x005d:
            java.lang.String r7 = r5.b     // Catch:{ all -> 0x010c }
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = r5.c     // Catch:{ all -> 0x010c }
            if (r7 == 0) goto L_0x0076
            r5.a(r6)     // Catch:{ all -> 0x010c }
            r5.t()     // Catch:{ all -> 0x010c }
            kkb r5 = r0.b     // Catch:{ all -> 0x010c }
            r5.i()     // Catch:{ all -> 0x010c }
            kkb r5 = r0.b     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
        L_0x0072:
            r5.j()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            goto L_0x007f
        L_0x0076:
            kkb r7 = r0.b     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r7.j()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            goto L_0x0080
        L_0x007c:
            kkb r5 = r0.b     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            goto L_0x0072
        L_0x007f:
            r5 = r6
        L_0x0080:
            if (r5 == 0) goto L_0x0101
            javax.crypto.KeyGenerator r7 = defpackage.lrj.a     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            if (r7 == 0) goto L_0x00f9
            javax.crypto.KeyGenerator r7 = defpackage.lrj.a     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            javax.crypto.SecretKey r7 = r7.generateKey()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            byte[] r8 = r7.getEncoded()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            lro r9 = new lro     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.lang.String r10 = "/CBC/PKCS5Padding"
            r9.<init>(r7, r10, r8)     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.lang.String r5 = r5.b     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.lang.String r7 = r7.toString()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            kkf r8 = r0.c     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r8.e((java.lang.String) r7)     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.io.File r5 = r0.a(r5, r2)     // Catch:{ all -> 0x00f2 }
            java.io.File r8 = r0.a(r7, r3)     // Catch:{ all -> 0x00f2 }
            r8.createNewFile()     // Catch:{ all -> 0x00f2 }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ all -> 0x00f2 }
            r10.<init>(r5)     // Catch:{ all -> 0x00f2 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f2 }
            r5.<init>(r8)     // Catch:{ all -> 0x00f2 }
            javax.crypto.CipherOutputStream r5 = defpackage.lrk.a((defpackage.lro) r9, (java.io.OutputStream) r5)     // Catch:{ all -> 0x00f2 }
            defpackage.jjt.a(r10, r5, r3)     // Catch:{ all -> 0x00f2 }
            kkf r5 = r0.c     // Catch:{ all -> 0x00f2 }
            knh r4 = r5.d((java.lang.String) r4)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x00cc
            r5 = 1
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            java.lang.String r8 = "encryptionSpec must be set if and only if sharedFilename is set."
            defpackage.iva.b(r5, r8)     // Catch:{ all -> 0x00f2 }
            java.lang.String r5 = r4.b     // Catch:{ all -> 0x00f2 }
            if (r5 == 0) goto L_0x00d8
            r5 = 1
            goto L_0x00dd
        L_0x00d8:
            if (r7 != 0) goto L_0x00dc
            r5 = 0
            goto L_0x00dd
        L_0x00dc:
            r5 = 1
        L_0x00dd:
            java.lang.String r8 = "internal and shared filenames cannot both be null"
            defpackage.iva.a((boolean) r5, (java.lang.Object) r8)     // Catch:{ all -> 0x00f2 }
            r4.c = r7     // Catch:{ all -> 0x00f2 }
            r4.d = r9     // Catch:{ all -> 0x00f2 }
            r4.a(r6)     // Catch:{ all -> 0x00f2 }
            r4.t()     // Catch:{ all -> 0x00f2 }
            kkf r0 = r0.c     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r0.f((java.lang.String) r7)     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            goto L_0x0101
        L_0x00f2:
            r4 = move-exception
            kkf r0 = r0.c     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r0.f((java.lang.String) r7)     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            throw r4     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
        L_0x00f9:
            lrn r0 = new lrn     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            java.lang.String r4 = "KeyGenerator not initialized."
            r0.<init>((java.lang.String) r4)     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            throw r0     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
        L_0x0101:
            kkf r0 = r11.c     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r0.f()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            kkf r12 = r11.c
        L_0x0108:
            r12.e()
            return
        L_0x010c:
            r4 = move-exception
            kkb r0 = r0.b     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            r0.j()     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
            throw r4     // Catch:{ lrn -> 0x0117, IOException -> 0x0115 }
        L_0x0113:
            r12 = move-exception
            goto L_0x012c
        L_0x0115:
            r0 = move-exception
            goto L_0x0118
        L_0x0117:
            r0 = move-exception
        L_0x0118:
            ith r4 = a     // Catch:{ all -> 0x0113 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = r12.a     // Catch:{ all -> 0x0113 }
            r3[r2] = r12     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = "Failed to move content to shared storage: %s"
            java.lang.String r12 = java.lang.String.format(r12, r3)     // Catch:{ all -> 0x0113 }
            r4.c(r1, r12, r0)     // Catch:{ all -> 0x0113 }
            kkf r12 = r11.c
            goto L_0x0108
        L_0x012c:
            kkf r0 = r11.c
            r0.e()
            goto L_0x0133
        L_0x0132:
            throw r12
        L_0x0133:
            goto L_0x0132
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khw.a(knh):void");
    }
}
