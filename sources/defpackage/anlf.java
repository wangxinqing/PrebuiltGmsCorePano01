package defpackage;

import java.io.Serializable;

/* renamed from: anlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlf extends anlh implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;

    public anlf(int i) {
        this.a = i;
    }

    public final int a() {
        return 32;
    }

    public final byte[] b() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    public final int c() {
        return this.a;
    }

    public final long d() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    public final boolean a(anlh anlh) {
        return this.a == anlh.c();
    }
}
