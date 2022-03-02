package defpackage;

/* renamed from: cay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cay {
    public final bsz a;
    public final int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    private long g;

    public cay(bsz bsz, int i, int i2) {
        iva.b(i2 != 1);
        this.a = bsz;
        this.b = i;
        this.c = true;
        this.d = i2;
        this.g = 0;
        this.e = 1;
        this.f = 1;
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.d != 2 ? cbi.i().a() - this.g > awuz.t() && this.e == 1 && this.f != 3 : this.e == 1 && this.f != 2;
        }
        if (this.d == 2) {
            int i2 = this.e;
            return i2 == 1 ? this.f != 2 : i2 == 3;
        }
        int i3 = this.e;
        return i3 == 1 ? this.f != 3 : i3 == 2;
    }

    public final void b(int i) {
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        iva.b(z);
        this.d = i;
        this.g = cbi.i().a();
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("isSync", Boolean.valueOf(this.c));
        int i = this.d;
        int i2 = i - 1;
        if (i != 0) {
            a2.a("client", Integer.valueOf(i2));
            a2.a("time", Long.valueOf(this.g));
            int i3 = this.e;
            int i4 = i3 - 1;
            if (i3 != 0) {
                a2.a("inProgServ", Integer.valueOf(i4));
                int i5 = this.f;
                int i6 = i5 - 1;
                if (i5 != 0) {
                    a2.a("confServ", Integer.valueOf(i6));
                    return a2.toString();
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
