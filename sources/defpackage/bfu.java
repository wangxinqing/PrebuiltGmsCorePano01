package defpackage;

import com.google.ads.afma.proto2api.c;
import com.google.ads.afma.proto2api.h;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfu {
    static boolean a = false;
    public static MessageDigest b = null;
    static final CountDownLatch c = new CountDownLatch(1);
    private static final Object d = new Object();
    private static final Object e = new Object();

    public static String a(c cVar) {
        byte[] bArr;
        byte[] k = cVar.k();
        if (((Boolean) n.i.a()).booleanValue()) {
            Vector b2 = b(k);
            if (b2 == null || b2.size() == 0) {
                bArr = a(b().k(), true);
            } else {
                aucd o = h.e.o();
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    o.b(auay.a(a((byte[]) b2.get(i), false)));
                }
                auay a2 = auay.a(a(k));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                h hVar = (h) o.b;
                a2.getClass();
                hVar.a |= 1;
                hVar.c = a2;
                bArr = ((h) o.i()).k();
            }
        } else if (bhn.a != null) {
            byte[] a3 = bhn.a.a(k, new byte[0]);
            aucd o2 = h.e.o();
            o2.b(auay.a(a3));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            h hVar2 = (h) o2.b;
            hVar2.d = 2;
            hVar2.a |= 4;
            bArr = ((h) o2.i()).k();
        } else {
            throw new GeneralSecurityException();
        }
        return bfr.a(bArr, true);
    }

    static c b() {
        aucd o = c.Q.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        c cVar = (c) o.b;
        cVar.a |= 524288;
        cVar.l = 4096;
        return (c) o.i();
    }

    static Vector b(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i = (length + 254) / 255;
        Vector vector = new Vector();
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i3 > 255) {
                    length2 = i3 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i3, length2));
                i2++;
            } catch (IndexOutOfBoundsException e2) {
                return null;
            }
        }
        return vector;
    }

    static void a() {
        synchronized (e) {
            if (!a) {
                a = true;
                new Thread(new bft()).start();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e A[Catch:{ InterruptedException -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[Catch:{ InterruptedException -> 0x001b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(byte[] r6) {
        /*
            java.lang.Object r0 = d
            monitor-enter(r0)
            a()     // Catch:{ all -> 0x0034 }
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = c     // Catch:{ InterruptedException -> 0x001b }
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x001b }
            boolean r2 = r2.await(r3, r5)     // Catch:{ InterruptedException -> 0x001b }
            if (r2 == 0) goto L_0x001a
            java.security.MessageDigest r2 = b     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x001a
            java.security.MessageDigest r1 = b     // Catch:{ all -> 0x0034 }
            goto L_0x001c
        L_0x001a:
            goto L_0x001c
        L_0x001b:
            r2 = move-exception
        L_0x001c:
            if (r1 == 0) goto L_0x002c
            r1.reset()     // Catch:{ all -> 0x0034 }
            r1.update(r6)     // Catch:{ all -> 0x0034 }
            java.security.MessageDigest r6 = b     // Catch:{ all -> 0x0034 }
            byte[] r6 = r6.digest()     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r6
        L_0x002c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch:{ all -> 0x0034 }
            throw r6     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfu.a(byte[]):byte[]");
    }

    private static byte[] a(byte[] bArr, boolean z) {
        int i;
        byte[] bArr2;
        if (!z) {
            i = 255;
        } else {
            i = 239;
        }
        if (bArr.length > i) {
            bArr = b().k();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr3 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(PSKKeyManager.MAX_KEY_LENGTH_BYTES).put(a(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        bfv[] bfvArr = new bgi().cG;
        int length2 = bfvArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            bfvArr[i2].a(bArr2, bArr4);
        }
        return bArr4;
    }
}
