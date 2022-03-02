package defpackage;

/* renamed from: avxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxr {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;

    public avxr(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) >> 5;
        this.c = i3;
        this.d = new int[(i3 * i2)];
    }

    public final boolean a(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i >> 5)] >>> (i & 31)) & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avxr) {
            avxr avxr = (avxr) obj;
            if (this.a == avxr.a && this.b == avxr.b && this.c == avxr.c && this.d.length == avxr.d.length) {
                int i = 0;
                while (true) {
                    int[] iArr = this.d;
                    if (i >= iArr.length) {
                        return true;
                    }
                    if (iArr[i] != avxr.d[i]) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (((((i * 31) + i) * 31) + this.b) * 31) + this.c;
        for (int i3 : this.d) {
            i2 = (i2 * 31) + i3;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b * (this.a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(!a(i2, i) ? "  " : "X ");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
