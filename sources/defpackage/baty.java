package defpackage;

import java.util.Arrays;

/* renamed from: baty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baty extends batg {
    final transient byte[][] f;
    final transient int[] g;

    public baty(batd batd, int i) {
        super((byte[]) null);
        baud.a(batd.b, 0, (long) i);
        batw batw = batd.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = batw.c;
            int i6 = batw.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                batw = batw.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f = new byte[i4][];
        this.g = new int[(i4 + i4)];
        batw batw2 = batd.a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f;
            bArr[i7] = batw2.a;
            int i8 = batw2.c;
            int i9 = batw2.b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            batw2.d = true;
            i7++;
            batw2 = batw2.f;
        }
    }

    private final int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch < 0 ? binarySearch ^ -1 : binarySearch;
    }

    private final batg h() {
        return new batg(f());
    }

    private Object writeReplace() {
        return h();
    }

    public final byte a(int i) {
        baud.a((long) this.g[this.f.length - 1], (long) i, 1);
        int b = b(i);
        int i2 = b != 0 ? this.g[b - 1] : 0;
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    public final String c() {
        return h().c();
    }

    public final batg d() {
        return h().d();
    }

    public final int e() {
        return this.g[this.f.length - 1];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof batg)) {
            return false;
        }
        batg batg = (batg) obj;
        return batg.e() == e() && a(batg, e());
    }

    public final byte[] f() {
        int[] iArr = this.g;
        int length = this.f.length;
        byte[] bArr = new byte[iArr[length - 1]];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    public final batg g() {
        return h().g();
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    public final String toString() {
        return h().toString();
    }

    public final String a() {
        return h().a();
    }

    public final String b() {
        return h().b();
    }

    public final void a(batd batd) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            batw batw = new batw(this.f[i], i3, (i3 + i4) - i2);
            batw batw2 = batd.a;
            if (batw2 == null) {
                batw.g = batw;
                batw.f = batw;
                batd.a = batw;
            } else {
                batw2.g.a(batw);
            }
            i++;
            i2 = i4;
        }
        batd.b += (long) i2;
    }

    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            if (b != 0) {
                i4 = this.g[b - 1];
            } else {
                i4 = 0;
            }
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!baud.a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public final boolean a(batg batg, int i) {
        int i2;
        if (e() - i < 0) {
            return false;
        }
        int b = b(0);
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (b != 0) {
                i2 = this.g[b - 1];
            } else {
                i2 = 0;
            }
            int min = Math.min(i, ((this.g[b] - i2) + i2) - i3);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!batg.a(i4, bArr[b], (i3 - i2) + iArr[bArr.length + b], min)) {
                return false;
            }
            i3 += min;
            i4 += min;
            i -= min;
            b++;
        }
        return true;
    }
}
