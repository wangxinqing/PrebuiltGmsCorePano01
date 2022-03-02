package defpackage;

import java.util.Arrays;

/* renamed from: annn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class annn extends annp {
    final int a;
    final int b;
    final double c;

    public annn(int i, double d, int i2) {
        boolean z;
        annp.c(i2);
        this.a = i2;
        annp.c(i);
        this.b = i;
        if (d > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        this.c = d;
    }

    public final boolean a(int i) {
        amrl.a(i >= 0);
        return i < this.a;
    }

    public final int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (!a(i)) {
            return -1;
        }
        double d = (double) this.b;
        double pow = Math.pow(this.c, (double) (i - 1));
        Double.isNaN(d);
        return annp.a(d * pow);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof annn) {
            annn annn = (annn) obj;
            return this.b == annn.b && this.c == annn.c && this.a == annn.a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Double.valueOf(this.c)});
    }
}
