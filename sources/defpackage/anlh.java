package defpackage;

/* renamed from: anlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anlh {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static anlh a(int i) {
        return new anlf(i);
    }

    public abstract int a();

    public abstract boolean a(anlh anlh);

    public abstract byte[] b();

    public abstract int c();

    public abstract long d();

    public byte[] e() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anlh) {
            anlh anlh = (anlh) obj;
            return a() == anlh.a() && a(anlh);
        }
    }

    public final int hashCode() {
        if (a() >= 32) {
            return c();
        }
        byte[] e = e();
        byte b = e[0] & 255;
        for (int i = 1; i < e.length; i++) {
            b |= (e[i] & 255) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r2 + r2);
        for (byte b : e()) {
            sb.append(a[(b >> 4) & 15]);
            sb.append(a[b & 15]);
        }
        return sb.toString();
    }

    public static anlh a(long j) {
        return new anlg(j);
    }

    static anlh a(byte[] bArr) {
        return new anle(bArr);
    }
}
