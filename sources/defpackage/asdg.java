package defpackage;

/* renamed from: asdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdg extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdg(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        return this.a.m.b() && this.a.o.b() && this.a.p.b() && this.a.c.getAll().isEmpty();
    }

    public final boolean c() {
        return this.a.c.edit().clear().commit();
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
