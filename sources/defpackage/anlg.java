package defpackage;

import java.io.Serializable;

/* renamed from: anlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlg extends anlh implements Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public anlg(long j) {
        this.a = j;
    }

    public final int a() {
        return 64;
    }

    public final byte[] b() {
        long j = this.a;
        return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
    }

    public final int c() {
        return (int) this.a;
    }

    public final long d() {
        return this.a;
    }

    public final boolean a(anlh anlh) {
        return this.a == anlh.d();
    }
}
