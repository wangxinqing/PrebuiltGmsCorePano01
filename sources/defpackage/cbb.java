package defpackage;

/* renamed from: cbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbb extends jup {
    public final atkh a;

    public cbb(atkh atkh) {
        iva.a((Object) atkh);
        this.a = atkh;
    }

    private static atkh a(int i) {
        aucd o = atkh.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkh atkh = (atkh) o.b;
        atkh.b = i - 1;
        atkh.a |= 1;
        return (atkh) o.i();
    }

    public static cbb b() {
        return new cbb(a(4));
    }

    public static cbb c() {
        return new cbb(a(5));
    }

    public final int d() {
        int a2 = atkg.a(this.a.b);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final long e() {
        int d = d();
        if (d == 1) {
            return this.a.c;
        }
        String valueOf = String.valueOf(Integer.toString(d));
        throw new IllegalStateException(valueOf.length() == 0 ? new String("No duration for type ") : "No duration for type ".concat(valueOf));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(d()));
        if (d() == 1) {
            sb.append(" durn=");
            sb.append(e());
        }
        return sb.toString();
    }

    public static cbb a() {
        return new cbb(a(3));
    }
}
