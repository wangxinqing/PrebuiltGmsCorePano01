package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: dty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dty {
    public int a = 0;
    public int b = 0;
    public final int[] c;
    public final byte[] d;

    public dty(int[] iArr, byte[] bArr) {
        this.c = iArr;
        this.d = bArr;
    }

    public final void a(int i) {
        if (i < this.a) {
            this.a = 0;
            this.b = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 < i) {
                this.b += this.c[i2];
                this.a = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final String b(int i) {
        a(i);
        try {
            return new String(this.d, this.b, this.c[this.a], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
