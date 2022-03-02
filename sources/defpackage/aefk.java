package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: aefk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aefk {
    private static final char[] c = "0123456789abcdef".toCharArray();
    public final byte[] a;
    public final ByteOrder b;

    public static byte[] a(ByteOrder byteOrder, short... sArr) {
        ByteBuffer order = ByteBuffer.allocate(r0 + r0).order(byteOrder);
        for (short putShort : sArr) {
            order.putShort(putShort);
        }
        return order.array();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aefk) {
            return Arrays.equals(this.a, ((aefk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r2 + r2);
        for (byte b2 : this.a) {
            sb.append(c[(b2 >> 4) & 15]);
            sb.append(c[b2 & 15]);
        }
        return sb.toString();
    }

    public aefk(byte[] bArr, ByteOrder byteOrder) {
        this.a = bArr;
        this.b = byteOrder;
    }

    static short[] a(ByteOrder byteOrder, byte[] bArr) {
        ShortBuffer asShortBuffer = ByteBuffer.wrap(bArr).order(byteOrder).asShortBuffer();
        short[] sArr = new short[asShortBuffer.remaining()];
        asShortBuffer.get(sArr);
        return sArr;
    }
}
