package defpackage;

import java.nio.charset.Charset;

/* renamed from: anma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anma extends ankw {
    private int a;
    private long b;
    private int c;
    private int d = 0;
    private boolean e = false;

    public anma(int i) {
        this.a = i;
    }

    private final void a(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = anmb.a(this.a, anmb.b((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    public final anlh a() {
        amrl.b(!this.e);
        this.e = true;
        int b2 = this.a ^ anmb.b((int) this.b);
        this.a = b2;
        return anmb.b(b2, this.d);
    }

    public final void b(byte b2) {
        a(1, (long) (b2 & 255));
    }

    public final void b(byte[] bArr, int i, int i2) {
        amrl.a(i, i + i2, bArr.length);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i2) {
                break;
            }
            a(4, (long) anmb.b(bArr, i3 + i));
            i3 = i4;
        }
        while (i3 < i2) {
            b(bArr[i + i3]);
            i3++;
        }
    }

    public final anlj a(CharSequence charSequence, Charset charset) {
        if (!amqn.c.equals(charset)) {
            return super.a(charSequence, charset);
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            char charAt3 = charSequence.charAt(i + 2);
            char charAt4 = charSequence.charAt(i + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            a(4, (long) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i = i2;
        }
        while (i < length) {
            char charAt5 = charSequence.charAt(i);
            if (charAt5 < 128) {
                a(1, (long) charAt5);
            } else if (charAt5 < 2048) {
                a(2, anmb.b(charAt5));
            } else if (charAt5 >= 55296 && charAt5 <= 57343) {
                int codePointAt = Character.codePointAt(charSequence, i);
                if (codePointAt != charAt5) {
                    i++;
                    a(4, anmb.c(codePointAt));
                } else {
                    a(charSequence.subSequence(i, length).toString().getBytes(charset));
                    return this;
                }
            } else {
                a(3, anmb.a(charAt5));
            }
            i++;
        }
        return this;
    }

    public final void a(char c2) {
        a(2, (long) c2);
    }

    public final void a(long j) {
        a(4, (long) ((int) j));
        a(4, j >>> 32);
    }
}
