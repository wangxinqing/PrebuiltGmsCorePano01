package defpackage;

/* renamed from: agdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdd extends aggp {
    public final amri a;
    public final amri b;
    public final amri c;
    public final amri d;
    public final amri e;
    private final bapu f;
    private final amri g;
    private final amri h;
    private final amri i;
    private final amri j;
    private final amri k;
    private final amri l;

    public agdd(bapu bapu, amri amri, amri amri2, amri amri3, amri amri4, amri amri5, amri amri6, amri amri7, amri amri8, amri amri9, amri amri10, amri amri11) {
        this.f = bapu;
        this.g = amri;
        this.a = amri2;
        this.b = amri3;
        this.h = amri4;
        this.c = amri5;
        this.d = amri6;
        this.i = amri7;
        this.e = amri8;
        this.j = amri9;
        this.k = amri10;
        this.l = amri11;
    }

    public final bapu a() {
        return this.f;
    }

    public final amri b() {
        return this.g;
    }

    public final amri c() {
        return this.a;
    }

    public final amri d() {
        return this.b;
    }

    public final amri e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aggp) {
            aggp aggp = (aggp) obj;
            return this.f.equals(aggp.a()) && this.g.equals(aggp.b()) && this.a.equals(aggp.c()) && this.b.equals(aggp.d()) && this.h.equals(aggp.e()) && this.c.equals(aggp.f()) && this.d.equals(aggp.g()) && this.i.equals(aggp.h()) && this.e.equals(aggp.i()) && this.j.equals(aggp.j()) && this.k.equals(aggp.k()) && this.l.equals(aggp.l());
        }
    }

    public final amri f() {
        return this.c;
    }

    public final amri g() {
        return this.d;
    }

    public final amri h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.l.hashCode();
    }

    public final amri i() {
        return this.e;
    }

    public final amri j() {
        return this.j;
    }

    public final amri k() {
        return this.k;
    }

    public final amri l() {
        return this.l;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.a);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.c);
        String valueOf7 = String.valueOf(this.d);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.e);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        StringBuilder sb = new StringBuilder(length + 316 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length());
        sb.append("PrimesConfigurations{metricTransmitterProvider=");
        sb.append(valueOf);
        sb.append(", globalConfigurations=");
        sb.append(valueOf2);
        sb.append(", memoryConfigurations=");
        sb.append(valueOf3);
        sb.append(", timerConfigurations=");
        sb.append(valueOf4);
        sb.append(", crashConfigurations=");
        sb.append(valueOf5);
        sb.append(", networkConfigurations=");
        sb.append(valueOf6);
        sb.append(", packageConfigurations=");
        sb.append(valueOf7);
        sb.append(", jankConfigurations=");
        sb.append(valueOf8);
        sb.append(", tikTokTraceConfigurations=");
        sb.append(valueOf9);
        sb.append(", primesTraceConfigurations=");
        sb.append(valueOf10);
        sb.append(", batteryConfigurations=");
        sb.append(valueOf11);
        sb.append(", experimentalConfigurations=");
        sb.append(valueOf12);
        sb.append("}");
        return sb.toString();
    }
}
