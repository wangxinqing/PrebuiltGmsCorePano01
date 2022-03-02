package defpackage;

import java.util.Arrays;

/* renamed from: aicv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aicv {
    private final int a;
    private int[] b;
    private int c;
    private int d;

    public aicv(int i) {
        this.a = i;
        c();
    }

    private final int b() {
        int i = this.c;
        if (i < this.a) {
            return i;
        }
        this.c = 0;
        return 0;
    }

    private final void c() {
        this.b = new int[Math.min(this.a, 10)];
        this.c = 0;
        this.d = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        int i;
        int[] iArr = this.b;
        int length = iArr.length;
        if (length != 0) {
            int i2 = this.c;
            if (i2 == length && i2 < (i = this.a)) {
                this.b = Arrays.copyOf(iArr, Math.min(i, length + 10));
            }
            this.b[b()] = (int) j;
            this.c++;
            int i3 = this.d;
            if (i3 < this.a) {
                this.d = i3 + 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long[] a() {
        int i = this.d;
        long[] jArr = new long[i];
        if (i != this.a) {
            this.c = 0;
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            jArr[i2] = (long) this.b[b()];
            this.c++;
        }
        c();
        return jArr;
    }
}
