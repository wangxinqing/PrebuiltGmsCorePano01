package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: amxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxv extends amxr {
    transient long[] h;
    private transient int i;
    private transient int j;

    private final void c(int i2, int i3) {
        if (i2 != -2) {
            long[] jArr = this.h;
            jArr[i2] = (jArr[i2] & -4294967296L) | (((long) (i3 + 1)) & 4294967295L);
        } else {
            this.i = i3;
        }
        if (i3 != -2) {
            long[] jArr2 = this.h;
            jArr2[i3] = (4294967295L & jArr2[i3]) | (((long) (i2 + 1)) << 32);
            return;
        }
        this.j = i2;
    }

    private final int f(int i2) {
        return ((int) (this.h[i2] >>> 32)) - 1;
    }

    public final void a(int i2, int i3) {
        int size = size() - 1;
        super.a(i2, i3);
        c(f(i2), e(i2));
        if (i2 < size) {
            c(f(size), i2);
            c(i2, e(size));
        }
        this.h[size] = 0;
    }

    public final int b(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    public final void clear() {
        if (!b()) {
            this.i = -2;
            this.j = -2;
            long[] jArr = this.h;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0);
            }
            super.clear();
        }
    }

    public final void d(int i2) {
        super.d(i2);
        this.h = Arrays.copyOf(this.h, i2);
    }

    public final int e(int i2) {
        return ((int) this.h[i2]) - 1;
    }

    public final int h() {
        return this.i;
    }

    public amxv() {
        super(3);
    }

    public final void b(int i2) {
        super.b(i2);
        this.i = -2;
        this.j = -2;
    }

    public final Map e() {
        Map e = super.e();
        this.h = null;
        return e;
    }

    public final int c() {
        int c = super.c();
        this.h = new long[c];
        return c;
    }

    public final void a(int i2, Object obj, Object obj2, int i3, int i4) {
        super.a(i2, obj, obj2, i3, i4);
        c(this.j, i2);
        c(i2, -2);
    }

    public final Map c(int i2) {
        return new LinkedHashMap(i2, 1.0f, false);
    }
}
