package defpackage;

/* renamed from: cai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cai extends jug {
    public final atkc a;
    private final agvx b;

    public cai(atkc atkc) {
        this(atkc, (agvx) null);
    }

    public static cai a() {
        aucd o = atkc.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkc atkc = (atkc) o.b;
        atkc.b = 1;
        atkc.a = 1 | atkc.a;
        return new cai((atkc) o.i());
    }

    public final int b() {
        int a2 = atkb.a(this.a.b);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final long c() {
        int b2 = b();
        if (b2 != 2) {
            String valueOf = String.valueOf(Integer.toString(b2));
            throw new IllegalStateException(valueOf.length() == 0 ? new String("No time period for type ") : "No time period for type ".concat(valueOf));
        }
        agvx agvx = this.b;
        return agvx != null ? ((Long) agvx.c()).longValue() : this.a.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(b()));
        if (b() == 2) {
            sb.append(" timePeriod=");
            sb.append(c());
        }
        return sb.toString();
    }

    public cai(atkc atkc, agvx agvx) {
        iva.a((Object) atkc);
        this.a = atkc;
        this.b = agvx;
    }
}
