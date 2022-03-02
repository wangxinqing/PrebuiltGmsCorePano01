package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: anlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlv extends anku {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public anlv(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void b() {
        amrl.b(!this.c, (Object) "Cannot re-use a Hasher after calling hash() on it");
    }

    public final anlh a() {
        b();
        this.c = true;
        return this.b == this.a.getDigestLength() ? anlh.a(this.a.digest()) : anlh.a(Arrays.copyOf(this.a.digest(), this.b));
    }

    /* access modifiers changed from: protected */
    public final void a(byte b2) {
        b();
        this.a.update(b2);
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr, int i, int i2) {
        b();
        this.a.update(bArr, i, i2);
    }
}
