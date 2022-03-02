package defpackage;

import java.io.IOException;

/* renamed from: anml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anml {
    public static final anml e = new anmh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final anml f = new anmh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final anml g = new anmg(new anmf("base16()", "0123456789ABCDEF".toCharArray()));

    static {
        new anmk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new anmk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    }

    public abstract int a(int i);

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract anml a();

    public abstract anml a(String str);

    public CharSequence a(CharSequence charSequence) {
        throw null;
    }

    public abstract void a(Appendable appendable, byte[] bArr, int i);

    public abstract int b(int i);

    public abstract anml b();

    public final String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            CharSequence a = a(charSequence);
            int b = b(a.length());
            byte[] bArr = new byte[b];
            int a2 = a(bArr, a);
            if (a2 == b) {
                return bArr;
            }
            byte[] bArr2 = new byte[a2];
            System.arraycopy(bArr, 0, bArr2, 0, a2);
            return bArr2;
        } catch (anmi e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final String a(byte[] bArr, int i) {
        amrl.a(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(a(i));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
