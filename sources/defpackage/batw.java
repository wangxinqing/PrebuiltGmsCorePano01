package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: batw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batw {
    public final byte[] a;
    public int b;
    public int c;
    boolean d;
    final boolean e;
    public batw f;
    public batw g;

    public batw() {
        this.a = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        this.e = true;
        this.d = false;
    }

    /* access modifiers changed from: package-private */
    public final batw a() {
        this.d = true;
        return new batw(this.a, this.b, this.c);
    }

    public final void a(batw batw) {
        batw.g = this;
        batw.f = this.f;
        this.f.g = batw;
        this.f = batw;
    }

    public final batw b() {
        batw batw = this.f;
        batw batw2 = batw != this ? batw : null;
        batw batw3 = this.g;
        batw3.f = batw;
        this.f.g = batw3;
        this.f = null;
        this.g = null;
        return batw2;
    }

    public batw(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    public final void a(batw batw, int i) {
        if (batw.e) {
            int i2 = batw.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!batw.d) {
                    int i4 = batw.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = batw.a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        i2 = batw.c - batw.b;
                        batw.c = i2;
                        batw.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, batw.a, i2, i);
            batw.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
