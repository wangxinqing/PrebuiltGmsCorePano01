package defpackage;

import java.nio.ByteBuffer;

/* renamed from: arhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class arhl {
    public final int a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    protected final arhi j;

    protected arhl(arhi arhi, int i2, int i3, float f2, ByteBuffer byteBuffer, int i4) {
        if (i3 <= 0 || ((float) i3) >= ((float) i4) * f2) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("The initial capacity ");
            sb.append(i3);
            sb.append(" must be between one (inclusive) and ");
            sb.append((int) (((float) i4) * f2));
            sb.append(" (exclusive).");
            throw new IllegalArgumentException(sb.toString());
        }
        this.j = arhi;
        this.a = i2;
        int min = Math.min(i3, i2);
        this.b = min;
        this.c = f2;
        if (byteBuffer == null) {
            k(min);
            return;
        }
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getInt();
        this.i = byteBuffer.getInt();
        a(byteBuffer);
        this.j.a(this.f);
    }

    public abstract int a(int i2);

    public final int a(int i2, boolean z) {
        if (z) {
            i2 = i(i2);
        }
        h(i2);
        g(i2);
        int i3 = this.h;
        if (i3 != this.i) {
            this.h = d(i3);
        }
        this.d++;
        return i2;
    }

    public abstract void a();

    public abstract void a(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    public abstract int b();

    public abstract int b(int i2);

    /* access modifiers changed from: protected */
    public final int b(int i2, int i3) {
        int i4 = this.h;
        int i5 = this.g;
        c();
        this.j.a();
        k(i2);
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 != i3) {
                this.j.b(i4);
            } else {
                i6 = this.j.b(i4);
            }
            i4 = f(i4);
        }
        d();
        this.j.b();
        this.d++;
        return i6;
    }

    public abstract void b(ByteBuffer byteBuffer);

    public abstract int c(int i2);

    /* access modifiers changed from: protected */
    public abstract void c();

    public abstract int d(int i2);

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract void e();

    public abstract void e(int i2);

    /* access modifiers changed from: protected */
    public abstract int f(int i2);

    public final boolean f() {
        return this.g == 0;
    }

    public final int g() {
        if (f()) {
            return this.h;
        }
        int i2 = this.g;
        int i3 = this.f;
        if (i2 == i3 && i2 != this.a) {
            b(i3 + i3, -1);
        }
        int i4 = this.h;
        if (this.g == this.f) {
            h(i4);
            g(i4);
            this.j.d(i4);
        } else {
            i4 = c(i4);
            this.h = i4;
        }
        e(i4);
        this.d++;
        return i4;
    }

    /* access modifiers changed from: protected */
    public abstract void g(int i2);

    /* access modifiers changed from: protected */
    public abstract void h(int i2);

    public final int i(int i2) {
        int i3 = this.g;
        int i4 = this.f;
        return (i3 != i4 / 4 || i4 == this.b) ? i2 : b(i4 / 2, i2);
    }

    /* access modifiers changed from: protected */
    public final int j(int i2) {
        int i3 = this.e;
        return ((i2 % i3) + i3) % i3;
    }

    /* access modifiers changed from: protected */
    public final void k(int i2) {
        this.g = 0;
        int max = Math.max(Math.min(i2, this.a), this.b);
        this.f = max;
        this.j.a(max);
        this.e = (int) (((float) this.f) / this.c);
        this.h = 0;
        this.i = 0;
        e();
        this.d++;
    }
}
