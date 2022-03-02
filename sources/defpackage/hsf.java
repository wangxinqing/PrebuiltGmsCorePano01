package defpackage;

/* renamed from: hsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hsf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final hpq e;

    public hsf(hpq hpq, int i, int i2, hps hps) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (hpq != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2);
        if (i2 >= 7) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.b(z3);
        int i3 = i + i2;
        if (i3 <= hpq.a()) {
            z4 = true;
        } else {
            z4 = false;
        }
        iva.b(z4);
        if (hpp.b(i) + 4 <= i2) {
            z5 = true;
        } else {
            z5 = false;
        }
        iva.b(z5);
        iva.b(hps == null ? false : z6);
        this.e = hpq;
        int a2 = hpp.a(i);
        this.a = a2;
        this.b = a2 + 4;
        this.c = i3;
        this.d = hps.b();
    }

    public final int a() {
        int b2 = this.e.b(this.a);
        if (b2 >= 0) {
            return b2;
        }
        throw new hpt("block count is not valid");
    }

    public final int b(int i) {
        byte a2 = this.e.a(i);
        if (a2 <= 0 || a2 > 64) {
            throw new hpt("source length is not valid");
        } else if (hpp.a(i + a2 + 1) + this.d <= this.c) {
            return a2;
        } else {
            throw new hpt("source length is out of bounds");
        }
    }

    public final String a(int i) {
        boolean z;
        int i2 = 0;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        int i3 = i + 1;
        if (this.d + i3 >= this.c) {
            z2 = false;
        }
        iva.b(z2);
        int b2 = b(i);
        StringBuilder sb = new StringBuilder();
        while (i2 < b2) {
            sb.append((char) this.e.a(i3));
            i2++;
            i3++;
        }
        return sb.toString();
    }
}
