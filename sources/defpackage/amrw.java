package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: amrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amrw extends Random {
    private final boolean a = true;

    static final SecureRandom a() {
        return (SecureRandom) amrx.b.get();
    }

    /* access modifiers changed from: protected */
    public final int next(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean nextBoolean() {
        return a().nextBoolean();
    }

    public final void nextBytes(byte[] bArr) {
        a().nextBytes(bArr);
    }

    public final double nextDouble() {
        return a().nextDouble();
    }

    public final float nextFloat() {
        return a().nextFloat();
    }

    public final double nextGaussian() {
        return a().nextGaussian();
    }

    public final int nextInt() {
        return a().nextInt();
    }

    public final long nextLong() {
        return a().nextLong();
    }

    public final void setSeed(long j) {
        if (!this.a) {
            super.setSeed(j);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
    }

    public final int nextInt(int i) {
        return a().nextInt(i);
    }
}
