package defpackage;

import java.util.Arrays;

/* renamed from: apdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apdf extends apdz {
    private final int a;
    private final int b;
    private final int c;
    private final byte[] d;
    private final byte[] e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final byte[] u;
    private final byte[] v;
    private final int w;
    private final int x;
    private final byte[] y;

    public apdf(int i2, int i3, int i4, byte[] bArr, byte[] bArr2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, byte[] bArr3, byte[] bArr4, int i20, int i21, byte[] bArr5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = bArr2;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
        this.m = i12;
        this.n = i13;
        this.o = i14;
        this.p = i15;
        this.q = i16;
        this.r = i17;
        this.s = i18;
        this.t = i19;
        this.u = bArr3;
        this.v = bArr4;
        this.w = i20;
        this.x = i21;
        this.y = bArr5;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final byte[] d() {
        return this.d;
    }

    public final byte[] e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apdz) {
            apdz apdz = (apdz) obj;
            if (this.a == apdz.a() && this.b == apdz.b() && this.c == apdz.c()) {
                boolean z = apdz instanceof apdf;
                if (Arrays.equals(this.d, z ? ((apdf) apdz).d : apdz.d())) {
                    if (Arrays.equals(this.e, z ? ((apdf) apdz).e : apdz.e()) && this.f == apdz.f() && this.g == apdz.g() && this.h == apdz.h() && this.i == apdz.i() && this.j == apdz.j() && this.k == apdz.k() && this.l == apdz.l() && this.m == apdz.m() && this.n == apdz.n() && this.o == apdz.o() && this.p == apdz.p() && this.q == apdz.q() && this.r == apdz.r() && this.s == apdz.s() && this.t == apdz.t()) {
                        if (Arrays.equals(this.u, z ? ((apdf) apdz).u : apdz.u())) {
                            if (Arrays.equals(this.v, z ? ((apdf) apdz).v : apdz.v()) && this.w == apdz.w() && this.x == apdz.x()) {
                                if (Arrays.equals(this.y, z ? ((apdf) apdz).y : apdz.y())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ this.p) * 1000003) ^ this.q) * 1000003) ^ this.r) * 1000003) ^ this.s) * 1000003) ^ this.t) * 1000003) ^ Arrays.hashCode(this.u)) * 1000003) ^ Arrays.hashCode(this.v)) * 1000003) ^ this.w) * 1000003) ^ this.x) * 1000003) ^ Arrays.hashCode(this.y);
    }

    public final int i() {
        return this.i;
    }

    public final int j() {
        return this.j;
    }

    public final int k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public final int m() {
        return this.m;
    }

    public final int n() {
        return this.n;
    }

    public final int o() {
        return this.o;
    }

    public final int p() {
        return this.p;
    }

    public final int q() {
        return this.q;
    }

    public final int r() {
        return this.r;
    }

    public final int s() {
        return this.s;
    }

    public final int t() {
        return this.t;
    }

    public final byte[] u() {
        return this.u;
    }

    public final byte[] v() {
        return this.v;
    }

    public final int w() {
        return this.w;
    }

    public final int x() {
        return this.x;
    }

    public final byte[] y() {
        return this.y;
    }
}
