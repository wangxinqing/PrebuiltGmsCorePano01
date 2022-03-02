package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aqew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqew {
    public aqex a;
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public double i;
    public double j;
    public String k = null;
    public int l;
    public String m = null;
    public int n;
    public boolean o = false;

    public final void a(double d2) {
        this.i = d2;
        this.n |= 2;
    }

    public final void a(float f2) {
        this.h = f2;
        this.n |= 128;
    }

    public final void a(int i2, int i3, int i4) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.n |= 1;
    }

    public final void a(String str) {
        this.m = str;
        this.n |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public final void b(double d2) {
        this.j = d2;
        this.n |= 16;
    }

    public final void b(float f2) {
        this.g = f2;
        this.n |= 8;
    }

    public final void c(float f2) {
        this.f = f2;
        this.n |= 64;
    }

    public final void d(float f2) {
        this.e = f2;
        this.n |= 4;
    }

    public final aqey a() {
        aqey aqey = new aqey(this);
        this.o = false;
        return aqey;
    }

    public final void a(double d2, double d3, int i2) {
        a(aell.b(d2), aell.b(d3), i2);
    }

    public final void a(aqex aqex) {
        if (aqex != null) {
            this.a = aqex;
            return;
        }
        throw new IllegalArgumentException("Provider cannot be null, use Provider.UNKNOWN");
    }
}
