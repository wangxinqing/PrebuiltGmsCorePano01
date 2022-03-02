package defpackage;

import java.util.Arrays;

/* renamed from: vbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class vbw {
    private static final char[] b = "0123456789abcdef".toCharArray();
    public final byte[] a;

    protected vbw(byte[] bArr) {
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

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass().isAssignableFrom(getClass())) {
            return Arrays.equals(this.a, ((vbw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return a(this.a);
    }

    public final String a() {
        return a(this.a);
    }
}
