package defpackage;

/* renamed from: amdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdk {
    public final byte[] a;
    public int b;
    public int c;
    public byte d = 0;
    public boolean e = false;
    private final int f;
    private int g;
    private int h;

    public amdk(int i) {
        boolean z = false;
        amrl.a(i > 0 ? true : z);
        this.f = 1;
        this.a = new byte[i];
        c();
    }

    private final String a(int i, int i2) {
        amdo amdo = new amdo();
        int min = Math.min(i2, this.a.length - i);
        amdo.a(this.a, i, min);
        if (min < i2) {
            amdo.a(this.a, 0, i2 - min);
        }
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b2 : amdo.a.digest()) {
            sb.append(amdo.b[(b2 >> 4) & 15]);
            sb.append(amdo.b[b2 & 15]);
        }
        return sb.toString();
    }

    private static final int c(int i) {
        return ((i % 65521) + 65521) % 65521;
    }

    public final int a() {
        return this.a.length;
    }

    public final String b(int i) {
        boolean z = true;
        amrl.a(i >= 0);
        amrl.a(i <= this.a.length);
        if (this.c < i) {
            z = false;
        }
        amrl.b(z);
        int length = this.a.length;
        return a(((this.b + length) - i) % length, i);
    }

    public final boolean b() {
        return this.c == this.a.length;
    }

    public final void c() {
        this.b = 0;
        this.g = this.f;
        this.h = 0;
        this.c = 0;
        this.e = false;
    }

    public final int d() {
        amrl.b(b());
        return ((char) this.g) | (this.h << 16);
    }

    public final String e() {
        amrl.b(b());
        return a(this.b, this.a.length);
    }

    public final int a(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        if (i > this.a.length) {
            z2 = false;
        }
        amrl.a(z2);
        int i2 = this.g;
        int i3 = this.h;
        for (int i4 = this.c; i4 > i; i4--) {
            byte[] bArr = this.a;
            int length = bArr.length;
            byte b2 = bArr[((this.b + length) - i4) % length] & 255;
            i2 = c(i2 - b2);
            i3 = c((i3 - (b2 * i4)) - 1);
        }
        return ((char) i2) | (i3 << 16);
    }

    public final void a(byte b2) {
        byte b3 = b2 & 255;
        if (!b()) {
            int c2 = c(this.g + b3);
            this.g = c2;
            this.h = c(this.h + c2);
            this.c++;
        } else {
            byte b4 = this.a[this.b] & 255;
            int c3 = c((this.g + b3) - b4);
            this.g = c3;
            this.h = c(((this.h + c3) - (this.a.length * b4)) - 1);
            this.d = this.a[this.b];
            this.e = true;
        }
        byte[] bArr = this.a;
        int i = this.b;
        bArr[i] = b2;
        this.b = (i + 1) % bArr.length;
    }
}
