package defpackage;

/* renamed from: awbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awbw {
    public int a;
    public int b;
    public int c;
    public final int[] d = new int[10];

    /* access modifiers changed from: package-private */
    public final int a() {
        return Integer.bitCount(this.a);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        if ((this.a & 2) != 0) {
            return this.d[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return this.d[7];
        }
        return 65536;
    }

    /* access modifiers changed from: package-private */
    public final int c(int i) {
        int i2 = 1 << i;
        int i3 = (this.c & i2) == 0 ? 0 : 2;
        return (i2 & this.b) != 0 ? i3 | 1 : i3;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3) {
        int[] iArr = this.d;
        if (i < iArr.length) {
            int i4 = 1 << i;
            this.a |= i4;
            if ((i2 & 1) == 0) {
                this.b &= i4 ^ -1;
            } else {
                this.b |= i4;
            }
            if ((i2 & 2) == 0) {
                this.c &= i4 ^ -1;
            } else {
                this.c |= i4;
            }
            iArr[i] = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(int i) {
        return this.d[i];
    }
}
