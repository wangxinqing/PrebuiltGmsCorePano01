package defpackage;

import java.io.Closeable;
import java.security.MessageDigest;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bps extends MessageDigest implements Closeable {
    private static final ou c = new ou();
    private final MessageDigest a;
    private final ReentrantLock b = new ReentrantLock();

    private bps(MessageDigest messageDigest) {
        super(messageDigest.getAlgorithm());
        this.a = messageDigest;
    }

    public static bps a(String str) {
        bps bps;
        synchronized (bps.class) {
            bps = (bps) c.get(str);
            if (bps == null) {
                bps = new bps(MessageDigest.getInstance(str));
                c.put(str, bps);
            }
        }
        bps.b.lock();
        bps.a.reset();
        return bps;
    }

    private final void b() {
        if (!this.b.isHeldByCurrentThread()) {
            throw new IllegalStateException("Attempting to use SharedMessageDigest after release()");
        }
    }

    public final void close() {
        a();
    }

    public final int digest(byte[] bArr, int i, int i2) {
        b();
        return this.a.digest(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public final byte[] engineDigest() {
        throw new amtg();
    }

    /* access modifiers changed from: protected */
    public final int engineGetDigestLength() {
        return this.a.getDigestLength();
    }

    /* access modifiers changed from: protected */
    public final void engineReset() {
        throw new amtg();
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte b2) {
        throw new amtg();
    }

    public final void reset() {
        b();
        this.a.reset();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void update(byte b2) {
        b();
        this.a.update(b2);
    }

    public final byte[] digest() {
        b();
        return this.a.digest();
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        throw new amtg();
    }

    public final void update(byte[] bArr) {
        b();
        this.a.update(bArr);
    }

    public final byte[] digest(byte[] bArr) {
        b();
        return this.a.digest(bArr);
    }

    public final void update(byte[] bArr, int i, int i2) {
        b();
        this.a.update(bArr, i, i2);
    }

    public final void a() {
        b();
        this.b.unlock();
    }
}
