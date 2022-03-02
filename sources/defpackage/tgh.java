package defpackage;

import java.util.Arrays;

/* renamed from: tgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgh {
    public final byte[] a;

    public tgh(auay auay) {
        this.a = auay.k();
    }

    public static tgh a(String str) {
        try {
            return new tgh(jhy.c(str));
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Bad base64 token: ") : "Bad base64 token: ".concat(valueOf), e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgh) {
            return Arrays.equals(((tgh) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (byte b : this.a) {
            i = (i * 31) + b;
        }
        return i;
    }

    public final String toString() {
        String a2 = a();
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 25 + String.valueOf(arrays).length());
        sb.append("TokenId [string=");
        sb.append(a2);
        sb.append(", bytes=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }

    public tgh(byte[] bArr) {
        this.a = bArr;
    }

    public final String a() {
        return jhy.d(this.a);
    }
}
