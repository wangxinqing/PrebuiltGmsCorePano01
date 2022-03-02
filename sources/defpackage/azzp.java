package defpackage;

/* renamed from: azzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class azzp extends azzf {
    static {
        baam.a((Object) new azzo());
    }

    public abstract boolean a();

    public abstract int b();

    public abstract String c();

    public baam d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        amrg a = amrh.a((Object) this);
        a.a("policy", (Object) c());
        a.a("priority", b());
        a.a("available", a());
        return a.toString();
    }
}
