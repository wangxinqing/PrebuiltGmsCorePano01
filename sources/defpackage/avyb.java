package defpackage;

import java.lang.reflect.Array;

/* renamed from: avyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyb {
    public final byte[][] a;
    public final int b;
    public final int c;

    public avyb(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.b = i;
        this.c = i2;
    }

    public final byte a(int i, int i2) {
        return this.a[i2][i];
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(((i + i) * this.c) + 2);
        for (int i2 = 0; i2 < this.c; i2++) {
            for (int i3 = 0; i3 < this.b; i3++) {
                byte b2 = this.a[i2][i3];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }

    public final void a(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public final void a(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : 0;
    }
}
