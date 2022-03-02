package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: aaae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaae {
    private static final char[] b = "0123456789abcdef".toCharArray();
    public final byte[] a;

    static {
        aaae.class.getSimpleName();
    }

    public aaae(byte[] bArr) {
        this.a = bArr;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b2 : bArr) {
            sb.append(b[(b2 >> 4) & 15]);
            sb.append(b[b2 & 15]);
        }
        return sb.toString();
    }

    public final aaae b() {
        return new aaae(Arrays.copyOfRange(this.a, 0, 4));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        try {
            if (obj instanceof aaae) {
                return Arrays.equals(this.a, ((aaae) obj).a);
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 527;
    }

    public static byte[] a(int i) {
        return ByteBuffer.allocate(4).putInt(i).array();
    }

    public final int a() {
        return this.a.length;
    }

    public final boolean a(aaae aaae) {
        if (this.a.length < aaae.a()) {
            return false;
        }
        byte[] bArr = aaae.a;
        for (int i = 0; i < aaae.a(); i++) {
            if (this.a[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
