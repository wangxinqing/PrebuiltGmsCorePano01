package defpackage;

import java.nio.charset.Charset;

/* renamed from: ankw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ankw implements anlj {
    public anlj a(CharSequence charSequence, Charset charset) {
        a(charSequence.toString().getBytes(charset));
        return this;
    }

    public void b(byte[] bArr, int i, int i2) {
        throw null;
    }

    public void a(char c) {
        b((byte) c);
        b((byte) (c >>> 8));
    }

    public final void a(double d) {
        a(Double.doubleToRawLongBits(d));
    }

    public void a(long j) {
        for (int i = 0; i < 64; i += 8) {
            b((byte) ((int) (j >>> i)));
        }
    }

    public final void a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
    }

    public final void a(boolean z) {
        b(z ? (byte) 1 : 0);
    }

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }
}
