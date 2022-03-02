package defpackage;

/* renamed from: cbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbc extends juq {
    public final atkm a;

    public cbc(atkm atkm) {
        iva.a((Object) atkm);
        this.a = atkm;
    }

    public static cbc a(long j) {
        aucd o = atkm.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkm atkm = (atkm) o.b;
        atkm.b = 2;
        int i = atkm.a | 1;
        atkm.a = i;
        atkm.a = 2 | i;
        atkm.c = j;
        return new cbc((atkm) o.i());
    }

    public final long b() {
        return this.a.c;
    }

    public final int c() {
        int a2 = atkj.a(this.a.d);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final long d() {
        return this.a.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(a()));
        int a2 = a();
        if (a2 == 2) {
            sb.append(" intvl=");
            sb.append(b());
        } else if (a2 == 3) {
            sb.append(" intvl=");
            sb.append(b());
            sb.append(" pri=");
            sb.append(Integer.toString(c()));
        } else if (a2 == 6) {
            sb.append(" intvl=");
            sb.append(d());
        }
        return sb.toString();
    }

    public static cbc a(long j, int i) {
        aucd o = atkm.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkm atkm = (atkm) o.b;
        atkm.b = 3;
        int i2 = 1;
        int i3 = atkm.a | 1;
        atkm.a = i3;
        atkm.a = i3 | 2;
        atkm.c = j;
        int a2 = atkj.a(i);
        if (a2 != 0) {
            i2 = a2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkm atkm2 = (atkm) o.b;
        atkm2.d = i2 - 1;
        atkm2.a |= 4;
        return new cbc((atkm) o.i());
    }

    public final int a() {
        int a2 = atkl.a(this.a.b);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }
}
